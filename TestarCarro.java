package exercicios;

public class TestarCarro {

	public static void main(String[] args) {
		produto p1=new produto();
		p1.modelo=": Uno com Escada ";
		p1.ano= 2013;
		
		
		produto p2=new produto(": ferrari ");
		p2.ano= 2020;
		
		
		produto p3=new produto(": Gol ", 2016);
		
     
		 System.out.println("modelo" +p1.modelo + "/" + "ano" + p1.ano + "/");
		 System.out.println("modelo" +p2.modelo + "/" + "ano" + p2.ano + "/");
		 System.out.println("modelo" +p3.modelo + "/" + "ano" + p3.ano + "/");
	}

}
