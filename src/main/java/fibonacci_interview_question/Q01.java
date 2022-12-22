package fibonacci_interview_question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
         /*
 INTERWIEW
Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
0-1-1-2-3-5-8-13-21-34....
*/
        List<Integer> fibonacci=new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayı= scan.nextInt();

        fibonacci.add(0);
        fibonacci.add(1);
        int i=1;
        if (sayı<=1){
            System.out.println("Lütfen 1'den büyük bir sayı giriniz");

        }else {

            while (fibonacci.get(i)<sayı){
                fibonacci.add(fibonacci.get(i)+fibonacci.get(i-1));//bir önceki eleman ile topladık
                i++;//bir basamak ilerlesin
            }
        }
        if (fibonacci.get(fibonacci.size()-1)>sayı){//fibonacci'de yer almıyorsa
            fibonacci.remove(fibonacci.size()-1);//son elemanı kaldır
            System.out.println("Girdiğiniz sayı fibonacci'de yer almıyor.\nGirilen sayıya kadar olan olan fibonacci:"+ fibonacci);
        }else {
            System.out.println("Girdiğiniz sayı bir fibonacci sayısıdır."+fibonacci);
        }


    }
}
