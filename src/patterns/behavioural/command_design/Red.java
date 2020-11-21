package patterns.behavioural.command_design;
import utils.behavioural.command.Command;

//Commands
public class Red implements Command {
    protected Light light;
    public Red(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnRed();
    }
}
