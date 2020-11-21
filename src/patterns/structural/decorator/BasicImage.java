package patterns.structural.decorator;
import utils.structural.decrorator.Image;

public class BasicImage implements Image {
    public void getDescription(){
        System.out.println("Basic image");
    }
}
