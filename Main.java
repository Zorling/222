public class Main {
    public static void main(String[] args) {
        int i = 501; //длинна нашего препядствия
        Cat cat1 = new Cat(i);
        cat1.runcat();
        cat1.swimcat();

        Dog dog1 = new Dog(i);
        dog1.rundog();
        dog1.swimdog();
    }

}
