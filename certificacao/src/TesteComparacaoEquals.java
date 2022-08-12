class Cliente {
	String nome;
	public Cliente(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object o) {
		Cliente outro = (Cliente) o;
		return this.nome.equals(outro.nome);
	}
}

public class TesteComparacaoEquals {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Mario");
		Cliente c2 = new Cliente("Guilherme");
		Cliente c3 = new Cliente("Guilherme");
		
//		System.out.println(c1 == c2);
//		System.out.println(c1 == c1);
//		System.out.println(c2 == c3);
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c1));
		System.out.println(c2.equals(c3));
		System.out.println(c2.equals((Object)c3));
	}
}
