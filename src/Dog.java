public class Dog {

    static String genus = "Canis";

    void printData() {
        Dog d = new Dog();
        System.out.println(d.genus); // Confusing
        System.out.println(Dog.genus); // Clearer
    }

}
