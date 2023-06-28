package GrantsApps.ChangePassword.StepsImplementation;
import java.util.Random;
import appsCommon.PageInitializer;
public class ChangePasswordStepsImpl extends PageInitializer {
    public static String generateNewPassword() {
        int len = 20;
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi"
                + "jklmnopqrstuvwxyz!";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        System.out.println(sb.toString());
        return sb.toString();
    }
}

