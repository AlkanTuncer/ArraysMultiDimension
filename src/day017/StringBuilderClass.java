package day017;

public class StringBuilderClass {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Mesaj: ");    // String'de olsa değiştirilemez!! StringBuilder'da değiştirilebilir ilave yapılabilir nesneye.
        sb.append("Bu bir uyarı mesajıdır.");

        int x=53;
        sb.append(x);

        sb.append(" gündür buradayım.");



        sb.delete(0,7);  // 0 1 2 3 4 5 6 index silindi --> 'Mesaj: '

        sb.append(" Sen neredesin?");

        sb.insert(3,"önemli ");  // 3.indexe 'önemli ' ekledik.

        sb.reverse(); // Metnimizi tersine çevirdi. NESNE KALICI OLARAK TERS OLDU.
                      // BURDA NESNE DEĞİŞTİĞİ İÇİN ORJİNAL HALİ HER ZAMAN SONDAKİ OLUR.

        sb.reverse(); //Tersin tersini aldık yani düz oldu tekrar (:

        System.out.println(sb.toString());

    }
}
