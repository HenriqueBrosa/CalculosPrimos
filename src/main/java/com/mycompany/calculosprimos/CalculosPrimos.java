/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculosprimos;

/**
 *
 * @author 10724263295
 */
public class CalculosPrimos {
    
    
    public static void main(String ang[]){
        
        int inicio = 5;
        int fim = 100;
        
        for (int i = inicio; i<= fim; i++) {
            int conta = 0;
            
            for (int j = i; j>= 2 ; j--) {
                if (i % j == 0) {

                    conta++;
                    {
                        if (conta == 2 ){
                            System.out.println("O numero" + i + "é primo");
                        }
                    }
                }
            }
        }
    }
}
