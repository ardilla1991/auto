package by.htp.auto.entity;

public class Train extends Transport{
	
	private int wagonCount;
	private static int trainsCount;
	
	{
		wagonCount = 10;
	}
	
	{
		trainsCount++;
	}
	
	public Train(double race) {
		super(race);
	}
	
	public static int getTrainsCount() {
		return trainsCount;
	}

	public Train(int wagonCount, double race) {
		super(race);
		this.wagonCount = wagonCount;
	}

}
