package atividade03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para leitura de um arquivo .obj
 * Esta classe apenas le um arquivo, e mostra quantos vertices normais textura e faces tem no .obj
 *
 * @author lucas
 */
public class IOObj {

    private final List<Vertice> vertices;
    private final List<Normal> normais;
    private final List<CoordenadasTextura> coordsTextura;
    private final List<Face> faces;

    /**
     *  Cria os arrays ao instanciar a classe
     */
    public IOObj() {
        vertices = new ArrayList<>();
        faces = new ArrayList<>();
        normais = new ArrayList<>();
        coordsTextura = new ArrayList<>();
    }

    /**
     * Recebe um caminho para um arquivo .obj e armazena no array especifico cada valor lido
     *
     * @param objPath
     */
    public void readObj(String objPath) {
        Path objFilePath = Paths.get(objPath);

        try (BufferedReader reader = new BufferedReader(new FileReader(objFilePath.toFile()))){
            String line;

            //le linha por linha
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");

                if (parts.length > 0) {
                    double x, y, z;
                    switch (parts[0]) {
                        //caso vertice
                        case "v":
                            x = Double.parseDouble(parts[1]);
                            y = Double.parseDouble(parts[2]);
                            z = Double.parseDouble(parts[3]);
                            vertices.add(new Vertice(x, y, z));
                            break;
                        //caso normais
                        case "vn":
                            x = Double.parseDouble(parts[1]);
                            y = Double.parseDouble(parts[2]);
                            z = Double.parseDouble(parts[3]);
                            normais.add(new Normal(x, y, z));
                            break;
                        //caso coordenadas de textura
                        case "vt":
                            x = Double.parseDouble(parts[1]);
                            y = Double.parseDouble(parts[2]);
                            coordsTextura.add(new CoordenadasTextura(x, y));
                            break;
                        //caso faces
                        case "f":
                            int[] vertexIndices = new int[parts.length - 1];
                            int[] normalIndices = new int[parts.length - 1];
                            int[] textureCoordinateIndices = new int[parts.length - 1];
                            
                            for (int i = 1; i < parts.length; i++) {
                                
                                String[] indicesParts = parts[i].split("/");
                                vertexIndices[i - 1] = Integer.parseInt(indicesParts[0]) - 1;
                                
                                if (indicesParts.length > 1 && !indicesParts[1].isEmpty()) {
                                    textureCoordinateIndices[i - 1] = Integer.parseInt(indicesParts[1]) - 1;
                                }
                                if (indicesParts.length > 2) {
                                    normalIndices[i - 1] = Integer.parseInt(indicesParts[2]) - 1;
                                }
                            }
                            
                            faces.add(new Face(vertexIndices, normalIndices, textureCoordinateIndices));
                            break;
                    }
                }
            }

            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Imprime a quantidade de cada um dos arrays
     * 
     * @return String padrao com a quantidade de cada array
     */
    @Override
    public String toString() {
        return "Número de vértices: " + vertices.size()
                + "\nNúmero de normais: " + normais.size()
                + "\nNúmero de coordenadas de tuxturas: " + coordsTextura.size()
                + "\nNúmero de faces: " + faces.size();
    }  
}