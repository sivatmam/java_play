package ca.teletact;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;



public class LayoutBorder extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        BorderPane borderPane = new BorderPane();

        //ToolBar toolbar = new ToolBar();
        HBox statusbar = new HBox();
        // HBox appContent = new HBox();

        Label colorLabel = new Label("Color: Lightblue");
        colorLabel.setFont(new Font("Verdana", 18));
        borderPane.setTop(colorLabel);
        BorderPane.setAlignment(colorLabel, Pos.CENTER);
        BorderPane.setMargin(colorLabel, new Insets(20, 10, 5, 10));


        Rectangle rectangle = new Rectangle(100,50, Color.LIGHTBLUE);
        borderPane.setCenter(rectangle);

        borderPane.setBottom(statusbar);

        borderPane.setPrefSize(320, 230);

        Scene scene = new Scene(borderPane);
        stage.setTitle("MyShapes with Layout Border");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}
