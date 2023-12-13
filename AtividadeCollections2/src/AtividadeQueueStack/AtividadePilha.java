package AtividadeQueueStack;

import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> livro = new Stack<String>();
		Scanner ler = new Scanner(System.in);
		int op;
		
		
		do {
			
			System.out.println("\n------------------------------");
			System.out.println("\n\t\t Pilha de Livros: ");
			System.out.println("\n 1- Adicionar livros na Pilha  ");
			System.out.println("\n 2- Mostrar todos os livros na pilha");
			System.out.println("\n 3- Retirar livro da pilha ");
			System.out.println("\n 0- Sair?");
			System.out.println("\n------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = ler.nextInt();
			
			
			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o nome do livro: ");
				livro.push(ler.nextLine());
				System.out.println("\n Livro adicionado!");
				break;
			case 2:
				System.out.println("\nLista de livros na pilha : ");
				System.out.println(livro);
				break;
			
			case 3:
				ler.nextLine();
				livro.pop();
				System.out.println(  livro +  "\n\t Um Livro foi retirado!");
				if( livro.isEmpty()){
					System.out.println(" A fila está vazia");
					
				}
				break;
			case 0:
				System.out.println( "Programa Finalizado!");
				break;
				
			default:
				System.out.println("Opção Inválida");
			}
			
			
			
		}while(op != 0);
		
		ler.close();
	}
	
	

}
