public class Main {

    public static void main(String[] args) {

        // Static variable is declared by using the keyword static.
        // Static variable are also known as static member variables.
        // Every instance of the class shares the same static variable.
        // If changes are made to that variable, all other instances of that class will see the effect of that change

        System.out.println(DogStatic.genus);
        DogStatic dog = new DogStatic();
        dog.printData();

        System.out.println();

        // Instance Variables don't use the static keyword.
        // They're also known as fields or member variables.
        // They belong to a specific instance of a class

        DogInstance rex = new DogInstance("rex");
        DogInstance spike = new DogInstance("spike");
        rex.printName();
        spike.printName();



    }


}
