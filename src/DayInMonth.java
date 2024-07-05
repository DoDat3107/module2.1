import java.util.Scanner;

public class DayInMonth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhập tháng muốn kiểm tra: ");
        int month = in.nextInt();
        switch (month) {
            case 2:
                System.out.print("tháng '2' có 28 hoặc 29 ngày!");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("tháng '" + month + "' có 31 ngày!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("tháng '" + month + "' có 30 ngày!");
                break;
            default:
                System.out.print("Tháng này không tồn tại!");
                break;
        }
        }

    }

