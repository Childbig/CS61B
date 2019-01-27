package Discussion.Dis4;

/******************************************************************************
 *  Author:        Zhang Xuan
 *  Written:       2018/8/6
 *  Last updated:  2018/8/6
 *  Compilation:   javac Animal.java
 *  Description:   Given the Animal class, fill in the definition of the Cat                    class so that when greet() is called, the label “Cat”                        (instead of “Animal”) is printed to the screen. Assume that                   a Cat will make a “Meow!” noise if the cat is 5 years or                     older and “MEOW!”if the cat is less than 5 years old.
 *
 ******************************************************************************/


public class Animal {
    protected String name, noise;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.noise = "Huh?";
    }

    public String makeNoise() {
        if (age < 5) {
            return noise.toUpperCase();
        } else {
            return noise;
        }
    }

    public void greet() {
        System.out.println("Animal " + name + " says: " + makeNoise());
    }
}


class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
        this.noise = "Meow!";
    }

    @Override
    public String makeNoise() {
        return super.makeNoise();
    }

    @Override
    public void greet() {
        System.out.println("cat " + this.name + " says: " + makeNoise());
    }
    public static class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
            noise = "Woof!";
        }

        @Override
        public void greet() {
            System.out.println("Dog " + name + " says: " + makeNoise());
        }

        public void playFetch() {
            System.out.println("Fetch, " + name + "!");
        }
    }

    public static void main(String[] args) {
        Animal a = new Animal("Pluto", 10);
        Cat c = new Cat("Garfield", 6);
        Dog d = new Dog("Fido", 4);

    }

}
