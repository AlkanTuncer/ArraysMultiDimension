package day017;

public class bStringsMethodsSplit {
    public static void main(String[] args) {

        String name="Alkan Dante Tuncer";
        String[] names=name.split(" "); // String[] names={"Alkan","Dante","Tuncer"} şeklinde bir dizi oldu.

        String initialLetters="";
        for (String s:names){
            initialLetters+=s.charAt(0);
        }
        System.out.println(initialLetters);


        String str="Elimizde uzunca bir cümle oldugunu varsayalım. Bu cümle kaç kelimeden olusmaktadır?";
        System.out.println(countWords(str));

    }

    public static int countWords(String content){
        return content.split(" ").length;
    }

}
