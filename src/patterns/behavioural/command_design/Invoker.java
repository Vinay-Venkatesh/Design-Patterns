package patterns.behavioural.command_design;

import utils.behavioural.command.Command;

//Invoker
public class Invoker {

    public void submit(Command command){
        command.execute();
    }
}
