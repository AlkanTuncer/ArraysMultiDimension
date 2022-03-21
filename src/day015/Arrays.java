package day015;

public class Arrays {
    public static void main(String[] args) {

        // Tek boyutlu dizi - Vektör
        // İki boyutlu dizi - Matrix

        String[] gunler;
        gunler=new String[7];
        gunler[0]="Pazartesi";
        gunler[1]="Salı";
        // .....
        gunler[6]="Pazar";

        String[] days={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};

        System.out.println("Eleman Adedi = "+days.length);
        System.out.println("Day 03 (2.Index) = "+days[2]);
        System.out.println("Day 07 (6.Index) = "+days[6]);

        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }                                           System.out.print("\n");
        for(String day:days){
            System.out.println(day);
        }

    }
}
