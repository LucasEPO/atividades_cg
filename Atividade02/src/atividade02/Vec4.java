package atividade02;

/**
 * Representa um vetor de quatro dimensoes com componentes x, y, z e a
 * 
 * @author lucas
 */ 
public class Vec4 {
    protected final double[] e;

    /**
     * Construtor padrão. Inicializa o vetor com zeros.
     * 
     */
    public Vec4() {
        e = new double[]{0, 0, 0, 0};
    }

    /**
     * Construtor que inicializa o vetor com valores especificos.
     * 
     * @param e0 Valor do componente x.
     * @param e1 Valor do componente y.
     * @param e2 Valor do componente z.
     * @param e3 Valor do componente a.
     */
    public Vec4(double e0, double e1, double e2, double e3) {
        e = new double[]{e0, e1, e2, e3};
    }

    /**
     * Retorna uma representacao de string do vetor no formato "x y z a"
     *
     * @return Representacao de string do vetor
     */
    @Override
    public String toString() {
        return e[0] + " " + e[1] + " " + e[2] + " " + e[3];
    }
    
    /**
     * Obtem o valor de um componente especifico do vetor
     *
     * @param i componente do vetor (0, 1, 2, 3)
     * @return Valor do componente
     */
    public double get(int i) {
        return e[i];
    }

    /**
     * Define o valor de um componente especifico do vetor
     * 
     * @param i componente do vetor (0, 1, 2, 3)
     * @param value valor a ser atribuido no componente
     */
    public void set(int i, double value) {
        e[i] = value;
    }
    
    /**
     * Obtem o valor do componente x
     * 
     * @return Valor do componente x
     */
    public double x() {
        return e[0];
    }

    /**
     * Obtem o valor do componente y
     * 
     * @return Valor do componente y
     */
    public double y() {
        return e[1];
    }

    /**
     * Obtem o valor do componente z
     * 
     * @return Valor do componente z
     */
    public double z() {
        return e[2];
    }
    
    /**
     * Obtem o valor do componente a
     * 
     * @return Valor do componente a
     */
    public double a() {
        return e[3];
    }
    
    /**
     * Cria um vetor com os valores opostos ao da instancia
     *
     * @return Vec4 com x,y,z e a opostos ao da instancia
     */
    public Vec4 negate() {
        return new Vec4(-e[0], -e[1], -e[2], -e[3]);
    }
    
    /**
     * Soma dois vetores
     *
     * @param v Vetor que somara da instancia
     * @return Vec4 com x,y,z e a somados com outro vetor
     */
    public Vec4 add(Vec4 v) {
        return new Vec4(e[0] + v.e[0], e[1] + v.e[1], e[2] + v.e[2], e[3] + v.e[3]);
    }

    /**
     * Subtrai dois vetores
     *
     * @param v Vetor que subtraira da instancia
     * @return Vec4 com x,y,z e a subtraidos pelo outro vetor
     */
    public Vec4 subtract(Vec4 v) {
        return new Vec4(e[0] - v.e[0], e[1] - v.e[1], e[2] - v.e[2], e[3] - v.e[3]);
    }

    /**
     * Multiplica o vetor por um valor
     *
     * @param t Valor que multiplicara o vetor
     * @return Vec4 com x,y,z e a multiplicados pelo valor escolhido
     */
    public Vec4 multiply(double t) {
        return new Vec4(t * e[0], t * e[1], t * e[2], t * e[3]);
    }

    /**
     * Divide o vetor por um valor
     *
     * @param t Valor que dividira o vetor
     * @return Vec4 com x,y,z e a divididos pelo valor escolhido
     */
    public Vec4 divide(double t) {
        return new Vec4(e[0] / t, e[1] / t, e[2] / t, e[3] / t);
    }
    
    /**
     * Calcula o comprimento do vetor
     * 
     * @return Valor Double com o comprimento do vetor
     */
    public double length() {
        return Math.sqrt(lengthSquared());
    }

    /**
     * Calcula o quadrado do comprimento do vetor
     * 
     * @return Valor Double com o quadrado do comprimento do vetor
     */
    public double lengthSquared() {
        return e[0] * e[0] + e[1] * e[1] + e[2] * e[2] + e[3] * e[3];
    }
    
    /**
     * Calcula o produto escalar entre dois vetores
     * 
     * @param u vetor Vec4
     * @param v vetor Vec4
     * @return Valor Double com a soma da multiplicacao das colunas
     */
    public static double dot(Vec4 u, Vec4 v) {
        return u.e[0] * v.e[0] + u.e[1] * v.e[1] + u.e[2] * v.e[2] + u.e[3] * v.e[3];
    }

    /**
     * Calcula o vetor unitario da instacia
     *
     * @return Vec4 com x,y,z e a divididos por length()
     */
    public Vec4 unitVector() {
        double length = length();
        return new Vec4(e[0] / length, e[1] / length, e[2] / length,  e[3] / length);
    }


}
