package com.blog.pojo;

public class UserLoginMark {
    private Integer id;

    private String userid;

    private String logintime;

    private String loginip;

    private String action;

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

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime == null ? null : logintime.trim();
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    @Override
    public String toString() {
        return "UserLoginMark{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", logintime='" + logintime + '\'' +
                ", loginip='" + loginip + '\'' +
                ", action='" + action + '\'' +
                '}';
    }
}