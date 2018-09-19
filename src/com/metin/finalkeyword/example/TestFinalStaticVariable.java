package com.metin.finalkeyword.example;

public class TestFinalStaticVariable {

    private static int x;
    private static int y = 5;
    private static int z;

    private static final int a = 10;
    private static final int b;

    static {  // static final constructor'dan tanımlanamadığı için static blok ile tanımlama yapabiliriz.
        b = 30;
    }

    public TestFinalStaticVariable(int z){
        this.z = z;
    }

    public static void main(String[] args) {

        TestFinalStaticVariable testFinalStaticVariable = new TestFinalStaticVariable(20);

        System.out.println("x ==> " + testFinalStaticVariable.x);  // static tanımlanmış alanlara instance üzerinden ulaşabilirsiz. Örneğin: testInstanceVariable.x
        System.out.println("y ==> " + TestFinalStaticVariable.y);  // ama önerilen kullanım classAdi.alanAdi (TestFinalStaticVariable.y)
        System.out.println("z ==> " + z); // aynı class içerisinde olduğunda instance variable direkt kullanılabilir.

        System.out.println("a ==> " + a); // static final kullanımında ya değer tanımlanırken atanmalıdır. Örneğin: private static final int a = 10;
        System.out.println("b ==> " + b); // bu örnekte b'nin değeri static blok ile atanmıştır.

    }
}
