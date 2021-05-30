import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PyramidCSVDAO implements PyramidDAO {

    File pFile;

    @Override
    public List<Pyramid> readFile(String fileName) {

        List<Pyramid> pyramids = new ArrayList<Pyramid>();
        pFile = new File(fileName);

        //Lines
        List<String> lines = new ArrayList<String>();
        try {
            lines = Files.readAllLines(pFile.toPath());
        } catch (Exception e) {
            System.out.println("error happened while reading the file");
        }

        //Fields
        for(int l = 1; l < lines.size(); l++){
            String line = lines.get(l);
            String[] fields = line.split(",");
            for (int fieldIdx = 0; fieldIdx < fields.length; fieldIdx++) {
                fields[fieldIdx] = fields[fieldIdx].trim();
            }
            pyramids.add(createPyramid(fields));
        }

        return pyramids;
    }


    public Pyramid createPyramid(String[] fields) {

        double height;
        try {
            height = Double.parseDouble(fields[7]);
        } catch (Exception e){
            height = -1;
        }
        String pharaoh = fields[0];
        String name = fields[2];
        String site = fields[4];
        Pyramid p = new Pyramid(pharaoh,name,site,height);
        return p;
    }
}
