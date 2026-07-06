abstract class Animal {
    abstract void sound();
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog sounds");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {

        Animal obj = new Dog();

        obj.sound();
        obj.sleep();
    }
}