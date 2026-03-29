
package universidade;

public class Universidade {

	public static void main(String[] args) {
		Monitor monitor1 = new Monitor("Lógica I");
		System.out.println(monitor1.autenticar("TesteDeS3nh@") );
		
		Professor professor1 = new Professor("Jose da Silva", "12345678900", "Tecnologia");
		System.out.println(professor1.exibirDados() );
				
	}
	
}
