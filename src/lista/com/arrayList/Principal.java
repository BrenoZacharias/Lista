package lista.com.arrayList;

public class Principal{
    public static void main(String [] args){
          Pizza p;
          
        
          Pizza p1 = new Pizza("Mozzarella");
          Pizza p2 = new Pizza("Marguerita");
          Pizza p3 = new Pizza("Portuguesa");
          Pizza p4 = new Pizza("Pepperoni");
          Pizza p5 = new Pizza("Quatro queijos");
          Pizza p6 = new Pizza("Strogonoff");
          Pizza p7 = new Pizza("Atum");
          Pizza p8 = new Pizza("Chocolate");
          
          System.out.println("Total de pizzas instanciadas = " + p6.getTotalPizzas());
          
          p1.adicionaIngredientes("queijo mussarela");
          
          p2.adicionaIngredientes("mussarela de bufala");
          p2.adicionaIngredientes("tomate");
          p2.adicionaIngredientes("manjericao");
          
          p3.adicionaIngredientes("cebola");
          p3.adicionaIngredientes("queijo");
          p3.adicionaIngredientes("ervilha");
          p3.adicionaIngredientes("presunto");
          p3.adicionaIngredientes("ovo");
          p3.adicionaIngredientes("oregano");
          
          CarrinhoDeCompras c1 = new CarrinhoDeCompras();
          c1.adicionarItem(p1);
          c1.adicionarItem(p2);
          
          CarrinhoDeCompras c2 = new CarrinhoDeCompras();
          c2.adicionarItem(p3);
          
          System.out.println("Total a pagar no carrinho c1 " + c1.getTotalPagar());
          
          System.out.println("Total a pagar no carrinho c2 " + c2.getTotalPagar());
    }
}
