import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c, u, area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci dik kenarın uzunluğunu giriniz: ");
        a = scanner.nextInt();

        System.out.print("İkinci dik kenarın uzunluğunu giriniz: ");
        b = scanner.nextInt();

        // Hipotenüsü bul ve bildir
        c =  Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("Hipotenüsün uzunluğu: " + c );

        // Alanı, 𝑢 = (a+b+c) / 2 => alan^2 = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) formülüne göre bul ve bildir
        u = (a + b + c) /2;
        area = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin alanı: " + area);

    }

}
