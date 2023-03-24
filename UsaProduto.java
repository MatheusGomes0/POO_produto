package semana06;

public class UsaProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		
		for(int i=1; i<=10; i++) {
			p.setCodigo(i);
			p.setDescricao("Produto " + i);
			p.setValor(Math.random()*10);
			System.out.println(p.gravar());
			
			
			Produto p2 = p.ler(i);
			if(p2 != null) {
				p2.mostrar();
			} else {
				System.out.println("Arquivo não encontrado");
			}
		}
		

	}

}
