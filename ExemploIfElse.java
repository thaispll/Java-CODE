//Exercício que verifica o nível de conhecimento de programação com base nos anos de experiência
public class ExemploIfElse {
    public static void main (String[] args){
        int anosDeExperiencia = 5;
        if(anosDeExperiencia <2) {
            System.out.println("Você é um desenvolvedor júnior!");
        } else if (anosDeExperiencia >= 2 && anosDeExperiencia <5) {
            System.out.println("Você é um desenvolvedor pleno!");
        } else {
            System.out.println("Você é um desenvolvedor sênior!");
        }
    }
}