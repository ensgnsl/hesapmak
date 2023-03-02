import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2, select;
        double sonuc;

        System.out.print("1. Sayıyı girin :");
        n1 = input.nextInt();
        System.out.print("2. Sayıyı girin :");
        n2 = input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçin :");
        System.out.println("1 - Çarpma\n2 - Bölme\n3 - Toplama\n 4 - Çıkarma");
        select = input.nextInt();

        switch (select)
        {
        case 1:
            sonuc = n1 * n2;
            System.out.println("İŞlem Sonucu :" + sonuc);
            break;
        case 2:
            sonuc = n1 / n2;
            System.out.println("İŞlem Sonucu :" + sonuc);
            break;
        case 3:
            sonuc = n1 + n2;
            System.out.println("İŞlem Sonucu :" + sonuc);
            break;
        case 4:
            sonuc = n1 - n2;
            System.out.println("İŞlem Sonucu :" + sonuc);
            break;
        }

    }
}