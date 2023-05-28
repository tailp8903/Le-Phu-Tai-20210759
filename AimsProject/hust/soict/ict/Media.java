package AimsProject.hust.soict.ict;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public Media(){

    }
    public Media(int id, String title, String category, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
    
    public void setId(int id){ this.id = id; }
    public void setTitle(String tiltle){ this.title = title; }
    public void setCategory(String category){ this.category = category; }
    public void setCost(float cost){ this.cost = cost; }
    public int getId(){ return id; }
    public String getTiltle(){ return title; }
    public String getCategory(){ return category; }
    public float getCost(){ return cost; }

}
