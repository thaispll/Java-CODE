/*Escreva um programa que leia dois números inteiros e apresente as opções para 
usuário escolher o que deseja realizar: 
1 – Verificar se um dos números lidos é ou não múltiplo do outro 
2 – Verificar se os dois números lidos são pares 
3 – Verificar se a média dos dois números é maior ou igual a 7. 
4 – Sair*/

import java.util.Scanner;

public class VerificadorNumero{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println(" Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();
        
        int opcao;
        
        do {
            System.out.println("\n Escolha uma opção: ");
            System.out.println("1 -Verificar se um dos números lidos é ou não múltiplo do outro ");
            System.out.println("2 -Verificar se os dois números lidos são pares ");
            System.out.println("3 -Verificar se a média dos dois números é maior ou igual a 7 ");
            System.out.println("4 - Sair");
            System.out.println("Opção escolhida: ");
            opcao = scanner.nextInt();
            
            switch (opcao){
                case 1:
                    verificarMultiplo(numero1, numero2);
                    break;
                    
                case 2:
                    verificarPares(numero1, numero2);
                    break;
                
                case 3:
                    verificarMedia(numero1, numero2);
                    break;
                    
                case 4:
                    System.out.println("Finalizando o programa");
                    break;
                    
                default:
                    System.out.println("Opção Inválida! Tente novamente");
            }
        } while (opcao !=4);
            scanner.close();
    }
    //Metodo para verificar se é multiplo ou não
    private static void verificarMultiplo( int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println(num1 + " é múltiplo de " + num2);
        } else if (num2 % num1 == 0 ){
            System.out.println(num2 + " é múltiplo de " + num1);
        } else {
            System.out.println("Nenhum dos números é múltiplo do outro");
        }
    }
    
    //Metodo para verificar se são pares
    private static void verificarPares( int num1, int num2){
        if( num1 % 2 ==0 && num2 % 2 ==0){
            System.out.println("Ambos os números são pares");
        } else {
            System.out.println("Nenhum dos números é par do outro");
        }
    }
    
    //Metodo para verificar se a media é maior ou igual a 7
    private static void verificarMedia( int num1, int num2){
        double media = (num1 + num2)/2;
        
        if(media >= 7){
             System.out.println("A média dos dois números é: " +media+ ", que é maior ou igual a 7.");
        } else {
             System.out.println("A média dos dois números é: " +media+ ", que é menor que 7.");
        }
    }
}

