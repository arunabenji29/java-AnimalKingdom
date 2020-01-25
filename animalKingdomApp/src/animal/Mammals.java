package animal;

public class Mammals extends Animals{
	private String move = "walk";
	public String breath = "lungs";
	private String reproduce = "live births";

	public Mammals(String name,int year)
	{
		super(name,year);
	}

//	public String[] move()
//	{
////		System.out.println(this.name + " can walk");
//		String sent = this.name + " can walk";
//		String[] moves = sent.split(" ");
//		return moves;
//	}
//
//	public String[] breath()
//	{
//		String sent = this.name + " breath through lungs";
//		String[] moves = sent.split(" ");
//		return moves;
//	}
//
//	public void reproduce()
//	{
//		System.out.println(this.name + " give live births");
//	}

	@Override
	public String toString() {
		return "Mammals: name: " + this.name + ", year: " + this.year + " can " + move + ", breath through " + breath +
				" and reproduce using " + reproduce;
	}
}