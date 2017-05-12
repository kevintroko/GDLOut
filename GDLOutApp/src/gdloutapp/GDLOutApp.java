/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gdloutapp;

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
        
        Scene scene_municipio, scene_categoria, scene_recomendacion;
        Stage thestage;
        thestage=primaryStage;
        
        Image image = new Image("fondo.jpg");
        //Fondo
        Image image_logo = new Image("logo.png");
        
        //Texto
        Image image_texto_fondo = new Image("texto_fondo.png");
        Image image_texto_precio = new Image("texto_precio.png");
        Image image_texto_municipio = new Image("texto_municipio.png");
        Image image_texto_categoria = new Image("texto_catogoria.png");
        
        //Botones
        Image image_boton_fondo = new Image("boton_fondo.png");
        Image image_boton_fondo2 = new Image("boton_fondo.png");
        Image image_boton_fondo3 = new Image("boton_fondo.png");
        Image image_cat_gratis = new Image("cat_gratis.png");
        Image image_cat_s = new Image("cat_s.png");
        Image image_cat_ss = new Image("cat_ss.png");
        Image image_cat_sss = new Image("cat_sss.png");
        Image image_cat_gdl = new Image("cat_gdl.png");
        Image image_cat_zapopan = new Image("cat_zapopan.png");
        Image image_cat_tlaquepaque = new Image("cat_tlaquepaque.png");
        Image image_cat_coffe = new Image("cat_coffe.png");
        Image image_cat_comida = new Image("cat_comida.png");
        Image image_cat_club = new Image("cat_club.png");
        Image image_cat_diversion = new Image("cat_diversion.png");
        
        //Image views
        ImageView iv = new ImageView(image);
        ImageView iv2 = new ImageView(image);
        ImageView iv3 = new ImageView(image);
        ImageView iv4 = new ImageView(image);
        
        //Fondo
        ImageView iv_image_logo = new ImageView(image_logo);
        ImageView iv2_image_logo = new ImageView(image_logo);
        ImageView iv3_image_logo = new ImageView(image_logo);
        ImageView iv4_image_logo = new ImageView(image_logo);
        iv_image_logo.setTranslateX(-350);
        iv_image_logo.setTranslateY(-250);
        iv2_image_logo.setTranslateX(-350);
        iv2_image_logo.setTranslateY(-250);
        iv3_image_logo.setTranslateX(-350);
        iv3_image_logo.setTranslateY(-250);
        iv4_image_logo.setTranslateX(-350);
        iv4_image_logo.setTranslateY(-250);
        
        //Textos
        ImageView iv_image_texto_fondo = new ImageView(image_texto_fondo);
        ImageView iv_image_texto_precio = new ImageView(image_texto_precio);
        ImageView iv2_image_texto_municipio = new ImageView(image_texto_municipio);
        ImageView iv2_image_texto_fondo = new ImageView(image_texto_fondo);
        ImageView iv3_image_texto_categoria = new ImageView(image_texto_categoria);
        ImageView iv3_image_texto_fondo = new ImageView(image_texto_fondo);
        ImageView iv4_image_texto_recomendacion = new ImageView(image_texto_precio);
        ImageView iv4_image_texto_fondo = new ImageView(image_texto_fondo);
        iv_image_texto_fondo.setTranslateY(-90);
        iv_image_texto_precio.setTranslateY(-90);
        iv2_image_texto_fondo.setTranslateY(-90);
        iv2_image_texto_municipio.setTranslateY(-90);
        iv3_image_texto_fondo.setTranslateY(-90);
        iv3_image_texto_categoria.setTranslateY(-90);
        iv4_image_texto_fondo.setTranslateY(-90);
        iv4_image_texto_recomendacion.setTranslateY(-90);
        
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
        
        //Boton 1
        ImageView iv2_image_boton_fondo = new ImageView(image_boton_fondo2);
        ImageView iv_image_cat_gdl = new ImageView(image_cat_gdl);
        iv2_image_boton_fondo.setTranslateY(60);
        iv_image_cat_gdl.setTranslateY(60);
        iv2_image_boton_fondo.setTranslateX(-200);
        iv_image_cat_gdl.setTranslateX(-200);
        //Boton 2
        ImageView iv2_image_boton_fondo2 = new ImageView(image_boton_fondo2);
        ImageView iv_image_cat_tlaquepaque = new ImageView(image_cat_tlaquepaque);
        iv2_image_boton_fondo2.setTranslateY(60);
        iv_image_cat_tlaquepaque.setTranslateY(60);
        iv2_image_boton_fondo2.setTranslateX(0);
        iv_image_cat_tlaquepaque.setTranslateX(0);
        //Boton 3
        ImageView iv2_image_boton_fondo3 = new ImageView(image_boton_fondo2);
        ImageView iv_image_cat_zapopan = new ImageView(image_cat_zapopan);
        iv2_image_boton_fondo3.setTranslateY(60);
        iv_image_cat_zapopan.setTranslateY(60);
        iv2_image_boton_fondo3.setTranslateX(200);
        iv_image_cat_zapopan.setTranslateX(200);
        
        //Boton 1
        ImageView iv3_image_boton_fondo = new ImageView(image_boton_fondo3);
        ImageView iv_image_cat_coffe = new ImageView(image_cat_coffe);
        iv3_image_boton_fondo.setTranslateY(60);
        iv_image_cat_coffe.setTranslateY(60);
        iv3_image_boton_fondo.setTranslateX(-300);
        iv_image_cat_coffe.setTranslateX(-300);
        //Boton 2
        ImageView iv3_image_boton_fondo2 = new ImageView(image_boton_fondo3);
        ImageView iv_image_cat_comida = new ImageView(image_cat_comida);
        iv3_image_boton_fondo2.setTranslateY(60);
        iv_image_cat_comida.setTranslateY(60);
        iv3_image_boton_fondo2.setTranslateX(-100);
        iv_image_cat_comida.setTranslateX(-100);
        //Boton 3
        ImageView iv3_image_boton_fondo3 = new ImageView(image_boton_fondo3);
        ImageView iv_image_cat_club = new ImageView(image_cat_club);
        iv3_image_boton_fondo3.setTranslateY(60);
        iv_image_cat_club.setTranslateY(60);
        iv3_image_boton_fondo3.setTranslateX(100);
        iv_image_cat_club.setTranslateX(100);
        //Boton 4
        ImageView iv3_image_boton_fondo4 = new ImageView(image_boton_fondo3);
        ImageView iv_image_cat_diversion = new ImageView(image_cat_diversion);
        iv3_image_boton_fondo4.setTranslateY(60);
        iv_image_cat_diversion.setTranslateY(60);
        iv3_image_boton_fondo4.setTranslateX(300);
        iv_image_cat_diversion.setTranslateX(300);
         

        StackPane root = new StackPane();
        StackPane root_municipio = new StackPane();
        StackPane root_categoria = new StackPane();
        StackPane root_recomendacion = new StackPane();
        
        root.getChildren().addAll(iv,iv_image_logo,
                                            iv_image_texto_fondo,
                                            iv_image_texto_precio,
                                            iv_image_boton_fondo,
                                            iv_image_boton_fondo2,
                                            iv_image_boton_fondo3,
                                            iv_image_boton_fondo4,
                                            iv_image_cat_gratis,
                                            iv_image_cat_s,
                                            iv_image_cat_ss,
                                            iv_image_cat_sss);

        root_municipio.getChildren().addAll(iv2,
                                            iv2_image_logo,
                                            iv2_image_texto_fondo,
                                            iv2_image_texto_municipio,
                                            iv2_image_boton_fondo,
                                            iv2_image_boton_fondo2,
                                            iv2_image_boton_fondo3,
                                            iv_image_cat_gdl,
                                            iv_image_cat_tlaquepaque,
                                            iv_image_cat_zapopan);


        root_categoria.getChildren().addAll(iv3,
                                            iv3_image_logo,
                                            iv3_image_texto_fondo,
                                            iv3_image_texto_categoria,
                                            iv3_image_boton_fondo,
                                            iv3_image_boton_fondo2,
                                            iv3_image_boton_fondo3,
                                            iv3_image_boton_fondo4,
                                            iv_image_cat_coffe,
                                            iv_image_cat_comida,
                                            iv_image_cat_club,
                                            iv_image_cat_diversion);
        
        Scene scene = new Scene(root, 1200, 750);
        scene_municipio = new Scene(root_municipio,1200,750);
        scene_categoria = new Scene(root_categoria,1200,750);
        scene_recomendacion = new Scene(root_recomendacion,1200,750);
        
        //Mouse Listeners Scene Precio
        iv_image_boton_fondo.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 1"); // change functionality
            thestage.setScene(scene_municipio);
        });
        iv_image_boton_fondo2.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 2"); // change functionality
            thestage.setScene(scene_municipio);
        });
        iv_image_boton_fondo3.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 3"); // change functionality
            thestage.setScene(scene_municipio);
        });
        iv_image_boton_fondo4.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 4"); // change functionality
            thestage.setScene(scene_municipio);
        });
        iv_image_cat_gratis.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 1"); // change functionality
            thestage.setScene(scene_municipio);
        });
        iv_image_cat_s.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 2"); // change functionality
            thestage.setScene(scene_municipio);
        });
        iv_image_cat_ss.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 3"); // change functionality
            thestage.setScene(scene_municipio);
        });
        iv_image_cat_sss.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 4"); // change functionality
            thestage.setScene(scene_municipio);
        });
        
        //Mouse Listeners Scene Precio
        iv2_image_boton_fondo.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 1"); // change functionality
            thestage.setScene(scene_categoria);
        });
        iv2_image_boton_fondo2.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 2"); // change functionality
            thestage.setScene(scene_categoria);
        });
        iv2_image_boton_fondo3.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 3"); // change functionality
            thestage.setScene(scene_categoria);
        });
        iv_image_cat_gdl.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 1"); // change functionality
            thestage.setScene(scene_categoria);
        });
        iv_image_cat_tlaquepaque.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 2"); // change functionality
            thestage.setScene(scene_categoria);
        });
        iv_image_cat_zapopan.setOnMouseClicked((MouseEvent e) -> {
            System.out.println("Clicked! 3"); // change functionality
            thestage.setScene(scene_categoria);
        });
        primaryStage.setTitle("GDL Out");
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
