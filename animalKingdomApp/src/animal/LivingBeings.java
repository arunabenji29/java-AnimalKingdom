package animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LivingBeings{

	public static void main(String[] args){
//		Mammals panda = new Mammals("Panda",1869);
//		Mammals zebra = new Mammals("Zebra",1778);
//		Mammals koala = new Mammals("Koala",1816);
//		Mammals sloth = new Mammals("Sloth",1804);
//		Mammals armadillo = new Mammals("Armadillo",1758);
//		Mammals racoon = new Mammals("Racoon",1758);
//		Mammals bigfoot = new Mammals("BigFoot",2021);

		List<Animals> animals = new ArrayList<>();
		animals.add(new Mammals("Panda",1869));
		animals.add(new Mammals("Zebra",1778));
		animals.add(new Mammals("Koala",1816));
		animals.add(new Mammals("Sloth",1804));
		animals.add(new Mammals("Armadillo",1758));
		animals.add(new Mammals("Racoon",1758));
		animals.add(new Mammals("BigFoot",2021));

		animals.add(new Birds("Pigeon",1837));
		animals.add(new Birds("Peacock",1821));
		animals.add(new Birds("Toucan",1758));
		animals.add(new Birds("Parrot",1824));
		animals.add(new Birds("Swan",1758));

		animals.add(new Fish("Salmon",1758));
		animals.add(new Fish("Catfish",1817));
		animals.add(new Fish("Perch",1758));

		Collections.sort(animals);

		for(Animals a:animals)
		{
			System.out.println(a);
		}


//		Birds pigeon = new Birds("Pigeon",1837);
//		Birds peacock = new Birds("Peacock",1821);
//		Birds toucan = new Birds("Toucan",1758);
//		Birds parrot = new Birds("Parrot",1824);
//		Birds swan = new Birds("Swan",1758);

//		Fish salmon = new Fish("Salmon",1758);
//		Fish catfish = new Fish("Catfish",1817);
//		Fish perch = new Fish("Perch",1758);
	}

}