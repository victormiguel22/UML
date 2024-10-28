package uml;

public class Conta {

	private String banco;
	private double saldo;
	private int agencia;
	private int numeroConta;

	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public boolean deposito(double valor) {
		if (valor > 0) {
			saldo += valor;
			boolean depositou = true;
			return depositou;
		} else {
			return false;
		}
	}
	
	public boolean saque(double valor) {
		if (saldo >= valor) {
		boolean sacou = true;
		saldo -= valor;
		return sacou;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numeroConta=");
		builder.append(numeroConta);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
