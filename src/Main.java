public class Main {

    public static void main(String[] args) {

        // Static variable is declared by using the keyword static.
        // Static variable are also known as static member variables.
        // Every instance of the class shares the same static variable.
        // If changes are made to that variable, all other instances of that class will see the effect of that change

        System.out.println(Dog.genus);
        Dog dog = new Dog();
        dog.printData();

    }


}
