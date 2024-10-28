package uml;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		p.setNome("Joao");
		p.setEndereco("Rua principal");
		System.out.println(p);
		
		PessoaFisica pf = new PessoaFisica();
		
		pf.setCpf("002.431.984-32");
		pf.setEstadoCivil("Casado");
		System.out.println(pf);
		
		PessoaJuridica pj = new PessoaJuridica();
		
		pj.setCnpj("12.124.876/0001-87");
		pj.setTipoEmpresa("S/A");
		System.out.println(pj);
		
	}

}
