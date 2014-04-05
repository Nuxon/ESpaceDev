package com.espace.tests;

import com.espace.Dot;
import com.espace.astro.single.Asteroid;
import com.espace.astro.single.AstronomicalObject;
import com.espace.astro.single.Planet;

public class PolimorphicTest {
	
	PolimorphicTest() {
		polimorphProcess();
		System.out.print(planet.getName());
	}
	
	public static void main(String[] args) {
		
		new PolimorphicTest();
		
	}
	
	private void polimorphProcess() {
		Dot dot = new Planet("Какой-то объект", story, 1.0, 2.0, 3.0,10,10);
		Planet planet = (Planet) dot;
	}
	
	private Dot dot;
	private Planet planet;
	
	public static String[] story = {"Зеленная","Охуенная"};

}
