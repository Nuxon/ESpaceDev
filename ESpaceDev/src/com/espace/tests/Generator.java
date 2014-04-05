package com.espace.tests;

import java.util.Random;

import com.espace.astro.single.Planet;

public class Generator {
	/*
	 *  стати говор€ класс Generator впрочем как и все остальные, которые € писал, "»нкапсулированны" <- повод загуглить
	 * 
	 * 
	 * ÷ель: реализовать динамичное(цикличное) заполнение любого массива типа Planet[]
	 * 
	 * P.S.
	 * ѕока писал этот класс возникла иде€, о том как писать классы типа Galaxy =)
	 */
	
	
	// онструктор класса Generator
	public Generator(int num) {
		
		/*
		 * ¬се что написанно в generatePlanets(int) € мог и в конструктор сразу записать,
		 *но пох лучше делать так как € сделал 
		 */
		generatePlanets(num);
	}
	
	/*
	 * ќсновной метод класса в нем : создаетс€ массив Planets[] с макс. размером = numOfgen,
	 *  далее цикл который этот массив заполн€ет.
	 */
	public void generatePlanets(int numOfgen) {
		
		//создаетс€ массив Planets[] с макс. размером = numOfgen
		Planet[] genPlanets = new Planet[numOfgen];
		
		//–андом
		Random r = new Random();
		
		//ѕромежуток между планетами
		int interval = 100;
		
		// X
		int x = 0;
		
		//√енератор имен влом писать было так - что ... префикс и все prefix + str(шаг цикла) = Planet0 Planet1 и тд...
		String prefix = "Planet";
		
		for(int i = 0; i < numOfgen; i++, x += interval) {
			
			// radius в классе Planet €вл€етс€ одновременно шириной и высотой(width & height)
			int radius = r.nextInt(interval);
			
			genPlanets[i] = new Planet(prefix+Integer.toString(i), null, 0.0, 0.0, radius, x, 10);
		}
		
		// ѕосле того как массив заполнен передаем его значение классу
		this.aGenPlanets = genPlanets;
	}
	
	public Planet[] getGenPlanets() {
		return this.aGenPlanets;
	}
	
	private Planet[] aGenPlanets;

}
