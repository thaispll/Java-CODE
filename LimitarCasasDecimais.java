import java.text.DecimalFormat;

public class LimitarCasasDecimais {
    public static void main(String[] args) {
        double numero = 23.9999999999999;
        DecimalFormat df = new DecimalFormat("0.00"); // Define 2 casas decimais
        System.out.println("Número formatado: " + df.format(numero));
    }
}