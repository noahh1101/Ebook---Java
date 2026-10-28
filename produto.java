package programacao_algoritimo;

public class produto {
	//Atributos
	String nome;
	String marca;
	Float valor;
	
	//Construtores
	produto(){
	}
	produto(String nome) {
		this.nome=nome;
	}
	produto(String nome,String marca) {
	    this.nome = nome;
	    this.marca = marca;    
    }
	produto(String nome,String marca,Float valor) {
		this.nome=nome;
		this.marca=marca;
		this.valor=valor;
	}

}