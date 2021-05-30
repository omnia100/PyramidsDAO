import java.util.List;

public class Main {


    public static void main(String[] args) {
        PyramidDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readFile("pyramids.csv");

        for(Pyramid p : pyramids){
            System.out.println(p.toString());
        }
    }

}