/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdloutapp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Kevintroko
 */
public class GDLOutApp extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Image image = new Image("fondo.jpg");
        //Fondo
        Image image_edificio_shader = new Image("fondo.jpg");
        Image image_logo = new Image("logo.png");
        //Texto
        Image image_texto_fondo = new Image("texto_fondo.png");
        Image image_texto_precio = new Image("texto_precio.png");
        //Botones
        Image image_boton_fondo = new Image("boton_fondo.png");
        Image image_cat_gratis = new Image("cat_gratis.png");
        Image image_cat_s = new Image("cat_s.png");
        Image image_cat_ss = new Image("cat_ss.png");
        Image image_cat_sss = new Image("cat_sss.png");
        
        //Image views
        ImageView iv = new ImageView(image);
        
        //Fondo
        ImageView iv_image_edificio_shader = new ImageView(image_edificio_shader);
        ImageView iv_image_logo = new ImageView(image_logo);
        iv_image_logo.setTranslateX(-350);
        iv_image_logo.setTranslateY(-250);
        
        //Textos
        ImageView iv_image_texto_fondo = new ImageView(image_texto_fondo);
        iv_image_texto_fondo.setTranslateY(-90);
        ImageView iv_image_texto_precio = new ImageView(image_texto_precio);
        iv_image_texto_precio.setTranslateY(-90);
        
        //Boton 1
        ImageView iv_image_boton_fondo = new ImageView(image_boton_fondo);
        ImageView iv_image_cat_gratis = new ImageView(image_cat_gratis);
        iv_image_boton_fondo.setTranslateY(60);
        iv_image_cat_gratis.setTranslateY(60);
        iv_image_boton_fondo.setTranslateX(-300);
        iv_image_cat_gratis.setTranslateX(-300);
        
        //Boton 2
        ImageView iv_image_boton_fondo2 = new ImageView(image_boton_fondo);
        ImageView iv_image_cat_s = new ImageView(image_cat_s);
        iv_image_boton_fondo2.setTranslateY(60);
        iv_image_cat_s.setTranslateY(60);
        iv_image_boton_fondo2.setTranslateX(-100);
        iv_image_cat_s.setTranslateX(-100);
        
        //Boton 3
        ImageView iv_image_boton_fondo3 = new ImageView(image_boton_fondo);
        ImageView iv_image_cat_ss = new ImageView(image_cat_ss);
        iv_image_boton_fondo3.setTranslateY(60);
        iv_image_cat_ss.setTranslateY(60);
        iv_image_boton_fondo3.setTranslateX(100);
        iv_image_cat_ss.setTranslateX(100);
        
        //Boton 4
        ImageView iv_image_boton_fondo4 = new ImageView(image_boton_fondo);
        ImageView iv_image_cat_sss = new ImageView(image_cat_sss);
        iv_image_boton_fondo4.setTranslateY(60);
        iv_image_cat_sss.setTranslateY(60);
        iv_image_boton_fondo4.setTranslateX(300);
        iv_image_cat_sss.setTranslateX(300);

        
        //Mouse Listeners
        iv_image_boton_fondo.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked!"); // change functionality
        });
        iv_image_boton_fondo2.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked!"); // change functionality
        });
        iv_image_boton_fondo3.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked!"); // change functionality
        });
        iv_image_boton_fondo4.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked!"); // change functionality
        });
        iv_image_cat_gratis.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked!"); // change functionality
        });
        iv_image_cat_s.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked!"); // change functionality
        });
        iv_image_cat_ss.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked!"); // change functionality
        });
        iv_image_cat_sss.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked!"); // change functionality
        });
        StackPane root = new StackPane();

        root.getChildren().add(iv);
        root.getChildren().add(iv_image_edificio_shader);
        root.getChildren().add(iv_image_logo);
        root.getChildren().add(iv_image_texto_fondo);
        root.getChildren().add(iv_image_texto_precio);
        root.getChildren().add(iv_image_boton_fondo);
        root.getChildren().add(iv_image_boton_fondo2);
        root.getChildren().add(iv_image_boton_fondo3);
        root.getChildren().add(iv_image_boton_fondo4);
        root.getChildren().add(iv_image_cat_gratis);
        root.getChildren().add(iv_image_cat_s);
        root.getChildren().add(iv_image_cat_ss);
        root.getChildren().add(iv_image_cat_sss);


        Scene scene = new Scene(root, 1200, 750);
        //scene.getStylesheets().add("src/style.css");
       
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui podemos meter el input 
        launch(args);
    }
}
