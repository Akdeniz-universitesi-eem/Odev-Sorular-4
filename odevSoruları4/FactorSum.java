/*
Parametresi ile aldığı poziƟf bir tamsayının kendisi hariç tüm çarpanlarının toplamı ile geri dönen
sumFactors metodunu yazınız. Metot parametresi ile aldığı sayı hariç tüm çarpanlarının toplamına geri
dönecekƟr: (1 her sayının doğal çarpanıdır ve toplama dahil edilecekƟr.)
 */
public class FactorSum {

    // Verilen sayının tüm çarpanlarının toplamını döndüren metod
    public static int sumFactors(int number) {
        int sum = 0;

        // 1'den başlayarak sayının yarısına kadar olan çarpanlarını toplar
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i; // Çarpanı toplama ekle
            }
        }

        return sum; // Tüm çarpanların toplamını döndürür
    }

    public static void main(String[] args) {
        int sayi = 28; // Örnek olarak 28'i kullanalım
        int toplam = sumFactors(sayi);
        System.out.println(sayi + " sayısının çarpanlarının toplamı: " + toplam);
    }
}


