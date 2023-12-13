package sınıflarArasıIliskiler;

public class Student {
    private String name, surname, idNo, address;
    private int note;

    public Student(String name, String surname, String idNo, String address, int note) {
        this.name = name;
        this.surname = surname;
        this.idNo = idNo;
        this.address = address;
        this.note = (note > 100 || note <0) ? 0 : note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = (note > 100 || note <0) ? 0 : note;
    }
}
