/*Faça um programa que leia um número. Se positivo armazene-o em A, se for 
negativo, em B. No final mostrar o resultado.*/

import java.util.Scanner;

public class AprovacaoAluno {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        //leitura
        System.out.println("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.println("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 +nota4)/4;
        
        //verificação da aprovação do aluno
        if (media >= 7) {
            System.out.printf("A média do aluno é %.2f. O aluno foi aprovado \n", media);    
        } else {
           System.out.printf("A média do aluno é %.2f. O aluno não foi aprovado \n", media);    
           
           System.out.printf("Digite a nota de recuperação: ");
           
           double notaRecuperacao = scanner.nextDouble();
           
           double novaMedia = (media + notaRecuperacao) /2;
           
           //verificação da nova media
            if (novaMedia >= 7) {
                System.out.printf("A média do aluno é %.2f. O aluno foi aprovado \n", novaMedia);    
            } else {
                System.out.printf("A média do aluno é %.2f. O aluno não foi aprovado \n", novaMedia);    
            } 
        }
        scanner.close();
    }
}