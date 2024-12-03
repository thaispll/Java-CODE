/*Escreva um programa que leia dois números inteiros e mostre todos os 
relacionamentos de ordem existentes entre eles. Os relacionamentos possíveis 
são: Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual.*/

import java.util.Scanner;

public class RelacionamentosDeOrdem {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        
        //Verificação dos RelacionamentosDeOrdem
        
        //Igual
        if (numero1 == numero2) {
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("Os números são diferentes!");
        }
        
        //Maior
        if (numero1 > numero2) {
            System.out.println("O primeiro número é o maior que o segundo");
        } else if( numero1<numero2) {
            System.out.println("O primeiro número é menor que o segundo");
        }
                
        //Maior ou igual
        if (numero1 >= numero2) {
            System.out.println("O primeiro número é maior ou igual ao segundo");
        } 
        
        if( numero1 <= numero2) {
            System.out.println("O primeiro número é menor ou igual ao segundo");
        }
       
       scanner.close();
    }
}