import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {

        short clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }



        int year = 2021;
        if ((year % 4 == 0 && year % 400 == 0)  && year > 1584) {
            System.out.println(year + " год является високосный");
        } else {
            System.out.println(year + " год не является високосным");
        }


        int deliveryDistance = 95;
        if (1 <= deliveryDistance && deliveryDistance <= 20) {
            System.out.println("Для доставки нужен 1 день");
        } else if (20 < deliveryDistance && deliveryDistance <= 60) {
            System.out.println("Для доставки нужно 2 дня");
        } else if (60 < deliveryDistance && deliveryDistance <= 100) {
            System.out.println("Для доставки нужно 3 дня");
        } else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }


        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Месяцев не так много");
        }
    }
}