package day017;

public class aStringsMethods {
    public static void main(String[] args){


        String str1="Deneme mesajıdır.";
        int aranan=str1.indexOf("n");              //-->Bu metot arananın indexini verir.
        System.out.println("Bulunan "+aranan);

        System.out.println(str1.substring(7));     //-->Bu metot girilen indexten itibaren
        System.out.println(str1.substring(7,12));  //Belirtilen indexler arası yazdırıldı. 12 dahil degil 12'ye kadar oluyor. 7 8 9 10 11

        System.out.println();

        System.out.println(findInitialLetters("Alkan Tuncer"));
        System.out.println(findInitialLetters("Çağlasu Büke"));

        hideSomeCharsOfName("Alkan Tuncer");
    }

    /*
        Verilen ad ve soyadı içeren metinden sadece baş harflerini döndüren bir metot yazınız.
        Name : A l k a n   T u n c  e  r
               0 1 2 3 4 5 6 7 8 9 10 11
     */

    public static String findInitialLetters(String name){
        char firstChar=name.charAt(0);
        int spaceIndex=name.indexOf(" ");
        char secondChar=name.charAt(spaceIndex+1);
        return firstChar+""+secondChar;
    }

    /*
        Adı ve Soyadı baş harfler hariç gizleyen bir metot yazınız.
        Alkan Tuncer --> A**** T*****
     */

    public static void hideSomeCharsOfName(String name){
        char firstLetter=name.charAt(0);
        int spaceIndex=name.indexOf(" ");
        char secondLetter=name.charAt(spaceIndex+1);

        String hidden="";
        for (int i = 0; i < name.length(); i++) {
            hidden+=i==0?firstLetter:i==spaceIndex+1?secondLetter:"*";  // Turnary ? ve :
        }
        System.out.println(hidden);
    }


}
