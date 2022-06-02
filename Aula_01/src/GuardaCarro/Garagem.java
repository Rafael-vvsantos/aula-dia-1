package GuardaCarro;
import java.util.ArrayList;
import java.util.List;


public class Garagem {
	
	private List<IVeiculo> veiculo = new ArrayList<IVeiculo>();
	
	int capacidade;
	
	void listarVeiculo() {
		for(int i = 0 ; i < veiculo.size(); i++){
           System.out.println(veiculo.get(i));
     }
	}
	
	void temVaga(carro carro1) {
		if(veiculo.size() <= capacidade) {
			System.out.println("Não tem vaga");
			return ;
		}else {
			
			veiculo.add((IVeiculo) veiculo);
			return;
		}
	}


	
	
	
}
