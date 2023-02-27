
package exemplo02;
//SOLUÇÃO USANDO CAIXA DE DIÁLOGO
import javax.swing.JOptionPane;

public class Slide68Ex1 {
    
    public static void main(String[] args) {
        
                
        String base = JOptionPane.showInputDialog(
            "Informe o valor da base: "
        );
        
        String altura = JOptionPane.showInputDialog(
            "Informe o valor da altura"
        );
        
        double area = (Double.parseDouble(base) *
                      Double.parseDouble(altura) / 2);
        
        JOptionPane.showMessageDialog(
                null,
                //"A área do triângulo retângulo = " + area
                String.format("Área = %.2f", area), 
                "Triangulo",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}

