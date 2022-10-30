public class Main {
    public static void main(String[] args) {
//  Задание 1
        System.out.println("//ОС мобильного приложения");
        boolean clientOS = true;
        if (clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
//  Задание 2
        System.out.println("//Версия мобильного приложения");
        boolean clientOS1 = true;
        int clientDeviceYear = 2017;
        if (clientOS1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
//  Задание 3
        System.out.println("//Високосный год");
        int year = 2000;
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
//  Задание 4
        System.out.println("//Срок доставки карты");
        int deliveryDistance = 120;
        int deliveryDays = (deliveryDistance - 20)/ 40;
        if ((deliveryDistance - 20) % 40 == 0) {
            deliveryDays = deliveryDays + 1;
            System.out.println("Потребуется дней:" + deliveryDays);
        } else {
            deliveryDays = deliveryDays + 2;
            System.out.println("Потребуется дней:" + deliveryDays);
        }
//  Задание 4
        System.out.println("//Сезон по номеру месяца");
        int monthNumber = 5;
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}