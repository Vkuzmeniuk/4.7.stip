package Main;
import java.util.Properties;

public class Main {
    public Main() {
    }
    public interface a {
        void a();}
    public static void main(String[] var0)  {
        String var3;
            Properties var1 = new Properties();
            Properties var3 = a(var1);
            CaseConfig var3 = new CaseConfig("./cfg/test.properties", var0);
            System.out.println("Test passed.");
            String var4 = var3.f;
            var4 = DigestUtils.md5Hex("Salt: Beatrice1.0 Base:" + var4);
            System.out.println("Task pass-key: " + var4);
    }
}
