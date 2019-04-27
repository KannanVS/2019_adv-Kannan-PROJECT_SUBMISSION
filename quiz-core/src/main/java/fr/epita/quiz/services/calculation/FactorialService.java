package fr.epita.quiz.services.calculation;

public class FactorialService {
	
	
	public Integer calculate(Integer depth) {
		if (depth <= 1 ) {
			System.out.println("This is a sample");
			return 1;
		}else {
			return calculate(depth - 1) * depth;
		}
		
		
	}

}
