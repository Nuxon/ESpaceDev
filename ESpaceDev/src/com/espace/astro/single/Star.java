package com.espace.astro.single;

public class Star extends AstronomicalObject{

	public Star(String name, String[] history,
			double weight, double age, double radius, 
			int x, int y) {
		
		super(name, history, age, weight, (int)radius, (int)radius, x, y);
		
	}

}
