package com.metin.finalkeyword.example;

public class TestFinalLocalVariable {

    public static void main(String[] args) {

        int a; // local variable tanımlanıp değer atanmadığından daha sonra değer atanabilir.
        a = 5; // bu durum gibi.
        a = 10; // local variable kullanırken, tanımlanırken değer atanabilir ve istedeğimiz kadar değer değiştirilebilir.
        System.out.println("a ==> " + a);

        // Fakat final keyword kullanılmış olursa sadece bir defa tanımlama şansımız olur.
        final int b = 20;
        System.out.println("b ==> " + b);


        final int c;
        c = 30;
        System.out.println("c ==> " + c);


        final int d = 40;
        d = 50; // bu satırda hata alırız. Çünkü d'nin değeri 40 olarak atanmıştır.
    }
}
