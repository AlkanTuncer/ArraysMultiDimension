package day015;

public class JaggedArray {
    public static void main(String[] args) {

        // JAGGED ARRAY

        // Günleri Ayları ve Mevsimleri tutan bir dizi

        String[][] time=new String[3][]; // 3 Elemanlı bir dizi Günler - Aylar - Mevsimler
        time[0]=new String[7];   // İlk dizinin 0.indexi 7 elemanlı günler
        time[1]=new String[12];  // İlk dizinin 1.indexi 12 elemanlı aylar
        time[2]=new String[4];   // İlk dizinin 2.indexi 4 elemanlı mevsimler

        time[0][0]="Pazartesi";      time[1][0]="Ocak";    time[1][6]="Temmuz";     time[2][0]="İlkbahar";
        time[0][1]="Salı";           time[1][1]="Şubat";   time[1][7]="Ağustos";    time[2][1]="Yaz";
        time[0][2]="Çarşamba";       time[1][2]="Mart";    time[1][8]="Eylül";      time[2][2]="Sonbahar";
        time[0][3]="Perşembe";       time[1][3]="Nisan";   time[1][9]="Ekim";       time[2][3]="Kış";
        time[0][4]="Cuma";           time[1][4]="Mayıs";   time[1][10]="Kasım";
        time[0][5]="Cumartesi";      time[1][5]="Haziran"; time[1][11]="Aralık";
        time[0][6]="Pazar";

        String [][] time_53={
                {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"},
                {"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Agustos","Eylül","Ekim","Kasım","Aralık"},
                {"İlkbahar","Yaz","Sonbahar","Kış"}
        };

        for (int i = 0; i < time_53.length; i++) {   // Bu döngü 3 kez döner - time_53 dizisinin indexi kadar 0 1 2
            for (int j = 0; j < time_53[i].length; j++) {  // İlk dizinin i.indexin uzunlugu kadar dönücek - 0da7  1de12 2de4 kez dönücek.
                System.out.print(time_53[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
