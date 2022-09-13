/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajarconobligatorio;

/**
 *
 * @author rl850
 */
public class FuncionAuxiliar {
    public static String mostrarmatriz(String[][] m) {
        String ret="";
       
        int filas= m.length;
        int columnas=m[0].length;
        for (int i=0; i<filas;i++){
           for (int j=0;j<columnas;j++){
              ret=ret+ m[i][j]+ " - ";
           }
              ret=ret+"\n";
        }             
        return ret;
    }  
}
