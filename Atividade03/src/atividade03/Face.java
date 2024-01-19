package atividade03;

/**
 * Classe para as faces de um .Obj
 * @author lucas
 */
public class Face {
    int[] vertexIndices;
    int[] normalIndices;
    int[] textureCoordinateIndices;

    public Face(int[] vertexIndices, int[] normalIndices, int[] textureCoordinateIndices) {
        this.vertexIndices = vertexIndices;
        this.normalIndices = normalIndices;
        this.textureCoordinateIndices = textureCoordinateIndices;
    }
}
