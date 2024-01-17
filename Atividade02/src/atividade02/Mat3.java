package atividade02;

/**
 * Representa uma matriz 3x3 com componentes a, b, c, d, e, f, g, h e i
 * 
 * @author lucas
 */
public class Mat3 {
    protected final double[][] e = new double[3][3];

    /**
     * Construtor padrão. Inicializa o vetor com zeros.
     * 
     */
    public Mat3() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
     * @param e10 Valor do componente de indice 10 na matriz
     * @param e11 Valor do componente de indice 11 na matriz
     * @param e12 Valor do componente de indice 12 na matriz
     * @param e20 Valor do componente de indice 20 na matriz
     * @param e21 Valor do componente de indice 21 na matriz
     * @param e22 Valor do componente de indice 22 na matriz
     */
    public Mat3(double e00, double e01, double e02, double e10, double e11, double e12, double e20, double e21, double e22) {
        e[0][0] = e00;
        e[0][1] = e01;
        e[0][2] = e02;
        e[1][0] = e10;
        e[1][1] = e11;
        e[1][2] = e12;
        e[2][0] = e20;
        e[2][1] = e21;
        e[2][2] = e22;
    }
    
    /**
     * Construtor a partr de um vetor de elementos
     * 
     * @param values vetor com valores a serem inseridos na matriz, caso tenha menos que nove valores a matriz sera completado com 0, se houver mais de 9 valores serao ignorados
     */
    public Mat3(double[] values) {
        int qtdValores = values.length;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if((i*3+j) > qtdValores-1){
                    e[i][j] = 0;
                } else {
                    e[i][j] = values[i*3+j];
                }
            }
        }
    }
    
    /**
     * Construtor a partr de tres Vec3
     * 
     * @param v1 vec3 A ser inserido na primeira linha da matriz
     * @param v2 vec3 A ser inserido na segunda linha da matriz
     * @param v3 vec3 A ser inserido na terceira linha da matriz
     */
    public Mat3(Vec3 v1, Vec3 v2, Vec3 v3) {
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
                    default:
                        e[i][j] = 0;
                }
            }
        }
    }
    
    /**
     * Retorna uma representacao de string do vetor no formato "a b c\nd e f\ng h i"
     *
     * @return Representacao de string do vetor
     */
    @Override
    public String toString() {
        return e[0][0] + " " + e[0][1] + " "+ e[0][2]
                + "\n" + e[1][0] + " " + e[1][1] + " " + e[1][2]
                + "\n" + e[2][0] + " " + e[2][1] + " " + e[2][2];
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
    public Mat3 negate() {
        return new Mat3(-e[0][0], -e[0][1], -e[0][2], -e[1][0], -e[1][1], -e[1][2], -e[2][0], -e[2][1], -e[2][2]);
    }
    
    /**
     * Soma duas matrizes
     *
     * @param m Matriz que somara da instancia
     * @return Mat3 com componentes somados com outra matriz
     */
    public Mat3 add(Mat3 m) {
        
        double[] results = new double[9];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                results[i*3+j] = e[i][j] + m.e[i][j];
            }   
        }
        
        Mat3 mSoma = new Mat3(results);
        
        return mSoma;
    }
    
    /**
     * Subtrai duas matrizes
     *
     * @param m Matriz que subtraira da instancia
     * @return Mat3 com componentes subtraidos pela outra matriz
     */
    public Mat3 subtract(Mat3 m) {
        double[] results = new double[9];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                results[i*3+j] = e[i][j] - m.e[i][j];
            }   
        }
        
        Mat3 mSub = new Mat3(results);
        
        return mSub;
    }
    
    /**
     * Multiplica a matriz por um valor
     *
     * @param t Valor que multiplicara a matriz
     * @return Mat3 com componentes multiplicados pelo valor escolhido
     */
    public Mat3 multiply(double t) {
        
        double[] results = new double[9];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                results[i*3+j] = e[i][j] * t;
            }   
        }
        
        Mat3 mMult = new Mat3(results);
        
        return mMult;
    }
    
    /**
     * Multiplica a matriz por um valor
     *
     * @param m Matriz que multiplicara a matriz instanciada
     * @return Mat3 com componentes multiplicados pela matriz
     */
    public Mat3 multiply(Mat3 m) {
        Mat3 results = new Mat3();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
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
     * @return Mat3 com componentes divididos pelo valor escolhido
     */
    public Mat3 divide(double t) {
        if(t == 0) {
            System.out.println("Divisão impossível");
            return null;
        }
        
        double[] results = new double[9];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                results[i*3+j] = e[i][j] / t;
            }   
        }
        
        Mat3 mDiv = new Mat3(results);
       
        return mDiv;
    }
    
    /**
     * Calcula o determinante da matriz instanciada
     *
     * @return valor do determinante
     */
    public double determinant(){
        double det = e[0][0] * (e[1][1] * e[2][2] - e[2][1] * e[1][2])
                   - e[0][1] * (e[1][0] * e[2][2] - e[2][0] * e[1][2])
                   + e[0][2] * (e[1][0] * e[2][1] - e[2][0] * e[1][1]);

        return det;
    }
    
    /**
     * Calcula a matriz inversa caso exista da matriz instanciada
     *
     * @return Mat3 inversa ou null se nao existir matriz inversa
     */
    public Mat3 inverse(){
        double det = this.determinant();
        
        if(det == 0) {
            System.out.println("Determinante da matriz é 0, não existe Inversa");
            return null;
        }
        
        Mat3 mAdj = adjointMatrix();
        Mat3 mInv = mAdj.multiply(1 / det); 
        
        return mInv;
    }
    
    private Mat3 adjointMatrix() {
        Mat3 mAdj = new Mat3();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
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
        double[][] minorMatrix = new double[2][2];
        int minorRow = 0, minorCol;

        for (int i = 0; i < 3; i++) {
            if (i == lin) {
                continue;
            }
            minorCol = 0;
            for (int j = 0; j < 3; j++) {
                if (j == col) {
                    continue;
                }
                minorMatrix[minorRow][minorCol] = e[i][j];
                minorCol++;
            }
            minorRow++;
        }

        return minorMatrix[0][0] * minorMatrix[1][1] - minorMatrix[0][1] * minorMatrix[1][0];
    }
    
    
}
