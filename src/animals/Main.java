package animals;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Mammal panda = new Mammal("Panda", 1869);
        Mammal zebra = new Mammal("Zebra", 1778);
        Mammal koala = new Mammal("Koala", 1816);
        Mammal sloth = new Mammal("Sloth", 1804);
        Mammal armadillo = new Mammal("Armadillo", 1758);
        Mammal raccoon = new Mammal("Raccoon", 1758);
        Mammal bigfoot = new Mammal("Bigfoot", 2021);

        Bird pigeon = new Bird("Pigeon", 1837);
        Bird peacock = new Bird("Peacock", 1821);
        Bird toucan = new Bird("Toucan", 1758);
        Bird parrot = new Bird("Parrot", 1824);
        Bird swan = new Bird("Swan", 1758);

        Fish salmon = new Fish("Salmon", 1758);
        Fish catfish = new Fish("Catfish", 1817);
        Fish perch = new Fish("Perch", 1758);

        ArrayList<AbstractAnimal> animals = new ArrayList<AbstractAnimal>();
        animals.add(panda);
        animals.add(zebra);
        animals.add(koala);
        animals.add(sloth);
        animals.add(armadillo);
        animals.add(raccoon);
        animals.add(bigfoot);
        animals.add(pigeon);
        animals.add(peacock);
        animals.add(toucan);
        animals.add(parrot);
        animals.add(swan);
        animals.add(salmon);
        animals.add(catfish);
        animals.add(perch);

        System.out.println("*** descending by year name ***");
        animals.sort((a1, a2) -> a1.getYear() - a2.getYear());
        animals.forEach(a -> System.out.println(a));

        System.out.println("*** Animals Alpa Order ***");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animals.forEach(a -> System.out.println(a));

        System.out.println("*** Animals in order by movement ***");
        animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animals.forEach(a -> System.out.println(a));

        System.out.println("*** Animals that breath with lungs ***");
        animals.forEach(a -> {
            if (a.breath().equals("lungs")) {
                System.out.println(a);
            }
        });

        System.out.println("*** Animals that breath with lungs and named 1758***");
        animals.forEach(a -> {
            if (a.breath().equals("lungs") && a.getYear() == 1758) {
                System.out.println(a);
            }
        });

        System.out.println("*** Animals that breath with lungs and lay eggs ***");
        animals.forEach(a -> {
            if (a.breath().equals("lungs") && a.reproduce().equals("eggs")) {
                System.out.println(a);
            }
        });


        System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
        animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        printEachAnimal(animals, a -> a.getYear() == 1758);

        System.out.println("*** STRETCHHHHH ***");
        printEachAnimal(animals, a -> a instanceof Mammal);

    }

    public static void printEachAnimal(ArrayList<AbstractAnimal> arr, CheckAnimal c){
        for (AbstractAnimal a: arr) {
            if (c.thingToDo(a)){
                System.out.println(a);
            }
        }
    }
}