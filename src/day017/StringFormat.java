package day017;

public class StringFormat {
    public static void main(String[] args) {

        String isim="Alkan";

        // %s ve %n Kullanımı
        // %s --> Placeholder for string value
        // %n --> Placeholder for new line(carriage return)
        System.out.printf("Merhaba %s!",isim);  // souf -> printf    %s String Value -> isim yer tutucunun oldugu yerde gösterilicek.  '%s Place Holder'
        System.out.println("Merhaba "+isim+"!");

        System.out.printf("Merhaba %s!%n",isim); // %n aynı \n gibi sonrakini yeni satıra gönderdi.İmleci sonraki satıra aldı.
        System.out.println("Merhaba "+isim+"!");

        System.out.println();
        // %f --> Floating point numbers
        double price=53.17190553;
        System.out.println(String.format("Price = %5.2f",price));
        System.out.println(String.format("Price = %8.2f",price));
        System.out.println(String.format("Price = %8.5f",price));

        String message=String.format("Price = %8.2f",price);
        System.out.printf("Price = %8.2e%n",25.3);
        System.out.println(message);

        System.out.println();
        // %b --> null ve false durumda false, diğer bütün değerler için true gösterir.
        System.out.printf("Result : %b%n",5);
        System.out.printf("Result : %b%n",false);
        System.out.printf("Result : %b%n",true);
        System.out.printf("Result : %b%n",null);

        System.out.println();
        //%c --> unicod charecter  %x --> hexal   %d --> decimal  %o --> 4lük sistemdeki karsılıgını gösterir.
        System.out.printf("Result : %x%n",65);
        System.out.printf("Result : %c%n",65);
        System.out.printf("Result : %d%n",65);
        System.out.printf("Result : %o%n",65);



    }
}
