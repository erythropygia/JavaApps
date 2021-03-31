package application;

import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.control.Label;
import javafx.scene.text.*;
import static javafx.scene.paint.Color.*;
import javafx.scene.layout.Pane;
import javafx.application.Application;
import javafx.scene.Scene;
import java.time.LocalDateTime;


public class Main extends Application {
	
    int MERKEZ = 200;
    int[] XKORDINAT = {182,260,295,320,300,250,186,120,80,60,70,110};
    int[] YKORDINAT = {60,80,130,179,240,280,300,280,240,180,130,85};
    
    //ÝNTERNETTEKÝ KAYNAKLARDAN ALDIM BU ARRAY FÝKRÝNÝ


    @Override
    public void start(Stage stage) {


        LocalDateTime AnlikZaman = LocalDateTime.now();
        int SAAT = AnlikZaman.getHour();
        int DAKIKA = AnlikZaman.getMinute();
        int SANIYE = AnlikZaman.getSecond();

	Label Yaz12 =  new Label("12");
        Yaz12.setTranslateX(180);
        Yaz12.setTranslateY(60);
        Yaz12.setFont(Font.font("bold", FontWeight.NORMAL, 30));
        
        Label Yaz9 =  new Label("9");
        Yaz9.setTranslateX(60);
        Yaz9.setTranslateY(180);
        Yaz9.setFont(Font.font("bold", FontWeight.NORMAL, 30));
        
        Label Yaz6 =  new Label("6");
        Yaz6.setTranslateX(185);
        Yaz6.setTranslateY(300);
        Yaz6.setFont(Font.font("bold", FontWeight.NORMAL, 30));  
        
        Label Yaz3 =  new Label("3");
        Yaz3.setTranslateX(320);
        Yaz3.setTranslateY(180);
        Yaz3.setFont(Font.font("bold", FontWeight.NORMAL, 30));


        Circle Yaricap = new Circle(MERKEZ,MERKEZ,5);
  
        Circle SaatCercevesi = new Circle();
        SaatCercevesi.setCenterX(MERKEZ);
        SaatCercevesi.setCenterY(MERKEZ);
        SaatCercevesi.setRadius(150);
        SaatCercevesi.setFill(null);
        SaatCercevesi.setStroke(Color.PINK);
        SaatCercevesi.setStrokeWidth(1);
        Yaricap.setStroke(Color.PINK);
        Yaricap.setFill(Color.PINK);
        
     
        Pane Pano = new Pane();
        Pano.getChildren().add(Yaricap);
        Pano.getChildren().add(Yaz12);
        Pano.getChildren().add(Yaz6);
        Pano.getChildren().add(Yaz9);
        Pano.getChildren().add(Yaz3);
        Pano.getChildren().add(SaatCercevesi);
        


        Line AkrepCiz = new Line();
        AkrepCiz.setStartX(MERKEZ);
        AkrepCiz.setStartY(MERKEZ);
        AkrepCiz.setEndX(XKORDINAT[SAAT%12]+6);
        AkrepCiz.setEndY(XKORDINAT[SAAT%12]+6);
        AkrepCiz.setStrokeWidth(4);
        AkrepCiz.setFill(BLACK);
        AkrepCiz.setStroke(BLACK);


        Line YelkovanCiz = new Line();
        YelkovanCiz.setStartX(MERKEZ);
        YelkovanCiz.setStartY(MERKEZ);
        YelkovanCiz.setEndX(XKORDINAT[DAKIKA/5]);
        YelkovanCiz.setEndY(YKORDINAT[DAKIKA/5]);
        YelkovanCiz.setStrokeWidth(3);
        YelkovanCiz.setFill(PINK);
        YelkovanCiz.setStroke(PINK);

        Line SaniyeCiz = new Line();
        SaniyeCiz.setStartX(MERKEZ);
        SaniyeCiz.setStartY(MERKEZ);
        SaniyeCiz.setEndX(XKORDINAT[SANIYE/5]);
        SaniyeCiz.setEndY(YKORDINAT[SANIYE/5]);
        SaniyeCiz.setStrokeWidth(0.5);
        SaniyeCiz.setFill(RED);
        SaniyeCiz.setStroke(RED);

        Pano.getChildren().add(SaniyeCiz);
        Pano.getChildren().add(AkrepCiz);
        Pano.getChildren().add(YelkovanCiz);

        Scene Scene = new Scene(Pano, 400, 400);
        stage.setScene(Scene);
        stage.setTitle("JAVAFX Saat Ödevi");
        stage.show();

    }
    public static void main(String args[]){
        launch(args);
    }
}