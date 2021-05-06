package lista.ligada.livro;

import lista.ligada.livro.Livro;

public class Livro {
	private String nome;
	private int ano;
	private double preco;
	private Livro anterior;
	
	public Livro (String nome){
		this.nome = nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setAno(int ano){
		this.ano = ano;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public void setAnterior(Livro anterior){
		this.anterior = anterior;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String toString(){
		return nome;
	}
	
	public int getAno(){
		return ano;
	}
	
	public double getPreco(){
		return preco;
	}
	
	public Livro getAnterior(){
		return anterior;
	}
}

