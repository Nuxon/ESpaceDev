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
	
	//����������� ������ GraphicsTest
	GraphicsTest() {
		
		Generator gen = new Generator(10);
		this.planets = gen.getGenPlanets();
		
		frame = new JFrame();
		frame.add(this);
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	//����� ��������� 
	public void paint(Graphics g) {
		Random r = new Random();
		
		/*� ��������� ������ X �������� ����� �_�, ������� x - ��� ������,
		 *  ������� x = 0, ����� 50, ����� 100 � ��, 
		 *   ������ ��� ��� ���� ����� ������� ����-��-����� �� ��������  
		 */
		int x = 0;
		for(int i = 0; i < planets.length; i++, x+= 50) {
			//������ ����(����)
			g.drawOval(planets[i].getX()+x, planets[i].getY(), planets[i].getWidth(), planets[i].getHeight());
			
			//������ �����(String)
			g.drawString(planets[i].getName(), planets[i].getX()+x, planets[i].getY());
			
			//������ "�����" � ��������� ���� �� RGB - Red Green Blue, r.nextInt(100) - ��������� ������ Int'� �� 0 �� 100
			g.setColor( new Color( r.nextInt(100), r.nextInt(100), r.nextInt(100) ) );
			//�������
			g.fillOval(planets[i].getX()+x, planets[i].getY(), planets[i].getWidth(), planets[i].getHeight());
		}
	}
	
	
	private Planet[] planets;
	private JFrame frame;
	
}
