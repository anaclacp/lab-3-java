//CÁLCULO DO IMC

package exemplo02;

import javax.swing.JOptionPane;

public class Slide69Ex2 {
    
    public static void main(String[] args) {
        
        String str1 = JOptionPane.showInputDialog(
                "Informe a sua altura: "
        );
        String str2 = JOptionPane.showInputDialog (
                "Informe o seu peso: "
        );
        double peso = Double.parseDouble(str2);
        double altura = Double.parseDouble (str1);
        JOptionPane.showMessageDialog(null,
                String.format("IMC = %.2f", (peso/Math.pow(altura, 2)))
                );
        
    }
    
}
