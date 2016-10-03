package integration.basic;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class GeneratorServiceImpl implements GeneratorService{

	@Override
	public String generuj(int liczba) {
		 Random randomGenerator = new Random();
		 int randomInt = randomGenerator.nextInt(100);		
		 return new Integer (randomInt).toString();
	}

	
}
