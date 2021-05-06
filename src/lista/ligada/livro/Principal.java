package lista.ligada.livro;

import lista.ligada.livro.Lista;
import lista.ligada.livro.Livro;

public class Principal {

	public static void main(String[] args) {

		Lista list = new Lista();
		Livro l1 = new Livro("Harry Potter");
		Livro l2 = new Livro("Viagem ao centro da terra");
		Livro l3 = new Livro("Supernatural");
		Livro l4 = new Livro("As crônicas de Nárnia");
		Livro l5 = new Livro("Petter Pan");
		
		list.adicionaLivro(l1);
		list.adicionaLivro(l2);
		list.adicionaLivro(l3);
		list.adicionaLivro(l4);
		list.adicionaLivro(l5);
		
		System.out.println("Antes da remoção:");
		System.out.println("");
		list.listarLivro();
		
		list.removeLivro();
		System.out.println("");
		
		System.out.println("Após a remoção:");
		System.out.println("");
		list.listarLivro();
		
		System.out.println("");
		System.out.println("Cabeça:");
		System.out.println("" + list.mostraCabeca());
	}

}
