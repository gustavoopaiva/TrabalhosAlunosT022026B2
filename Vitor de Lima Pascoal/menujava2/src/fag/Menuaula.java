package fag;
import java.util.Scanner;
public class Menuaula {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int escolha = 0;
		double  senhadig,saque = 0,saldo = 0,deposito = 0, senha = 1234;
		
		for(int i = 1; i <= 3; i++ ) {
			System.out.println("Digite a senha para acessar o programa");
			senhadig = scan.nextDouble();
			if(senhadig == senha) {
				System.out.println("Senha correta!");
		
			while(escolha != 4) {
				print();
				escolha = scan.nextInt();
				
				if(escolha == 1) {
				System.out.println("Seu saldo:\nR$ " + saldo);
				}
				
				else if(escolha == 2){
					System.out.println("Insira o valor a depositar:\n");
					deposito = scan.nextDouble();
					saldo = depositar(deposito, saldo);
				}
				else if (escolha == 3){
					System.out.println("Insira o valor a sacar:\n");
					saque = scan.nextDouble();
					saldo = sacar(saque, saldo);
				}
				else if (escolha == 4) {
					System.out.println("Voce saiu do sistema");
				}
				else {
					System.out.println("Nao temos essa opcao");
				}
			}//while	
		}//senha-correta
		else {
			System.out.println("Senha incorreta");
				if(i <= 2) {
					System.out.println("Numero de tentativas restantes: " + (3 - i));
				}
				else {
					System.out.println("Tentavias excedidas!");
				}
			
		}
		
	}//for 
		scan.close();
	} // main
	
		
		

	
	
	public static double depositar(double deposito, double saldo) {
		if (deposito <= 0) {
			System.out.println("Você não pode insirir valores menores ou iguais a zero");
			return 0;
		}
		else {
			saldo = saldo + deposito;
			return saldo;
		}
	}
	public static double sacar(double saque, double saldo) {
		if(saque > saldo) {
			System.out.println("Seu saque é maior que o seu saldo. Tente novamente");
			return saldo;
		}
		else if (saque <= 0) {
			System.out.println("Você não pode insirir valores menores ou iguais a zero");
			return saldo;
		}
		else {
		saldo = saldo - saque;
		return saldo;
		}
	}

		

	public static void print() {
		System.out.println("1 - Consultar saldo\n");
		System.out.println("2 - Depositar dinheiro\n");
		System.out.println("3 - Sacar dinheiro\n");
		System.out.println("4 - Sair\n");
			
	}
		
}

	
