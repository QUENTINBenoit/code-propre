package ex3;

import java.util.ArrayList;

public class ZooApplication {

	public static void main(String[] args) {
		/*
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Zèbre", "MAMIFERE", "HERBIVORE");
		zoo.addAnimal("Lion", "MAMMIFERE", "HERBIVORE");
		zoo.addAnimal("Panthère", "MAMMIFERE", "CARNIVORE");
		zoo.addAnimal("Requin blanc", "POISSON", "HERBIVORE");
		zoo.addAnimal("Truite dorée", "POISSON", "HERBIVORE");
		zoo.addAnimal("Boa constrictor", "SERPENT", "CARNIVORE");
		zoo.addAnimal("Python", "SERPENT", "CARNIVORE");

		 */
       /**
       * liste des Animaux du Zoo
        */
		ArrayList<Zoo> zoo = new ArrayList<>();
		zoo.add(new Zoo("Gazelle", "MAMMIFERE", "HERBIVORE", 5));
		zoo.add(new Zoo("Zèbre", "MAMIFERE", "HERBIVORE",  3));
		zoo.add(new Zoo("Lion", "MAMMIFERE", "HERBIVORE", 2));
		zoo.add(new Zoo("Panthère", "MAMMIFERE", "CARNIVORE", 1));
		zoo.add(new Zoo("Requin blanc", "POISSON", "HERBIVORE", 6));
		zoo.add(new Zoo("Truite dorée", "POISSON", "HERBIVORE", 1));
		zoo.add(new Zoo("Boa constrictor", "SERPENT", "CARNIVORE",  10));
		zoo.add(new Zoo("Python", "SERPENT", "CARNIVORE",  13));
	}

}
