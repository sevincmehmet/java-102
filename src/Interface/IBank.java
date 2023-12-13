package Interface;

public interface IBank {
    final String HOST_IP_ADDRESS = "127.0.0.1";

    boolean connect(String ipAddress);

    boolean payment(double price, String cardNumber, String date, String cvc);

}
