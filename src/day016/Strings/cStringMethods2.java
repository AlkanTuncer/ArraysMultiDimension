package day016.Strings;

public class cStringMethods2 {
    public static void main(String[] args) {

        String str1=new String("Bu bir deneme mesajıdır.");
        str1.replace("deneme","test"); // Heapdeki nesne direk değiştirilmedi. Yeni bir nesne veriyor bize metot.
        String strChanged=str1.replace("deneme","test");  // 2.nesneyi yeni bir adrese tanımladık.
        System.out.println(str1);
        System.out.println(strChanged);

        str1=str1.replace('ı','i');
        System.out.println(str1);

        System.out.println();


        System.out.println("".isEmpty());   //T
        System.out.println("".isBlank());   //T
        System.out.println("A".isEmpty());  //F
        System.out.println("A".isBlank());  //F
        System.out.println(" ".isEmpty());  //F
        System.out.println(" ".isBlank());  //T
        System.out.println("               ".isBlank()); //T

        String str17="     Bu bir deneme mesajıdır.     ";
        String str23="Bu bir deneme mesajıdır.";
        System.out.println(str17);
        System.out.println(str23);

        System.out.println("str17 : "+str17.length());
        System.out.println("str23 : "+str23.length());

        String str20=str17.trim();  // Bir metnin sagında ve solunda bosluk karakteri var ise trim metotu o boslukları kaldırır ve yeni nesne olarak başka değişkene atarız.
        System.out.println(str20);                                                                                             // orjinal nesnedeki metin değişmez.
        System.out.println("str20 : "+str20.length());
        System.out.println(str17);


    }
}
