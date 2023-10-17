package atividade02;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.FileOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Classe para criacao de novas imagens
 * 
 * @author lucas
 */
public class MyImages {
    
    private int imageWidth;
    private int imageHeight;
    private String imageName;
    private String imageType;

    /**
     *
     * @param imageWidth - Largura da imagem
     * @param imageHeight - Altura da imagem
     * @param imageName - Nome que sera salvo a imagem
     * @param imageType - Tipo q sera salvo da imagem
     */
    public MyImages(int imageWidth, int imageHeight, String imageName, String imageType) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.imageName = imageName;
        this.imageType = imageType.toUpperCase();
    }

    /**
     *
     * @return imageWidth - Largura da imagem
     */
    public int getImageWidth() {
        return imageWidth;
    }

    /**
     *
     * @return imageHeight - Altura da imagem
     */
    public int getImageHeight() {
        return imageHeight;
    }

    /**
     *
     * @return imageName - Nome a ser salvo da imagem
     */
    public String getImageName() {
        return imageName;
    }
    
    /**
     *
     * @return nome da imagem seguindo ponto sua extensao ex: Image.png
     * 
     */
    public String getImagefileName() {
        return imageName+"."+imageType.toLowerCase();
    }

    /**
     *
     * @return imageType - extensao do arquivo a ser salvo
     */
    public String getImageType() {
        return imageType;
    }

    /**
     * Altera o tipo de imagem
     * 
     * @param imageType - Tipo em qua a imagem sera salva
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    /**
     *  Altera o nome da imagem
     * 
     * @param imageName - Nome da imagem que sera salva
     */
    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     *  Altera largura da imagem
     * 
     * @param imageWidth - Largura da imagem
     */
    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    /**
     *  Altera altura da imagem
     * 
     * @param imageHeight - Altura da imagem
     */
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }
    
    /**
     * Gera a imagem degrade a depender do tipo da imagem
     * Pode gerar PPM e PNG
     * 
     */
    public void generateImage() {
        
        if("PPM".equals(imageType)){
            StringBuilder ppmContent = new StringBuilder();
            ppmContent.append("P3\n");
            ppmContent.append(imageWidth).append(" ").append(imageHeight).append("\n");
            ppmContent.append("255\n");

            for (int j = 0; j < imageHeight; ++j) {
                for (int i = 0; i < imageWidth; ++i) {
                    Color color = new Color((double) i / (imageWidth - 1), (double) j / (imageHeight - 1), 0 );
                    ppmContent.append(color.writeColorPPM());
                }
            }

            saveFile(ppmContent);
            
        } else if("PNG".equals(imageType)) {
            BufferedImage image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);

            for (int j = 0; j < imageHeight; ++j) {
                for (int i = 0; i < imageWidth; ++i) {
                    Color color = new Color((double) i / (imageWidth - 1), (double) j / (imageHeight - 1), 0 );
                    int rgb = color.writeColorPNG();
    
                    image.setRGB(i, j, rgb);
                }
            }
            
            saveFile(image);
        }
    }
    
    /**
     * Cria arquivo PPM de um formato desejado, por enquanto, apenas quadrados e linhas
     * e define uma cor para ela
     *
     * @param shape - Formato que deseja q seja sua imagem (square or stripes)
     * @param color - Cor em vetor
     */
    public void generateShapesPPM(String shape, Color color){
        StringBuilder ppmContent = new StringBuilder();
        ppmContent.append("P3\n");
        ppmContent.append(imageWidth).append(" ").append(imageHeight).append("\n");
        ppmContent.append("255\n");
        
        String rgb = color.writeColorPPM();
        
        if("square".equals(shape.toLowerCase())){
            if(imageWidth != imageHeight){
                System.out.println("Altura e largura diferentes, para o quadrado a largura será aplicada para as duas dimensões!");
            }
            for (int j = 0; j < imageWidth; ++j) {
                for (int i = 0; i < imageWidth; ++i) {
                    ppmContent.append(rgb);
                }   
            }
        }else if("stripes".equals(shape.toLowerCase())){

            for (int j = 0; j < imageHeight;) {
                for (int i = 0; i < imageWidth;++i) {
                    ppmContent.append(rgb);
                }   
                j=j+5;
            }
      
        }
        
        saveFile(ppmContent);
    }
    
    /**
     * Cria arquivo PNG de um formato desejado, por enquanto, apenas quadrados e linhas
     * e define uma cor para ela
     *
     * @param shape - Formato que deseja q seja sua imagem (square or stripes)
     * @param color - Cor em vetor
     */
    public void generateShapesPNG(String shape, Color color){
        BufferedImage image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
        
        int rgb = color.writeColorPNG();
        
        if("square".equals(shape.toLowerCase())){
            if(imageWidth != imageHeight){
                System.out.println("Altura e largura diferentes, para o quadrado, a menor dimensão será aplicada para as duas dimensões!");
            }
            int minSize=Integer.min(imageHeight, imageWidth);
            for (int j = 0; j < minSize; ++j) {
                for (int i = 0; i < minSize; ++i) {
                    image.setRGB(i, j, rgb);
                }   
            }
        }else if("stripes".equals(shape.toLowerCase())){

            for (int j = 0; j < imageHeight;) {
                for (int i = 0; i < imageWidth;++i) {
                    image.setRGB(i, j, rgb);
                }   
                j=j+5;
            }
        }
        
        saveFile(image);
    }
    
    /**
     * Salva a imagem em um diretorio, pode salvar arquivos PPM e PNG
     * 
     * @param image - imagem a ser salva
     */
    private <T> void saveFile(T image) {
        
        File directory = new File("generatedImages/generated"+imageType.toUpperCase());
        if (!directory.exists()) {
            directory.mkdirs();
        }
        File outputFile = new File(directory, imageName+"."+imageType.toLowerCase());
         
        if("PPM".equals(imageType)){
            try (FileOutputStream fos = new FileOutputStream(outputFile)) {
                fos.write(image.toString().getBytes());
                System.out.println("Arquivo PPM criado com sucesso em: " + outputFile.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Erro ao escrever a imagem: " + e.getMessage());
            }
        } else {
            try {
                ImageIO.write((BufferedImage)image, "png", outputFile);
                System.out.println("Arquivo PNG criado com sucesso em: " + outputFile.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Erro ao escrever a imagem: " + e.getMessage());
            }   
        }
    }
    
    /**
     *  Abre um JFrame com a imagem, apenas se for PNG, imagens PPM não podem ser abertas
     */
    public void openImage() {
        String path = ("generatedImages/generated" + imageType.toUpperCase() +"/"+ this.getImagefileName());
        
        try {
            if("PPM".equals(imageType)) {
                System.out.println("Erro: Não é possível abrir arquivo .ppm");
                return;
            }
            BufferedImage image = ImageIO.read(new File(path));
            
            if (image != null) {
                JFrame frame = new JFrame();
                JLabel label = new JLabel(new ImageIcon(image));
                frame.getContentPane().add(label);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            } else {
                System.out.println("Erro: A imagem não pôde ser carregada.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
        }
    }

}
