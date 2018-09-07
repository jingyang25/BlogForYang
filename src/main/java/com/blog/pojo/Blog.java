package com.blog.pojo;

public class Blog {

    private Integer id;

    private String title;

    private String typeid;

    private String keywords;

    private String sort;

    private String imgid;

    private String content;

    private int clickvolume;

    private String createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid == null ? null : typeid.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getImgid() {
        return imgid;
    }

    public void setImgid(String imgid) {
        this.imgid = imgid == null ? null : imgid.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public int getClickvolume() {
        return clickvolume;
    }

    public void setClickvolume(int clickvolume) {
        this.clickvolume = clickvolume;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", typeid='" + typeid + '\'' +
                ", keywords='" + keywords + '\'' +
                ", sort='" + sort + '\'' +
                ", imgid='" + imgid + '\'' +
                ", content='" + content + '\'' +
                ", clickvolume='" + clickvolume + '\'' +
                ", createtime='" + createtime + '\'' +
                '}';
    }
}