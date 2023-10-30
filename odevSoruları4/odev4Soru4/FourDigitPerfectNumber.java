/*
 4 basamaklı tek bir mükemmel sayı vardır. Yazmış olduğunuz isPerfect metodunu kullanarak 4
basamaklı mükemmel sayıyı bulan programı yazınız
 */
public class FourDigitPerfectNumber {

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
        for (int i = 1000; i <= 9999; i++) {
            if (isPerfect(i)) {
                System.out.println("4 basamaklı mükemmel sayı: " + i);
                break; // Tek bir 4 basamaklı mükemmel sayı olduğu belirtildiği için döngüden çık
            }
        }
    }
}