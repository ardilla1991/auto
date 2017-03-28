package by.htp.auto.logic;

import by.htp.auto.entity.Transport;

public class AutoCountant implements TransportCountant{

	private static final int AMR_KF = 10; // одна переменная в памяти, не нужно
	// всегда добавлять в память при
	// создании объекта
	
	@Override
	public double amortisate(Transport transport, int years) {
		double result = (transport.totalRace() * years * AMR_KF) / PCNT;

		return result;
	}
}
