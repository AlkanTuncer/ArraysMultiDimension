package day016.Strings;

public class bStringMethods {
    public static void main(String[] args) {

        String str1="Bu bir Java uygulamasıdır.";
        System.out.println(str1);
        System.out.println(str1.toLowerCase());   // String nesneleri immutable'dir.Değiştirilemezler. Metotlar content üzerinde değişiklik yapılır ve String olarak döndürür.
        System.out.println(str1);                 // toLoweCase metotundan sonra str1 i yazdırınca bir değişiklik olmadığını farkediyoruz.
        System.out.println(str1.toUpperCase());

        str1=str1.toUpperCase(); //Burda str1'i yeni bir nesne yaptıgımız için bundan sonra değişir.
        System.out.println(str1);

        String str2="Benim adım Dante.";
        str1=str2;                       //Heapdeki nesne ile bagını kopardık ve GarbageCollector aldı-->"Bu bir Java uygulamasıdır."
        System.out.println(str1);

        System.out.println();


        String str53="Benim Adım Dante.";
        System.out.println(str53.charAt(0));   // String str53 dizisinin 0.index B
        System.out.println(str53.charAt(1));   // String str53 dizisinin 1.index e
        System.out.println(str53.charAt(7));   // String str53 dizisinin 7.index d
        System.out.println(str53.charAt(10));  // String str53 dizisinin 10.index " " Boşluk.
        System.out.println(str53.charAt(15));
        System.out.println(str53.length());  // 0 1 2 3 4 5 ....... 15 --> toplam 16 tane karakter var.

        for (int i = 0; i < str53.length(); i++) {
            System.out.print(str53.charAt(i));
        }
        System.out.println();


        String str17=reverse(str53);
        System.out.println(str17);
        System.out.println(str53.substring(11)); // Bu metot dizinin belirttigin indexinden yazdırıyor.

    }
//SOLID - Yukarıdaki herhangi bir şeye bagımlı değil metodumuz.

    public static String reverse(String content){   //Bir metin içeriğini tersten yazdıran metot.
        String result="";
        for (int i = content.length()-1; i >= 0 ; i--) {
            result+=content.charAt(i);
        }
        return result;
    }
}
