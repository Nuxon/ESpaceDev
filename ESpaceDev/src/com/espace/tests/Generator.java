package com.espace.tests;

import java.util.Random;

import com.espace.astro.single.Planet;

public class Generator {
	/*
	 * ������ ������ ����� Generator ������� ��� � ��� ���������, ������� � �����, "����������������" <- ����� ���������
	 * 
	 * 
	 * ����: ����������� ����������(���������) ���������� ������ ������� ���� Planet[]
	 * 
	 * P.S.
	 * ���� ����� ���� ����� �������� ����, � ��� ��� ������ ������ ���� Galaxy =)
	 */
	
	
	//����������� ������ Generator
	public Generator(int num) {
		
		/*
		 * ��� ��� ��������� � generatePlanets(int) � ��� � � ����������� ����� ��������,
		 *�� ��� ����� ������ ��� ��� � ������ 
		 */
		generatePlanets(num);
	}
	
	/*
	 * �������� ����� ������ � ��� : ��������� ������ Planets[] � ����. �������� = numOfgen,
	 *  ����� ���� ������� ���� ������ ���������.
	 */
	public void generatePlanets(int numOfgen) {
		
		//��������� ������ Planets[] � ����. �������� = numOfgen
		Planet[] genPlanets = new Planet[numOfgen];
		
		//������
		Random r = new Random();
		
		//���������� ����� ���������
		int interval = 100;
		
		// X
		int x = 0;
		
		//��������� ���� ���� ������ ���� ��� - ��� ... ������� � ��� prefix + str(��� �����) = Planet0 Planet1 � ��...
		String prefix = "Planet";
		
		for(int i = 0; i < numOfgen; i++, x += interval) {
			
			// radius � ������ Planet �������� ������������ ������� � �������(width & height)
			int radius = r.nextInt(interval);
			
			genPlanets[i] = new Planet(prefix+Integer.toString(i), null, 0.0, 0.0, radius, x, 10);
		}
		
		// ����� ���� ��� ������ �������� �������� ��� �������� ������
		this.aGenPlanets = genPlanets;
	}
	
	public Planet[] getGenPlanets() {
		return this.aGenPlanets;
	}
	
	private Planet[] aGenPlanets;

}
