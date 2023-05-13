public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private int id;
    private static int nbDigitalVideoDisc = 0;


    public DigitalVideoDisc(String title){
        this.title = title;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, float cost){
        this.category = category;
        this.title = title;
        this.cost = cost;
        this.director = "unknown";
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String director, String category, String title, float cost){
        this.director = director;
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){ return title; }
    public String getCategory(){ return category; }
    public String getDirector(){ return director; }
    public int getLength(){ return length; }
    public float getCost(){ return cost; }
    public int getID(){ return id;}

}
