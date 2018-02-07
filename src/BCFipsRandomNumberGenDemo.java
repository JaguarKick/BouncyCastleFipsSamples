import java.security.*;
import javax.xml.bind.DatatypeConverter;

public class BCFipsRandomNumberGenDemo {
    
    private static void addBCFipsProvider(){
        Security.addProvider(new org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider());
    }
    
    private static byte[] genRandomBytes(int size) throws Exception{
        byte []rand = new byte[size];
        SecureRandom sRand = SecureRandom.getInstance("DEFAULT", "BCFIPS");
        sRand.nextBytes(rand);
        return rand;
    }
    
    public static void main(String args[]) throws Exception{
        addBCFipsProvider();
        System.out.println(DatatypeConverter.printHexBinary(genRandomBytes(20)));
    }
}
