package Classes;

import Interface.ICalculadora;

public class Divisao implements ICalculadora{

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		return n1/n2;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		return n1/n2;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		return n1/n2;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		int divisao = 0;
		for (Integer d : numeros) {
			divisao = d.intValue() / d.intValue();
		}
		return divisao;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float divisao = 0f;
		for (Float d : numeros) {
			divisao = d.floatValue() / 

d.floatValue();
		}
		return divisao;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double divisao = 0d;
		for (Double d : numeros) {
			divisao = d.doubleValue() / 

d.doubleValue();
		}
		return divisao;
	}
	
}
