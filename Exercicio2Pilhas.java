import java.util.*;
import javax.swing.*;

class Pilha {
 private char vet[];
 private int topo;

 public Pilha(int tamanho)
 {
  vet = new char[tamanho];
  topo = -1;
 }

 public void empilhar(char x)
 {
  topo++;
  vet[topo] = x;
 }

 public char desempilhar()
 {
  char aux = vet[topo];
  topo--;
  return aux;
 }

 public boolean vazia()
 {
  if (topo == -1) return true;
  else return false;
 }
}

public class Exercicio2Pilhas
{ 
 public static void main(String[] args)
 {
  Pilha p1 = new Pilha(100);
  
  String palavra = JOptionPane.showInputDialog("Digite uma palavra:"); 
  
  
  for(int i=0; i<palavra.length(); i++)
  {
      p1.empilhar(palavra.charAt(i));
  }
  
  String invertida="";
  while(! p1.vazia())
  {
   char aux = p1.desempilhar();
   invertida = invertida + aux;
  }
  
  System.out.println("Invertida = " + invertida);
  
  if(palavra.equals(invertida)) System.out.println("E palindrome");
  else  System.out.println("Nao e palíndrome");
 }
}