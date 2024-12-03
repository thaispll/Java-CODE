/*Faça um programa em Java para pagamento de comissão de vendedores de peças, 
levando-se em consideração que sua comissão será de 5% do total da venda e 
que você tem os seguintes dados: 
- Identificação do vendedor 
- Código da peça 
- Preço unitário da peça 
- Quantidade vendida*/
import java.util.Scanner;
//importar Scanner

public class PagamentoComissao {
    // criar Class
    public static void main (String[] args){

    //criar objeto Scanner
    Scanner scanner = new Scanner(System.in);
    
    // Solicitar Identificação do vendedor ao usuário
    System.out.println("Digite a identificação do vendedor: ");
    String idVendedor = scanner.nextLine();
    
    // Solicitar Código da Peça ao usuário
    System.out.println("Digite o código da peça: ");
    String codigoPeca = scanner.nextLine(); 
    
    //Solicitar Preço unitário da Peça ao usuário
    System.out.println("Digite o preço unitário da peça: ");
    double precoUnitario = scanner.nextDouble(); 
    
    //Solicitar quantidade vendida ao usuário
    System.out.println("Digite a quantidade vendida: ");
    int quantidadeVendida = scanner.nextInt();
    
    // criar totalVenda = preco * uni
    double totalVenda = precoUnitario * quantidadeVendida;
    
    // criar comissao = totalVenda * 5/100
    double comissao = totalVenda * 5/100;    
    
    //mostrar ao vendedor todas as variáveis
    System.out.println("Identificação do(a) vendedor(a): " + idVendedor);
    System.out.println("Código da peça: " + codigoPeca);
    System.out.println("Quantidade vendida: "+ quantidadeVendida);
    
    //Java para printf utiliza , antes da variável
    System.out.printf("Total da venda: %.2f %n ", totalVenda);
    System.out.printf("Comissão do(a) vendedor(a): %.2f", comissao);
    
    scanner.close();
    }
}





