package Hesaplamalar;

import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {

        double boy,kilo,vki;

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen Boyunuzu Giriniz (Metre Cinsinden) : ");
        boy=input.nextDouble();
        System.out.println("Lutfen Kilonuzu Giriniz (Kilogram Cinsinden) : ");
        kilo=input.nextDouble();

        vki=(kilo/(boy*boy));

        System.out.println("Vucut Kitle Endeksiniz : "+vki);



    }
}
