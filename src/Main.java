import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)throws InvalidAgeException {
        //A1 İstifadəçidən Scanner ilə iki ədəd alın və bölün. InputMismatchException
        // və ArithmeticException-ı
        // ayrı-ayrı tutun. Düzgün giriş olana qədər təkrar soruşun.


//            Scanner sc = new Scanner(System.in);
//
//            while (true) {
//                try {
//                    System.out.print("Birinci ədəd: ");
//                    int a = sc.nextInt();
//
//                    System.out.print("İkinci ədəd: ");
//                    int b = sc.nextInt();
//
//                    int netice = a / b; // b == 0 olsa ArithmeticException
//                    System.out.println("Nəticə: " + a + " / " + b + " = " + netice);
//                    break; // düzgün giriş oldu, dövrdən çıx
//
//                } catch (InputMismatchException e) {
//                    System.out.println("Xəta: yalnız tam ədəd daxil edin!");
//                    sc.nextLine(); // səhv daxiletməni bufferdən təmizləyir
//
//                } catch (ArithmeticException e) {
//                    System.out.println("Xəta: sıfıra bölmək olmaz!");
//                }
//            }
            //A2 String[] names = {"Ali", "Vüsal", "Aysel"} massivi verilib.
            // İstifadəçidən indeks alın, elementi çap edin.
            // İndeks yanlışdırsa ArrayIndexOutOfBoundsException-ı tutub mesaj verin.

//        String[] names = {"Ali", "Vüsal", "Aysel"};
//            Scanner scanner=new Scanner(System.in);
//            try {
//                System.out.println("indexi daxil edin");
//                int index =scanner.nextInt();
//                System.out.println(names[index]);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println(e.getMessage());
//            }



        //A3 String array-dəki dəyərləri int-ə çevirin: {"12", "abc", "7", "", "3.5", "-4"}.
        // Hər element üçün ya nəticəni,
        // ya da “X: rəqəm deyil” mesajını çap edin. Sonda düzgün çevrilənlərin cəmini tapın
//
//                String[] deyerler = {"12", "abc", "7", "", "3.5", "-4"};
//                int cem = 0;
//
//                for (String s : deyerler) {
//                    try {
//                        int n = (int) Double.parseDouble(s); // onluq hissə atılır
//                        System.out.println("\"" + s + "\" -> " + n);
//                        cem += n;
//                    } catch (NumberFormatException e) {
//                        System.out.println("\"" + s + "\": rəqəm deyil");
//                    }
//                }
//
//                System.out.println("Düzgün çevrilənlərin cəmi: " + cem);





            // Düzgün hal
//            try {
//                RegisterUser.registerUser("Əli", 25);
//            } catch (InvalidAgeException e) {
//                System.out.println("Xəta: " + e.getMessage());
//            }
//
//            // Yanlış hal (18-dən kiçik)
//            try {
//                RegisterUser.registerUser("Leyla", 15);
//            } catch (InvalidAgeException e) {
//                System.out.println("Xəta: " + e.getMessage());
//            }
//
//            // Yanlış hal (120-dən böyük)
//            try {
//                RegisterUser.registerUser("Vüqar", 130);
//            } catch (InvalidAgeException e) {
//                System.out.println("Xəta: " + e.getMessage());
//            }




    }
}