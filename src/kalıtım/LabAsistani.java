package kalıtım;

public class LabAsistani extends Asistan{

    public LabAsistani(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
    }
    public void lablaraGir() {
        System.out.println(getAdSoyad() + " adlı Lab Asistanı lablara girdi");
    }
}
