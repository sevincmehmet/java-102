package sınıflarArasıIliskiler;

public class Main {
    public static void main(String[] args) {
        Student batu = new Student("batu", "ham", "123", "AA", 85);
        Student gazi = new Student("gazi", "mert", "456", "AA", 110);
        Student dursun = new Student("dursun", "sevinc", "789", "AA", -70);
        Student mehmet = new Student("mehmet", "sevinc", "012", "AA", 85);

        Instructor teacher = new Instructor("Ahmet", "Gürhan", "GRAPH-1");
        Course mat = new Course("MAT101", "MAT", teacher);

        System.out.println(mat.getInstructor().getName());

        //Student[] stu = {batu, gazi, dursun, mehmet};
        //System.out.println("Ortalama :" + mat.calcAvarage(stu));
    }
}
