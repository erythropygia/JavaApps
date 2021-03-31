
package application;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.scene.control.Button; 



public class Main extends Application implements EventHandler<ActionEvent> {
	
  static int X_ekseni = 3;
  static int Y_ekseni = 3;
  static int sayac=0;
  Button button;
  Button button1;
  static int ButtonKontrol=0;

  @Override
  public void start(final Stage primaryStage) {
    Group root = new Group();
    Scene scene = new Scene(root, 500, 400, Color.WHITE);
    
  
    
    primaryStage.setTitle("JAVAFX ÇARPAN TOP");
    primaryStage.setScene(scene);
    primaryStage.show();



    final Circle Top = new Circle(100, 100, 20, Color.SALMON);
    root.getChildren().add(Top);
    
    
    button = new Button();
    button.setText("Yön Deðiþtir ve Hýz Arttýr");
    button.setOnAction(this);
    
    root.getChildren().add(button);

      
    Timeline timeline = new Timeline();
    timeline.setCycleCount(Animation.INDEFINITE);
    KeyFrame TopHareketi = new KeyFrame(Duration.seconds(.0100),
        (ActionEvent event) -> {
          double X_Min = Top.getBoundsInParent().getMinX();
          double Y_Min = Top.getBoundsInParent().getMinY();
          double X_Max = Top.getBoundsInParent().getMaxX();
          double Y_Max = Top.getBoundsInParent().getMaxY();
          
          button.setOnAction(new EventHandler<ActionEvent>() {
          	@Override
          	public void handle(ActionEvent event) {
          		
          		if(ButtonKontrol%2==1) {
          			ButtonKontrol++;
          			X_ekseni = (X_ekseni * ButtonKontrol);
          			
          		
          		}
          		else {
          			ButtonKontrol++;
          			Y_ekseni = (Y_ekseni * ButtonKontrol);	
          			
          		}
          		
          	}
          });
          
        


          // Çarpýþma Sýnýrlarý
        if (X_Min < 0 || X_Max > scene.getWidth()) {
          X_ekseni = X_ekseni * -1;
          sayac++;
          primaryStage.setTitle("JAVAFX ÇARPAN TOP                 "+ "Toplam Çarpma:" + sayac);
         
   
              
        }
        if (Y_Min < 0 || Y_Max > scene.getHeight()) {
        	Y_ekseni = Y_ekseni * -1;
          sayac++;
          primaryStage.setTitle("JAVAFX ÇARPAN TOP                 "+ "Toplam Çarpma:" + sayac);
          
         
        }
        

        Top.setTranslateX(Top.getTranslateX() + X_ekseni);
        Top.setTranslateY(Top.getTranslateY() + Y_ekseni);
      });

    timeline.getKeyFrames().add(TopHareketi);
    timeline.play();
  }
  
  
 
  



@Override
public void handle(ActionEvent event) {

}









public static void main(String[] args) {
	  launch(args);
	  }
  
  
}
    
