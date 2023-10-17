package atividade02;

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

        try{
            squarePPM.generateShapesPPM("square", new Color("#2B045D"));
            stripePPM.generateShapesPPM("stripes", new Color(0.6, 0.5, 0.1));
        }catch(IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        try{
            squarePNG.generateShapesPNG("square", new Color(260, 150, 3));
            squarePNG.openImage();
        }catch(IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
        
        try{
            stripePNG.generateShapesPNG("stripes", new Color("#2B045D"));
            stripePNG.openImage();
        }catch(IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        imagePNG.generateImage();
        imagePNG.openImage();

        
        
        
    }

}
