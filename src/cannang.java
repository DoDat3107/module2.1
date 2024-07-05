import java.sql.SQLOutput;
import java.util.Scanner;

public class cannang {
    public static void main(String[] args) {
        // nhập bằng bàn phím
        Scanner width = new Scanner(System.in);
        Scanner height = new Scanner(System.in);
    //hiển thị và lưu thông tin nhập vào
        System.out.println("Nhập chiều rộng");
        int x = width.nextInt();
        System.out.println("Nhập chiều dài");
        int y = height.nextInt();
    // hiển thị kết quả
        System.out.println("chiều rộng là: " + x);
        System.out.println("chiều dài là: " + y);

    }

}

