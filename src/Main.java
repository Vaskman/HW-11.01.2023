public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    //"Home Work 09.01.2023");
    public static void task1() {
        System.out.println(" Задача №1 ");
        int clientOS = 0;
        int year = 2014;
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        System.out.println(" Задача №2");
        if (clientOS == 1 && year <= 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println(" Задача №3 ");
        int year = 1960;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(+year + " високосный");
        } else {
            System.out.println(+year + " не високосный");
        }
    }

    public static void task3() {
        System.out.println(" Задача №4 ");
        int deliveryDistance = 101;
        int dey = 1;
        if (deliveryDistance > 20) {
            dey++;
        }
        if (deliveryDistance > 60) {
            dey++;
        }
        System.out.println("Дней потребуется " + dey);
        if (deliveryDistance > 100) {
            System.out.println("доставки нет");
        }
    }

    public static void task4() {
        System.out.println(" Задача №5 ");
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("вам пора на юпитер");


        }


    }
}
