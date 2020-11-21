package patterns.behavioural.command_design;

//Receiver
public class Light {
    public void turnRed(){
        System.out.println("Red light..");
    }
    public void turnYellow(){
        System.out.println("Yellow light..");
    }
    public void turnGreen(){
        System.out.println("Green light..");
    }
}
