public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    //"Home Work 09.01.2023");
    public static void task1() {
        System.out.println(" Задача №1 ");
        int clientOS = 0;
        int year = 2014;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else  {
            System.out.println("Установите версию приложения для iOS по ссылке");}

        System.out.println(" Задача №2");
        if (clientOS == 1 && year <= 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        }
        else  {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println(" Задача №3 ");
        int year = 1960;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(+year + " високосный");
        } else {
            System.out.println(+year+ " не високосный");}
        }

    public static void task3() {
        System.out.println(" Задача №4 ");


    }
}