package animal;

public class Birds extends Animals {

	public Birds(String name,int year){

		super(name,year);
	}

	public void move(){
		System.out.println(this.name + "can fly");
//		return this.name + "can fly";
	}

	public void breath(){
		System.out.println(this.name + "breath through lungs");
//		return this.name + "breath through lungs";
	}

	public void reproduce(){

		System.out.println(this.name + "uses eggs to reproduce");
	}

	@Override
	public String toString() {
		return "Birds: name: " + this.name + "year: " + this.year;
	}
//	@Override
//	public int compareTo(Birds o) {
//		return 0;
//	}
}