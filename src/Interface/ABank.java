package Interface;

public class ABank implements IBank{ // implement ederken araya (,) koyarak birden fazla implement edilebilir
    private String bankaAdi, terminalID, password;

    public ABank(String bankaAdi, String terminal_id, String password) {
        this.bankaAdi = bankaAdi;
        this.terminalID = terminal_id;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAddress) {
        System.out.println("Kullanıcı ip: " + ipAddress);
        System.out.println("Makine ip: " + this.HOST_IP_ADDRESS);
        System.out.println(this.bankaAdi + " Bağlanıldı !");
        return true;
    }

    @Override
    public boolean payment(double price, String cardNumber, String expiryDate, String cvc) {
        // Banka ödeme işlemleri
        System.out.println("Bankadan cevap bekleniyor");
        System.out.println("İşlem başarılı");
        return true;
    }

    public String getBankaAdi() {
        return this.bankaAdi;
    }

    public void  setBankaAdi(String bankaAdi) {
        this.bankaAdi = bankaAdi;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
