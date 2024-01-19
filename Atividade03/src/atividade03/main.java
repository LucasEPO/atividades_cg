package atividade03;

/**
 * 
 * @author lucas
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IOObj objReader = new IOObj();
        objReader.readObj("src/atividade03/assets/girlOBJ.obj");
        System.out.println(objReader);
    }

}
