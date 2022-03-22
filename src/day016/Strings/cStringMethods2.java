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
    }
}
