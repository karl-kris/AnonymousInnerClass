/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author usu2dam
 */
public class AnonymousInnerClass extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button("New");
        Button btn1 = new Button("Open");
        Button btn2 = new Button("Save");
        Button btn3 = new Button("Print");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Nuevo proceso");
            }
        });
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abrir proceso");
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guardar proceso");
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprimir proceso");
            }
        });
        
        StackPane root = new StackPane();
        HBox botones = new HBox(10);
        botones.setAlignment(Pos.CENTER);
        botones.getChildren().addAll(btn, btn1, btn2, btn3);
        root.getChildren().add(botones);
        
        Scene scene = new Scene(root, 300, 100);
        
        primaryStage.setTitle("AnonymousHandlerDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
