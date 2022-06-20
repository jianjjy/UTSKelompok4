import java.util.ArrayList;

public class Matkul {
    
    private String kodeMatakuliah;
    private String namaMatakuliah;
    private double sks;
    private String kodeTerm;

    public Matkul() {
    }

    public Matkul(String kodeMatakuliah, String namaMatakuliah, double sks, String kodeTerm) {
        this.kodeMatakuliah = kodeMatakuliah;
        this.namaMatakuliah = namaMatakuliah;
        this.sks = sks;
        this.kodeTerm = kodeTerm;
    }


    public String getKodeMatakuliah() {
        return this.kodeMatakuliah;
    }

    public void setKodeMatakuliah(String kodeMatakuliah) {
        this.kodeMatakuliah = kodeMatakuliah;
    }

    public String getNamaMatakuliah() {
        return this.namaMatakuliah;
    }

    public void setNamaMatakuliah(String namaMatakuliah) {
        this.namaMatakuliah = namaMatakuliah;
    }

    public double getSks() {
        return this.sks;
    }

    public void setSks(double sks) {
        this.sks = sks;
    }

    public String getKodeTerm() {
        return this.kodeTerm;
    }

    public void setKodeTerm(String kodeTerm) {
        this.kodeTerm = kodeTerm;
    }




    @Override
    public String toString() {
        return "" +
            "" + getKodeMatakuliah() + "\t\t\t" +
            "| " + getNamaMatakuliah() + "\t\t" +
            "| " + getSks() + "\t" +
            "| " + getKodeTerm()
            ;
    }

    
    public static ArrayList<Matkul> initMatkul1 (ArrayList<Matkul> matkul){
        Matkul matkul1 = new Matkul("210MD", "Matematika", 3.0, "21001");
        matkul.add(matkul1);
        Matkul matkul2 = new Matkul("210AP", "Algoritma", 3.0, "21001");
        matkul.add(matkul2);
        Matkul matkul3 = new Matkul("211SP", "Statistika", 3.0, "21002");
        matkul.add(matkul3);
        Matkul matkul4 = new Matkul("211SS", "Soft Skills", 2.0, "21002");
        matkul.add(matkul4);
        return matkul;
    }

    public static void cetakMatkul (ArrayList<Matkul> matkul){
        System.out.println("Kode Matakuliah\t\t| Nama MataKuliah\t\t| SKS\t| Kode Term\t|");   
        System.out.println("--------------------------------------------------------------------------");
        for (Matkul matkul2 : matkul) {
            System.out.println(matkul2);
        }
    }
}
