import java.security.*;
import org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider;

public class AddBouncyCastleProvider {
    public static void main(String args[]){
        Security.addProvider(new org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider());
        Provider []prod = Security.getProviders();
        for(Provider p:prod){
            System.out.println(p);
        }
    }
}
