public abstract class produto{

	private String  fabricante;
	private double valor;
	private String nome;
	private int    qtdEstoque;

	public void setFabricante(String  fabricante){
		this.fabricante = fabricante;
	}

	public void setValor(double valor){
		this.valor = valor;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setNome(int    qtdEstoque){
		this.qtdEstoque = qtdEstoque;
	}

}