package exemplo02;

import java.util.Scanner;

public class ComandosDeEntrada {
    
    public static void main(String[] args) {
        //Comandos de entrada
        
        //entrada de dados
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o primeiro valor: ");
        //int valor1 = entrada.nextInt();
        double valor1 = entrada.nextDouble();
        
        System.out.print("Informe o segundo valor: ");
        //int valor2 = entrada.nextInt();
        double valor2 = entrada.nextDouble();
        System.out.println("Soma = " + (valor1+valor2));
        
        
        
        
    }
    
    
}
