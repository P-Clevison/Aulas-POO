package mobilidade;


public class Carro implements Veiculo {
	private boolean motorLigado;
	private boolean parado;
	private double velocidade;
	private int qtdPassageiros;
	private int lotacao;

	public Carro(boolean motorLigado, int qtdPassageiros, int lotacao) {
		this.motorLigado = motorLigado;
		this.parado = true;
		this.velocidade = 0;
		this.qtdPassageiros = qtdPassageiros;
		this.lotacao = lotacao;
	}

	public boolean getMotorLigado() {
		return motorLigado;
	}

	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}

	private boolean getParado() {	// pode ser privado
		return parado;
	}

	private void setParado(boolean parado) { // pode ser privado
		this.parado = parado;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public int getLotacao() {
		return lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}
	
	@Override
	public void ligarMotor() {
		this.setMotorLigado(true);
	}
	
	@Override
	public void desligarMotor() {
		this.setMotorLigado(false);
	}
	
	@Override
	public void acelerar() {
		if (this.getMotorLigado() == false) {
			this.setMotorLigado(true);
		}		
		if (this.getParado() == true) {
			this.setParado(false);
		}
		
		this.setVelocidade(this.getVelocidade() + 5);
	}
	
	@Override
	public void frear() {
		if (this.getVelocidade() >= 5) {
			this.setVelocidade(this.getVelocidade() - 5);
		} else {
			this.setVelocidade(0);
			this.setParado(true);
		}
	}

	@Override
	public void subirPassageiro() {
		if (this.getQtdPassageiros() < this.getLotacao() ) {
			this.setQtdPassageiros( this.getQtdPassageiros() + 1 );
		} else {
			System.out.println("Carro Lotado");
		}
	}

	@Override
	public void descerPassageiro() {
		if (this.getQtdPassageiros() > 1 ) {
			this.setQtdPassageiros( this.getQtdPassageiros() -1 );
		} else {
			System.out.println("Carro Vazio");
		}
	}
}
