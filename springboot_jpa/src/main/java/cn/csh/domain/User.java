package cn.csh.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Sihao.Chen
 * @version V1.0
 * @Package cn.csh.domain
 * @date 2020/2/11 14:48
 */
@Entity
@Table(name = "user")
public class User implements Serializable {
    // 主键
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    // 用户名
    @Column(name = "username")
    private String username;
    // 密码
    @Column(name = "password")
    private String password;
    // 姓名
    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
