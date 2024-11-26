import java.util.ArrayList;
import java.util.List;

//classe Produto
class Produto {
    private int id;
    private String nome;
    private double preco;

    public Produto (int id , String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return  nome;
    }
        public double getPreco() {
            return preco;
        }
}

class Pedido {
    private int numero;
    private String data;
    private List<Produto> produtos;

    public Pedido(int numero, String data) {
        this.numero = numero;
        this.data = data;
        this.produtos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getData() {
        return data;
    }

    public void adicionarProduto (Produto produto) {
        produtos.add(produto);
        System.out.println( " Produto " + produto.getNome() + " adicionado ao pedido. " );
    
    }

}
//classe Principal
public class ProdutoPrograma {

    public static void main (String[] args) {
        Produto produto1 = new Produto( 1, "Camiseta" ,29.90);
        Produto produto2 = new Produto( 2, "Calça", 79.90);

        Pedido pedido = new Pedido( 101, "24-11-21");
        pedido.adicionarProduto(produto1);
        pedido.adicionarProduto(produto2);

        System.out.println(" Pedidado nuemro " + pedido.getNumero());
        System.out.println(" Data do pedido " + pedido.getData());
    }
}