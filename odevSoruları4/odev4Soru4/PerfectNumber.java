/*
 Parametresi ile aldığı int türden bir değerin mükemmel sayı olup olmadığını test eden isPerfect
metodunu yazınız. Metot sayı mükemmel ise true mükemmel değil ise false değerine geri dönecektir.
 */
public class PerfectNumber {

    // Verilen sayının mükemmel sayı olup olmadığını kontrol eden metod
    public static boolean isPerfect(int number) {
        int sum = 0;

        // Sayının bölenlerinin toplamını bul
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Toplam, verilen sayıya eşit mi kontrol et
        return sum == number;
    }

    public static void main(String[] args) {
        int testNumber = 28; // Örnek olarak 28'i kullanalım

        if (isPerfect(testNumber)) {
            System.out.println(testNumber + " mükemmel bir sayıdır. That is true.");
        } else {
            System.out.println(testNumber + " mükemmel bir sayı değildir. That is false.");
        }
    }
}