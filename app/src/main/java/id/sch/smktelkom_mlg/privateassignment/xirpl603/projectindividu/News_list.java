package id.sch.smktelkom_mlg.privateassignment.xirpl603.projectindividu;

/**
 * Created by Mokleters on 13/05/2017.
 */

public class News_list {
    private String image;
    private String judul;
    private String popular;
    private String detildeskripsi;

    public News_list(String image, String judul, String popular) {
        this.image = image;
        this.judul = judul;
        this.popular = popular;
        this.detildeskripsi = detildeskripsi;
    }

    public String getImage() {
        return image;
    }

    public String getJudul() {
        return judul;
    }

    public String getPopular() {
        return popular;
    }

    public String getDetildeskripsi() {
        return detildeskripsi;
    }
}
