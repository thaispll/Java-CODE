//Faça um programa para calcular o estoque médio de uma peça, sendo que:
//ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2. em Java

import java.util.Scanner;

//criar classe EstoqueMedio
public class EstoqueMedio {
    public static void main(String[] args){
    // Criar objeto scanner para leitura dos dados do usuário
    Scanner scanner = new Scanner(System.in);
    
    //solicitar quantidade mínima do EstoqueMedio
    System.out.println("Digite a quantidade mínima do estoque: ");
    double quantidadeMinima = scanner.nextDouble();
    
    //solicitar quantidade máxima do EstoqueMedio
    System.out.println("Digite a quantidade máxima do estoque: ");
    double quantidadeMaxima = scanner.nextDouble();

    // calcular estoque MÉDIO
    double estoqueMedio = (quantidadeMinima + quantidadeMaxima)/2;

    //Exibir o resultado para o usuário 
    System.out.println("O estoque médio é: "+ estoqueMedio);
    }
}



