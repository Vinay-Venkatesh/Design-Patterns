package patterns.creative.singleton;/*
patterns.creative.Singleton pattern
 */

class Log{
    private static Log obj;
    private Log(){}
    public static Log getInstance(){
        if(obj == null)
            obj = new Log(); // --> Object is created here..
        return obj;
    }
    public void printLog(){
        System.out.println("Printing,Log");
    }
}