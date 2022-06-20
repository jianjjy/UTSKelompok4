import java.util.ArrayList;

public class Mahasiswa {
    private String studentID;
    private String namaMahasiswa;
    private String jurusanMahasiswa;
    private String tahunMasukMahasiswa;



    public Mahasiswa() {
    }

    public Mahasiswa(String studentID, String namaMahasiswa, String jurusanMahasiswa, String tahunMasukMahasiswa) {
        this.studentID = studentID;
        this.namaMahasiswa = namaMahasiswa;
        this.jurusanMahasiswa = jurusanMahasiswa;
        this.tahunMasukMahasiswa = tahunMasukMahasiswa;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getNamaMahasiswa() {
        return this.namaMahasiswa;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public String getJurusanMahasiswa() {
        return this.jurusanMahasiswa;
    }

    public void setJurusanMahasiswa(String jurusanMahasiswa) {
        this.jurusanMahasiswa = jurusanMahasiswa;
    }

    public String getTahunMasukMahasiswa() {
        return this.tahunMasukMahasiswa;
    }

    public void setTahunMasukMahasiswa(String tahunMasukMahasiswa) {
        this.tahunMasukMahasiswa = tahunMasukMahasiswa;
    }

    @Override
    public String toString() {
        return "" +
            "" + getStudentID() + "\t\t|" +
            " " + getNamaMahasiswa() + "\t|" +
            " " + getJurusanMahasiswa() + "\t|" +
            " " + getTahunMasukMahasiswa() + "\t|" +
            "";
    }


    public static ArrayList<Mahasiswa> initMahasiswa (ArrayList<Mahasiswa> mahasiswa){
        Mahasiswa Andy = new Mahasiswa("0001","Andy","Sistem Informasi", "2021");
        mahasiswa.add(Andy);
        Mahasiswa Budi = new Mahasiswa("0002","Budi","Sistem Informasi", "2021");
        mahasiswa.add(Budi);
        return mahasiswa;
    }

    public static void cetakMahasiswa(ArrayList<Mahasiswa> mahasiswa){
        System.out.println("Student ID\t| Nama\t| Jurusan\t\t\t| Tahun Masuk");
        System.out.println("===========================================================");
        for (Mahasiswa mahasiswa1 : mahasiswa) {
            System.out.println(mahasiswa1);
        }
        System.out.println("===========================================================");
    }
}
