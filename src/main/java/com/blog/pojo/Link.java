package com.blog.pojo;

public class Link {
    private Integer id;

    private String linkname;

    private String url;

    private String sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }


    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", linkname='" + linkname + '\'' +
                ", url='" + url + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }
}