package atividade02;

/**
 * Representa um vetor tridimensional com componentes x, y e z
 * 
 * @author lucas
 */ 
public class Vec3 {
    protected final double[] e;

    /**
     * Construtor padrão. Inicializa o vetor com zeros.
     * 
     */
    public Vec3() {
        e = new double[]{0, 0, 0};
    }

    /**
     * Construtor que inicializa o vetor com valores especificos.
     * 
     * @param e0 Valor do componente x.
     * @param e1 Valor do componente y.
     * @param e2 Valor do componente z.
     */
    public Vec3(double e0, double e1, double e2) {
        e = new double[]{e0, e1, e2};
    }

    /**
     * Retorna uma representacao de string do vetor no formato "x y z"
     *
     * @return Representacao de string do vetor
     */
    @Override
    public String toString() {
        return e[0] + " " + e[1] + " " + e[2];
    }
    
    /**
     * Obtem o valor de um componente especifico do vetor
     *
     * @param i componente do vetor (0, 1, 2)
     * @return Valor do componente
     */
    public double get(int i) {
        return e[i];
    }

    /**
     * Define o valor de um componente especifico do vetor
     * 
     * @param i componente do vetor (0, 1, 2)
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
     * Cria um vetor com os valores opostos ao da instancia
     *
     * @return Vec3 com x,y e z opostos ao da instancia
     */
    public Vec3 negate() {
        return new Vec3(-e[0], -e[1], -e[2]);
    }
    
    /**
     * Soma dois vetores
     *
     * @param v Vetor que somara da instancia
     * @return Vec3 com x,y e z somados com outro vetor
     */
    public Vec3 add(Vec3 v) {
        return new Vec3(e[0] + v.e[0], e[1] + v.e[1], e[2] + v.e[2]);
    }

    /**
     * Subtrai dois vetores
     *
     * @param v Vetor que subtraira da instancia
     * @return Vec3 com x,y e z subtraidos pelo outro vetor
     */
    public Vec3 subtract(Vec3 v) {
        return new Vec3(e[0] - v.e[0], e[1] - v.e[1], e[2] - v.e[2]);
    }

    /**
     * Multiplica o vetor por um valor
     *
     * @param t Valor que multiplicara o vetor
     * @return Vec3 com x,y e z multiplicados pelo valor escolhido
     */
    public Vec3 multiply(double t) {
        return new Vec3(t * e[0], t * e[1], t * e[2]);
    }

    /**
     * Divide o vetor por um valor
     *
     * @param t Valor que dividira o vetor
     * @return Vec3 com x,y e z divididos pelo valor escolhido
     */
    public Vec3 divide(double t) {
        return new Vec3(e[0] / t, e[1] / t, e[2] / t);
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
        return e[0] * e[0] + e[1] * e[1] + e[2] * e[2];
    }
    
    /**
     * Calcula o produto escalar entre dois vetores
     * 
     * @param u vetor Vec3
     * @param v vetor Vec3
     * @return Valor Double com a soma da multiplicacao das colunas
     */
    public static double dot(Vec3 u, Vec3 v) {
        return u.e[0] * v.e[0] + u.e[1] * v.e[1] + u.e[2] * v.e[2];
    }

    /**
     * Retorna um vetor perpendicular a dois vetores
     * 
     * @param u vetor Vec3
     * @param v vetor Vec3
     * @return Vec3
     */
    public static Vec3 cross(Vec3 u, Vec3 v) {
        return new Vec3(u.e[1] * v.e[2] - u.e[2] * v.e[1],
                        u.e[2] * v.e[0] - u.e[0] * v.e[2],
                        u.e[0] * v.e[1] - u.e[1] * v.e[0]);
    }

    /**
     * Calcula o vetor unitario da instacia
     *
     * @return Vec3 com x,y e z divididos por length()
     */
    public Vec3 unitVector() {
        double length = length();
        return new Vec3(e[0] / length, e[1] / length, e[2] / length);
    }


}
