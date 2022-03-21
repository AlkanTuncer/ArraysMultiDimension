package day015;

public class Arrays3D {
    public static void main(String[] args) {

        // 3D Arrays

        int[][][] notlar53;  // Öğrenciler - Dersler - Vize ve Final Notları

        int[][][] notlar={
                {
                        {70,80},{50,65},{80,85}  // 1.Ögrencinin Mat Fiz Kimya Notları -(Vize,Final)
                },
                {
                        {50,70},{30,60},{75,85}  // 2.Ögrencinin Mat Fiz Kimya Notları -(Vize,Final)
                },
                {
                        {80,80},{70,70},{60,60}  // 3.Ögrencinin Mat Fiz Kimya Notları -(Vize,Final)
                }
        };

        int[][][] notlar_1=new int[3][3][2];  // 3 öğrenci 3 ders 2 sınav
        notlar_1[0][0][1]=70;
        notlar_1[2][1][1]=70;


        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                for (int k = 0; k < notlar[i][j].length; k++) {
                    System.out.print(notlar[i][j][k]+" ");       // en içteki notlar arası bosluk
                }
                System.out.print("\t");      // 2 notun diger 2 notla arasındaki tab
            }
            System.out.println();      // Her dönüş sonrası alt satıra geçme
        }

    }
}
