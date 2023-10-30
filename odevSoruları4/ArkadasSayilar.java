/*
 x ve y poziƟf tamsayılar olmak üzere eğer x sayısının kendisi hariç bölenleri toplamı y sayısına ve aynı
zamanda y sayısının kendisi hariç bölenleri toplamı x sayısına eşit ise bu sayılar arkadaşƨr denir. Örneğin
220 ve 284 sayıları arkadaş sayılardır. Parametre olarak aldığı iki tamsayının arkadaş olup olmadıklarını
test eden areFriends metodunu yazınız. Metodunuzu dört basamaklı bir arkadaş sayı çifti bulan bir
kodla test edebilirsiniz
 */
public class ArkadasSayilar {

    // Verilen iki sayının arkadaş sayı olup olmadığını kontrol eden metod
    public static boolean areFriends(int x, int y) {
        return (sumFactors(x) == y && sumFactors(y) == x);
    }

    // Bir sayının tüm bölenlerinin toplamını döndüren metod
    public static int sumFactors(int number) {
        int sum = 0;

        // Sayının yarısına kadar olan bölenlerini toplar
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i; // Çarpanı toplama ekle
            }
        }

        return sum; // Tüm çarpanların toplamını döndürür
    }

    public static void main(String[] args) {
        int min = 1000; // Dört basamaklı sayılar için minimum değer
        int max = 9999; // Dört basamaklı sayılar için maksimum değer

        // Belirlenen aralıktaki sayıların arkadaş sayı olup olmadığını kontrol eder
        for (int i = min; i <= max; i++) {
            int sumFactorsI = sumFactors(i);
            if (sumFactorsI > i && sumFactorsI <= max) { // Arkadaş olma şartlarına uygun sayıyı kontrol et
                if (areFriends(i, sumFactorsI)) {
                    System.out.println(i + " ve " + sumFactorsI + " arkadaş sayılardır.");
                }
            }
        }
    }
}