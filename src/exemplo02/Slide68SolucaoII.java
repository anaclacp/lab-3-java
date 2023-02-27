package exemplo02;
//SOLUÇÃO UTILIZANDO O SCANNER E PRINTLN
import java.util.Scanner;

public class Slide68SolucaoII {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o valor da altura: ");
        double altura = entrada.nextDouble();
        
        System.out.print("Informe o valor da base: ");
        double base = entrada.nextDouble();
        
        System.out.println(String.format(
        "Portanto, a área do triângulo retângulo é = = %.2f", ((base * altura)/2)
        ));
        //System.out.println("Portanto, a área do triângulo retângulo é = " + (base * altura)/2);
    }
}
