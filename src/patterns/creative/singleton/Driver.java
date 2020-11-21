package patterns.creative.singleton;
public class Driver {
    public static void main(String[] args) {
        //Singleton
        //patterns.creative.Log lg = new patterns.creative.Log(); --> Error because patterns.creative.Log() is private
        Log lg = Log.getInstance(); // --> At any given point only 1 object is created.
        lg.printLog();
    }
}
