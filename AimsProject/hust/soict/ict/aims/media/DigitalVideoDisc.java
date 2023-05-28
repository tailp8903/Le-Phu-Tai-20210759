package AimsProject.hust.soict.ict.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    // public DigitalVideoDisc(String title){
    //     this.title = title;
    // }

    // public DigitalVideoDisc(String title, String category, float cost){
    //     this.category = category;
    //     this.title = title;
    //     this.cost = cost;
    //     this.director = "unknown";
    // }

    // public DigitalVideoDisc(String director, String category, String title, float cost){
    //     this.director = director;
    //     this.title = title;
    //     this.category = category;
    //     this.cost = cost;
    // }

    // public DigitalVideoDisc(String title, String category, String director, int length, float cost){
    //     this.title = title;
    //     this.category = category;
    //     this.director = director;
    //     this.length = length;
    //     this.cost = cost;
    // }
    
    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director){
        super(id, title, category, cost, length, director);
    }
   
    @Override
    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
	    System.out.println("DVD length: " + this.getLength());
    }
    
}
