package tests;

import java.util.Random;

import core.astro.single.Planet;

public class Generator {
	
	public Generator(int num) {
		generatePlanets(num);
	}
	
	public void generatePlanets(int numOfgen) {
		
		Planet[] genPlanets = new Planet[numOfgen];
		Random r = new Random();
		int interval = 100;
		int x = 0;
		String prefix = "Planet";
		
		for(int i = 0; i < numOfgen; i++, x += interval) {
			
			int radius = r.nextInt(interval);
			
			genPlanets[i] = new Planet(prefix+Integer.toString(i), null, 0.0, 0.0, radius, x, 10);
		}
		
		this.aGenPlanets = genPlanets;
	}
	
	public Planet[] getGenPlanets() {
		return this.aGenPlanets;
	}
	
	private Planet[] aGenPlanets;

}
