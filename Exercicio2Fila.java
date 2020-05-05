class Fila {
      private int vet[];
      private int inicio, fim, quantidade;
   
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

    public class Exercicio2Fila
   { 
       public static void main(String args[])
      {
         int mat[][]= {
               {0,0,1,1,1,1,0,0,1,1,1,1,0,0},
               {0,1,0,0,0,0,1,1,0,0,0,0,1,0},
               {1,0,0,0,0,0,0,0,0,0,0,0,0,1},
               {1,0,0,0,0,0,0,0,0,0,0,0,0,1},
               {0,1,0,0,0,0,0,0,0,0,0,0,1,0},
               {0,0,1,0,0,0,0,0,0,0,0,1,0,0},
               {0,0,0,1,0,0,0,0,0,0,1,0,0,0},
               {0,0,0,0,1,0,0,0,0,1,0,0,0,0},
               {0,0,0,0,0,1,0,0,1,0,0,0,0,0},
               {0,0,0,0,0,0,1,1,0,0,0,0,0,0},
               {0,0,0,0,0,0,0,0,0,0,0,0,0,0}
                      };
      
         
         int x=2, y=2;   
         System.out.println("Coordenadas iniciais: x = " + x + ", y = " + y + "\n\n");
         Fila f = new Fila(1000);
         f.enfileirar(x);
         f.enfileirar(y); 
         while(!f.vazia())
         {
            x=f.desenfileirar();
            y=f.desenfileirar(); 
            if(mat[x][y] == 0) 
            {
               mat[x][y] = 2; 
               if((x+1)<mat.length && mat[x+1][y] == 0) 
               {
                  f.enfileirar(x+1);
                  f.enfileirar(y);
               }
         }
   }
}
}