import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập năm muốn kiểm tra: ");
        int year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("Đây là năm nhuận: ", year);
                } else {
                    System.out.printf("Đây không phải năm nhuận", year);
                }
            } else {
                System.out.printf("Đây là năm nhuận", year);
            }
        } else {
            System.out.printf("Đây không phải là năm nhuận", year);
        }
    }

}
