package atividade02;

/**
 * Classe para trabalhar com as cores na geracao de imagens
 * 
 * @author lucas
 */
public class Color extends Vec3 {

    /**
     * Inicializa uma cor sem parametros com a cor preta
     */
    public Color() {
        super(0, 0, 0);
    }

    /**
     * Inicializa uma cor a partir dos valores rgb. Os valores podem ser entre
     *  0 e 1 ou 0 e 255, caso um dos componentes esteja acima de 1, todos os 
     *  componentes serao divididos por 255 para fazer a cor
     * 
     * @param r Componente cor Vermelho
     * @param g Componente cor Verde
     * @param b Componente cor Azul
     */
    public Color(double r, double g, double b) {
        super();
        Vec3 v = new Vec3(r, g, b);
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255) {
            throw new IllegalArgumentException("Os valores de r, g e b devem estar entre 0 e 255");
        } else if (r > 1 || g > 1 || b > 1){
            v = v.divide(255);
        }
        this.e[0] = v.x();
        this.e[1] = v.y();
        this.e[2] = v.z();
        
    }

    /**
     * Construtor para Cores com valor hexadecimal
     *
     * @param hex Cor em Hexadecimal
     */
    public Color(String hex) {
        super();
        Vec3 v = hexToVec3(hex);
        this.e[0] = v.x();
        this.e[1] = v.y();
        this.e[2] = v.z();
    }
    
    /**
     *  Calcula String a ser adicionada nos arquivos PPM
     * 
     * @return String rgb
     */
    public String writeColorPPM() {
        return ((int) (255.999 * x()) + " " +
                (int) (255.999 * y()) + " " +
                (int) (255.999 * z()) + "\n"
        );
    }
    
    /**
     *  Calcula valor rgb para ser usando em funcoes PNG
     * 
     * @return valor rgb int
     */
    public int writeColorPNG() {
        int r = (int) (255.999 * x());
        int g = (int) (255.999 * y());
        int b = (int) (255.999 * z());
        
        return r << 16 | g << 8 | b;
    }
    
    private Vec3 hexToVec3(String hex) {
        hex = hex.replace("#", "");
        
        int intValue = Integer.parseInt(hex, 16);
        int red = (intValue >> 16) & 0xFF;
        int green = (intValue >> 8) & 0xFF;
        int blue = intValue & 0xFF;
        
        Vec3 v = new Color(red, green, blue);
        return v;
    }
    

}
