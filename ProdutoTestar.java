package programacao_algoritimo;

public class ProdutoTestar {

	public static void main(String[] args) {
		//Construtor padrão
		produto p1=new produto();
		p1.nome=": Caneta Preta ";
		p1.marca=" Bic ";
		p1.valor= 1.50f;
		
		//Construtor de dois parâmetros
	    produto p2=new produto(": Caneta "," Faber ");
	    p2.valor= 1.67f;
	    
	    //Construtor com três parâmetros
	    produto p3=new produto(": Borracha "," Mercur ",1.86f);
	    
	    //Objeto
	    System.out.println("Nome" +p1.nome + "/" + "marca:" + p1.marca + "/" + "valor" + p1.valor + "/");
	    
	    //Objeto 2
	    System.out.println("Nome" +p2.nome + "/" + "marca:" + p2.marca + "/" + "valor" + p2.valor + "/");
	    
	    //Objeto 3
	    System.out.println("Nome" +p3.nome + "/" + "marca:" + p3.marca + "/" + "valor" + p3.valor + "/");
	}

}