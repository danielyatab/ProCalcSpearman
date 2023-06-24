/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.File;

/**
 *
 * @author yatac
 */
public class ControlFile {

    public static void createCarpet() {
        String nombreCarpetaBoleta = "ResultTxt";
        String directorioActual = System.getProperty("user.dir");
        File carpeta = new File(directorioActual, nombreCarpetaBoleta);
        
        /*Verificar si la carpeta existe*/
        if (!carpeta.exists()) {
            boolean carpetaCreada = carpeta.mkdir();
            if (carpetaCreada) {
                System.out.println("La carpeta se ha creado exitosamente.");
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
        }
    }

    public static void createDocument() {
        File file = new File("ResultTxt/config.txt");
        File fileResult =  new File("ResultTxt/result.txt");
        try {
            /*Crear archivo de nuevo*/
            if(!file.exists()){
                file.createNewFile();
            }
            /*Crear archivo de resultados*/
            if(!fileResult.exists()){
                fileResult.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("Error al crear archivo txt :" + e.getMessage());
        }
        
    }
}
