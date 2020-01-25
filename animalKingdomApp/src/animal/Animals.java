package animal;

public abstract class Animals implements Comparable<Animals>{
	
	
	private int maxId=0;
	private int id;

	public String name;
	public int year;
//	public String move;
	public String breath;
//	public String reproduce;

	public Animals(String name,int year){
		maxId += 1;
		id = maxId;
		this.name = name;
		this.year = year;
	}

	public void consume(){
		System.out.println("I eat nom nom nom");
//		return "I eat nom nom nom";
	};

//	sort the animals alphabetically
	@Override
	public int compareTo(Animals a) {
		int b = name.compareTo(a.name);
		return b>=0?1:-1;
	}

//	//	sort the animals in descending order by year
//	@Override
//	public int compareTo(Animals a) {
//
//		return year<a.year?1:-1;
//	}

////	sort the animals based on how they move
//	@Override
//	public int compareTo(Animals a) {
//		int b = move()[2].compareTo(a.move()[2]);
//		return b>=0?1:-1;
//	}

//	public abstract String[] move();
//	public abstract String[] breath();
//	public abstract void reproduce();
}