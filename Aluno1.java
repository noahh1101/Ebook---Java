package exemplo_tres;

public class Aluno1 {
	private String nome;
	private int idade;
	
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void SetIdade(int idade) {
    	if (idade > 0 && idade < 67) {
    		this.idade = idade;
    		System.out.println("Idade Cadastrada com sucesso");
    	}
    	else {
    		System.out.println("Erro! Idade Inválida");
    	}
    }
}