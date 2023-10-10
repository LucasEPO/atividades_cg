package images;

/**
 * 
 * @author lucas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyImages imagePPM = new MyImages(256, 256, "TestePPM", "ppm");
       MyImages squarePPM = new MyImages(300, 256, "SquarePPM", "ppm");
       MyImages stripePPM = new MyImages(256, 256, "StripesPPM", "ppm");
       MyImages imagePNG = new MyImages(256, 256, "TestePNG", "png");
       MyImages squarePNG = new MyImages(100, 300, "SquarePNG", "png");
       MyImages stripePNG = new MyImages(256, 256, "StripesPNG", "png");
       
       imagePPM.generateImage();
       imagePPM.openImage();
       
       squarePPM.generateShapesPPM("square", "#2B045D");
       stripePPM.generateShapesPPM("spiral", "#C20606");
       squarePNG.generateShapesPNG("square", "#2B045D");
       stripePNG.generateShapesPNG("stripes", "#06C2AB");
       
       imagePNG.generateImage();
       imagePNG.openImage();
       
       squarePNG.openImage();
       stripePNG.openImage();
    }

}
