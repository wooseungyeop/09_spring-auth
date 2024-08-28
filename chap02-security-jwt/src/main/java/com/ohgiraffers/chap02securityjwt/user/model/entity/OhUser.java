package com.ohgiraffers.chap02securityjwt.user.model.entity;

import jakarta.persistence.*;

import javax.print.attribute.standard.MediaSize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "TBL_USER")
public class OhUser {

    @Id
    @Column(name = "USER_NO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userNo;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "USER_PASS")
    private String userPass;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_EMAIL")
    private String userEmail;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "USER_ROLE")
    private OhgiraffersRole role;

    @Column(name = "USER_STATE")
    private String state;


    public List<String> getRoleList(){
        if(this.role.getRole().length() >0 ){
            return Arrays.asList(this.role.getRole().split(","));
        }
        return new ArrayList<>();
    }

    public OhUser() {
    }

    public OhUser(int userNo, String userId, String userPass, String userName, String userEmail, OhgiraffersRole role, String state) {
        this.userNo = userNo;
        this.userId = userId;
        this.userPass = userPass;
        this.userName = userName;
        this.userEmail = userEmail;
        this.role = role;
        this.state = state;
    }


    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public OhgiraffersRole getRole() {
        return role;
    }

    public void setRole(OhgiraffersRole role) {
        this.role = role;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "OhUser{" +
                "userNo=" + userNo +
                ", userId='" + userId + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", role=" + role +
                ", state='" + state + '\'' +
                '}';
    }
}
