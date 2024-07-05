import java.util.Scanner;

public class ToanTu {
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
        System.out.println("chia lấy dư của 2 số là:" +(so1%so2) );
    }
}
class Baii2{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int so1 = a.nextInt();
        System.out.println("nhập số b: ");
        int so2 = b.nextInt();
        System.out.println(" Sử dụng các toán tử =, +=, -=, *=, /= ");

        System.out.println("a = b " + (so1 = so2));
        System.out.println("a += b " + (so1 += so2));
        System.out.println("a -= b " + (so1 -= so2));
        System.out.println("a *= b " + (so1 *= so2));
        System.out.println("a /= b " + (so1 /= so2));
    }
}
class Baii3{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("nhập số a: ");
        int so1 = a.nextInt();
        System.out.println("nhập số b: ");
        int so2 = b.nextInt();
        System.out.println("Giá trị ban đầu của a: " + so1);
        System.out.println("Giá trị  của a++ : " + so1++);
        System.out.println("Giá trị  của ++a :" + ++so1);
        System.out.println("Giá trị  của --a : " + --so1);
        System.out.println("Giá trị  của a-- : " + so1--);
        System.out.println("Giá trị ban đầu của b: " + so2);
        System.out.println("Giá trị của b++ : " + so2++);
        System.out.println("Giá trị của ++b : " + ++so2);
        System.out.println("Giá trị của --b : " + --so2);
        System.out.println("Giá trị của b-- : " + so2--);
    }
}
class Baii4{
    public static void main(String[] args) {
            Scanner a = new Scanner(System.in);
            Scanner b = new Scanner(System.in);
            System.out.println("nhập số a: ");
            int so1 = a.nextInt();
            System.out.println("nhập số b: ");
            int so2 = b.nextInt();
        System.out.println("a < b : " + (so1 < so2));
        System.out.println("a > b : " + (so1 > so2));
        System.out.println("a <= b : " + (so1 <= so2));
        System.out.println("a >= b : " + (so1 >= so2));
        System.out.println("a == b : " + (so1 == so2));
        System.out.println("a != b : " + (so1 != so2));
    }
}