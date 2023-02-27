package exemplo3;

import javax.swing.JOptionPane;

public class Exercicio3While {
    
    public static void main(String[] args) {
        
        int num = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Informe um número"
            )
        );
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i<=10){
            sb.append(
            String.format(
            " %d x %d = %d\n ", num, i, (num*i)
                )
            );
            i++;
        } 
        JOptionPane.showMessageDialog(null,sb.toString());
    }
    
}
