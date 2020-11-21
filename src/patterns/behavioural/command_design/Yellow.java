package patterns.behavioural.command_design;
import utils.behavioural.command.Command;

//Commands
public class Yellow implements Command {
    protected Light light;
    public Yellow(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnYellow();
    }
}
