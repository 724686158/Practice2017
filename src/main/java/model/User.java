package model;

/**
 * Created by Administrator on 2017/7/11.
 */
import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "user", catalog = "work")
public class User implements java.io.Serializable {

    private String id;
    private String nickName;
    private String telephone;
    private Date registerTime;
    //private Set<AcctRole> acctRoles = new HashSet<AcctRole>(0);

    public User() {

    }

    public User(String id, String nickName) {
        this.id = id;
        this.nickName = nickName;
    }

    public User(String id, String nickName, String telephone,
                    Date registerTime) {
        this.id = id;
        this.nickName = nickName;
        this.telephone = telephone;
        this.registerTime = registerTime;
    }

    @Id
    @Column(name = "id", unique = true, nullable = false, length = 36)
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "nick_name", nullable = false)
    public String getNickName() {
        return this.nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Column(name = "telephone")
    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "register_time", length = 19)
    public Date getRegisterTime() {
        return this.registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }


}
