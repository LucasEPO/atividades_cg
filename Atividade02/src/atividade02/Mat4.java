package atividade02;

/**
 * Representa uma matriz 4x4 com componentes a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p
 * 
 * @author lucas
 */
public class Mat4 {
    protected final double[][] e = new double[4][4];

    /**
     * Construtor padrão. Inicializa o vetor com zeros.
     * 
     */
    public Mat4() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                e[i][j] = 0;
            }
        }
    }
    
    /**
     * Construtor que inicializa o vetor com valores especificos.
     * 
     * @param e00 Valor do componente de indice 00 na matriz
     * @param e01 Valor do componente de indice 01 na matriz
     * @param e02 Valor do componente de indice 02 na matriz
     * @param e03 Valor do componente de indice 03 na matriz
     * @param e10 Valor do componente de indice 10 na matriz
     * @param e11 Valor do componente de indice 11 na matriz
     * @param e12 Valor do componente de indice 12 na matriz
     * @param e13 Valor do componente de indice 13 na matriz
     * @param e20 Valor do componente de indice 20 na matriz
     * @param e21 Valor do componente de indice 21 na matriz
     * @param e22 Valor do componente de indice 22 na matriz
     * @param e23 Valor do componente de indice 23 na matriz
     * @param e30 Valor do componente de indice 30 na matriz
     * @param e31 Valor do componente de indice 31 na matriz
     * @param e32 Valor do componente de indice 32 na matriz
     * @param e33 Valor do componente de indice 33 na matriz
     */
    public Mat4(double e00, double e01, double e02, double e03,
            double e10, double e11, double e12, double e13, 
            double e20, double e21, double e22, double e23,
            double e30, double e31, double e32, double e33) {
        e[0][0] = e00;
        e[0][1] = e01;
        e[0][2] = e02;
        e[0][3] = e03;
        e[1][0] = e10;
        e[1][1] = e11;
        e[1][2] = e12;
        e[1][3] = e13;
        e[2][0] = e20;
        e[2][1] = e21;
        e[2][2] = e22;
        e[2][3] = e23;
        e[3][0] = e30;
        e[3][1] = e31;
        e[3][2] = e32;
        e[3][3] = e33;
    }
    
    /**
     * Construtor a partr de um vetor de elementos
     * 
     * @param values vetor com valores a serem inseridos na matriz, caso tenha menos que 16 valores a matriz sera completado com 0, se houver mais de 9 valores serao ignorados
     */
    public Mat4(double[] values) {
        int qtdValores = values.length;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if((i*4+j) > qtdValores-1){
                    e[i][j] = 0;
                } else {
                    e[i][j] = values[i*4+j];
                }
            }
        }
    }
    
    /**
     * Construtor a partr de quatro Vec4
     * 
     * @param v1 vec4 A ser inserido na primeira linha da matriz
     * @param v2 vec4 A ser inserido na segunda linha da matriz
     * @param v3 vec4 A ser inserido na terceira linha da matriz
     * @param v4 vec4 A ser inserido na quarta linha da matriz
     */
    public Mat4(Vec4 v1, Vec4 v2, Vec4 v3, Vec4 v4) {
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                switch(i){
                    case 0:
                        e[i][j] = v1.get(j);
                        break;
                    case 1:
                        e[i][j] = v2.get(j);
                        break;
                    case 2:
                        e[i][j] = v3.get(j);
                        break;
                    case 3:
                        e[i][j] = v4.get(j);
                        break;
                    default:
                        e[i][j] = 0;
                }
            }
        }
    }
    
    /**
     * Retorna uma representacao de string do vetor no formato "a b c d\ne f g h\ni j k l\nm n o p"
     *
     * @return Representacao de string do vetor
     */
    @Override
    public String toString() {
        return e[0][0] + " " + e[0][1] + " " +  e[0][2] + " " + e[0][3]
                + "\n" + e[1][0] + " " + e[1][1] + " " + e[1][2] + " " + e[1][3]
                + "\n" + e[2][0] + " " + e[2][1] + " " + e[2][2] + " " + e[2][3]
                + "\n" + e[3][0] + " " + e[3][1] + " " + e[3][2] + " " + e[3][3];
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
     * @return Mat3 com componentes opostos ao da instancia
     */
    public Mat4 negate() {
        return new Mat4(-e[0][0], -e[0][1], -e[0][2], -e[0][3],
                -e[1][0], -e[1][1], -e[1][2], -e[1][3],
                -e[2][0], -e[2][1], -e[2][2], -e[2][3],
                -e[3][0], -e[3][1], -e[3][2], -e[3][3]);
    }
    
    /**
     * Soma duas matrizes
     *
     * @param m Matriz que somara da instancia
     * @return Mat4 com componentes somados com outra matriz
     */
    public Mat4 add(Mat4 m) {
        
        double[] results = new double[16];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                results[i*4+j] = e[i][j] + m.e[i][j];
            }   
        }
        
        Mat4 mSoma = new Mat4(results);
        
        return mSoma;
    }
    
    /**
     * Subtrai duas matrizes
     *
     * @param m Matriz que subtraira da instancia
     * @return Mat4 com componentes subtraidos pela outra matriz
     */
    public Mat4 subtract(Mat4 m) {
        double[] results = new double[16];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                results[i*4+j] = e[i][j] - m.e[i][j];
            }   
        }
        
        Mat4 mSub = new Mat4(results);
        
        return mSub;
    }
    
    /**
     * Multiplica a matriz por um valor
     *
     * @param t Valor que multiplicara a matriz
     * @return Mat4 com componentes multiplicados pelo valor escolhido
     */
    public Mat4 multiply(double t) {
        
        double[] results = new double[16];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                results[i*4+j] = e[i][j] * t;
            }   
        }
        
        Mat4 mMult = new Mat4(results);
        
        return mMult;
    }
    
    /**
     * Multiplica a matriz por um valor
     *
     * @param m Matriz que multiplicara a matriz instanciada
     * @return Mat4 com componentes multiplicados pela matriz
     */
    public Mat4 multiply(Mat4 m) {
        Mat4 results = new Mat4();
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    results.set(i, j, (results.get(i, j) + e[i][k] * m.e[k][j]));
                }
            }
        }
        
        return results;
    }
    
    /**
     * Multiplica a matriz por uma outra atriz
     *
     * @param t Valor que dividira a matriz
     * @return Mat4 com componentes divididos pelo valor escolhido
     */
    public Mat4 divide(double t) {
        if(t == 0) {
            System.out.println("Divisão impossível");
            return null;
        }
        
        double[] results = new double[16];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                results[i*4+j] = e[i][j] / t;
            }   
        }
        
        Mat4 mDiv = new Mat4(results);
       
        return mDiv;
    }
    
    /**
     * Calcula o determinante da matriz instanciada
     *
     * @return valor do determinante
     */
    public double determinant(){
        double det = 0;

        for (int j = 0; j < 4; j++) {
            double cofactor = cofactor(0, j);
            det += e[0][j] * cofactor;
        }

        return det;
    }
    
    /**
     * Calcula a matriz inversa caso exista da matriz instanciada
     *
     * @return Mat4 inversa ou null se nao existir matriz inversa
     */
    public Mat4 inverse(){
        double det = this.determinant();
        
        if(det == 0) {
            System.out.println("Determinante da matriz é 0, não existe Inversa");
            return null;
        }
        
        Mat4 mAdj = adjointMatrix();
        Mat4 mInv = mAdj.multiply(1 / det); 
        
        return mInv;
    }
    
    private Mat4 adjointMatrix() {
        Mat4 mAdj = new Mat4();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double cof = cofactor(i, j);
                mAdj.set(j, i, cof);
            }
        }

        return mAdj;
    }
    
    private double cofactor(int i, int j) {
        double sign = Math.pow(-1, i + j);
        double minorDeterminant = calculateMinorDeterminant(i, j);
        return sign * minorDeterminant;
    }
    
    private double calculateMinorDeterminant(int lin, int col) {
        double[][] minorMatrix = new double[3][3];
        int minorRow = 0, minorCol;

        for (int i = 0; i < 4; i++) {
            if (i == lin) {
                continue;
            }
            minorCol = 0;
            for (int j = 0; j < 4; j++) {
                if (j == col) {
                    continue;
                }
                minorMatrix[minorRow][minorCol] = e[i][j];
                minorCol++;
            }
            minorRow++;
        }

        double minorDet = minorMatrix[0][0] * (minorMatrix[1][1] * minorMatrix[2][2] - minorMatrix[2][1] * minorMatrix[1][2])
                        - minorMatrix[0][1] * (minorMatrix[1][0] * minorMatrix[2][2] - minorMatrix[2][0] * minorMatrix[1][2])
                        + minorMatrix[0][2] * (minorMatrix[1][0] * minorMatrix[2][1] - minorMatrix[2][0] * minorMatrix[1][1]);

        return minorDet;
    }
    
    
}
