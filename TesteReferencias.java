
public class TesteReferencias {
	public static void main(String[] args) {
		
		Funcionario g1 = new Gerente(); // esquerda eh mais generico e direita eh mais especifico
		
		g1.setNome("Victor");
		String nome = g1.getNome();
		
//		g1.autentica(2222);
		
		System.out.println(nome);
	}
}
