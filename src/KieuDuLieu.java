import java.util.Scanner;

public class KieuDuLieu {
    public static void main(String[] args) {
        int a =9;
        System.out.println(a);
    }
}
class Bai2{
    public static void main(String[] args) {
        Scanner Numberinput = new Scanner(System.in);
        System.out.println("Hãy nhập số :");
        int n = Numberinput.nextInt();
        System.out.println("số nhập vào là :" + n);
    }
}
class Bai3{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int so1 = a.nextInt();
        System.out.println("nhập số b: ");
        int so2 = b.nextInt();
        System.out.println("tổng 2 số là: "+(so1+so2) );
        System.out.println("hiệu 2 số là:" +(so1-so2) );
        System.out.println("tích 2 số là:" +(so1*so2) );
        System.out.println("thương 2 số là:" +(so1/so2) );
        System.out.println("chia lấy dư của4 2 số là:" +(so1%so2) );


    }
}
class Bai4{
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        System.out.println("nhập tên của bạn: " );
        String name1 = name.nextLine();
        System.out.println("nhập tuổi của bạn:");
        int age1 = age.nextInt();
        System.out.println("Xin chào "+name1 +","+" tôi năm nay "+age1);

    }
}
