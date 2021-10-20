/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ja001;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HelloFX extends Application{

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) throws Exception {
    StackPane stackPane = new StackPane();
    Stop[] stops = new Stop[] {
                new Stop(0, Color.DODGERBLUE),
                new Stop(0.5, Color.LIGHTBLUE),
                new Stop(1, Color.LIGHTGREEN),
    };

    LinearGradient gradient = new LinearGradient(0,0,0,1, true, CycleMethod.NO_CYCLE, stops);

    Ellipse ellipse = new Ellipse(110, 70);
    ellipse.setFill(gradient);
    ellipse.setEffect(new DropShadow(30,10,10,Color.GRAY));

    Text text = new Text("My Shapes");
    text.setFont(new Font("Arial Bold", 24));

    Reflection reflect = new Reflection();
    reflect.setFraction(0.8);
    reflect.setTopOffset(1.0);
    text.setEffect(reflect);

    stackPane.getChildren().addAll(ellipse, text);

    Scene scene = new Scene(stackPane, 320, 230, Color.YELLOW);
    stage.setTitle("Gradient");
    stage.setScene(scene);
    stage.show();
  }
  
}
