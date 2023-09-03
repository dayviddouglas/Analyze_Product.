package analiseProduto;

public class Produto {
  private int codigo;
  private String nome;
  private String preco;
  
  
  public Produto(int cod, String nomeProduto, String precoProduto) {
	if (cod <= 0) {
		throw new IllegalArgumentException("Você digitou o código menor ou igual a 0.");
	}else if (nomeProduto.length()<=4) {
		throw new IllegalArgumentException("Você deverá inserir ao menos 5 letras no nome do produto.");
	}else if (verificaPreco(precoProduto)!= true) {
		throw new IllegalArgumentException("Você não digitou o preço em real ou escreveu errado.");
	}
	
	else {
		this.codigo = cod;
		this.nome = nomeProduto;
		this.preco = precoProduto;
		System.out.println("Produto criado com sucesso!!");
		
	}
	
	  
	
}
  
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getPreco() {
	return preco;
}
public void setPreco(String preco) {
	this.preco = preco;
}

 public boolean verificaPreco(String preco) {
	 
	char [] caracteres = {'R','$',','}; 
	boolean confirmacao = true;
	// Verifica se existe esses caracteres nessa string.
	for (char caracter : caracteres) {
		if (preco.indexOf(caracter)== -1) {
			confirmacao = false;
			break;
		}
	}
	
	  return confirmacao;
	
	
 }
  
  
}
