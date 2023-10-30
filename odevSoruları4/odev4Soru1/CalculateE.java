// Bir Java programı yazarak e sayısını seri toplamıyla hesaplayarak ekrana yazdırınız.
public class CalculateE {

    public static void main(String[] args) {
        int n = 20; // İterasyon sayısı, isteğe bağlı olarak değiştirilebilir.
        double e = calculateE(n);
        System.out.println("e sayısı: " + e);
    }

    // e sayısını hesaplamak için seri toplamı kullanan fonksiyon
    public static double calculateE(int n) {
        double eApprox = 1.0; // e'nin ilk terimi
        double factorial = 1.0;

        // Belirtilen iterasyon sayısına kadar döngü
        for (int i = 1; i <= n; i++) {
            factorial *= i; // Faktöriyel değeri her adımda güncelleniyor.
            eApprox += 1.0 / factorial; // E sayısının yaklaşık değeri her adımda güncellenir.
        }

        return eApprox; // Yaklaşık e sayısını döndürür.
    }
}

