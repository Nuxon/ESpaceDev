package core.astro.single;

import core.Dot;

public class AstronomicalObject extends Dot{

	public AstronomicalObject(String name, int x, int y) {
		super(x, y);
		
		this.name = name;
	}
	
	public Object getTypeOfAObj() {
		return this.getClass();
	}
	
	public String getName() {
		return name;
	}
	
	private String name;
}
