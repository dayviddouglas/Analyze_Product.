package analiseProduto;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Digite o código do produto...");
		int codProdutoUsuario = input.nextInt();
		input.nextLine();
		
		
		System.out.println("Digite o nome do produto...");
		String nomeProdutoUsuario = input.nextLine();
		
		System.out.println("Digite o preço do produto...");
		String precoProdutoUsuario = input.nextLine();
		
		   
			Produto p = new Produto(codProdutoUsuario,nomeProdutoUsuario,precoProdutoUsuario);
		
		
        
	}

}
