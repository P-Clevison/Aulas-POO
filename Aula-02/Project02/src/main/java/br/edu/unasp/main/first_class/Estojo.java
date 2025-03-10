
package br.edu.unasp.main.first_class;

public class Estojo {
	public int capacity;
	public int fullCapacity;
	
	public boolean isFull() {
		if (this.capacity == fullCapacity) {
			System.out.println("O estojo esta cheio");
			return true;
		} else {
			System.out.println("Ainda ha espaco");
			return false;
		}
	}
	
}
