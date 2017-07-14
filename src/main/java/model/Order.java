package model;

// Generated 2017-7-10 21:43:21 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "Order", catalog = "work")
public class Order implements java.io.Serializable {

    private Integer orderid;
    private User user;
    private String pname;
    private Double pricesum;
    private Integer number;

    public Order() {
    }

    public Order(User user, String pname, Double pricesum, Integer number) {
        this.user = user;
        this.pname = pname;
        this.pricesum = pricesum;
        this.number = number;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY,generator="tableGenerator")
    @TableGenerator(name="tableGenerator",initialValue=10000,allocationSize = 1)
    @Column(name = "orderid", unique = true, nullable = false)
    public Integer getOrderid() {
        return this.orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid")
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "pname", length = 15)
    public String getPname() {
        return this.pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Column(name = "pricesum", precision = 22, scale = 0)
    public Double getPricesum() {
        return this.pricesum;
    }

    public void setPricesum(Double pricesum) {
        this.pricesum = pricesum;
    }

    @Column(name = "number")
    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

}
