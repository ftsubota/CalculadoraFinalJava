package Classes;

import Interface.ICalculadora;

public class Soma implements ICalculadora{

	private static final Integer Integer = null;
	private static final Float Float = null;
	private static final Double Double = null;
	
	@Override
	public Integer calcula(Integer n1, Integer n2) {
		if (n1 == null || n1 != Integer || n2 == null || n2 != Integer) {
			System.out.println("Insirir dois numeros inteiros. ");
		}
		return n1 + n2;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		if (n1 == null || n1 != Float || n2 == null || n2 != Float) {
			System.out.println("Insira dois numeros do tipo float ");
		}
		return n1 + n2;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		if (n1 == null || n1 != Double || n2 == null || n2 != Double) {
			System.out.println("Insira dois numeros do tipo 'double'. ");
		}
		return n1 + n2;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer soma = 0;
		for (Integer n : numeros) {
			soma = n.intValue() + n.intValue();
		}
		return soma;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float soma = 0f;
		for (Float n : numeros) {
			soma = n.floatValue() + n.floatValue();
		}
		return soma;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double soma = 0d;
		for (Double n: numeros) {
			soma = n.doubleValue() + n.doubleValue();
		}
		return soma;
	}
}