package generalizacao;

public class ContaSimples extends Conta {

    private double saldoPoupanca = 0;

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
            this.saldoPoupanca = saldoPoupanca;
        }
    

    public boolean depositoPoupanca(double valor) {
        if (valor > 0) {
            this.saldoPoupanca += valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean saquePoupanca(double valor) {
        if (saldoPoupanca >= valor && valor > 0) {
            this.saldoPoupanca -= valor;
            return true;
        } else {
            return false;
        }
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}