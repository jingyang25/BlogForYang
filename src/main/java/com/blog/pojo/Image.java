package com.blog.pojo;

public class Image {
    private Integer id;

    private String imgname;

    private String imgurl;

    private String content;

    private String uploadtime;

    private String clickvolume;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgname() {
        return imgname;
    }

    public void setImgname(String imgname) {
        this.imgname = imgname == null ? null : imgname.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(String uploadtime) {
        this.uploadtime = uploadtime == null ? null : uploadtime.trim();
    }

    public String getClickvolume() {
        return clickvolume;
    }

    public void setClickvolume(String clickvolume) {
        this.clickvolume = clickvolume == null ? null : clickvolume.trim();
    }

    @Override
    public String toString() {
        return "Image{" +
                "id=" + id +
                ", imgname='" + imgname + '\'' +
                ", imgurl='" + imgurl + '\'' +
                ", content='" + content + '\'' +
                ", uploadtime='" + uploadtime + '\'' +
                ", clickvolume='" + clickvolume + '\'' +
                '}';
    }
}