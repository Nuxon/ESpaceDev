package tests;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

import core.Dot;
import core.astro.single.Planet;

public class GraphicsTest extends Canvas{
	//http://docs.oracle.com/javase/7/docs/api/java/awt/Canvas.html
	public static void main(String[] args) {
		new GraphicsTest();
		
	}
	
	GraphicsTest() {
		
		Generator gen = new Generator(10);
		this.planets = gen.getGenPlanets();
		
		frame = new JFrame();
		frame.add(this);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public void paint(Graphics g) {
		int x = 0;
		for(int i = 0; i < planets.length; i++, x+= 50) {
			g.drawOval(planets[i].getX()+x, planets[i].getY(), planets[i].getWidth(), planets[i].getHeight());
			g.drawString(planets[i].getName(), planets[i].getX()+x, planets[i].getY());
			g.fillOval(planets[i].getX()+x, planets[i].getY(), planets[i].getWidth(), planets[i].getHeight());
		}
	}
	Planet[] planets;
	JFrame frame;
	
}
