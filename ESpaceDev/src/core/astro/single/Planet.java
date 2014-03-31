package core.astro.single;

public class Planet extends AstronomicalObject{

	public Planet(String name, String[] history, double weight,
			double age, double radius, int x, int y) {
		super(name, x, y, (int)radius, (int)radius);
		
		if(history == null) this.history = new String[]{"<---->"};
		
		this.history = history;
		this.age = age;
		this.weight = weight;
		this.radius = radius;
		
		this.width = (int)radius;
		this.height = (int)radius;
		
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	private String[] history;
	
	private double age;
	private double weight;
	private double radius;
	
	private int pop;
	private int maxPop;
	
	private int width;
	private int height;
}
