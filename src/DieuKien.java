import java.util.Scanner;

public class DieuKien {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("nhập số a");
        int so1 = a.nextInt();
        System.out.println("nhập số b");
        int so2 = b.nextInt();
        if (so1 % so2 == 0) {
            System.out.println("số a chia hêt cho số b");
        } else {
            System.out.println("số a không chia hết cho số b");
        }
    }
}

class BBai2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Hãy nhập tuổi của học sinh: ");
        int age = a.nextInt();
        if (age < 15) {
            System.out.println("Học sinh này chưa đủ điều kiện vào 10");
        } else if (age >= 15 && age <= 25) {
            System.out.println("học sinh này đã đủ điều kiện vào 10");
        } else {
            System.out.println("học sinh đã vựt quá điều kiện để vào 10");
        }
    }
}

class BBai3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra: ");
        int so = a.nextInt();
        if (so < 0) {
            System.out.println("số " + so + " là số âm");
        } else {
            System.out.println("số " + so + " là số dương");
        }
    }
}

class BBai4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("nhập số a :");
        int so1 = a.nextInt();
        System.out.println("nhập số b :");
        int so2 = b.nextInt();
        System.out.println("nhập số c");
        int so3 = c.nextInt();
        if (so1 > so2 && so1 > so3) {
            System.out.println("Số " + so1 + " là số lớn nhất");
        } else if (so2 > so1 && so2 > so3) {
            System.out.println("Số " + so2 + " là số lớn nhất");
        } else {
            System.out.println("Số " + so3 + " là số lớn nhất");
        }
    }
}

class BBai5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("nhập điểm bài kiểm tra :");
        double kiemtra = a.nextDouble();
        System.out.println("nhập điểm bài thi giữ kỳ :");
        double giuaky = b.nextDouble();
        System.out.println("nhập điểm bài thi cuối kỳ");
        double cuoiky = c.nextDouble();
        double e = kiemtra * 0.1 + giuaky * 0.3 + cuoiky * 0.6;
        if (e >= 8) {
            System.out.println(e + " Đạt học sinh giỏi");
        } else if (e < 8 && e >= 6.5) {
            System.out.println(e + " Đạt học sinh khá");
        } else if (e < 6.5 && e >= 4.5) {
            System.out.println(e + "Đạt học sinh trung bình");
        } else {
            System.out.println(e + " Đạt học sinh yếu");
        }
    }
}

class BBai6 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nhập doanh số bán hàng trong tháng: ");
        double doanhso = a.nextDouble();
        double datduoc = (doanhso / 1000000000) * 100;
        if (datduoc < 40 && datduoc >= 0) {
            System.out.println("doanh số cần đạt được trong tháng là: 1,000,000,000");
            System.out.println("doanh thu đạt được trên tháng là " + datduoc + "%");
            System.out.println("không có thưởng hoa hồng");
        } else if (datduoc >= 40 && datduoc < 80) {
            double thuong = doanhso * 0.2;
            System.out.println("doanh số cần đạt được trong tháng là: 1,000,000,000");
            System.out.println("doanh thu đạt được trên tháng là " + datduoc + "%");
            System.out.println("được thưởng hoa hồng 20% " + thuong + "VNĐ");
        } else {
            double thuong = doanhso * 0.4;
            System.out.println("doanh số cần đạt được trong tháng là: 1,000,000,000");
            System.out.println("doanh thu đạt được trên tháng là " + datduoc + "%");
            System.out.println("được thưởng hoa hồng 40% " + thuong + "VNĐ");
        }
    }
}

class BBai7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nhập số thời gian sử dụng:");
        double time = a.nextDouble();
        if (time > 0 && time <= 30) {
            Scanner b = new Scanner(System.in);
            System.out.println("đây có phải cuộc gọi trong nước không?");
            boolean c = b.nextBoolean();
            if (c == true) {
                double tien = time * 0.790;
                System.out.println("Là cuộc gọi trong nước");
                System.out.println("số tiền cước điện thoại tính theo hộ gia đình là: " + tien + "VNĐ");
            } else {
                double tien = time * 1.000;
                System.out.println("Là cuộc gọi ngoài nước");
                System.out.println("số tiền cước điện thoại tính theo hộ gia đình là: " + tien + "VNĐ");
            }
        }
        else if (time > 30 && time <= 60) {
            Scanner b = new Scanner(System.in);
            System.out.println("đây có phải cuộc gọi trong nước không?");
            boolean c = b.nextBoolean();
            if (c == true) {
                double tien = time * 0.1200;
                System.out.println("Là cuộc gọi trong nước");
                System.out.println("số tiền cước điện thoại tính theo hộ gia đình là: " + tien + "VNĐ");
            } else {
                double tien = time * 1.500;
                System.out.println("Là cuộc gọi ngoài nước");
                System.out.println("số tiền cước điện thoại tính theo hộ gia đình là: " + tien + "VNĐ");
            }
        }
        if(time<60){
            Scanner b = new Scanner(System.in);
            System.out.println("đây có phải cuộc gọi trong nước không?");
            boolean c = b.nextBoolean();
            if(c == true){
                double tien = time*1500;
                System.out.println("Là cuộc gọi trong nước");
                System.out.println("số tiền cước điện thoại tính theo hộ gia đình là: "+tien +"VNĐ");
            }
            else {
                double tien = time*1.700;
                System.out.println("Là cuộc gọi ngoài nước");
                System.out.println("số tiền cước điện thoại tính theo hộ gia đình là: "+tien +"VNĐ");
            }
        }
    }
}
class BBBai1{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nhập độ C ");
        double C = a.nextDouble();
        double F = (C *9/5)+32;
        System.out.println("Độ F là: " + F );
    }
}
class BBBai2{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nhập met: ");
        double M = a.nextDouble();
        double Ft = M * 3.2808;
        System.out.println("Feet là: " + Ft);
    }
}
class BBBai3{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nhập cạnh a :");
        double C = a.nextDouble();
        double S = C*C;
        System.out.println("Diện tích hình vuông là: " + S);
    }
}
class BBBai4 {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    Scanner b = new Scanner(System.in);
        System.out.println("nhập cạnh a:");
        double C1 = a.nextDouble();
        System.out.println("nhập cạnh b:");
        double C2 = b.nextDouble();
        double S = C1*C2;
        System.out.println("Diện tích hình chữ nhật là: "+ S);
}
}
class BBBai5 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("nhập giá trị a: ");
        double C1 = a.nextDouble();
        System.out.println("nhập giá trị b");
        double C2 = b.nextDouble();
        double S = (C1*C2)/2;
        System.out.println("Diện tích hình tam giác là: "+ S);
    }
}
class BBBai6 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        System.out.println("nhập cạnh a: ");
        double C1 = a.nextDouble();
        System.out.println("nhập cạnh b");
        double C2 = b.nextDouble();
        double x = -(C2/C1);
        if(C1 == 0 &&  C2 == 0){
            System.out.println("phương trình có vô số nghiệm");
        }
        else if(C1 == 0 &&  C2 != 1){
            System.out.println("phương trinh vô nghiệm");
        }
        else if(C1 != 0 ){
            System.out.println("phương trình có 1 nghiệm là: " + x);
        }
    }
}
class BBBai7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("nhập giá trị a: ");
        double C1 = a.nextDouble();
        System.out.println("nhập giá trị b");
        double C2 = b.nextDouble();
        System.out.println("nhập giá trị c");
        double C3 = c.nextDouble();
        double detal = C2*C2-4*C1*C3;
        double x1 = (-C2+(Math.sqrt(detal)))/2*C1;
        double x2 = (-C2-(Math.sqrt(detal)))/2*C1;
        double x3 = -C2/(2*C1);
        if(detal < 0){
            System.out.println("phương trình bậc 2 vô nghiệm: ");
        }
        else if(detal == 0){
            System.out.println("phương trình có nghiệm kép: "+ x3);
        }
        else if(detal >0){
            System.out.println(" phương trình có 2 nghiệm: "+ x1 +" và "+x2);
        }
    }
}
class BBBai8 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("nhập số tuổi của người muốn kiểm tra: ");
        int age = a.nextInt();
        if(age>0 && age<120){
            System.out.println(age + " là độ tuổi của 1 người:");
        }
        else {
            System.out.println(age+ "  không phải là độ tuổi của 1 người  ");
        }
    }
}
class BBBai9 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("nhập cạnh a: ");
        double C1 = a.nextDouble();
        System.out.println("nhập canh b");
        double C2 = b.nextDouble();
        System.out.println("nhập cạnh c");
        double C3 = c.nextDouble();
        if(C1 > 0 && C2 > 0 && C3 > 0){
            if (C1 + C2 >C3 || C1 +C3 >C2 || C3 +C2>C1){
                System.out.println("Đây là 3 cạnh của 1 tam giác");
            }
            else {
                System.out.println("Đây không phải 3 cạnh của 1 tam giác");
            }
        }
        else {
            System.out.println("Đây không phải 3 cạnh của 1 tam giác");
        }
    }
}



