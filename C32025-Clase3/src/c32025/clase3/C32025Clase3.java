/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c32025.clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C32025Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //i++ sigfnica que se va incremetar
        /*
        int i =0;
        System.out.println("i:"+i);
        i++;
        System.out.println("i:"+i);
        i++;
        i++;
        System.out.println("i:"+i);
        */
        
        /*
        for (int i = 0; i < 10; i++) {
            //JOptionPane.showMessageDialog(null, "i:"+i);
             System.out.println("i:"+i);
        }
        
        for (int i = 10; i > 0; i--) {
            //i > 0
            System.out.println("i:"+i);
            System.out.println("i:"+i);
            System.out.println("i:"+i);
            //i--
        }
        */
        
        /*
        int v1 = Integer.parseInt(JOptionPane.showInputDialog("Digite la catiidad de veces que vamos a gritar viva CR"));
        
        for (int i = 0; i < v1; i++) {
            System.out.println("VIVA CR");
        }*/
        
        /*
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Feliz Año nuevo");
        */
        
        
        // esto es ciclo infinito con FOR
        /*
        for (;;){
        
        }
        */
        /*
        int j =1;
        int m =1;
        for (int i = 0; i < 10; i++) {
            j=i*j;
            m=i+m+j;
            System.out.println("i:"+i);
        }
        //System.out.println("m:"+i); esta linea da error pq no i no existe despues de las llaves
        System.out.println("j:"+j);
        System.out.println("m:"+m);
        
        */
        /*
        while (true){
             JOptionPane.showMessageDialog(null, "ME encicle");
             
        }
        */
        
        /*
        boolean entre=true;
        while (entre) {            
            String salimos = JOptionPane.showInputDialog("Es hora de salir");
            if (salimos.equals("SI") || salimos.equals("si") || salimos.equals("Si")){
                entre=false;
            }
        }*/
        
        // ejemplo de contar hasta 10 con while
        /*
        int i =0;
        while (i<10) {
            System.out.println("i: "+ i);
            i++;
            //i=i+1; en la practica es lo mismo en redimiento es mejor el i++ 
            //esto tambien es valido ++i
        }
        */
        /*
        int i =10;
        while (i>0) {
            System.out.println("i: "+ i);
            i--;
            //i=i+1; en la practica es lo mismo en redimiento es mejor el i++ 
            //esto tambien es valido ++i
        }
        System.out.println("Feliz año nuevo");
        */
        
        /*
        do {            
            System.out.println("este codigo solo se ejecuta una vez pq mi condición de salida es falsa");
        } while (false);
        */
        
        /*
        String menu="Bienvenido Menu 1 \n"
                    + " Opción 1 Solicitar información\n"
                    + " Opción 2 Visualizar información\n"
                    + " Opción 3 Salir \n"
                ;
        int i=0;
        do {            
            i=Integer.parseInt(JOptionPane.showInputDialog(menu));
            
        } while (i!=3);
        System.out.println("Sali");
        */
 
        /*
        int numero=0;
        do {            
            System.out.println("numero: " + numero);
            numero++;
        } while (numero<10);
        */
        
        /*
        int numero=10;
        do {            
            System.out.println("numero: " + numero);
            numero--;
        } while (numero>0);
        */
        /*
        int cant=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                   cant++; 
                }
            }
        }
        JOptionPane.showMessageDialog(null, cant);

        */
        
        
        /*
        int cantidad=0;
        int i=0;
        while (i<10) {
            i++;
            for (int j = 0; j < 10; j++) {
                int k=0;
                do {                    
                    cantidad++;
                    k++;
                } while (k<10);
            }
        }
        System.out.println("cantidad " +cantidad);     
        */
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("  "+ j);                
            }
            System.out.println("");
        }
        
        
        
        
        
        
    }
    
}
