import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // <kiểu dữ liệu> name =<giá trị>;
        // các lệnh trong java bắt buộc phải kết thúc bằng dấu ;
        // các kiểu dữ liệu: số nguyên(int) 0,1,2,3,4,...,
        //                   số thực double 1.5,2.5,3.2,...,
        //                   số thực (float) 1.5f,2.5f
        //                   logic (boolean) true/false
        //                   chuỗi (String)  "Đạt, C04jv,..."
        //                   ký tự (character) : 'a', 'b', 'j'
//        int age = 10;
//        float diem = 9.75f;
//        double a = 10.04;
//        String name = "Đạt";
//        char f = 'r';
//        boolean b = true;
//        // fomast code Ctrl + Alt +L
//        //in ra sử dụng sout + tab
//        System.out.println(age);
//        System.out.println(diem);
//        System.out.println(a);
//        System.out.println(name);
//        System.out.println(b);
//        System.out.println(f );
//    }

    /*
    Các loại toán tử
    - toán tử số học; +,-,*,/,%,++,--
    - toán tử logic ; || , && , !
    - toán tử so sánh ; != ,< ,>,<=,>=
-------------------------------------------------------------------------
    Các câu lệnh điều kiện
     CÁC ĐIỀU KIỆN BẮT BUỘC PHẢI CÓ KIỂU DỮ LIỆU LÀ BOOLEAN

    -if(<điều kiện>){
    <khôi lượng thực thi khi câu lệnh true>
    }
    else {
    Khôi câu lệnh khi điều kiện false
    }
-------------------------------------------------------------------------
    -if(<điều kiện 1> ){
    <khôi lượng thực thi khi câu lệnh1 true>
    }
else if(<Đk2>){
    Khôi câu lệnh thục thi khi điều kiện 1 false thực hiện đk2
    }
    else if(<dk3>){
    Khôi câu lệnh thục thi khi điều kiện2 false thực hiện đk3
    }
   */
//        int choose = 1;
//        switch (choose) {
//            case 1:
//                System.out.println("hello");
//                break;
//
//            case 2:
//                System.out.println("helllllo");
//        }
//        String name = "Đạt con";
//        System.out.println("Đạt nhỏ "+10+" có tên là "+ name);
//        System.out.println("hehe");
//        System.out.print("hả");
//        System.out.print("hú");
////        System.out.printf(); //tìm hiểu thêm


        // Nhập dữ liệu
//        Scanner input = new Scanner(System.in);  //Đại diện cho nơi nhập dữ liệu từ bàn phím (System.in là nhập từ bàn phím)
//        System.out.println("vui lòng nhập : ");
//        int a = input.nextInt(); // gọi phương thức nhập số
//        double a =input.nextDouble();
//        boolean a = input.nextBoolean();
//        String a = input.nextLine(); // nhập chuỗi
//        System.out.println("số bạn nhập là " + a);
// ------------------------------------------------------------------------------
        // nhập dữ liệu từ bàn phím
        Scanner inputNumber = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        System.out.println("Nhập số");
        int number = inputNumber.nextInt();
        System.out.println("Nhập chữ");
        String text = inputText.nextLine();
        System.out.println("text: " + text);
        System.out.println("number: " + number);



    }


}