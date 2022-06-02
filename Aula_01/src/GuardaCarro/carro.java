package GuardaCarro;

public class carro implements IVeiculo {
	int quantidadePassageiros;

	@Override
	public String buzinar() {
		
		return "Bipi";
	}

	@Override
	public boolean estacionar() {
	
		return true;

	}
	
	
	
	
}
