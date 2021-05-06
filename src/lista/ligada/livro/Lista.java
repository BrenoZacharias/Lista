package lista.ligada.livro;

import lista.ligada.livro.Livro;

public class Lista {
	private Livro cabeca=null;
	private Livro anterior;
	
	public void adicionaLivro(Livro l){
		l.setAnterior(cabeca);
		cabeca = l;
	}
	
	public void removeLivro(){
		cabeca = cabeca.getAnterior();
		anterior=cabeca;
	}
	
	public String mostraCabeca(){
		return cabeca.getNome();
	}
	
	public void listarLivro(){
		Livro aux = cabeca;
		while(aux!=null){
			System.out.println(aux.getNome());
			aux = aux.getAnterior();
		}
	}
}
