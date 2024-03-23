public class QuizNo7 {
    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("                   QUIZ 1 NO 7                ");
        System.out.println("==============================================");
        System.out.println("Nama    : ODDIS NUR ALIFATHUR RAZAAQ");
        System.out.println("NIM     : 2241760015");
        System.out.println("Kelas   : SIB 2C");
        System.out.println("==============================================");
        
        // Tipe Data
        boolean 
        A = true, B = false, C = false, D = false,
        E = true, F = false, G = false, H = false,
        I = false, J = false, K = false;

        System.out.println();
        System.out.println("==============================================");
        // Ditanyakan
        System.out.println("Apakah K bernilai benar?");
        // Diketahui
        System.out.println("Fakta: A,E");
        System.out.println("==============================================");

        //Iterasi yang dilakukan menggunakan metode forward chaining
        boolean adaPerubahan;
        do {
            adaPerubahan = false;

            // R1
            if (A && B && !C) {
                C = true;
                System.out.println("Fakta baru C bernilai benar");
                adaPerubahan = true;
            }

            // R2
            if (C && !D) {
                D = true;
                System.out.println("Fakta baru D bernilai benar");
                adaPerubahan = true;
            }

            // R3
            if (A && E && !F) {
                F = true;
                System.out.println("Fakta baru F bernilai benar");
                adaPerubahan = true;
            }

            // R4
            if (A && !G) {
                G = true;
                System.out.println("Fakta baru G bernilai benar");
                adaPerubahan = true;
            }

            // R5
            if (F && G && !D) {
                D = true;
                System.out.println("Fakta baru D bernilai benar");
                adaPerubahan = true;
            }

            // R6
            if (G && E && !H) {
                H = true;
                System.out.println("Fakta baru H bernilai benar");
                adaPerubahan = true;
            }

            // R7
            if (C && H && !I) {
                I = true;
                System.out.println("Fakta baru I bernilai benar");
                adaPerubahan = true;
            }

            // R8
            if (I && A && !J) {
                J = true;
                System.out.println("Fakta baru J bernilai benar");
                adaPerubahan = true;
            }

            // R9
            if (G && !J) {
                J = true;
                System.out.println("Fakta baru J bernilai benar");
                adaPerubahan = true;
            }

            // R10
            if (J && !K) {
                K = true;
                System.out.println("Fakta baru K bernilai benar");
                adaPerubahan = true;
            }
        } while (adaPerubahan);
        System.out.println();
        System.out.println("==============================================");
        // Ditanyakan
        System.out.println("Apakah K bernilai benar? " + K);
        System.out.println();
        System.out.println("==============================================");
        // Kesimpulannya
        System.out.println("Jadi kesimpulannya adalah K bernilai:" + K);
    }
}