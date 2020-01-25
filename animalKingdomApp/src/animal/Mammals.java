package animal;

public class Mammals extends Animals{

	public Mammals(String name,int year)
	{
		super(name,year);
	}

	public void move()
	{
		System.out.println(this.name + "can walk");
	}

	public void breath()
	{
		System.out.println(this.name + "breath through lungs");
	}

	public void reproduce()
	{
		System.out.println(this.name + "give live births");
	}

	@Override
	public String toString() {
		return "Mammals: name: " + this.name + "year: " + this.year;
	}
}