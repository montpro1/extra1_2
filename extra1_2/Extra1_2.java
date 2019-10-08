/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra1_2;

import java.util.Scanner;

/**
 *
 * @author vmontestovar
 */
public class Extra1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Teclee el radio del triangulo");
        float radio=teclado.nextFloat();
        float area=(float)(Math.PI*Math.pow(radio, radio));
        System.out.println("El area del triangulo es "+area);
        
        
        
        
        // TODO code application logic here
    }
    
}
