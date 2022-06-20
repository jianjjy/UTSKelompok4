import java.util.ArrayList;

public class KHSDetail {
    ArrayList<Matkul> matkulx = new ArrayList<>();
    private String kodeKHSdetail;
    private String kodeKHS;
    private String kodeMatkul;
    private Matkul matkul;
    private Integer nilai;
    private String predikatKHS;
    private String studentID;
    private double weightKHS;
    private double gradePoint; //sks*ip

    public KHSDetail() {
    }

    public KHSDetail(String kodeKHSdetail, String kodeKHS, String kodeMatkul, Integer nilai, String studentID) {
        this.kodeKHSdetail = kodeKHSdetail;
        this.kodeKHS = kodeKHS;
        this.kodeMatkul = kodeMatkul;
        Matkul.initMatkul1(matkulx);
        for (Matkul matkul2 : matkulx) {
            if (matkul2.getKodeMatakuliah().equals(kodeMatkul)) {
                this.matkul = matkul2;
            }
        }
        this.nilai = nilai;
        this.studentID = studentID;
    }

    public String getKodeKHSdetail() {
        return this.kodeKHSdetail;
    }

    public void setKodeKHSdetail(String kodeKHSdetail) {
        this.kodeKHSdetail = kodeKHSdetail;
    }

    public String getKodeKHS() {
        return this.kodeKHS;
    }

    public void setKodeKHS(String kodeKHS) {
        this.kodeKHS = kodeKHS;
    }


    public String getKodeMatkul() {
        return this.kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }


    public Integer getNilai() {
        return this.nilai;
    }

    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }

    public String getPredikatKHS() {
        return this.predikatKHS;
    }

    public void setPredikatKHS(Integer nilai) {
        if (nilai >= 90) {
            this.predikatKHS = "A";
        } else if (nilai >= 85) {
            this.predikatKHS = "A-";
        } else if (nilai >= 80) {
            this.predikatKHS = "B+";
        }  else if (nilai >= 75) {
            this.predikatKHS = "B";
        } else if (nilai >= 70) {
            this.predikatKHS = "B-";
        } else if (nilai >= 65) {
            this.predikatKHS = "C+";
        } else if (nilai >= 60) {
            this.predikatKHS = "C";
        } else if (nilai >= 55) {
            this.predikatKHS = "C-";
        } else if (nilai >= 40) {
            this.predikatKHS = "D";
        } else {
            this.predikatKHS = "E";
        }
    }

    public double getWeightKHS(Integer nilai) {
        if (nilai >= 90) {
            this.weightKHS = 4.0;
        } else if (nilai >= 85) {
            this.weightKHS = 3.7;
        } else if (nilai >= 80) {
            this.weightKHS = 3.3;
        }  else if (nilai >= 75) {
            this.weightKHS = 3.0;
        } else if (nilai >= 70) {
            this.weightKHS = 2.7;
        } else if (nilai >= 65) {
            this.weightKHS = 2.3;
        } else if (nilai >= 60) {
            this.weightKHS = 2.0;
        } else if (nilai >= 55) {
            this.weightKHS = 1.5;
        } else if (nilai >= 40) {
            this.weightKHS = 1.0;
        } else {
            this.weightKHS = 0;
        }
        return this.weightKHS;
    }

    public void setWeightKHS(Integer nilai) {
        if (nilai >= 90) {
            this.weightKHS = 4.0;
        } else if (nilai >= 85) {
            this.weightKHS = 3.7;
        } else if (nilai >= 80) {
            this.weightKHS = 3.3;
        }  else if (nilai >= 75) {
            this.weightKHS = 3.0;
        } else if (nilai >= 70) {
            this.weightKHS = 2.7;
        } else if (nilai >= 65) {
            this.weightKHS = 2.3;
        } else if (nilai >= 60) {
            this.weightKHS = 2.0;
        } else if (nilai >= 55) {
            this.weightKHS = 1.5;
        } else if (nilai >= 40) {
            this.weightKHS = 1.0;
        } else {
            this.weightKHS = 0;
        }
    }

    public double getGradePoint(double weightKHS, Matkul matkul) {
        return weightKHS * matkul.getSks();
    }

    public void setGradePoint(double weightKHS, Matkul matkul) {
        this.gradePoint = weightKHS * matkul.getSks();
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }


    public Matkul getMatkul() {
        return this.matkul;
    }

    public void setMatkul(Matkul matkul) {
        this.matkul = matkul;
    }

    public static ArrayList<KHSDetail> initKHSDetail (ArrayList<KHSDetail> khs){
        
        KHSDetail KHS0001210MD = new KHSDetail("KHS0001210MD", "KHS000121", "210MD" ,90, "0001" );
        KHSDetail KHS0002210MD = new KHSDetail("KHS0002210MD", "KHS000221", "210MD" ,78, "0002" );
        KHSDetail KHS0001210AP = new KHSDetail("KHS0001210AP", "KHS000121", "210AP" ,89, "0001" );
        KHSDetail KHS0002210AP = new KHSDetail("KHS0002210AP", "KHS000221", "210AP" ,87, "0001" );
        KHSDetail KHS0001211SP = new KHSDetail("KHS00012101P", "KHS000121", "211SP" ,89, "0001" );
        KHSDetail KHS0002211SP = new KHSDetail("KHS00022101S", "KHS000221", "211SP" ,92, "0002" );
        KHSDetail KHS0001211SS = new KHSDetail("KHS00012101P", "KHS000121", "211SS" ,93, "0001" );
        KHSDetail KHS0002211SS = new KHSDetail("KHS00022101S", "KHS000221", "211SS" ,100,"0002" );
        khs.add(KHS0001210AP);
        khs.add(KHS0001210MD);
        khs.add(KHS0002210AP);
        khs.add(KHS0002210MD);
        khs.add(KHS0001211SP);
        khs.add(KHS0001211SS);
        khs.add(KHS0002211SP);
        khs.add(KHS0002211SS);
        return khs;
    }


    public static void cetakKHSDetail (ArrayList<KHSDetail> khs){
        System.out.println("Kode KHS Detail\t| Kode KHS\t| Kode Mata Kuliah\t| Mata Kuliah\t\t| SKS\t| Kode Term\t| Nilai\t| Student ID\t|");   
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        for (KHSDetail KHSDetail2 : khs) {
            System.out.println(KHSDetail2);
        }
    }

    @Override
    public String toString() {
        return "" +
            "" + getKodeKHSdetail() + "\t|" +
            " " + getKodeKHS() + "\t|" +
            " " + getMatkul() + "\t\t|" +
            " " + getNilai() + "\t|" +
            " " + getStudentID() + "\t\t|";
    }
    
    public static void cetakDetailKHS (ArrayList<KHSDetail> khsdetail, String StudentID, int term, ArrayList<Term> terms){
        String kodeTerm = "";
        if (term == 1) {
            kodeTerm = "21001";
        } else if (term ==2) {
            kodeTerm = "21002";
        }
        double totalSks = 0.0;
        double totalGradePoint=0.0;

        
            for (KHSDetail khsDetail2 : khsdetail) {
                if ((khsDetail2.getStudentID().equals(StudentID)) && (khsDetail2.getMatkul().getKodeTerm().equals(kodeTerm)) ) {
                    totalGradePoint += khsDetail2.getGradePoint(khsDetail2.getWeightKHS(khsDetail2.getNilai()), khsDetail2.getMatkul());
                    totalSks += khsDetail2.getMatkul().getSks();
                    System.out.println(khsDetail2);
                }
            }
        
        double ipk = totalGradePoint/totalSks;
        System.out.println("-------------------");
        System.out.println("IP : " + ipk);
        
    }

    public static void cetakKHS (ArrayList<KHSDetail> khsdetail, String StudentID, ArrayList<Term> terms){
        String kodeTerm = "21001";
        double totalSks = 0.0;
        double totalGradePoint=0.0;

            for (KHSDetail khsDetail2 : khsdetail) {
                if ((khsDetail2.getStudentID().equals(StudentID)) && (khsDetail2.getMatkul().getKodeTerm().equals(kodeTerm)) ) {
                    totalGradePoint += khsDetail2.getGradePoint(khsDetail2.getWeightKHS(khsDetail2.getNilai()), khsDetail2.getMatkul());
                    totalSks += khsDetail2.getMatkul().getSks();
                }
            }
        double ipk = totalGradePoint/totalSks;
        System.out.println("-------------------");
        System.out.println("IP : " + ipk);
         kodeTerm = "21002";
         totalSks = 0.0;
         totalGradePoint=0.0;

        
            for (KHSDetail khsDetail2 : khsdetail) {
                if ((khsDetail2.getStudentID().equals(StudentID)) && (khsDetail2.getMatkul().getKodeTerm().equals(kodeTerm))) {
                    totalGradePoint += khsDetail2.getGradePoint(khsDetail2.getWeightKHS(khsDetail2.getNilai()), khsDetail2.getMatkul());
                    totalSks += khsDetail2.getMatkul().getSks();
                }
            }
        
        ipk = totalGradePoint/totalSks;
        System.out.println("-------------------");
        System.out.println("IP : " + ipk);
    }
}
