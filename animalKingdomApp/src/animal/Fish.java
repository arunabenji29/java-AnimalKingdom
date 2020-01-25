package animal;

public class Fish extends Animals{
	public Fish(String name,int year)
	{
		super(name,year);
	}

	public void move()
	{
		System.out.println(this.name + "can swim");
	}

	public void breath()
	{
		System.out.println(this.name + "breath through gills");
	}

	public void reproduce()
	{
		System.out.println(this.name + "uses eggs to reproduce");
	}

	@Override
	public String toString() {
		return "Fish: name: " + this.name + "year: " + this.year;
	}
}