package atividade02;

/**
 * Representa uma matriz 2x2 com componentes a, b, c e d
 * 
 * @author lucas
 */
public class Mat2 {
    protected final double[][] e = new double[2][2];

    /**
     * Construtor padrão. Inicializa o vetor com zeros.
     * 
     */
    public Mat2() {
        e[0][0] = 0;
        e[0][1] = 0;
        e[1][0] = 0;
        e[1][1] = 0;
    }
    
    /**
     * Construtor que inicializa o vetor com valores especificos.
     * 
     * @param e00 Valor do componente de indice 00 na matriz
     * @param e01 Valor do componente de indice 01 na matriz
     * @param e10 Valor do componente de indice 10 na matriz
     * @param e11 Valor do componente de indice 11 na matriz
     */
    public Mat2(double e00, double e01, double e10, double e11) {
        e[0][0] = e00;
        e[0][1] = e01;
        e[1][0] = e10;
        e[1][1] = e11;
    }
    
    /**
     * Construtor a partr de um vetor de elementos
     * 
     * @param values vetor com valores a serem inseridos na matriz, caso tenha menos que nove valores a matriz sera completado com 0, se houver mais de 9 valores serao ignorados
     */
    public Mat2(double[] values) {
        int qtdValores = values.length;
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if((i*2+j) > qtdValores-1){
                    e[i][j] = 0;
                } else {
                    e[i][j] = values[i*2+j];
                }
            }
        }
    }
    
    /**
     * Construtor a partr de tres Vec3
     * 
     * @param v1 vec2 A ser inserido na primeira linha da matriz
     * @param v2 vec2 A ser inserido na segunda linha da matriz
     */
    public Mat2(Vec2 v1, Vec2 v2) {
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                switch(i){
                    case 0:
                        e[i][j] = v1.get(j);
                        break;
                    case 1:
                        e[i][j] = v2.get(j);
                        break;
                    default:
                        e[i][j] = 0;
                }
            }
        }
    }
    
    /**
     * Retorna uma representacao de string do vetor no formato "a b\nc d"
     *
     * @return Representacao de string do vetor
     */
    @Override
    public String toString() {
        return e[0][0] + " " + e[0][1] 
                + "\n" + e[1][0] + " " + e[1][1] ;
    }
    
    /**
     * Obtem o valor de um componente especifico do vetor
     *
     * @param lin linha do componente na matriz
     * @param col coluna do componente na matriz
     * @return Valor do componente
     */
    public double get(int lin, int col) {
        return e[lin][col];
    }

    /**
     * Define o valor de um componente especifico do vetor
     * 
     * @param lin linha do componente na matriz
     * @param col coluna do componente na matriz
     * @param value valor a ser atribuido no componente
     */
    public void set(int lin, int col, double value) {
        e[lin][col] = value;
    }
    
    /**
     * Cria um vetor com os valores opostos ao da instancia
     *
     * @return Mat2 com a, b, c e d opostos ao da instancia
     */
    public Mat2 negate() {
        return new Mat2(-e[0][0], -e[0][1], -e[1][0], -e[1][1]);
    }
    
    /**
     * Soma duas matrizes
     *
     * @param m Matriz que somara da instancia
     * @return Mat2 com a, b, c e d somados com outra matriz
     */
    public Mat2 add(Mat2 m) {
        return new Mat2(e[0][0] + m.e[0][0], 
                e[0][1] + m.e[0][1], 
                e[1][0] + m.e[1][0],
                e[1][1] + m.e[1][1]);
    }
    
    /**
     * Subtrai duas matrizes
     *
     * @param m Matriz que subtraira da instancia
     * @return Mat2 com a, b, c e d subtraidos pela outra matriz
     */
    public Mat2 subtract(Mat2 m) {
        return new Mat2(e[0][0] - m.e[0][0], 
                e[0][1] - m.e[0][1], 
                e[1][0] - m.e[1][0],
                e[1][1] - m.e[1][1]);
    }
    
    /**
     * Multiplica a matriz por um valor
     *
     * @param t Valor que multiplicara a matriz
     * @return Mat2 com a, b, c e d multiplicados pelo valor escolhido
     */
    public Mat2 multiply(double t) {
        return new Mat2(t * e[0][0],
                t * e[0][1],
                t * e[1][0],
                t * e[1][1]);
    }
    
    /**
     * Multiplica a matriz por um valor
     *
     * @param m Matriz que multiplicara a matriz instanciada
     * @return Mat2 com a, b, c e d multiplicados pela matriz
     */
    public Mat2 multiply(Mat2 m) {
        double v0 = e[0][0] * m.e[0][0] + e[0][1] * m.e[1][0];
        double v1 = e[0][0] * m.e[0][1] + e[0][1] * m.e[1][1];
        double v2 = e[1][0] * m.e[0][0] + e[1][1] * m.e[1][0];
        double v3 = e[1][0] * m.e[0][1] + e[1][1] * m.e[1][1];
        

        
        return new Mat2(v0, v1, v2, v3);
    }
    
    /**
     * Multiplica a matriz por uma outra atriz
     *
     * @param t Valor que dividira a matriz
     * @return Mat2 com a, b, c e d divididos pelo valor escolhido
     */
    public Mat2 divide(double t) {
        if(t == 0) {
            System.out.println("Divisão impossível");
            return null;
        }
        return new Mat2(e[0][0] / t,
                e[0][1] / t,
                e[1][0] / t,
                e[1][1] / t);
    }
    
    /**
     * Calcula o determinante da matriz instanciada
     *
     * @return valor do determinante
     */
    public double determinant(){
        return ((e[0][0]* e[1][1]) - (e[0][1] * e[1][0]));
    }
    
    /**
     * Calcula a matriz inversa caso exista da matriz instanciada
     *
     * @return Mat2 inversa ou null se nao existir matriz inversa
     */
    public Mat2 inverse(){
        double det = this.determinant();
        
        if(det == 0) {
            System.out.println("Determinante da matriz é 0, não existe Inversa");
            return null;
        }
        
        Mat2 mAux = new Mat2(e[1][1], -e[0][1], -e[1][0], e[0][0]);

        return mAux.multiply((1/det));
    }
    
    
}
