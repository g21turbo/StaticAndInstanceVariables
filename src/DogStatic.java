public class DogStatic {

    static String genus = "Canis";

    void printData() {
        DogStatic d = new DogStatic();
        System.out.println(d.genus); // Confusing
        System.out.println(DogStatic.genus); // Clearer
    }

}
