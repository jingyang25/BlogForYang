package com.blog.pojo;

public class Permission {
    private Integer pid;

    private String pname;

    private String purl;

    private String percode;

    private String type;

    private String parentid;

    private String sort;

    private Integer status;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPurl() {
        return purl;
    }

    public void setPurl(String purl) {
        this.purl = purl == null ? null : purl.trim();
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", purl='" + purl + '\'' +
                ", percode='" + percode + '\'' +
                ", type='" + type + '\'' +
                ", parentid='" + parentid + '\'' +
                ", sort='" + sort + '\'' +
                ", status=" + status +
                '}';
    }
}