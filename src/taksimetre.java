import java.util.Scanner;
public class taksimetre {
    public static void main (String[]args)
    {
        int a,b,c;
        double d,e;
        boolean fiyat;
        Scanner veri = new Scanner(System.in);
        a = 10;
        System.out.println("Taksimetre Açılış Ücreti :" + a);
        d=2.20;
        System.out.println("Taksimetre KM Ücreti :" + d);
        System.out.print("Gidilen KM :");
        b = veri.nextInt();
        e = (a+(d*b));
        fiyat = e <= 20;
        String str = fiyat ? "Ödeyeceğiniz Tutar 20 TL'dir." : "Ödeyeceğiniz Tutar :" + e ;
        System.out.print(str);




    }
}
