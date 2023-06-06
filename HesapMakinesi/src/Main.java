import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n1,n2,select;

        System.out.println("MENU\n-----------\n1-TOPLAMA\n2-CIKARMA\n3-CARPMA\n4-BOLME");
        System.out.println("yukaridaki menuden yapmak istediginiz islemi seciniz.");

        select = scan.nextInt();

        System.out.print("ilk sayiyi giriniz : ");
        n1 = scan.nextInt();
        System.out.print("ikinci sayiyi giriniz : ");
        n2 = scan.nextInt();

        switch(select) {
            case 1:
                System.out.println("Toplama islemi : "+(n1+n2));
                break;
            case 2:
                System.out.println("Cikarma islemi : "+(n1-n2));
                break;
            case 3:
                System.out.println("Carpma islemi : "+(n1*n2));
                break;
            case 4:
                if(n2 == 0)
                    System.out.println("herhangi bir sayi sifira bolunemez ikinci sayinizi tekrar giriniz.");
                else
                System.out.println("Bolme islemi : "+(n1/n2));
                break;
            default:
                System.out.println("menuden secim yapamadiniz. 1 ile 4 arasi bir secim yapiniz.");
                break;
        }

    }
}