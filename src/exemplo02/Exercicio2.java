
package exemplo02;

import javax.swing.JOptionPane;

public class Exercicio2 {
    
    public static void main(String[] args){
        
    String nome = "João da Silva";
    double altura = 1.95;
    double peso = 92.58;
    double imc = peso / (altura * altura);
    /* ou podemos usar Math.pow
    double imc = peso/Math.pow(altura,2); */
    JOptionPane.showMessageDialog(
    null,
            /* podemos usar também o string format
            String.format("%s tem imc igual a %2.f", nome,imc)*/ 
        "O IMC do João da Silva é: " + imc);
    }
}

