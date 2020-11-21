package patterns.structural.facade;

public class ComputerFacade {
    protected Computer computer;
/*
Computer object creation..
 */
    public ComputerFacade(){
        computer = new Computer();
    }
/*
Abstracting the process of turning off the computer..
 */
    public void turnOff(){
        this.computer.saveState();
        this.computer.terminateThreads();
        this.computer.logOutUser();
    }
}
