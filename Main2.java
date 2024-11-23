// Superclasse Carro
class Carro {
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }
}

// Subclasse Fusca
class Fusca extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O Fusca acelera lentamente: Vruum!");
    }
}

// Subclasse Gol
class Gol extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O Gol acelera com potência: Vruuum!");
    }
}

// Subclasse Jetta
class Jetta extends Carro {
    @Override
    public void acelerar() {
        System.out.println("O Jetta acelera rapidamente: Vruuuuuum!");
    }
}

// Classe Teste que não sobrescreve o método acelerar
class Teste extends Carro {
    // Não há necessidade de sobrescrever o método acelerar
}

// Classe principal para testar o Polimorfismo
public class Main2 {
    public static void main(String[] args) {
        // Criando array de Carros
        Carro[] carros = new Carro[4];
        carros[0] = new Fusca();
        carros[1] = new Gol();
        carros[2] = new Jetta();
        carros[3] = new Teste(); // Teste não sobrescreve, então usará a implementação da superclasse

        // Chamo método acelerar() para cada Carro
        for (Carro carro : carros) {
            carro.acelerar(); // Polimorfismo em ação
        }
    }
}