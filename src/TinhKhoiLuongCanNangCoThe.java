import java.util.Scanner;

public class TinhKhoiLuongCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Nhập cân nặng của bạn (kg): ");
        weight = scanner.nextDouble();
        System.out.print("Nhập chiều cao của bạn (m): ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s\n", "BMI", "Đánh giá");
        if (bmi < 18.5)
            System.out.printf("%-20.2f%s\n", bmi, "Gầy");
        else if (bmi < 23)
            System.out.printf("%-20.2f%s\n", bmi, "Bình thường");
        else if (bmi < 25)
            System.out.printf("%-20.2f%s\n", bmi, "Thừa cân");
        else if (bmi < 30)
            System.out.printf("%-20.2f%s\n", bmi, "Béo phì độ I");
        else if (bmi < 35)
            System.out.printf("%-20.2f%s\n", bmi, "Béo phì độ II");
        else
            System.out.printf("%-20.2f%s\n", bmi, "Béo phì độ III");
        scanner.close();
    }

}
