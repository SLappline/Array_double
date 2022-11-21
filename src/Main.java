import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.print("Введите длинну массива: ");
        int size = scanner.nextInt();
        double [] array = new double[size];
        System.out.println("Введите значения, которые будут записанны в массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextDouble();
        }
        //Использую вывод для проверки значений массива
//        System.out.println("Ваш массив: " + Arrays.toString(array));
        for (double v : array) {
            sum += v; //Находим сумму всех значений массива
        }
        double average = sum / array.length; //Находим среднее арифметическое массива
        //Использую выводы для проверки суммы и среднего арифметического
//        System.out.printf("%.2f%n",sum);
//        System.out.printf("%.2f%n",average);
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * average;//Перемножаем каждое значение массива на срежнее арифметическое
        }
        System.out.printf("Ваш массив: " + Arrays.toString(array)); //Выводим массив на экран
    }
}
