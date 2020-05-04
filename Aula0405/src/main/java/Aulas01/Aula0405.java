/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aulas01;

import java.util.Scanner;

/**
 *
 * @author gabriel
 */
public class Aula0405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tipo, nome, valor
        // int-Números inteiros, String-Palavras, double-Números quebrados
        
        //crie uma variável chamada número, do tipo inteira com valor 10
        
        int numero = 10;
        //crie agora uma variável chamada nome que armazene seu nome
        String nome = "Gabriel";
        //String com S maiúsculo
      //digite sout+tab(tecla)
       System.out.println("Meu nome é: "+nome+" e o valor da variavel é "+numero);
        //Shift+F6 para executar
        //Operações matemáticas
        
        //------------------------------------------------------------------------
        
        //Soma, Subtração, Multiplicação e Divisão
        
        int resultado;
        int a = 10;
        int b = 5;
        
        //Soma
        
        resultado = a+b;
        System.out.println("O resultado de a+b é : "+resultado);
        
       //Subtração
       
        resultado = a-b;
        System.out.println("O resultado de a-b é : "+resultado);
       
      //Multiplicação
      
        resultado = a*b;
        System.out.println("O resultado de a*b é : "+resultado);
     
     //Divisão
     
        resultado = a/b;
        System.out.println("O resultado de a/b é : "+resultado);
        
        //Crie uma variável do tipo double
        //Diferença entre double e float
        
    
        //-----------------------------------------------------------------------
        
        //Classe Scanner
        
        //Quero que o usuário digite o nome dele, e quero mostrar isso
        
        String nomeUsuario;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Olá! informe seu nome: ");

        nomeUsuario = teclado.next();
        
        System.out.println("Seu nome é: "+nomeUsuario);
        
        int n1, n2, tecsoma;
        
        System.out.println("Digite o primeiro numero: ");
        n1 = teclado.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = teclado.nextInt();
        
        tecsoma = n1+n2;
        
        System.out.println("A soma dos números é: "+tecsoma);
                
                
       
    
    }
    
   
    
}
