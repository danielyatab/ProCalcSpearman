/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import View.Static;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author yatac
 */
public class ControlTxt {
    
    public static void exportTxt(){
        try {
            BufferedWriter writeTxt =  new BufferedWriter(new FileWriter("ResultTxt/config.txt"));
            for(int i=0; i<Static.xList.size();i++){
                if(i == Static.xList.size()-1){
                    writeTxt.write(Static.xList.get(i)+"");
                }else {
                    writeTxt.write(Static.xList.get(i)+",");
                }
            }
            writeTxt.newLine();
            for(int i=0; i<Static.yList.size();i++){
                if(i == Static.yList.size()-1){
                    writeTxt.write(Static.yList.get(i)+"");
                }else {
                    writeTxt.write(Static.yList.get(i)+",");
                }
            }
            writeTxt.close();
            JOptionPane.showMessageDialog(null, "Exportado con exito :)","",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Error al escribir en el archibo txt : " + e.getMessage());
        }
    }
    
    public static void importTxt(){
        
    }
    
}
