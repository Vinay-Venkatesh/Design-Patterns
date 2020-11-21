package patterns.structural.facade;

public class Driver {
    public static void main(String [] args){
        ComputerFacade facade = new ComputerFacade();
        //User calls turnOff()
        facade.turnOff();
    }
}
