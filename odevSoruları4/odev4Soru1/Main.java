/*
 1- Unit Test nedir? Neden Unit Test yaparız? Unit Test Frameworkları listeleyiniz. Unit Test için
uyulması gereken kuralları belirƟniz.
 2- Design pattern nedir? Kaç tipi vardır her tipe 2 adet örnek veriniz? /*

1.Soru: Unit Test, yazılım geliştirme sürecindeki bir test türüdür ve genellikle en küçük test edilebilir birim olan "birim" (unit) adı verilen parçaları,
genellikle fonksiyonları veya metotları test etmek için kullanılır. Bu testler, kodun belirli bir kısmının doğru çalışıp çalışmadığını denetler.
    Unit Test için kullanılan birçok framework bulunmaktadır. Bunlardan bazıları şunlardır:
        JUnit: Java programlama dili için popüler bir unit test framework'üdür.
        NUnit: .NET platformu için kullanılan bir unit test framework'üdür.
        PyTest: Python dilinde kullanılan bir test framework'üdür.
        Mocha: JavaScript için bir test framework'üdür.
        RSpec: Ruby programlama dili için bir test framework'üdür.
        PHPUnit: PHP programlama dili için bir unit test framework'üdür.

    Unit Test'ler için bazı genel kurallar şunlardır:

        * Bağımsızlık ve Tekrarlanabilirlik: Her test birbirinden bağımsız olmalı ve defalarca çalıştırılabilir olmalıdır.
        * Beklenen ve Beklenmeyen Davranışların Test Edilmesi: Hem olumlu (beklenen sonuçlar) hem de negatif (hata durumları) senaryolar test edilmelidir.
        * Kolay Okunabilirlik: Testler anlaşılır olmalı ve test adları, test durumları açık bir şekilde belirtilmelidir.
        * Performans: Testlerin hızlı ve verimli olması önemlidir, aksi halde geliştirme sürecini uzatabilirler.
        * Sürekli Entegrasyon ve Sürekli Teslimat (CI/CD): Testlerin otomatikleştirilmesi ve sürekli entegrasyon süreçlerine entegre edilmesi, sürekli bir geliştirme sürecinde önemlidir.

        Unit testler, yazılım geliştirme sürecinde önemli bir rol oynar ve sağlam bir kod tabanı oluşturmak için temel bir unsurdur. Bu testler, yazılımın istikrarını artırır, hataları azaltır ve geliştirme sürecini daha verimli hale getirir.

2. Soru: Tasarım desenleri, yazılım geliştirme sürecinde tekrar eden problemlere yönelik genel çözüm şablonlarıdır. Üç ana kategoride incelenir: Oluşturucu Desenler (nesnelerin oluşturulması), Yapısal Desenler (nesneler arasındaki ilişki ve yapılar), ve Davranışsal Desenler (nesnelerin davranışları). Her kategoride iki örnek:
        * Oluşturucu Desenler: Singleton (Tekil Örnek), Factory Method (Fabrika Metodu).
        * Yapısal Desenler: Adapter (Adaptör), Decorator (Dekoratör).
        * Davranışsal Desenler: Observer (Gözlemci), Strategy (Strateji).

        Bu desenler, yazılım geliştirme sürecinde yaygın sorunlara yönelik test edilmiş ve tekrar kullanılabilir çözümler sunar.

     */
