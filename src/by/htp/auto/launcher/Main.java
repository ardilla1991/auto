package by.htp.auto.launcher;

import javax.naming.spi.DirStateFactory.Result;

import by.htp.auto.entity.*;
import by.htp.auto.logic.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport auto1 = new Auto(10);
		Transport auto2 = new Auto(14);
		Transport auto3 = new Auto(26);
		Transport auto4 = new Auto(18);
		
		Transport train1 = new Train(117);
		Transport train2 = new Train(119);
		Transport train3 = new Train(256);
		
		System.out.println("total auto count = "  + Auto.getAutoCount());
		System.out.println("total trains count = " + Train.getTrainsCount());
		
		
		double res1 = 0;
		TransportCountant countant = new AutoCountant();
		res1 = countant.amortisate(auto3, 5);
		System.out.println("Auto3 wear = " + res1);
		
		countant = new TrainCountant();
		res1 = countant.amortisate(train3, 5); 
		System.out.println("Train3 wear = " + res1);
		
		//System.out.println("Auto2 wear = " + auto2.amortisate(8));
		//System.out.println("Train2 wear = " + train2.amortisate(8));
	}

}
