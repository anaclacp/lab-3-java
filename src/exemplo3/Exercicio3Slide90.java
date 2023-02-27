package exemplo3;

//import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercicio3Slide90 {
    
    public static void main(String[] args) {
    
        Scanner entrada = new Scanner( System.in );
        int num;
        
        System.out.print("Informe o número que deseja consultar a tabuada: ");
        num = entrada.nextInt();
        StringBuilder sb = new StringBuilder ();
        for (int i = 1; i<=10; i++){ 
          sb.append(
            String.format(
            "%d x %d = %d\n", num, i, (num*i)
            )
          );
        }
            System.out.println ("A tabuada é \n" + sb.toString()); 
    }
    
    }

  
      