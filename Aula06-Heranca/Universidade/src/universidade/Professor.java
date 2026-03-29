package universidade;

public class Professor extends Pessoa implements Autenticavel {
	public String departamento;

	
	public Professor(String nome, String cpf, String departamento) {
		this.nome = nome;
		this.cpf = cpf;
		this.departamento = departamento;
	}
	
	
	@Override
	public String autenticar(String senha) {
		return "Acesso de professor concedido";
	}
	
	@Override
	public void mudarSenha() {
		
	}
}
