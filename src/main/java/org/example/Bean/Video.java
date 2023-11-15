package org.example.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
    private String title;
    private String descrip;
    private String imgSrc;
    private int videoID;
    private String tag;
    private String releaseDate;
    private int views;
    private int episodes;

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescrip() {
//        return descrip;
//    }
//
//    public void setDescrip(String descrip) {
//        this.descrip = descrip;
//    }
//
//    public String getImgSrc() {
//        return imgSrc;
//    }
//
//    public void setImgSrc(String imgSrc) {
//        this.imgSrc = imgSrc;
//    }
//
//    public int getVideoID() {
//        return videoID;
//    }
//
//    public void setVideoID(int videoID) {
//        this.videoID = videoID;
//    }
//
//    public String getTag() {
//        return tag;
//    }
//
//    public void setTag(String tag) {
//        this.tag = tag;
//    }

//    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")



}
