package exemplo3;

import java.text.DecimalFormat;

public class OperacoesMatematicas {

    public static void main(String[] args) {
        
        //Decimal Format (Formatar Número)
        
        DecimalFormat df = new DecimalFormat();
        
        double v1 = 70.2;
        //Valor sempre será apresentado com duas casas decimais
        //# Significa que pode ter vários valores
        df.applyPattern("#0.00");
        System.out.println(df.format(v1));
        
        //Formata no formato de moeda
        double v2 = 2583.65;
        df.applyPattern(" R$ #, ##0.00");
        System.out.println(df.format(v2));

    }
   
}
