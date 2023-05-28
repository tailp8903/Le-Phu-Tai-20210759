package AimsProject.hust.soict.ict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    private List<String> authors = new ArrayList<String>();

    public Book(int id, String title, String category, float cost, List authors){
        super().setId(id);
        super().setTitle(title);
        super().setCategory(category);
        super().setCost(cost);
        this.authors = authors;
    }
    
    public void setAuthours(List authours){ this.authors = authours; }
    public List getAuthours(){ return authors; }

    public void addAuthor(String authorName){
        if (!authors.contains(authorName)){
            authors.add(authorName);
        }
        else System.out.println("Author's already exist!");
    }
    public void removeAuthor(String authorName){
        if (authors.contains(authorName)){
            authors.remove(authorName);
        }
        else System.out.println("Not found author!");
    }

}
