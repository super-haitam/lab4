package problem1before;

public class SmsSender {
    public void send(String customer, String message) {
        System.out.printf("[sms to %s] %s\n", customer, message);
    }
}
