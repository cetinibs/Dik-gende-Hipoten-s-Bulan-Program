package Giris;
import java.util.*;
import java.util.Scanner;

public class UcgenHipotenusHesaplama {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("A kenarını giriniz : ");
        int a = input.nextInt();


        System.out.print("B kenarını giriniz : ");
        int b = input.nextInt();

        double c=Math.sqrt(a*a+b*b);
        System.out.print("Hipotenüs değeri:"+c);

    }

}
