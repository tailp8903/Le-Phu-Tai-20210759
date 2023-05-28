package AimsProject.hust.soict.ict.aims.media;

public class Disc extends Media {
    private int length;
    private String director;
    public Disc(int id, String title, String category, float cost, int length, String director){
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }
    public int getLength(){ return length; }
    public String director(){ return director; }
    
}
