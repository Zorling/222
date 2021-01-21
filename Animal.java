public class Animal { //создали класс животных
    int x; //длинна препядствия

    void run(int x) { //общий метод для всех животных способность бежать
        System.out.println("пробежал " + x + " метров.");
    }

    void swim(int x) { //общий метод для всех животных способность плыть
        System.out.println("проплыл " + x + " метров.");
    }

}

class Cat extends Animal {
    public Cat(int x) {
        super();
        this.x = x;
    } // создали класс кошек, наследуемый от животных

    void runcat () {
        if (x <= 200) {
            System.out.print("Кот ");
            super.run(x);
        }
        else {
            System.out.println("Кот слишком жирный и не пробежал дистанцию...");
        }
    }

    void swimcat () {
        System.out.println("Кот не умеет плавать");
    }
}

class Dog   extends Animal { //создали класс собак, наследуемый от животных
    public Dog(int x) {
        super();
        this.x = x;
    } // создали класс собак, наследуемый от животных

    void rundog () {
        if (x <= 500) {
            System.out.print("Пёс ");
            super.run(x);
        }
        else {
            System.out.println("Пёс слишком жирный и не пробежал дистанцию...");
        }
    }

    void swimdog () {
        if (x < 10) {
            System.out.print("Пёс ");
            super.swim(x);
        }
        else {
            System.out.println("Пёс не смог проплыть дистанцию и вернулся на берег...");
        }
    }
}
