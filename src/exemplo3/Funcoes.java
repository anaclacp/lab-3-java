package exemplo3;



public class Funcoes {
    
    public static void main(String[] args) {
        int s = soma(10,20);
        exibir(s);   
    }
    
    public static int soma(int a, int b){
        return (a+b);
    }
    
    public static void exibir(int valor){
        System.out.println(valor);
        
    }
}
