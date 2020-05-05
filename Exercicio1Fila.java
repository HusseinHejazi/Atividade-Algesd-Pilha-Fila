 class Fila { // A ordem da fila em comparação a pilha muda que, a fila ela enfilera um numero
      private int vet[]; // e esse mesmo numero e o primeiro a sair, ao contrario da pilha que o primeiro numero a ser enfileirado
      private int inicio, fim, quantidade; // e o ultimo numero a sair, portanto, a fila tem o conceito de que entra o 1 primeiro e ele sai primeiro, enfileira o segundo numero, e ele é o segundo a sair e assim por diante.
   
       public Fila(int tamanho)
      {
         vet = new int[tamanho];
         inicio = fim = quantidade = 0;
      }
   
       public void enfileirar(int x)
      {
         vet[fim] = x;
         fim++;
         quantidade++;
         if (fim == vet.length)
            fim = 0;
      }
   
       public int desenfileirar()
      {
         int resp = vet[inicio];
         inicio++;
         quantidade--;
         if (inicio == vet.length)
            inicio = 0;
         return resp;
      }
   
       public boolean vazia()
      {
         if (quantidade == 0) 
            return true;
         else 
            return false;
      }
   
       public boolean cheia()
      {
         if (quantidade == vet.length) 
            return true;
         else 
            return false;
      }
   }

    public class Exercicio1Fila
   { 
       public static void main(String[] args)
      {
         Fila f = new Fila(10);
      
         System.out.println("Colocando 8 números na fila.");
         for(int i = 1; i <= 8; i++)
            f.enfileirar(i);
      
         System.out.println("Retirando todos os elementos da fila:");
         while(! f.vazia())
         {
            System.out.println( f.desenfileirar() );
         }
      
         System.out.println("Colocando mais 10 números na fila.");
      
         for(int i = 9; i <= 18; i++)
            f.enfileirar(i);
      
         System.out.println("Retirando todos os elementos da fila:");
      
         while(! f.vazia())
         {
            System.out.println( f.desenfileirar() );
         }
      }
   }