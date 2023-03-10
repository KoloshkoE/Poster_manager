import java.util.Arrays;

public class PosterManager {
    private String[] poster = new String[0];
    private String[] countposter = new String[0];

    public PosterManager(int limit) {
        String[] countposter = new String[limit];
    }

    public PosterManager() {
        String[] countposter = new String[9];
    }


    public void setPoster(String newPoster) {
        String[] tmp = new String[this.poster.length + 1];
        for (int i = 0; i < this.poster.length; i++) {
            tmp[i] = this.poster[i];
        }
        tmp[tmp.length - 1] = newPoster;
        this.poster = tmp;
    }

    public String[] getPoster() {
        return poster;
    }

    public String[] theLastAdded(int countitems) {
        String[] allposter =getPoster();
        if (countitems < countposter.length) {
           allposter = new String[countitems];
        } else {
            allposter = new String[countposter.length];
        }
        String[] reversed = new String[allposter.length];
        for (int i = 0; i < reversed.length; i++) {

            reversed[i] = allposter[allposter.length - 1 - i];
        }
        return reversed;

    }

}
