package by.htp.auto.entity;

public abstract class Transport {
	
	private double mass;
	private double race;
	private static String producer;
	
	
	{
		mass = 1;
	}
	
	public Transport(double race) {
		super();
		this.race = race;
	}
	
	public Transport(double mass, double race) {
		
		this.mass = mass;
	}
	
	public double totalRace() {
		return race;
	}
	
	public void move(double distance) {
		race += distance;
	}

}
