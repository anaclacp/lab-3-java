
package exemplo3;


public class Vetores {
    
    public static void main(String[] args) {
        
        //Vetor com cinco elementos
        int v[] = new int[7];
        
        //Outra forma de declarar vetor é ja dar os valores como:
        //int vet[] = {10,20,30,40,50};
        
        //Preencher o vetor
        //Lengh retorna o valor do vetor
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)(Math.random()*100);
                       
        }
        //Exibir os valores
            System.out.println("Tamanho = " + v.length);
        for (int i = 0; i < v.length; i++) {
            System.out.println(
                    String.format("[%d] = %d", i, v[i])
            );
            
            
        }
    }
}
