import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rate = 23000;
        System.out.println("nhap so tien muon chuyen doi USD :");
        float usd = scanner.nextFloat();
        float vnd = usd*rate;
        System.out.println("so tien VND la :"+vnd);

    }
}
