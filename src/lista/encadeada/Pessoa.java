package lista.encadeada;

public class Pessoa {
	private String nome;
	private Pessoa proxima;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	//métodos setters - métodos de definição
	public void setProximo(Pessoa proxima) {
		this.proxima = proxima;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//métodos getters - captura de dados
	public Pessoa getProxima() {
		return proxima;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String toString() {
		return nome;
	}
}
