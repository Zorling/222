import com.sun.deploy.security.SelectableSecurityManager;

public class main {
    public static void main(String[] args) {

//Задание 1 начало
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};  //создание массива
        int n = myArray.length;
        for (int i = 0; i < n; i++) {
            int k = myArray[i];

            if (k == 0) myArray[i] = 1;
            else myArray[i] = 0;

            System.out.print(myArray[i]);
        }
//Задание 1 конец

//Задание 2 начало
        int[] myArray02 = new int[8];
        int y = 0;
        for (int i = 0; i < 8; i++) {
            myArray02[i] = y;
            y = y + 3;

        }
//Задание 2 конец

//Задание 3 начало
        int[] myArray03 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (myArray03[i] < 6)
                myArray03[i] = myArray03[i] * 2;
        }
//Задание 3 конец

//Задание 4 начало
        int[][] myArray04 = new int[8][8];
        for (int j = 0; j < 8; j++) {
            if (j%2 != 0){
                for (int i = 0; i < 8; i = i + 2) {
                    myArray04[j][i] = 1;
                }
            }
            else {
                for (int i = 1; i < 8; i = i + 2) {
                    myArray04[j][i] = 1;
                }
            }
        }
    }
    //Задание 4 конец

}

