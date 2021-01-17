
public class Main {

    public static void main(String[] args) {
        Worker[] workerArray = new Worker[5];
        workerArray[0] = new Worker("Прокопьев Эдмунд Сергеевич", "Лейтенант", "prok@mail.ru", 711148080, 200, 32);
        workerArray[1] = new Worker("Грин Антон Игоревич", "Дознаватель", "gra112@mail.ru", 920131313, 300, 30);
        workerArray[2] = new Worker("Андерсон София Леонидовна", "Связист", "sofi15@mail.ru", 222345654,  300,41);
        workerArray[3] = new Worker("Игнатьев Дмитрий Александрович","Сержант", "ignat@mail.ru", 444567840, 250, 45);
        workerArray[4] = new Worker("Прохоров Юрий Геннадьевич","Старший сержант","proxor@mail.ru",899404040,400,29);
        Worker[] workers = new Worker[1];






        for (int i = 0; i<5; i++) {
            workerArray[i].print();
        }
    }

}


