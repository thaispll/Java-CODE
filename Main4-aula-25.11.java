class Motor {
    private int potencia;
    private String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }
    public void ligar(){
        System.out.println("Motor movido a " + tipo + " ligado com potência de " + potencia + "CV.");
    }
    
    public void desligar(){
        System.out.println("O Motor movido à " + tipo + " está desligado.");
    }
    
    public int getPotencia(){
        return potencia;
    }
    
    public String getTipo() {
        return tipo;
    }
}

class Carro {
    private String modelo;
    private String cor;
    private Motor motor;
    
    public Carro(String modelo, String cor, Motor motor){
        this.modelo = modelo;
        this.cor = cor;
        this.motor = motor;
    }
    
    public void acelerar () {
        motor.ligar();
        System.out.println("O "+ modelo + " " + cor +  " está acelerando com potência de " +motor.getPotencia() + "CV." );
    }
    public void frear() {
        System.out.println("O "+ modelo + " " + cor +  " está freando.");
        motor.desligar();
    }
}

public class Main4 {
    public static void main(String[] args){
        Motor motor = new Motor(150, "Gasolina");
        Carro carro = new Carro("Fusca", "Azul", motor);
        
        carro.acelerar();
        carro.frear();
    }
}