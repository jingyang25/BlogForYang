package com.blog.pojo;

public class UserRelation {
    private Integer id;

    private String userid;

    private String userreid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUserreid() {
        return userreid;
    }

    public void setUserreid(String userreid) {
        this.userreid = userreid == null ? null : userreid.trim();
    }
}