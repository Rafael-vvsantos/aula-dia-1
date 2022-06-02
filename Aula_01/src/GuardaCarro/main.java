package GuardaCarro;

public class main {

	public static void main(String[] args) {
		
		Garagem garagem1 = new Garagem();
		
		carro carro1 = new carro();
		
		carro1.quantidadePassageiros = 1;
		
		garagem1.temVaga(carro1);
		
		System.out.println("Deu Certo!");
		
		System.out.println(carro1.buzinar());

	}

}
