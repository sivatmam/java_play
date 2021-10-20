package ca.teletact;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class LayoutGrid extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        GridPane gridPane = new GridPane();
        Label label1 = new Label("Label1");
        label1.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(10), Insets.EMPTY)));

        Label label2 = new Label("Label2");
        label2.setBackground(new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(2), Insets.EMPTY)));

        gridPane.add(label1, 0, 0);
        gridPane.add(label2, 1,0,2, 1);

        Scene scene = new Scene(gridPane, 350, 230, Color.LIGHTYELLOW);
        stage.setTitle("MyShapes with Layout Grid");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
