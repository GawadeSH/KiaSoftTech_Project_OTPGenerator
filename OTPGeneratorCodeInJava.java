import java.util.Random;
public class OTPGeneratorCodeInJava
{
    static String s = "";
    static int otp;
    public static String getOTP(int len)
    {
        Random r = new Random();
        for (int i = 0; i < len; i++)
        {
            otp = r.nextInt(9);
            s = s.concat(Integer.toString(otp));
        }
        return s;
    }

    public static void main(String[] args)
    {
        System.out.println("System generated OTP is " + getOTP(4));

    }
}
