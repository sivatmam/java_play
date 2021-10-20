package ca.teletact;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LayoutFlow extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        FlowPane flowPane = new FlowPane(Orientation.VERTICAL);

        Label label1 = new Label("Label1");
        label1.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(10), Insets.EMPTY)));

        Label label2 = new Label("Label2");
        label2.setBackground(new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(2), Insets.EMPTY)));

        flowPane.getChildren().add(label1);
        flowPane.getChildren().add(label2);

        Scene scene = new Scene(flowPane, 350, 230, Color.LIGHTYELLOW);
        stage.setTitle("MyShapes with Layout Grid");
        stage.setScene(scene);
        stage.show();
    }
}
