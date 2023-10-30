/* Aşağıdaki tabloda herhangi bir programının şifre belirleme arayüzü verilmişƟr. Aşağıdaki
koşulları yerine şifre oluşturulması sağlayan java programını yazınız. ( Not:
jopƟonpane.showinputdialog yapılarını kullanabilirsiniz.) */
import javax.swing.JOptionPane;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {
        // Kullanıcıdan şifre uzunluğunu girmesini isteyen bir ileti penceresi görüntülenir.
        String lengthInput = JOptionPane.showInputDialog(null, "Şifre Uzunluğunu Girin: ");

        if(lengthInput != null && !lengthInput.isEmpty()) {
            try {
                // Kullanıcının girdiği metni tam sayıya dönüştürür.
                int passwordLength = Integer.parseInt(lengthInput);
                // Belirtilen uzunlukta bir şifre oluşturan metodu çağırır.
                String password = generatePassword(passwordLength);
                // Oluşturulan şifreyi kullanıcıya gösteren bir ileti penceresi görüntülenir.
                JOptionPane.showMessageDialog(null, "Oluşturulan Şifre: " + password);
            } catch (NumberFormatException e) {
                // Geçersiz sayı girişi durumunda kullanıcıya bir hata mesajı gösterilir.
                JOptionPane.showMessageDialog(null, "Lütfen geçerli bir sayı girin!");
            }
        } else {
            // Boş veya geçersiz giriş durumunda kullanıcıya bir uyarı gösterilir.
            JOptionPane.showMessageDialog(null, "Geçersiz giriş!");
        }
    }

    // Belirtilen uzunlukta rastgele şifre oluşturan metot.
    public static String generatePassword(int length) {
        // Şifre oluşturulurken kullanılacak karakterlerin bulunduğu dize.
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?";

        // Oluşturulan şifrenin tutulacağı String Builder nesnesi.
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            // Rastgele bir karakter seçilir ve şifre oluşturulur.
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        return password.toString(); // Oluşturulan şifre döndürülür.
    }
}
