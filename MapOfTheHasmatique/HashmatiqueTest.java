import java.util.HashMap;

public class HashmatiqueTest {

    public static void main(String[] args) {

        String flatEmotionsLyrics = "Where is the person that could have been Who, what took over, when did the end begin Should we not prepare for the uncertain Mysteries of our life, of our destiny See things that are not there Intruding voices What went wrong to their picture perfect life They once knew - Flattening of emotions A mind shared by an uninvited stranger Which comes and goes as choose to appear Should we not prepare for the uncertain Mysteries of our life, of our destiny See things that are not there Intruding voices What went wrong to their picture perfect life They once knew - Flattening of emotions";
        String overactiveLyrcs = "Your existence is a script, Life for you is a perfomance, Play out the leading role. Directing and premeditating every move That creates the act of manipulation Mastering the art of deception. That increases your sick addiction It's an overactive imagination That enslaves your empty shell Existing in dimensions of addictive obsession Your script will run short of ideas The story will soon end itself People to trust come short in number. Like a plague your lies spread Fast across the world Mastering the art of deception That increases your sick addition It's an overactive imagination That enslaves your empty shell";
        String lackOfLyrics = "A condeming fear strikes down Things they cannot understand An excuse to cover up weaknesses that lie within Lies Laying your guilt and pain On people that had no part in the molding of a life That creates its destruction Lies Right before your very eyes A reflection of the mistakes To the end you will deny Your part in the demise of a life Lack of comprehension Thriving on your cliche Compelled by self-resentment Reaching into the minds of those that created The depression in which they In which they drowned their flesh and blood Lies So easy to blame the Everlasting fear on a pathetic attempt To justify the ending of life Lies Right before your very eyes A reflection of the mistakes To the end you will deny Your part in the demise of a life Lack of comprehension Thriving on your cliche Compelled by self-resentment";
        String bitePain = "Look down at the body You may see no trace of wounds In the eye, the eye of the beholder One cannot, assume Not a drop of blood is drawn But you know how it bleeds Beware of the sharp edged weapon Called human being It is a shield of passion And strong will From this I am the victor Instead of the kill I will not feed your hunger instead I bite the pain Looking not back but forward I bite down Try to cover up the trail of deceit And daggers spawned from your soul Acid the tears of remorse flow in vain Too late for regrets Save it for the next ill fated game It is a shield of passion And strong will From this I am the victor Instead of the kill I will not feed your hunger instead I bite the pain Looking not back but forward I bite down";

        HashMap<String, String> deathTrackLyrics = new HashMap<String, String>();
        deathTrackLyrics.put("Flattening of Emotions", flatEmotionsLyrics);
        deathTrackLyrics.put("Overactive Imagination", overactiveLyrcs);
        deathTrackLyrics.put("Lack of Comprehension", lackOfLyrics);
        deathTrackLyrics.put("Bite the Pain", bitePain);

        MapOfTheHashmatique appTest = new MapOfTheHashmatique();
        appTest.getTrackLyrics(deathTrackLyrics);
    }
}
