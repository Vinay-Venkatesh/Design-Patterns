package patterns.behavioural.command_design;
import utils.behavioural.command.Command;

//Commands
public class Green implements Command {
    protected Light light;
    public Green(Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnGreen();
    }
}
