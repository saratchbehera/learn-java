package thelazyguy.learnjava.solidprinciple.osp;

public class NotificationServiceBadDesign{
    public void sendOTP(String medium) {
        if (medium.equals("email")) {
            //write email related logic
            //use JavaMailSenderAPI
        }
    }
}