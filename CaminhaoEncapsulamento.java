public class CaminhaoEncapsulamento {
    private String modelo;
    private double capacidadeCarga;

    // Construtor
    public CaminhaoEncapsulamento(String modelo, double capacidadeCarga) {
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }

    // Métodos públicos para acessar os dados
    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        if (capacidadeCarga < 0) {
            throw new IllegalArgumentException("A capacidade de carga não pode ser negativa");
        }
        this.capacidadeCarga = capacidadeCarga;
    }

    // Método principal
    public static void main(String[] args) {
        // Criando um objeto Caminhão
        CaminhaoEncapsulamento caminhao = new CaminhaoEncapsulamento("Volvo FH", 25.5);
        
        // Exibindo informações do caminhão
        System.out.println("Modelo: " + caminhao.getModelo());
        System.out.println("Capacidade de Carga: " + caminhao.getCapacidadeCarga() + " toneladas");
    }
}