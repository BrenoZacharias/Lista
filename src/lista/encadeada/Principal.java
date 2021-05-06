package lista.encadeada;

import lista.encadeada.Lista;
import lista.encadeada.Pessoa;

public class Principal {

	public static void main(String[] args) {
		Lista l1 = new Lista();
		Pessoa p1 = new Pessoa ("João");
		Pessoa p2 = new Pessoa ("Maria");
		Pessoa p3 = new Pessoa ("Ana");
		Pessoa p4 = new Pessoa ("Pedro");
		Pessoa p5 = new Pessoa ("Bia");
		
		l1.adicionarElementoNoInicioDaLista(p1);
		l1.adicionarElementoNoInicioDaLista(p2);
		l1.adicionarElementoNoInicioDaLista(p3);
		

		System.out.println("Mostrando a lista após incluir 4 pessoas ");
		l1.listarTodasPessoasDaLista();
		
		System.out.println(" ");
		System.out.println("Mostrando a lista após apagar p2 e p3");
		
		l1.removerPessoaDaLista(p2);
		l1.removerPessoaDaLista(p3);
		
		l1.listarTodasPessoasDaLista();
		
	}
}
