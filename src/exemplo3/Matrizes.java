package exemplo3;

/*Java permite criar Matrizes Esparsas (são matrizes nas quais a maioria das 
posições é preenchida por zeros) 

Exemplo
1 2
3 4 5
6 7 8 9

*/

public class Matrizes {
    
    public static void main(String[] args) {
        
        //Matriz com 3 linhas e 4 colunas
        int mat[][] = new int [3][4];
        
        //Preencher a matriz
        //O mat.length mostra a quantidade de linha ou coluna!
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat [i][j] = (int)(Math.random()*10);   
            }   
        } 
        //Exibir os valors
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j]+"\t");    
            }
            System.out.print("\n"); 
        }
    } 
}
