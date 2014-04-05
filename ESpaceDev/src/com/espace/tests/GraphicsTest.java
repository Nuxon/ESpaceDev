package com.espace.tests;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JFrame;

import com.espace.Dot;
import com.espace.astro.single.Planet;

public class GraphicsTest extends Canvas{
	
	//main
	public static void main(String[] args) {
		new GraphicsTest();
		
	}
	
	//Конструктор класса GraphicsTest
	GraphicsTest() {
		
		Generator gen = new Generator(10);
		this.planets = gen.getGenPlanets();
		
		frame = new JFrame();
		frame.add(this);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	//Метод отрисовки 
	public void paint(Graphics g) {
		Random r = new Random();
		
		/*в некотором смысле X заменяет сетку О_о, кароуче x - это отступ,
		 *  вначале x = 0, потом 50, потом 100 и тд, 
		 *   сделал это для того чтобы планеты друг-на-друга не налезали  
		 */
		int x = 0;
		for(int i = 0; i < planets.length; i++, x+= 50) {
			//Рисуем овал(круг)
			g.drawOval(planets[i].getX()+x, planets[i].getY(), planets[i].getWidth(), planets[i].getHeight());
			
			//Рисуем текст(String)
			g.drawString(planets[i].getName(), planets[i].getX()+x, planets[i].getY());
			
			//Красим "кисть" в рандомный цвет по RGB - Red Green Blue, r.nextInt(100) - генерация любого Int'а от 0 до 100
			g.setColor( new Color( r.nextInt(100), r.nextInt(100), r.nextInt(100) ) );
			//Заливка
			g.fillOval(planets[i].getX()+x, planets[i].getY(), planets[i].getWidth(), planets[i].getHeight());
		}
	}
	
	
	private Planet[] planets;
	private JFrame frame;
	
}
