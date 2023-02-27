package exemplo02;

//Comandos de saída

import javax.swing.JOptionPane;

public class ComandosDeSaida {
    
    public static void main(String [] args) {
        
        System.out.print("Segunda\n");
        System.out.println("Terça");
        
        JOptionPane.showMessageDialog(
        null,
                "Programando em Java!"
        );
        
        JOptionPane.showMessageDialog(
        null,
                
            "Demonstração do uso da caixa de diálogo na linguagem Java",
            " Lab.Programação III",
                JOptionPane.ERROR_MESSAGE
        );

        
    }
    
}
