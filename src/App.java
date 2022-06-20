import java.util.ArrayList;
import java.util.Scanner;

public class App {       
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);
        
        
        
        ArrayList<Mahasiswa> mahasiswa = new ArrayList<>();
        ArrayList<Matkul> matkul1 = new ArrayList<>();
        ArrayList<Term> term = new ArrayList<>();
        ArrayList<KHSDetail> khsDetail = new ArrayList<>();
        ArrayList<KHS> khs = new ArrayList<>();

        Mahasiswa.initMahasiswa(mahasiswa);
        Matkul.initMatkul1(matkul1);
        KHSDetail.initKHSDetail(khsDetail);
        Term.initTerm(term);
        KHS.initKHS(khs);
        

        int pilihan=1;
        String yn = "y";
        do {
            cetakMenu();
            pilihan = input.nextInt();
            if (pilihan == 1) {
                String StudentID;
                String NamaMahasiswa;
                String Jurusan;
                String TahunMasuk;
                System.out.print("Student ID\t : \t");
                StudentID = input.next();
                System.out.print("Nama Mahasiswa\t : \t");
                NamaMahasiswa = input.next();
                System.out.print("Jurusan\t\t : \t");
                Jurusan = input.next();
                System.out.print("Tahun Masuk\t : \t");
                TahunMasuk = input.next();
                
                mahasiswa.add(new Mahasiswa(StudentID, NamaMahasiswa, Jurusan, TahunMasuk));
                
            } else if (pilihan == 2) {
                String kodeTerm;
                String tahunAjaran;
                String semesterTerm;
                String keteranganTerm;
                String keteranganSingkatTerm;

                System.out.print("Kode Term \t:\t");
                kodeTerm = input.next();
                System.out.print("Tahun Ajaran \t:\t");
                tahunAjaran = input.next();
                System.out.print("Semester Term \t:\t");
                semesterTerm = input.next();
                System.out.print("Keterangan Term \t:\t");
                keteranganTerm = input.next();
                System.out.print("Keterangan Singkat Term \t:\t");
                keteranganSingkatTerm = input.next();

                term.add(new Term (kodeTerm, tahunAjaran, semesterTerm, keteranganTerm, keteranganSingkatTerm));

            } else if (pilihan == 3) {
                String kodeKHS;
                String keteranganKHS;
                String keteranganSingkatKHS;

                System.out.print("Kode KHS \t:\t");
                kodeKHS = input.next();
                System.out.print("Keterangan KHS \t:\t");
                keteranganKHS = input.next();
                System.out.print("Keterangan Singkat KHS \t:\t");
                keteranganSingkatKHS = input.next();
                
                khs.add(new KHS (kodeKHS, keteranganKHS, keteranganSingkatKHS));
                
            } else if (pilihan == 4) {
                String kodeKHSdetail;
                String kodeKHS;
                String kodeMatkul;
                int nilai;
                String StudentID;
                
                System.out.print("Kode KHS Detail\t : \t");
                kodeKHSdetail = input.next();
                System.out.print("Kode KHS\t\t : \t");
                kodeKHS = input.next();
                System.out.print("Kode Matkul\t : \t");
                kodeMatkul = input.next();
                System.out.print("Nilai\t\t : \t");
                nilai = input.nextInt();
                System.out.print("Student ID\t : \t");
                StudentID = input.next();
                
                khsDetail.add(new KHSDetail(kodeKHSdetail, kodeKHS, kodeMatkul, nilai, StudentID));

            } else if (pilihan == 5) {
                String kodeMatkul;
                String namaMatkul;
                double sks;
                String kodeTerm;
                
                System.out.print("Kode Matkul\t : \t");
                kodeMatkul = input.next();
                System.out.print("Nama Matkul\t : \t");
                namaMatkul = input.next();
                System.out.print("SKS\t\t : \t");
                sks = input.nextDouble();
                System.out.print("Nilai\t\t : \t");
                kodeTerm = input.next();
                
                matkul1.add(new Matkul(kodeMatkul, namaMatkul, sks, kodeTerm));

            } else if (pilihan == 6) {
                Mahasiswa.cetakMahasiswa(mahasiswa);

            } else if (pilihan == 7) {
                Term.cetakTerm(term);

            } else if (pilihan == 8) {
                KHS.cetakKHS(khs);

            } else if (pilihan == 9) {
                KHSDetail.cetakKHSDetail(khsDetail);

            } else if (pilihan == 10) {
                Matkul.cetakMatkul(matkul1);

            } else if (pilihan == 11) {
                String studentId = "";

                System.out.print("Masukkan student ID : ");
                studentId = input.next();
                KHSDetail.cetakKHS(khsDetail, studentId, term);

            } else if (pilihan == 12) {
                int pilihan12=0;
                System.out.println("----------------");
                System.out.println("1. IP Term");
                System.out.println("2. IPK");
                System.out.print("Masukkan pilihan anda : ");
                pilihan12 = input.nextInt();
                if (pilihan12 == 1) {
                    String studentId = "";
                    int termInput = 0;
                    double hasil = 0;

                    System.out.print("Masukkan student ID : ");
                    studentId = input.next();
                    System.out.print("Masukkan term : ");
                    termInput = input.nextInt();
                    hasil = KHS.getIPKTerm(khsDetail, studentId, termInput, term);
                    System.out.println("IP Mahasiswa " + studentId + " di term " + termInput + " adalah " + hasil);
                    
                } else if (pilihan12 == 2) {
                    String studentId = "";
                    double hasil = 0;
                    System.out.print("Masukkan student ID : ");
                    studentId = input.next();
                    hasil = KHS.getIPK(khsDetail, studentId);
                    System.out.println("IPK Mahasiswa " + studentId  + " adalah " + hasil);
                }

            } else if (pilihan == 13) {
                String studentId = "";
                int termInput = 0;

                System.out.print("Masukkan student ID : ");
                studentId = input.next();
                System.out.print("Masukkan term : ");
                termInput = input.nextInt();
                KHSDetail.cetakDetailKHS(khsDetail, studentId, termInput, term);

            } else if (pilihan == 14) {
                break;

            }
            System.out.print("Apakah anda ingin kembali ke menu awal : ");
            yn = input.next();
            if(yn.equalsIgnoreCase("n")){
                clearScreen();
                System.out.println("\nTerima Kasih\n");
            }
        } while (yn.equalsIgnoreCase("y"));
    }
    
    public static void cetakMenu (){
        System.out.println("------------------------------");
        System.out.println("1. Input Mahasiswa");
        System.out.println("2. Input Term");
        System.out.println("3. Input KHS");
        System.out.println("4. Input KHS Detail");
        System.out.println("5. Input Mata Kuliah");
        System.out.println("6. Cetak Mahasiswa");
        System.out.println("7. Cetak Term");
        System.out.println("8. Cetak KHS (Semua)");
        System.out.println("9. Cetak KHS Detail");
        System.out.println("10. Cetak Mata Kuliah");
        System.out.println("11. Cetak KHS Mahasiswa");
        System.out.println("12. Cetak IPK Mahasiswa");
        System.out.println("13. Cetak KHS Detail Mahasiswa");
        System.out.println("14. Keluar");
        System.out.print("Pilihan anda (1-13) : ");
    }

    public static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}