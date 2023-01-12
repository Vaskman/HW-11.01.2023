public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    //"Home Work 09.01.2023");
    public static void task1() {
        System.out.println(" Задача №1 ");
        char clientOS = 0;
        char year = 2014;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        System.out.println(" Задача №2");
        if (clientOS == 1 && year <= 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        }
        if (clientOS == 0 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println(" Задача №3 ");
        char year = 2021;

    }
}