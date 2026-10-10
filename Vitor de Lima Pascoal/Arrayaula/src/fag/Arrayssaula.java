package fag;
import java.util.ArrayList;
import java.util.Scanner;

public class Arrayssaula {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
		ArrayList<String> produtos = new ArrayList<>();
		ArrayList<Double> precos = new ArrayList<>();
		ArrayList<Integer> estoque = new ArrayList<>();
		ArrayList<String> vendas = new ArrayList<>();
		
		produtos.add(("Leite"));
		produtos.add("Pao");
		produtos.add("ovos");
		
		while(escolha != 5) {
			escolha = Integer.parseInt(scan.nextLine());
			System.out.println("1 - ADICIONAR PRODUTO");
			System.out.println("2 - VENDER PRODUTO");
			System.out.println("3 -  VER ESTOQUE");
			System.out.println("4 - HISTORICO DE VENDAS");
			
			
			if(escolha == 1) {
				System.out.println("Digite o nome do produto");
				String prod = scan.nextLine();
				produtos.add(prod);
				
		
			}
			
			
			
			
			
			
			
		}
		
		
		
		
		
	}

}
