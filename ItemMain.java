package uml;

public class ItemMain {

	public static void main(String[] args) {
		
		Item i = new Item();
		
		i.setCodigo(1);
		i.setDescricao("Uma história sobre uma boneca falante");
		
		Livro l = new Livro();
		
		l.setAutor("Monteiro Lobato");
		
		Midia m = new Midia();
		
		m.setDuracao(5);
		m.setGravadora("WN Produções");
		
		CD c = new CD();
		
		c.setAlbum("Relapse");
		c.setArtista("Slim Shady");
		c.setFaixas(329);
		
		VHS v = new VHS();
		
		v.setTitulo("I feel good");
		
		System.out.println(v);
		
	}
}
