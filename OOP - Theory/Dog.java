class Animal {
    public void animalSound() {
        System.out.println("Default Sound");
    }
}

public class Dog extends Animal {
    public void animalSound() {
        System.out.println("bork");
    }

    public static void main(String args[]) {
        Animal obj = new Dog();
        obj.animalSound();
    }
}