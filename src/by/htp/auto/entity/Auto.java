package by.htp.auto.entity;

public class Auto extends Transport {

	private int passCount;
	private static int autoCount;


	{
		passCount = 4;
	}

	{
		autoCount++;
	}
	
	public Auto(double race) {
		super(race);
	}

	public Auto(int passCount, double race) {
		super(race);
		this.passCount = passCount;
	}

	public static int getAutoCount() {
		return autoCount;
	}
	
	
}
