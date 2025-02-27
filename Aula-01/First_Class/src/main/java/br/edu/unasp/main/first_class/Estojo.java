
package br.edu.unasp.main.first_class;

public class Estojo {
	public int capacity;
	
	public boolean isFull() {
		if (this.capacity == 10) {
			System.out.println("O estojo esta cheio");
			return true;
		} else {
			System.out.println("Ainda ha espaco");
			return false;
		}
	}
}
