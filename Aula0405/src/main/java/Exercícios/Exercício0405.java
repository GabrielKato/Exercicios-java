/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercícios;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Exercício0405 {

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
    
Scanner teclado = new Scanner(System.in);    
        
/*O tipo de dados double é usado quando precisamos 
armazenar números de ponto-flutuante (com parte fracionária) 
na faixa 4.94065645841246544e-324 até 1.79769313486231570e+308.
Possui precisão de 14 ou 15 dígitos significativos.*/

    //Double
    
    double n1, n2, tec;
    
    System.out.println("Digite o primeiro numero: ");
    n1 = teclado.nextDouble();
    System.out.println("Digite o segundo numero: ");
    n2 = teclado.nextDouble();
    
    //soma
    tec = n1+n2;
    System.out.println("A soma dos números é: "+tec);
    
    //subtração
    tec = n1-n2;
    System.out.println("A subtração dos números é: "+tec);
    
    //multiplicação
    tec = n1*n2;
    System.out.println("A multiplicação dos números é: "+tec);
    
    //divisão
    tec = n1/n2;
    System.out.println("A divisão dos números é: "+tec);
    
    
    /*Float:O tipo de dados float é usado quando precisamos 
    armazenar números de ponto-flutuante (com parte fracionária) 
    na faixa 1.401298464324817e-45f até 3.402823476638528860e+38f.
    Possui precisão de 6 ou 7 dígitos significativos.*/
    
    //float
    
    
    float lixo1, lixo2, pao;
    
    System.out.println("Digite o primeiro numero: ");
    lixo1 = teclado.nextFloat();
    System.out.println("Digite o segundo numero: ");
    lixo2 = teclado.nextFloat();
    
    //soma
    pao = lixo1+lixo2;
    System.out.println("A soma dos números é: "+pao);
    
    //subtração
    pao = lixo1-lixo2;
    System.out.println("A subtração dos números é: "+pao);
    
    //multiplicação
    pao = lixo1*lixo2;
    System.out.println("A multiplicação dos números é: "+pao);
    
    //divisão
    pao = lixo1/lixo2;
    System.out.println("A divisão dos números é: "+pao);
        
    //Mais diferenças
    
    //1°-O double ocupa 32 bits a mais que o float (o dobro do espaço);
    /*2°-Dependendo do hardware, o cálculo de um ou outro será mais rápido. 
      Placas de vídeo geralmente operam com floats, 
      as mais novas, com doubles.*/
    }
    
}
