package analiseProduto;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite o código do produto... Obs: O número deve ser inteiro maior que 0");
		int codProdutoUsuario = input.nextInt();
		input.nextLine();
		
		
		System.out.println("Digite o nome do produto... Obs: O produto deve ter pelo menos 5 letras");
		String nomeProdutoUsuario = input.nextLine();
		
		System.out.println("Digite o preço do produto... Obs: O preço deve ser em real brasileiro.");
		String precoProdutoUsuario = input.nextLine();
		
		 
			   Produto p = new Produto(codProdutoUsuario,nomeProdutoUsuario,precoProdutoUsuario);
		   
		
		
        
	}

}
