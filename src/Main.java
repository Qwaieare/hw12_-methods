import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        Main.showCurrentDate();

        System.out.println("");
        System.out.println("Задача 2");

        String clientDevice = "LocalDate.now().getYear()";
        String clientOS = "0";
        Main.getClientOS(clientDevice, clientOS);


        System.out.println("");
        System.out.println("Задача 3");

        int deliveryDistance = 95;
        Main.deliveryOfBankCards(deliveryDistance);

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

    public static void getClientOS(String year, String name) {
        if (year.equals("LocalDate.now().getYear()")) {
            System.out.print("Установите обычную версию приложения для" + " ");
        } else {
            System.out.print("Установите облегченную версию приложения для" + " ");
        }
        if (name.equals("0")) {
            System.out.println("iOS");
        } else {
            System.out.println("Android");
        }
    }

    private static void deliveryOfBankCards(int deliveryDistance) {
        int days = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется " + days + " день");
        }
        if (deliveryDistance <= 60) {
            System.out.println("Потребуется " + (days + 1) + " дня");
        }
        if (deliveryDistance <= 100) {
            System.out.println("Потребуется " + (days + 2) + " дня");
        } else {
            System.out.println("Доставка до этого адреса невозможна");
        }
    }

}