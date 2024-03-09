import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> listeners;
    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        listeners = new ArrayList();
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int howMany(ArrayList<String> newListeners){
        int tally = 0;
        for(int i = 0; i < newListeners.size(); i++){
            if(!(listeners.contains(newListeners.get(i).toLowerCase()))){
                tally = tally + 1;
                listeners.add(newListeners.get(i).toLowerCase());
            };
        }
        return tally;
    }

}