package patterns.structural.proxy;

public class Driver {
    public static void main (String[] args){
        UnlockMobile unlock_mobile = new UnlockMobile();
        /*
        Unlocking phone with credential
         */
        unlock_mobile.unlock("Password");
    }
}
