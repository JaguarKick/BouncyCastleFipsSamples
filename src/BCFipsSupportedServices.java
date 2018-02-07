import java.security.*;

public class BCFipsSupportedServices {
    private static void addBCFipsProvider(){
        Security.addProvider(new org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider());
    }
    
    private static void displayServices(){
        Provider prod = Security.getProvider("BCFIPS");
        for(Provider.Service srv:prod.getServices()){
            System.out.println(srv);
        }
    }
    
    public static void main(String args[]){
        addBCFipsProvider();
        displayServices();
    }
}
