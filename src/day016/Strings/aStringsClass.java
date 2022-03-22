package day016.Strings;

public class aStringsClass {
    public static void main(String[] args) {

        // String: Temelde bir karakterler dizisidir.String isminde bir class ile temsil edilir.
        // String , StringBuffer , StringBuilder --> java.lang ktphanesinde bulunur.
        // Stringler ilkel tip olmadıgı için HEAP de tutulur. Heap de bir NESNE oluşturulur.

        String str1="Dante";  // --> Heap'de tutulur ama Heap içerisinde String Pool'da tutulur.
        String str2=new String("Dante");  // --> Heap içerisinde bir nesne şeklinde tutulur havuzdan bağımsız.
        System.out.println(str1);
        System.out.println(str2);

        String str3=new String("Dante").intern(); // --> Nesne heap'de pool içerisine gönderirilir. intern metodu ile.
        String str4="Dante";
        String str5=new String("Dante");

        if (str1==str2) System.out.println("İki metin aynıdır.");
        else System.out.println("Farklıdır.");

        System.out.println(str1==str4); //str1 ile str4 heap'deki poolda aynı nesne olur.
        System.out.println(str2==str5);  //str2 ile str5 aynı olsa da heap'de farklı nesne olarak tutulurlar.Adresleri farklıdır.
        System.out.println(str1==str3);

        if (str2.equals(str5)){   // Üstte false demişti ama burda true dedi. 2 ayrı nesne var heapde tutulan ama nesne içerisindeki content aynı oldugu için true çıktı.
            System.out.println("Aynıdır.");                                                                      // equals metodu içeriği kıyasladı.
        }else{
            System.out.println("Farklıdır.");
        }
        System.out.print("\n");

        String str6="Alkan";  // bir harf bile büyük-kücük olsa dahi F verir cünkü poolda farklı nesne olurlar.
        String str7="aLkaN";
        System.out.println(str6==str7); // False
        System.out.println(str6.equals(str7)); //F
        System.out.println(str6.equalsIgnoreCase(str7)); //T

    }
}
