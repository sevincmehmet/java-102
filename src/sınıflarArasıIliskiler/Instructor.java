package sınıflarArasıIliskiler;

public class Instructor {
    String name, surnme, department;

    public Instructor(String name, String surnme, String department) {
        this.name = name;
        this.surnme = surnme;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnme() {
        return surnme;
    }

    public void setSurnme(String surnme) {
        this.surnme = surnme;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
