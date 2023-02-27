package exemplo02;
//Comandos de entrada II
import javax.swing.JOptionPane;

public class ComandosDeEntradaII {
    
    public static void main(String[] args) {
        
        /*é necessário declarar uma string para InputDialog porque todas as entradas são reconhecidas como string,
        para realizar um cálculo (seja int ou double), basta converter a string em double. 
        >>> Double.parseDouble(str1)*/
        
        String str1 = JOptionPane.showInputDialog(
            "Informe o primeiro valor"
        );
        
        String str2 = JOptionPane.showInputDialog(
            "Informe o segundo valor"
        );
        
        double soma = Double.parseDouble(str1) +
                      Double.parseDouble(str2);
        
        JOptionPane.showMessageDialog(
                null, "Soma = " + soma
        );
    }
}
