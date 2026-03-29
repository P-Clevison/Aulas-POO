package universidade;

public abstract class Pessoa {
	public String nome;
	public String cpf;
	
	public String exibirDados() {
		String msg = "O nome e: " + this.nome + " e o cpf e: " + this.cpf;
		return msg;
	}
}
