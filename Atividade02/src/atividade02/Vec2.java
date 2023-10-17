package atividade02;

/**
 * Representa um vetor bidimensional com componentes x, y
 * 
 * @author lucas
 */ 
public class Vec2 {
    protected final double[] e;

    /**
     * Construtor padrão. Inicializa o vetor com zeros.
     * 
     */
    public Vec2() {
        e = new double[]{0, 0};
    }

    /**
     * Construtor que inicializa o vetor com valores especificos.
     * 
     * @param e0 Valor do componente x.
     * @param e1 Valor do componente y.
     */
    public Vec2(double e0, double e1) {
        e = new double[]{e0, e1};
    }

    /**
     * Retorna uma representacao de string do vetor no formato "x y"
     *
     * @return Representacao de string do vetor
     */
    @Override
    public String toString() {
        return e[0] + " " + e[1];
    }
    
    /**
     * Obtem o valor de um componente especifico do vetor
     *
     * @param i componente do vetor (0, 1)
     * @return Valor do componente
     */
    public double get(int i) {
        return e[i];
    }

    /**
     * Define o valor de um componente especifico do vetor
     * 
     * @param i componente do vetor (0, 1)
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
     * Cria um vetor com os valores opostos ao da instancia
     *
     * @return Vec2 com x e y opostos ao da instancia
     */
    public Vec2 negate() {
        return new Vec2(-e[0], -e[1]);
    }
    
    /**
     * Soma dois vetores
     *
     * @param v Vetor que somara da instancia
     * @return Vec2 com x e y somados com outro vetor
     */
    public Vec2 add(Vec2 v) {
        return new Vec2(e[0] + v.e[0], e[1] + v.e[1]);
    }

    /**
     * Subtrai dois vetores
     *
     * @param v Vetor que subtraira da instancia
     * @return Vec2 com x e y subtraidos pelo outro vetor
     */
    public Vec2 subtract(Vec2 v) {
        return new Vec2(e[0] - v.e[0], e[1] - v.e[1]);
    }

    /**
     * Multiplica o vetor por um valor
     *
     * @param t Valor que multiplicara o vetor
     * @return Vec2 com x e y multiplicados pelo valor escolhido
     */
    public Vec2 multiply(double t) {
        return new Vec2(t * e[0], t * e[1]);
    }

    /**
     * Divide o vetor por um valor
     *
     * @param t Valor que dividira o vetor
     * @return Vec2 com x e y divididos pelo valor escolhido
     */
    public Vec2 divide(double t) {
        return new Vec2(e[0] / t, e[1] / t);
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
        return e[0] * e[0] + e[1] * e[1];
    }
    
    /**
     * Calcula o produto escalar entre dois vetores
     * 
     * @param u vetor Vec2
     * @param v vetor Vec2
     * @return Valor Double com a soma da multiplicacao das colunas
     */
    public static double dot(Vec2 u, Vec2 v) {
        return u.e[0] * v.e[0] + u.e[1] * v.e[1];
    }


    /**
     * Calcula o vetor unitario da instacia
     *
     * @return Vec2 com x e y divididos por length()
     */
    public Vec2 unitVector() {
        double length = length();
        return new Vec2(e[0] / length, e[1] / length);
    }


}
