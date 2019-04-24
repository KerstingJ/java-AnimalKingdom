package animals;

public abstract class AbstractAnimal {
    private static int maxId = 0;
    private int id;
    private String name;
    private int year;

    public AbstractAnimal(String name, int year) {
        id = maxId++;
        this.name = name;
        this.year = year;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public void eat() {
        System.out.println("crunch");
    }

    @Override
    public String toString()
    {
        return name + " Year Named: " + year;
    }
}