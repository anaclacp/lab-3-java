package exemplo3;

import javax.swing.JOptionPane;

public class Exercicio1Slide88 {
    
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(
            "Nome do produto: "
        );
        double valor = Double.parseDouble(
        JOptionPane.showInputDialog("Valor do produto")
        );
        
        double desconto = 0.0;
        
        if (valor < 0) 
        {
            JOptionPane.showMessageDialog(
            null,
                    "O valor informado deve ser maior que zero"
            );
        }else if (valor >= 50 && valor < 200){
            desconto = 0.05;
        }else if (valor >= 200 && valor < 500){
            desconto = 0.06;
        }else if (valor >= 500 && valor < 1000){
            desconto = 0.07;
        }else if (valor >= 100){
            desconto = 0.08;
        }
    
        
                    JOptionPane.showMessageDialog(
                null,
                String.format(
                    """
                        Produto: %s
                        Valor: R$ %.2f 
                        Valor com Desconto R$ %.2f
                    """,
                    nome, valor, (valor-(valor*desconto))
                )
            );
    }
       
}

