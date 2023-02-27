
package exemplo02;

public class Exercicio1 {
    
    public static void main(String[] args){
        
        double np = 8.5;
        double nf = 7.2;
        double mf = (np*0.40)+(nf*0.6);
        
        System.out.println("A média final é: " + mf);
        
        System.out.println(
            String.format("Média Final: %.1f", mf)
        );
   
    }
    
}
