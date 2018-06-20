package evercuevas.com.evergram.model;

/**
 * Created by evercuevas on 12/8/17.
 */

public class EcrCardView {
    private String img;
    private String title;
    private String fecha;
    private String likes;

    public EcrCardView(String img, String title, String fecha, String likes) {
        this.img = img;
        this.title = title;
        this.fecha = fecha;
        this.likes = likes;
    }

    public String getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public String getFecha() {
        return fecha;
    }

    public String getLikes() {
        return likes;
    }
}
