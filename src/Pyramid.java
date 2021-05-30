public class Pyramid {

    private double height;
    private String name;
    private String site;
    private String pharaoh;


    public Pyramid(String pharaoh, String name, String site, double height) {
        this.height = height;
        this.name = name;
        this.site = site;
        this.pharaoh = pharaoh;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPharaoh(String pharaoh) {
        this.pharaoh = pharaoh;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public String getSite() {
        return site;
    }

    @Override
    public String toString() {
        return "Pyramid{" +
                "pharaoh='" + pharaoh + '\'' +
                ", name='" + name + '\'' +
                ", site='" + site + '\'' +
                ", height=" + height +
                '}';
    }

}
