package e15_18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class e15_18Test extends Application {
    private final ClockPane clockPane = new ClockPane(4, 20, 45);
    private final ClockPane clockPane1 = new ClockPane(22, 46, 15);

    @Override
    public void start(Stage primaryStage) {
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(clockPane);
        flowPane.getChildren().add(clockPane1);

        Scene scene = new Scene(flowPane, 400, 200);
        primaryStage.setTitle("Exercise15_18");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}


