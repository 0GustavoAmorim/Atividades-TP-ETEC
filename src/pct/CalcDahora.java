/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class CalcDahora {
    public static void main(String[] args) {
            double n1 ,n2, resultado;
            int op;
            Scanner entrada = new Scanner(System.in);
        do{
           System.out.println("\n\t\t---Escolha a operação---\t");
           System.out.println("[1] ADIÇÃO");
           System.out.println("[2] SUBTRAÇÃO");
           System.out.println("[3] MULTIPLICAÇÃO");
           System.out.println("[4] DIVISÃO");
           System.out.println("[5] SAIR");
           op = entrada.nextInt();
           switch(op){
               case 1:{
                   System.out.println("--ADIÇÃO--");
                   System.out.println("Informe o primeiro numero: ");
                   n1 = entrada.nextDouble();
                   System.out.println("Informe o segundo numero: ");
                   n2 = entrada.nextDouble();
                   resultado = n1 + n2;
                   System.out.printf("%f + %f = %f", n1, n2, resultado);
                   break;
               }
               case 2:{
                   System.out.println("--SUBTRAÇÃO--");
                   System.out.println("Informe o primeiro numero: ");
                   n1 = entrada.nextDouble();
                   System.out.println("Informe o segundo numero: ");
                   n2 = entrada.nextDouble();
                   resultado = n1 - n2;
                   System.out.printf("%f - %f = %f", n1, n2, resultado);
                   break;
               }
               case 3:{
                   System.out.println("--MULTIPLICAÇÃO--");
                   System.out.println("Informe o primeiro numero: ");
                   n1 = entrada.nextDouble();
                   System.out.println("Informe o segundo numero: ");
                   n2 = entrada.nextDouble();
                   resultado = n1 * n2;
                   System.out.printf("%f * %f = %f", n1, n2, resultado);
                   break;
               }
               case 4:{
                   System.out.println("--DIVISÃO--");
                   System.out.println("Informe o primeiro numero: ");
                   n1 = entrada.nextDouble();
                   System.out.println("Informe o segundo numero: ");
                   n2 = entrada.nextDouble();
                   resultado = n1 / n2;
                   System.out.printf("%f * %f = %f", n1, n2, resultado);
                   break;
               }
               case 5:{
                   System.out.println("faloooooou");
                   break;
               }
           }
        }while(op != 5);
    }
}
