package atividade03;

/**
 * Classe para as coordenadade de textura vt de um .obj
 *
 * @author lucas
 */
public class CoordenadasTextura {
    double u, v;

    /**
     *  Cria um objeto com dois parametros u e v para coordenadas de textura em um .obj
     *
     * @param u
     * @param v
     */
    public CoordenadasTextura(double u, double v) {
        this.u = u;
        this.v = v;
    }
}
