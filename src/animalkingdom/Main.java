package animalkingdom;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("\nIt's Compiling!!\n");

		System.out.println("\n*** MVP ***\n");

		List<Animal> animalList = new ArrayList<>();
		//Adding Mammals
		animalList.add(new Mammals("Panda", 1869));
		animalList.add(new Mammals("Zebra", 1778));
		animalList.add(new Mammals("Koala", 1816));
		animalList.add(new Mammals("Sloth", 1804));
		animalList.add(new Mammals("Armadillo", 1758));
		animalList.add(new Mammals("Raccoon", 1758));
		animalList.add(new Mammals("Bigfoot", 2021));

		//Adding Birds
		animalList.add(new Birds("Pigeon", 1837));
		animalList.add(new Birds("Peacock", 1821));
		animalList.add(new Birds("Toucan", 1758));
		animalList.add(new Birds("Parrot", 1824));
		animalList.add(new Birds("Swan", 1758));

		//Adding Fish
		animalList.add(new Fish("Salmon", 1758));
		animalList.add(new Fish("Catfish", 1817));
		animalList.add(new Fish("Perch", 1758));

		System.out.println("\n*** List all the animals in descending order by year named ***");
		animalList.sort((a1, a2) -> a2.getYearDiscovered() - a1.getYearDiscovered());
		animalList.forEach( a -> System.out.println("Animal: " + a.getName() + " |  Year Discovered: " + a.getYearDiscovered()));

		System.out.println("\n*** List all the animals alphabetically ***");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animalList.forEach(a -> System.out.println(a.getName()));

		System.out.println("\n*** List all the animals order by how they move ***");
		animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		animalList.forEach(a -> System.out.println(a.getName() + " | How they move: " + a.move()));

		System.out.println("\n*** List only those animals that breath with lungs ***");

		System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");

		System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");

		System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
	}
}