import e15_18.ClockPane;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.util.Duration;
import javafx.scene.control.Button;


public class e16_24 extends Application {
    ClockPane clock = new ClockPane();
    EventHandler<ActionEvent> eventHandler = e -> {
        clock.setCurrentTime(); // Set a new clock time
    };
    Timeline animation = new Timeline(
            new KeyFrame(Duration.millis(1000), eventHandler));
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
       // Create a clock
        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button Button1 = new Button("Start");
        Button Button2 = new Button("Stop");
        hBox.getChildren().add(Button1);
        hBox.getChildren().add(Button2);

        Button1.setOnAction(new StartHandler());
        Button2.setOnAction(new StopHandler());



        animation.setCycleCount(Timeline.INDEFINITE);


        BorderPane borderPane=new BorderPane();
        borderPane.setCenter(clock);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox,Pos.CENTER);


        Scene scene = new Scene(borderPane, 250, 250);
        primaryStage.setTitle("ClockAnimation"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }

    class StartHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            animation.play();
        }
    }
    class StopHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent e) {
            animation.stop();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

