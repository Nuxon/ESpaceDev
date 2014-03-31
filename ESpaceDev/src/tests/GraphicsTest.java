package tests;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

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
		for(int i = 0; i < planets.length; i++) {
			g.drawOval(planets[i].getX(), planets[i].getY(), planets[i].getWidth(), planets[i].getHeight());
			g.drawString(planets[i].getName(), planets[i].getX(), planets[i].getY());
			g.setColor(new Color(r.nextInt(100),r.nextInt(100),r.nextInt(100)));
			g.fillOval(planets[i].getX(), planets[i].getY(), planets[i].getWidth(), planets[i].getHeight());
		}
	}
	Random r = new Random();
	Planet[] planets;
	JFrame frame;
	
}
