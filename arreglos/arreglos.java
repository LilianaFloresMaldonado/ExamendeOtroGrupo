package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class arreglos {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int matriz [][], nFilas,nCol;
        
        nFilas=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas:"));
         nCol=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas:"));
       
         matriz=new int[nFilas][nCol];
         System.out.println("Digite la matriz");
         for(int i=0; i<nFilas;i++){
             for(int j=0; j<nCol;j++){
                 System.out.print("Matriz["+i+"]["+j+"]:");
                 matriz[i][j]=leer.nextInt();
             }
         }
         System.out.println("La matriz es:");
         for(int i=0; i<nFilas;i++){
             for(int j=0; j<nCol;j++){
                 System.out.print (matriz[i][j]+"");
                 }
        System.out.println("");
    }
             for(int i=0; i<nFilas;i++){
            int restaFilas = 0;
                 for(int j=0;j<nCol;j++){
                     if (j==0){
                     restaFilas=matriz[i][j];  
                     }
                     else{
                     restaFilas-=matriz[i][j];
                      
                 }
                  System.out.println("La resta de la fila:["+i+"]es:"+restaFilas);   
                   
                        
                        
                    }
                 }
              System.out.println("");
             }
}
