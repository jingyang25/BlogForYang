package com.blog.pojo;

public class UserRole {

    private Integer id;

    private String userid;

    private String roleid;

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

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", roleid='" + roleid + '\'' +
                '}';
    }
}