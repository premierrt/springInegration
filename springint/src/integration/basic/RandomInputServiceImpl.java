package integration.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomInputServiceImpl implements RadomInputService{

	@Autowired
	private GeneratorService randomGateway;
	
	@Override
	public void generujLosowo() {
		System.out.println (randomGateway.generuj(1));
	}

	@Override
	public void pomnozLosowo(int liczba) {
		System.out.println (new Integer(randomGateway.generuj(1))*liczba);
		
	}

}
