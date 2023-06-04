import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int day, month;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Doğduğunuz günü giriniz.");
        day = scanner.nextInt();

        System.out.println("Doğduğunuz ayı giriniz.");
        month = scanner.nextInt();

        String burc = "";

        if ((month == 3 && day >= 21) || (month == 4 && day <= 20)) {
            burc = "Koç Burcu";
        } else if ((month == 4 && day >= 21) || (month == 5 && day <= 21)) {
            burc = "Boğa Burcu";
        } else if ((month == 5 && day >= 22) || (month == 6 && day <= 22)) {
            burc = "İkizler Burcu";
        } else if ((month == 6 && day >= 23) || (month == 7 && day <= 22)) {
            burc = "Yengeç Burcu";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            burc = "Aslan Burcu";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            burc = "Başak Burcu";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            burc = "Terazi Burcu";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            burc = "Akrep Burcu";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            burc = "Yay Burcu";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 21)) {
            burc = "Oğlak Burcu";
        } else if ((month == 1 && day >= 22) || (month == 2 && day <= 19)) {
            burc = "Kova Burcu";
        } else if ((month == 2 && day >= 20) || (month == 3 && day <= 20)) {
            burc = "Balık Burcu";
        } else {
            System.out.println("Hatalı giriş!");
            return;
        }

        System.out.println("Burcunuz: " + burc);
    }
}