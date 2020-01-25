package animal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LivingBeings{

	public static void main(String[] args){

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

//		Collections.sort(animals);


		for(Animals a:animals)
		{

			String[] moves = a.toString().split(" ");
			// // animals that breath through lungs and were named in 1758
//			if(moves[9].equals("lungs") && moves[4].equals("1758")){
//				System.out.println(a);
//			}

//			 // animals that lay egss and breath through lungs
//			if(moves[9].equals("lungs") && moves[13].equals("eggs")){
//				System.out.println(a);
//			}

			// animals that were named in 1758
			if(moves[4].equals("1758")){
				System.out.println(a);
			}

		}

	}

}