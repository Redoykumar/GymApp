package Applications;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MainMenu extends Application {
    public static final int WIDTH = 800, HEIGHT = 500;
    private Color backgroundColor = Color.DARKBLUE;

    public static void main(String[] args) {
        launch(args);
    }

        //ClientController clientController = new ClientController(this);

        //public void exit() {
            //dispose();
        //}

        public MainMenu() {
            @Override
            public void start(Stage primaryStage) throws Exception {

                Scene menuScene;
                Stage primaryStage = null;
                primaryStage.setResizable(false);
                primaryStage.setTitle("Gym Application");
                primaryStage.setScene(menuScene);
                primaryStage.show();

            }
            // Couleur de fond
            Color color = Color.DARKBLUE;

            // Pour le menu
            Pane menuPane = new Pane();

            Scene menuScene = new Scene(menuPane, WIDTH, HEIGHT);

            // Pour le logo
            ImageView logo = new ImageView(new Image("logo.png"));
            logo.setFitHeight(200);
            logo.setFitWidth(300);
            logo.setX(170);
            logo.setY(100);
            logo.setPreserveRatio(true);
            menuPane.getChildren().add(logo);

            // Pour le fond
            BackgroundFill background_fill = new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY);
            Background background = new Background(background_fill);
            menuPane.setBackground(background);

            //Parent root = FXMLLoader.load(getClass().getResource("GymApplication.fxml"));
            //primaryStage.setTitle("Hello World");
            //primaryStage.setScene(new Scene(root, 300, 275));
            //primaryStage.show();



        }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
