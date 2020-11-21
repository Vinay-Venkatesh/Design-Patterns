package patterns.structural.decorator;
import utils.structural.decrorator.Image;

public class BlackAndWhiteFilter implements Image {
    private Image newImage;

    public BlackAndWhiteFilter(Image new_img){
        this.newImage = new_img;
        System.out.println("Description before applying filter");
        newImage.getDescription();
    }

    @Override
    public void getDescription() {
        System.out.println("Black and white filter applied!!");
    }
}
