package patterns.structural.proxy;

/*
Proxy for Mobile class
Checks for authenticity to delegates access to mobile
 */
public class UnlockMobile {
    protected Mobile mobile;
    /*
    Constructor
     */
    public UnlockMobile(){
        mobile = new Mobile();
    }

    public void unlock(String password){
        //Authentication check delegation
        if(this.authenticate(password)){
            this.mobile.unlock();
        }else{
            System.out.println("Invalid password");
        }
    }
    /*
    Validate Password
     */
    public boolean authenticate(String password){
        return (password == "Password");
    }
}
