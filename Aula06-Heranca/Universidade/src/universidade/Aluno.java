
package universidade;

public class Aluno extends Pessoa implements Autenticavel {
	public String matricula;
	
	@Override
	public String autenticar(String senha) {
		int tamanho = senha.length();
		if ( tamanho > 8) {
			return "A senha possui mais de 8 caracteres";
		} else {
			return "A senha nao possui mais de 8 caracteres";
		}
	}
	
	@Override
	public void mudarSenha() {
		
	}
}
