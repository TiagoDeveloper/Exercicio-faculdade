package br.com.tiagoDeveloper.lista;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
	
	private ArrayList<String> nome = new ArrayList<String>();
	private String nomeAdd;
	private Scanner entrada = new Scanner(System.in);
	private int op;
	
	
	
	public Lista(){
		
		do{
			
			
			this.op = menu()
;		
			controller(this.op);
		
		}while(this.op != 0);
		
	}
	
	public void controller(int op){

			if(op == 1){
				

				this.adicionarNomes();
				
				
			}else if(op ==2){
				
				this.pesquisarNome();
				
			}else if(op == 3){
				
				this.limparLista();
				
				
			}else if(op == 4){
				
				this.pesquisarTodos();
				
				
			}else if(op == 0){
				
				
				System.out.println("Obrigado por usar meu programa!!!");
				
				
			}else{
				
				System.out.println("Opção inválida!!!");
			}

		}

	public int menu(){
		int op;
		
		System.out.println("1 - Adicionar nome");
		System.out.println("2 - Pesquisar nome");
		System.out.println("3 - Limpar Lista");
		System.out.println("4 - Listar todos");
		System.out.println("0 - Sair");
		System.out.print("Digite: ");
		op = Integer.parseInt(entrada.nextLine());
		
		System.out.println("------------------------------");
		
		
		return op;
		
		
		
	}

	
	public void adicionarNomes(){
		String escolha;
		
		do{
			
			
			System.out.println("Digite o nome a ser adicionado:");
			this.nomeAdd = entrada.nextLine().toString();
			
			this.nome.add(this.nomeAdd);
			
			
			
			System.out.println("Deseja mais um? (Sim)/(Não)");
			escolha = this.entrada.nextLine().toString();
		}while(escolha.contains("sim") || escolha.contains("Sim") || escolha.contains("SIM"));
		
	}
	public void pesquisarNome(){		
		int cont = 0;
		
		System.out.print("Digite o nome a ser pesquisado:");
		String nomeAdd = entrada.nextLine().toString();
		
		for(int i = 0; i < this.nome.size(); i++){
			
			
			if(this.nome.get(i).contains(nomeAdd)){
				
				System.out.print("Tem esse nome na memória:");
				System.out.println("["+this.nome.get(i)+"] na posição: "+ "["+ i +"]");
				
				if(removeNome()){
					
					this.nome.remove(i);
				}
				
			}else{
				
				cont++;
				
			}
			
		}
		if(cont == this.nome.size()){
			System.out.println("Não tem esse nome na memória!!!");
		}
	}
	
	public void pesquisarTodos(){		
		
		System.out.println("Nomes em memoria:");
		
		
		for(String temp : this.nome){
			
			
			
				System.out.print("["+temp+"]");
				
			
			
		}
		
		System.out.println();
	}
	
	public boolean removeNome(){
		String escolha;
		System.out.println("Deseja excluí-lo? (Sim)/(Não)");
		escolha = this.entrada.nextLine().toString();
		
		if(escolha.contains("sim") || escolha.contains("Sim") || escolha.contains("SIM")){
			
			return true;
			
		}else{
			
			return false;
		}
		
		
	}
	
	public void limparLista(){
		
		
		this.nome.clear();
		System.out.println("Lista Limpa!!!");
		
		
	}
}
