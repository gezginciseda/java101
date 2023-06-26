public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student (String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matVerbal, int fizik, int fizikVerbal, int kimya, int kimyaVerbal) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if(matVerbal>=0 && matVerbal<=100){
            this.mat.verbal = matVerbal;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if(fizikVerbal>=0 && fizikVerbal<=100){
            this.fizik.verbal = fizikVerbal;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if(kimyaVerbal>=0 && kimyaVerbal<=100){
            this.kimya.verbal = kimyaVerbal;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.mat.verbal == 0 || this.fizik.note == 0 || this.fizik.verbal == 0 || this.kimya.note == 0 || this.kimya.verbal == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {

        int matAvg = (80 * this.mat.note)/100 + (20 * this.mat.verbal)/100;
        int fizikAvg = (80 * this.fizik.note)/100 + (20 * this.fizik.verbal)/100;
        int kimyaAvg = (80 * this.kimya.note)/100 + (20 * this.kimya.verbal)/100;

        avarage = (matAvg + fizikAvg + kimyaAvg) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.verbal);
        System.out.println("Fizik Notu : " +this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " +this.fizik.verbal);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.verbal);
    }
}
