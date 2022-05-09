import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {
    public void getTrackLyrics(HashMap<String, String> deathTrackLyrics) {
        Set<String> tracks = deathTrackLyrics.keySet();
        for(String track : tracks) {
            System.out.println("Track: " + track);
            System.out.println("Lyrics: " + deathTrackLyrics.get(track));
        }
    }
}