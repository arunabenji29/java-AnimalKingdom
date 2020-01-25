package animal;

public class Birds extends Animals {
	private String move = "fly";
	public String breath = "lungs";
	private String reproduce = "eggs";

	public Birds(String name,int year){

		super(name,year);

	}

//	public String[] move(){
//		String sent = this.name + " can fly";
//		String[] moves = sent.split(" ");
//		return moves;
//	}
//
//	public String[] breath(){
//		String sent = this.name + " breath through lungs";
//		String[] moves = sent.split(" ");
////		System.out.println(moves);
//		return moves;
//
//	}
//
//	public void reproduce(){
//
//		System.out.println(this.name + " uses eggs to reproduce");
//	}

	@Override
	public String toString() {
		return "Birds: name: " + this.name + ", year: " + this.year + " can " + move + ", breath through " + breath + " and reproduce using " + reproduce;
	}

}