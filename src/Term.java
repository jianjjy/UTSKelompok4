import java.util.ArrayList;

public class Term {
    private String kodeTerm;
    private String tahunAjaran;
    private String semesterTerm;
    private String keteranganTerm;
    private String keteranganSingkatTerm;




    public Term() {
    }

    public Term(String kodeTerm, String tahunAjaran, String semesterTerm, String keteranganTerm, String keteranganSingkatTerm) {
        this.kodeTerm = kodeTerm;
        this.tahunAjaran = tahunAjaran;
        this.semesterTerm = semesterTerm;
        this.keteranganTerm = keteranganTerm;
        this.keteranganSingkatTerm = keteranganSingkatTerm;
    }

    public String getKodeTerm() {
        return this.kodeTerm;
    }

    public void setKodeTerm(String kodeTerm) {
        this.kodeTerm = kodeTerm;
    }

    public String getTahunAjaran() {
        return this.tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public String getSemesterTerm() {
        return this.semesterTerm;
    }

    public void setSemesterTerm(String semesterTerm) {
        this.semesterTerm = semesterTerm;
    }

    public String getKeteranganTerm() {
        return this.keteranganTerm;
    }

    public void setKeteranganTerm(String keteranganTerm) {
        this.keteranganTerm = keteranganTerm;
    }

    public String getKeteranganSingkatTerm() {
        return this.keteranganSingkatTerm;
    }

    public void setKeteranganSingkatTerm(String keteranganSingkatTerm) {
        this.keteranganSingkatTerm = keteranganSingkatTerm;
    }

    @Override
    public String toString() {
        return "" +
            "" + getKodeTerm() + "\t|" +
            " " + getTahunAjaran() + "\t|" +
            " " + getSemesterTerm() + "\t\t|" +
            "" + getKeteranganTerm() + "\t|" +
            " " + getKeteranganSingkatTerm() + "\t|" +
            "";
    }
    
    public static ArrayList<Term> initTerm (ArrayList<Term> term){
        
        Term term1 = new Term("21001", "2021/2022", "Ganjil", "Ganjil Sistem Informasi Tingkat 1", "Gjl1");
        Term term2 = new Term("21002", "2021/2022", "Genap", "Genap Sistem Informasi Tingkat 1", "Gnp1");
        term.add(term1);
        term.add(term2);
        return term;
    }

    public static void cetakTerm(ArrayList<Term> term){
        System.out.println("Kode\t| Tahun Ajaran\t| Semester\t| Keterangan\t| Keterangan Singkat");
        System.out.println("===============================================================================================");
        for (Term term2 : term) {
            System.out.println(term2);
        }
        System.out.println("===============================================================================================");
    }
}
