package AimsProject.hust.soict.ict.aims.media;

import java.util.List;

public class CompactDisc extends Disc implements Playable {
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();
    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist, List tracks){
        super(id, title, category, cost, length, director);
        this.artist = artist;
        this.tracks = tracks;
    }

    public String getArtist(){ return artist; }

    public void addTrack(Track track){
        if (!tracks.contains(track)){
            tracks.add(track);
        }
        else System.out.println("Track's already exist!");
    }

    public void removeTrack(Track track){
        if (tracks.contains(track)){
            tracks.remove(track);
        }
        else System.out.println("Not found track!");
    }

    @Override
    public void play(){
        for (Track track: tracks){
            track.play();
        }
    }

    @Override
    int sum_length = 0;
    public int getLength(){
        for (Track track: tracks){
            sum_length += track.getLength();
        }
        return sum_length;
    }
}
