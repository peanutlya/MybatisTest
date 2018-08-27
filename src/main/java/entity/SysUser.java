package entity;

import java.time.LocalDateTime;

public class SysUser {
    private  Long id;
    private String userName;
    private String userPassword;
    private String userEmail;
    private LocalDateTime createTime1;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public LocalDateTime getCreateTime1() {
        return createTime1;
    }

    public void setCreateTime1(LocalDateTime createTime) {
        System.out.println(createTime);
        this.createTime1 = createTime;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", createTime1=" + createTime1 +
                '}';
    }
}
