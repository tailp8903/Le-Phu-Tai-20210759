package AimsProject.hust.soict.ict.aims.media;

public class Track implements Playable {
    private String title;
    private int length;
    public Track(String title, int length){
        this.title = title;
        this.length = length;
    }

    public getTitle(){ return title; }
    public getLength(){ return length; }

    @Override
    public void play(){
        System.out.println("Playing DVD: " + this.getTitle());
	    System.out.println("DVD length: " + this.getLength());
    }
    
    @Override
    public boolean equals(Object o){
        o = (Track) o;
        if (this.title == o.getTitle() && this.length == o.getLength()) return true;
        return false;
    }
}
