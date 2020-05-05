class Pilha { // Explique o porquê da ordem numérica em que a sequência de 1 a 7 aparece?
 private int vet[]; // Pois o algoritmo ele vai fazer o comando de empilhar sendo do 1 ao 7 na ordem
 private int topo; // e depois fara o desempilhar seguindo o conceito de que o ultimo a entrar e o primeiro a sair
                  // seguindo a ordem, o penultimo a entrar e o segundo a sair, e assim por diante, formando a ordem 1 2 3 4 5 6 7 7 6 5 4 3 2 1
 public Pilha(int tamanho)
 {
  vet = new int[tamanho];
  topo = -1;
 }

 public void empilhar(int x)
 {
  topo++;
  vet[topo] = x;
 }

 public int desempilhar()
 {
  int aux = vet[topo];
  topo--;
  return aux;
 }

 public boolean vazia()
 {
  if (topo == -1) return true;
  else return false;
 }
}

public class Exercicio1Pilhas
{ 
 public static void main(String[] args)
 {
  Pilha p1 = new Pilha(10);
  Pilha p2 = new Pilha(10);
  
  p1.empilhar(1);
  p1.empilhar(2);
  p1.empilhar(3);
  p1.empilhar(4);
  p1.empilhar(5);
  p1.empilhar(6);
  p1.empilhar(7);

  while(! p1.vazia())
  {
   int aux = p1.desempilhar();
   System.out.println(aux);
   p2.empilhar( aux );
  }
  
  while(! p2.vazia())
  {
   System.out.println(p2.desempilhar());
  }
 }
}
