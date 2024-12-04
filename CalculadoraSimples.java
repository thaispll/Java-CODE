/*Escreva um programa que exiba as seguintes opções e realize os que se pede 
em cada uma delas: 
1 – Adição 
2 – Subtração 
3 – Multiplicação 
4 – Divisão
A partir da opção escolhida, o programa deverá solicitar para que o usuário digite 
dois números. Em seguida, o programa deve exibir o resultado da opção indicada 
pelo usuário e perguntar ao usuário se ele deseja voltar ao menu principal. Caso 
a resposta seja ´S´ ou ´s´, deverá voltar ao menu, caso contrário deverá encerrar 
o programa*/

import java.util.Scanner;

public class CalculadoraSimples{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        while (continuar) {
            //Exibe o menu
            
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            
            System.out.println("Digite a sua opção: ");
            int opcao = scanner.nextInt();
            
            //Solicita numeros ao usuário
            System.out.println("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            
            double resultado = 0;
            
            switch (opcao){
                case 1: 
                    resultado = num1 + num2;
                    System.out.println("Resultado da adiçao: " +resultado);
                    break;
                    
                case 2: 
                    resultado = num1 - num2;
                    System.out.println("Resultado da subtração: " +resultado);
                    break;
                    
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado da multiplicação: " +resultado);
                    break;
                
                case 4:
                    if (num2 != 0){
                        resultado = num1 / num2;
                        System.out.println("Resultado da divisão: " +resultado);
                    }  else {
                        System.out.println("Erro:Não é possivel fazer divisão por zero");
                    }  
                    break;
                    
                    default:
                        System.out.println("Opção inválida. Tente novamente");
                        continue;

            }
            // Pergunta se o usuário deseja voltar ao menu
            System.out.print("Deseja voltar ao menu principal? (S/N): ");
            scanner.nextLine(); // Limpa o buffer do scanner
            String resposta = scanner.nextLine();

            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false; // Encerra o loop se a resposta não for 'S' ou 's'
            }
        }

        // Encerra o programa
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}

