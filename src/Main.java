import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Main.showCurrentDate();

        System.out.println("");
        System.out.println("Задача 2");

        int clientDeviceYear = LocalDate.now().getYear();
        int clientOS = 0;
        int constructYear = constructClientYear(clientDeviceYear);
        int constructOS = constructClientOS(clientOS);
        System.out.println(constructYear + constructOS);

        System.out.println("");
        System.out.println("Задача 3");

        int deliveryDistance = 195;
        int result = deliveryOfBankCards(deliveryDistance);
        System.out.println(result);

    }

    public static void showCurrentDate() {
        int currentDate = LocalDate.now().getYear();
        boolean year = (currentDate % 4 == 0 && currentDate % 100 != 0 || currentDate % 400 == 0);
        if (year) {
            System.out.println(currentDate + " год является високосным");
        } else {
            System.out.println(currentDate + " год не является високосным");
        }
    }

    private static int constructClientYear(int yearOS) {
        if (yearOS == LocalDate.now().getYear()) {
            System.out.println("Установите обычную версию приложения для ");
        } else if (yearOS < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для ");
        }
        return (yearOS);
    }

    private static int constructClientOS(int textOS) {
        if (textOS == 0) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }
        return (textOS);
    }

    private static int deliveryOfBankCards(int deliveryDistance) {
        int days = 1;

        if (deliveryDistance <= 20) {
            return days;
        }
        if (deliveryDistance <= 60) {
            return days += 1;
        }
        if (deliveryDistance <= 100) {
            return days += 2;
        }
        return days -= 1;
    }
}