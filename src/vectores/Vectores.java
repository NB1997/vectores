/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectores;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear un prgrama que llene un vector de 10 Elementos luego imprima cuantos son pares y cuantos impares 
        
        int cantPar=0;
        int cantImpar=0;
        Scanner leer = new Scanner(System.in);
        
        int[] datos=new int[10];
        
        System.out.print("LLene el arreglo con 10 registros");
        
        for(int i=0; i<=9; i++){
            datos[i]=leer.nextInt();
            
            if(datos[i]%2==0){
                cantPar++;
            }else{
                cantImpar++;
            }
            
        }
        
        System.out.print("Hay " + cantPar + " numeros pares \n");
        System.out.print("Hay " + cantImpar + " numeros impares");
        
    }
    
}
