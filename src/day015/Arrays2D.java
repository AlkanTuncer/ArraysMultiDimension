package day015;

public class Arrays2D {
    public static void main(String[] args) {

        // Two Dimension Array

        int[][] notlar_1=new int[5][3];  // 5 Ögrenci - 3 Ders var
        notlar_1[0][0]=70;
        notlar_1[0][1]=60;
        notlar_1[0][2]=50;

        int[][] notlar={
             //  M  F  K
                {70,60,50},  //Çağlasu
                {80,55,75},  //Alkan
                {75,85,95},  //Ersel
                {40,60,80},  //Taylan
                {30,80,50}   //Ali Haydar
        };

        double[] toplamlar=new double[notlar[0].length];  //Ders notlarının ortalamasını bulmak için

        String[] isimler={"Çağlasu","Alkan","Ersel","Taylan","Ali H"};
        System.out.println("Öğrenci\tMat\tFiz\tKim");

        for (int i = 0; i < notlar.length; i++) {   // Her bir ögrenci için dönüyor.
            System.out.print(isimler[i]+"\t");      // İsim dizisi içinde "i" döndü.
            for (int j = 0; j < notlar[i].length; j++) {  //Her bir dersin notu için dönüyor.
                System.out.print(notlar[i][j]+"\t");
                toplamlar[j]+=notlar[i][j];
            }
            System.out.println();
        }
        System.out.println("Not Ortalamaları:");
        System.out.println("Mat "+toplamlar[0]/notlar.length);
        System.out.println("Fiz "+toplamlar[1]/notlar.length);
        System.out.println("Kim "+toplamlar[2]/notlar.length);
    }
}
