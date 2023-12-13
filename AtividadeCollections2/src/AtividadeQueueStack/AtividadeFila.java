package AtividadeQueueStack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> filaBanco = new LinkedList<String>();
		Scanner ler = new Scanner(System.in);
		int op;
		
		
		do {
			System.out.println("\n------------------------------");
			System.out.println("\n\t\t Fila do Banco: ");
			System.out.println("\n 1- Adicionar cliente na fila  ");
			System.out.println("\n 2- Listar todos os clientes");
			System.out.println("\n 3- Retirar cliente da fia ");
			System.out.println("\n 0- Sair?");
			System.out.println("\n------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = ler.nextInt();
			
			switch (op) {
			case 1:
				ler.nextLine();
				System.out.println("\nDigite o nome: ");
				filaBanco.add(ler.nextLine());
				System.out.println("\n Cliente adicionado: ");
				break;
			case 2:
				System.out.println("\nLista de Clientes na fila: ");
				System.out.println(filaBanco);
				break;
			
			case 3:
				ler.nextLine();
				filaBanco.remove();
				System.out.println( "Fila: "+ filaBanco  +  "\n\t O Cliente foi Chamado!");
				if( filaBanco.isEmpty()){
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
