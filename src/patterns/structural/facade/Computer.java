package patterns.structural.facade;

/*
Mimicking the process of computer shutdown.
 */
public class Computer {
    public void saveState(){
        System.out.println("Saving current state..");
    }

    public void terminateThreads(){
        System.out.println("Terminating threads...");
    }

    public void logOutUser(){
        System.out.println("Logging out user...");
    }
}