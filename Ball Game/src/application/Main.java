
package application;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.event.EventHandler;
import javafx.scene.control.Button; 



public class Main extends Application implements EventHandler<KeyEvent> {
	
  static int X_ekseni = 3;
  static int Y_ekseni = 3;
  static int sayac=0;
  Button button;
  Button button1;
  static int ButtonKontrol=0;

  @Override
  public void start(final Stage primaryStage) {
    Group root = new Group();
    Scene scene = new Scene(root, 600, 400, Color.WHITE);
    
  
    
    primaryStage.setTitle("JAVAFX ÇARPAN TOP (Yön Tuþlarý Aktif)");
    primaryStage.setScene(scene);
    primaryStage.show();



    final Circle Top = new Circle(100, 100, 20, Color.SALMON);
    root.getChildren().add(Top);
    
   
    
    scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
    @Override
    public void handle(KeyEvent event) {
    	// TODO Auto-generated method stub
    	if(event.getCode()== KeyCode.UP) {
    		X_ekseni *=-1;
    		Y_ekseni *=-1;
    	}
    		else if (event.getCode()==KeyCode.DOWN){
    			X_ekseni *=-1;
    			Y_ekseni *=-1;
    			
    		}
    		else if (event.getCode()==KeyCode.LEFT){
    			X_ekseni -=1;
    			Y_ekseni -=1;
    			
    		}
    		else if (event.getCode()==KeyCode.RIGHT){
    			X_ekseni +=1;
    			Y_ekseni +=1;
    			
    		}
	
    		
    	}});
    


    Timeline timeline = new Timeline();
    timeline.setCycleCount(Animation.INDEFINITE);
    KeyFrame TopHareketi = new KeyFrame(Duration.seconds(.0100),
        (ActionEvent event) -> {
          double X_Min = Top.getBoundsInParent().getMinX();
          double Y_Min = Top.getBoundsInParent().getMinY();
          double X_Max = Top.getBoundsInParent().getMaxX();
          double Y_Max = Top.getBoundsInParent().getMaxY();
          
         

          // Çarpýþma Sýnýrlarý
        if (X_Min < 0 || X_Max > scene.getWidth()) {
          X_ekseni = X_ekseni * -1;
          sayac++;
          primaryStage.setTitle("JAVAFX ÇARPAN TOP (Yön Tuþlarý Aktif)                "+ "Toplam Çarpma:" + sayac);
         
   
              
        }
        if (Y_Min < 0 || Y_Max > scene.getHeight()) {
        	Y_ekseni = Y_ekseni * -1;
          sayac++;
          primaryStage.setTitle("JAVAFX ÇARPAN TOP (Yön Tuþlarý Aktif)                 "+ "Toplam Çarpma:" + sayac);
          
         
        }
        

        Top.setTranslateX(Top.getTranslateX() + X_ekseni);
        Top.setTranslateY(Top.getTranslateY() + Y_ekseni);
      });

    timeline.getKeyFrames().add(TopHareketi);
    timeline.play();
    
    
    
    
    
  }
  


public static void main(String[] args) {
	  launch(args);
	  }



@Override
public void handle(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
  
  
}
    
