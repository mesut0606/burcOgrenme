import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**Koç Burcu : 21 Mart - 20 Nisan
         Boğa Burcu : 21 Nisan - 21 Mayıs
         İkizler Burcu : 22 Mayıs - 22 Haziran
         Yengeç Burcu : 23 Haziran - 22 Temmuz
         Aslan Burcu : 23 Temmuz - 22 Ağustos
         Başak Burcu : 23 Ağustos - 22 Eylül
         Terazi Burcu : 23 Eylül - 22 Ekim
         Akrep Burcu : 23 Ekim - 21 Kasım
         Yay Burcu : 22 Kasım - 21 Aralık
         Oğlak Burcu : 22 Aralık - 21 Ocak
         Kova Burcu : 22 Ocak - 19 Şubat
         Balık Burcu : 20 Şubat - 20 Mart */
        int month, day;
        String burc = " ";


        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz :");
        month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz :");
        day = input.nextInt();
        // Koç Burcu : 21 Mart - 20 Nisan
        if ((month == 3 && day >= 21 && day <= 31)) {
            burc = "Koç";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 4 && day >= 1 && day <= 20)) {
            burc = "Koç";
            System.out.println("Burcunuz " + burc);
        }
        //Boğa Burcu : 21 Nisan - 21 Mayıs
        if ((month == 4 && day >= 21 && day <= 30)) {
            burc = "Boğa ";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 5 && day >= 1 && day <= 21)) {
            burc = "Boğa ";
            System.out.println("Burcunuz " + burc);
        }
        //İkizler Burcu : 22 Mayıs - 22 Haziran
        if ((month == 5 && day >= 22 && day <= 31)) {
            burc = "İkizler ";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 6 && day >= 1 && day <= 22)) {
            burc = "İkizler ";
            System.out.println("Burcunuz " + burc);
        }
        //Yengeç Burcu : 23 Haziran - 22 Temmuz
        if ((month == 6 && day >= 23 && day <= 30)) {
            burc = "Yengeç";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 7 && day >= 1 && day <= 22)) {
            burc = "Yengeç";
            System.out.println("Burcunuz " + burc);
        }
        // Aslan Burcu : 23 Temmuz - 22 Ağustos
        if ((month == 7 && day >= 23 && day <= 31)) {
            burc = "Aslan";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 8 && day >= 1 && day <= 22)) {
            burc = "Aslan";
            System.out.println("Burcunuz " + burc);
        }
        // Başak Burcu : 23 Ağustos - 22 Eylül
        if ((month == 8 && day >= 23 && day <= 31)) {
            burc = "Başak";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 9 && day >= 1 && day <= 22)) {
            burc = "Başak";
            System.out.println("Burcunuz " + burc);
        }
        // Terazi Burcu : 23 Eylül - 22 Ekim
        if ((month == 9 && day >= 23 && day <= 30)) {
            burc = "Terazi";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 10 && day >= 1 && day <= 22)) {
            burc = "Terazi";
            System.out.println("Burcunuz " + burc);
        }
        // Akrep Burcu : 23 Ekim - 21 Kasım
        if ((month == 10 && day >= 23 && day <= 31)) {
            burc = "Akrep";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 11 && day >= 1 && day <= 21)) {
            burc = "Akrep";
            System.out.println("Burcunuz " + burc);
        }
        // Yay Burcu : 22 Kasım - 21 Aralık

        if ((month == 11 && day >= 22 && day <= 30)) {
            burc = "Yay";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 12 && day >= 1 && day <= 21)) {
            burc = "Yay";
            System.out.println("Burcunuz " + burc);
        }
        // Oğlak Burcu : 22 Aralık - 21 Ocak
        if ((month == 12 && day >= 22 && day <= 31)) {
            burc = "Oğlak";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 1 && day >= 1 && day <= 21)) {
            burc = "Oğlak";
            System.out.println("Burcunuz " + burc);
        }
        // Kova Burcu : 22 Ocak - 19 Şubat
        if ((month == 1 && day >= 22 && day <= 31)) {
            burc = "Kova";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 2 && day >= 1 && day <= 19)) {
            burc = "Kova";
            System.out.println("Burcunuz " + burc);
        }
        //    Balık Burcu : 20 Şubat - 20 Mart
        if ((month == 2 && day >= 20 && day <= 29)) {
            burc = "Balık";
            System.out.println("Burcunuz " + burc);
        }
        if ((month == 3 && day >= 1 && day <= 20)) {
            burc = "Balık";
            System.out.println("Burcunuz " + burc);
        }
        if (!(1 >= month || month <= 12)){
            System.out.println("Doğduğunuz ayı hatalı girdiniz!!");
        }

        if (!(1 >= day || day <= 31)){
          System.out.println("Doğduğunuz günü hatalı girdiniz!!");
       }
    }
}


