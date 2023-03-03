package com.example.javafx2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Group root = new Group(); //root node, ezekből áll egy jelenet, amelyből a stage
        Scene scene = new Scene(root);


        Text text = new Text();
        text.setText("Teszt Text");
        text.setX(10); //poziciók
        text.setY(10);
        text.setFill(Color.RED);

        root.getChildren().add(text);

        Line line = new Line();
        line.setStartX(10);
        line.setEndX(100);
        line.setStartY(15);
        line.setEndY(15);
        line.setStrokeWidth(2);

        root.getChildren().add(line);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(5);
        rectangle.setY(5);
        rectangle.setWidth(5);
        rectangle.setHeight(5);
        rectangle.setFill(Color.RED);

        //van még polyglon, circle, stb...

        //Image image = new Image("valami.png");
        //ImageView imageView = new ImageView(image);

        root.getChildren().add(rectangle);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setWidth(100);
        stage.setHeight(100);

        //stage.setFullScreen(true);
        stage.setFullScreenExitHint("Hint!");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}