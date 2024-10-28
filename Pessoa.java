package uml;

public class Pessoa {

	private String nome;
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 0) {
			this.nome = nome;
		} else {
			System.out.println("Inválido");
		}
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		if (endereco.length() > 0) {
			this.endereco = endereco;
		} else {
			System.out.println("Inválido");
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [nome=");
		builder.append(nome);
		builder.append(", endereco=");
		builder.append(endereco);
		builder.append("]");
		return builder.toString();
	}

}
