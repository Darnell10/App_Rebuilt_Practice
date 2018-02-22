package c4q.com.app_rebuild_practice.modelclasses;

/**
 * Created by D on 2/22/18.
 */

public class Picture {

    private String medium;
    private String thumbnail;

    public Picture(String medium, String thumbnail) {
        this.medium = medium;
        this.thumbnail = thumbnail;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
}
