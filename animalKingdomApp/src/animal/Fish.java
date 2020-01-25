package animal;

public class Fish extends Animals{
	private String move = "swim";
	public String breath = "gills";
	private String reproduce = "eggs";

	public Fish(String name,int year)
	{
		super(name,year);
	}

//	public String[] move()
//	{
////		System.out.println(this.name + " can swim");
//		String sent = this.name + " can swim";
//		String[] moves = sent.split(" ");
//		return moves;
//	}
//
//	public String[] breath()
//	{
//		String sent = this.name + " breath through gills";
//		String[] moves = sent.split(" ");
//		return moves;
//	}
//
//	public void reproduce()
//	{
//		System.out.println(this.name + " uses eggs to reproduce");
//	}

	@Override
	public String toString() {
		return "Fish: name: " + this.name + ", year: " + this.year + " can " + move + ", breath through "
				+ breath + " and reproduce using " + reproduce;
	}
}