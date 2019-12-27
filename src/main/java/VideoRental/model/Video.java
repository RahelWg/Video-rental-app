package VideoRental.model;

import javax.persistence.*;

@Entity
@Table(name = "videos")
public class Video {
    @Id
    @SequenceGenerator(name = "seq-gen", sequenceName = "MY_SEQ_GEN", initialValue = 205, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seq-gen")
    @Column(name = "id")
    private Long id;

    @Column(name = "video_title")
    private String video_title;

    @Column(name = "video_type")
    private String video_type;

    @Column(name = "price_per_video")
    private int price_per_video;

    @Column(name = "nb_video")
    private int nb_video;

    @Column(name = "total_price")
    private int total_price;

    public Video(){
    }

    public Video(Long id, String video_title, String video_type, int price_per_video, int nb_video, int total_price) {
        this.id = id;
        this.video_title = video_title;
        this.video_type = video_type;
        this.price_per_video = price_per_video;
        this.nb_video = nb_video;
        this.total_price = total_price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideo_title() {
        return video_title;
    }

    public void setVideo_title(String video_title) {
        this.video_title = video_title;
    }

    public String getVideo_type() { return video_type; }

    public void setVideo_type(String video_type) { this.video_type = video_type; }

    public int getPrice_per_video() {
        return price_per_video;
    }

    public void setPrice_per_video(int price_per_video) {
        this.price_per_video = price_per_video;
    }

    public int getNb_video() {
        return nb_video;
    }

    public void setNb_video(int nb_video) {
        this.nb_video = nb_video;
    }

    public int getTotal_price() {
        return nb_video * price_per_video;
    }

    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }


}