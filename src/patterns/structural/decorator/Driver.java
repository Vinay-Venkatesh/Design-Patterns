package patterns.structural.decorator;
import utils.structural.decrorator.Image;

public class Driver {
    public static void main(String[] args){
        Image img = new BasicImage();
        img = new BlackAndWhiteFilter(img);
        System.out.println("Description after applying the filter");
        img.getDescription(); // After applying filter using decorator design pattern..
    }
}
