package lista.encadeada;

public class Lista {
	private Pessoa cabeca=null;
	private Pessoa elemento;
	private int total = 0;
	
	public void adicionarElementoNoFimDaLista(Pessoa novo) {
		if(cabeca==null) {
			cabeca = novo;
			elemento = novo;
			total++;
		}
		else if(elemento.getProxima()==null) {
			elemento=novo;
			total++;
		}
	}
	
	public void adicionarElementoNoInicioDaLista(Pessoa p) {
		p.setProximo(cabeca);
		cabeca=p;
	}
	
	public void adicionarElementoNoMeioDaLista(int posicao, Pessoa p) {
		Pessoa aux = this.cabeca;
		for(int i=0; i<=posicao; i++) {
			if(i<=posicao) {
				p.setProximo(aux.getProxima());
				aux.setProximo(p);
			}
			aux=aux.getProxima();
		}
		total++;
	}
	
	public void removerPessoaDaLista(Pessoa p) {
		Pessoa aux = this.cabeca;
		while(aux!=null) {
			if(aux.getProxima()==p) {
				Pessoa proxima = aux.getProxima();
				aux.setProximo(proxima.getProxima());
			}
			else if(aux==p) {
				cabeca=p.getProxima();
			}
			aux=aux.getProxima();
		}
	}
	
	public String mostrarPrimeiraPessoaDaLista() {
		return cabeca.getNome();
	}
	
	public String mostrarUltimaPessoaDaLista() {
		return elemento.getNome();
	}
	
	public void listarTodasPessoasDaLista() {
		Pessoa aux = cabeca;
		while (aux!=null) {
			System.out.println(aux.getNome());
			aux = aux.getProxima();
		}
	}	
}
