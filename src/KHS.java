import java.util.ArrayList;

public class KHS {
    ArrayList<Mahasiswa> mahasiswax = new ArrayList <>();
    ArrayList<Term> termx = new ArrayList <>();
    private Mahasiswa mahasiswa;
    private Term term;
    private String kodeKHS;
    private String keteranganKHS;
    private String keteranganSingkatKHS;

    public KHS() {
    }

    public KHS(String kodeKHS, String StudentID, String kodeTerm, String keteranganKHS, String keteranganSingkatKHS ) {
        this.kodeKHS = kodeKHS;
        Mahasiswa.initMahasiswa(mahasiswax);
        for (Mahasiswa mahasiswa2 : mahasiswax) {
            if (mahasiswa2.getStudentID().equals(StudentID)) {
                this.mahasiswa = mahasiswa2;
            }
        }
        Term.initTerm(termx);
        for (Term term2 : termx) {
            if (term2.getKodeTerm().equals(kodeTerm)) {
                this.term = term2;
            }
        }
        this.keteranganKHS = keteranganKHS;
        this.keteranganSingkatKHS = keteranganSingkatKHS;
    }

    public KHS(String kodeKHS, Mahasiswa mahasiswa, String keteranganKHS, String keteranganSingkatKHS, Term termKHS) {
        this.kodeKHS = kodeKHS;
        this.keteranganKHS = keteranganKHS;
        this.keteranganSingkatKHS = keteranganSingkatKHS;
    }

    public KHS(String kodeKHS, String keteranganKHS, String keteranganSingkatKHS) {
        this.kodeKHS = kodeKHS;
        this.keteranganKHS = keteranganKHS;
        this.keteranganSingkatKHS = keteranganSingkatKHS;
    }

    public String getKodeKHS() {
        return this.kodeKHS;
    }

    public void setKodeKHS(String kodeKHS) {
        this.kodeKHS = kodeKHS;
    }

    public String getKeteranganKHS() {
        return this.keteranganKHS;
    }

    public void setKeteranganKHS(String keteranganKHS) {
        this.keteranganKHS = keteranganKHS;
    }

    public String getKeteranganSingkatKHS() {
        return this.keteranganSingkatKHS;
    }

    public void setKeteranganSingkatKHS(String keteranganSingkatKHS) {
        this.keteranganSingkatKHS = keteranganSingkatKHS;
    }


    public Mahasiswa getMahasiswa() {
        return this.mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Term getTerm() {
        return this.term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public static ArrayList<KHS> initKHS (ArrayList<KHS> khs2){
        
        KHS KHS0001210 = new KHS("KHS0001210", "0001", "21001", "Ganjil Andy 2021", "Ganjil");
        KHS KHS0002210 = new KHS("KHS0002210", "0002", "21001", "Ganjil Budi 2021", "Ganjil");
        KHS KHS0001211 = new KHS("KHS0001211", "0001", "21002", "Genap Andy 2021", "Genap");
        KHS KHS0002211 = new KHS("KHS0002211", "0002", "21002", "Genap Budi 2021", "Genap");
        khs2.add(KHS0001210);
        khs2.add(KHS0002210);
        khs2.add(KHS0001211);
        khs2.add(KHS0002211);
        return khs2;
    }


    @Override
    public String toString() {
        return "" +
            "| " + getKodeKHS() + "\t\t" + 
            "| " + getKeteranganKHS() + "\t\t" +
            "| " + getKeteranganSingkatKHS() + "\t\t";
    }

    public static double getIPK (ArrayList<KHSDetail> khsdetail, String StudentID){
        double totalSks = 0.0;
        double totalGradePoint=0.0;
        for (KHSDetail khsDetail2 : khsdetail) {
            if (khsDetail2.getStudentID().equals(StudentID)) {
                totalGradePoint += khsDetail2.getGradePoint(khsDetail2.getWeightKHS(khsDetail2.getNilai()), khsDetail2.getMatkul());
                totalSks += khsDetail2.getMatkul().getSks();
            }
        }
        double ipk = totalGradePoint/totalSks;
        return ipk;
    }

    public static double getIPKTerm (ArrayList<KHSDetail> khsdetail, String StudentID, int term, ArrayList<Term> terms){
        String kodeTerm = "";
        if (term == 1) {
            kodeTerm = "21001";
        } else if (term ==2) {
            kodeTerm = "21002";
        }
        double totalSks = 0.0;
        double totalGradePoint=0.0;

        for (KHSDetail khsDetail2 : khsdetail) {
            if ((khsDetail2.getStudentID().equals(StudentID)) && (khsDetail2.getMatkul().getKodeTerm().equals(kodeTerm))) {
                totalGradePoint += khsDetail2.getGradePoint(khsDetail2.getWeightKHS(khsDetail2.getNilai()), khsDetail2.getMatkul());
                totalSks += khsDetail2.getMatkul().getSks();
            }
        }
        double ipk = totalGradePoint/totalSks;
        return ipk;
    }

    public static void cetakKHS (ArrayList<KHS> khs){
        System.out.println("Kode KHS \t\t| Keterangan KHS\t\t| Keterangan Singkat KHS");   
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        for (KHS khs2 : khs) {
            System.out.println(khs2);
        }
    }

    

}
