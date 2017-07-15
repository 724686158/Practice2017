package model;

// Generated 2017-7-10 21:43:21 by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.*;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "Order", catalog = "work")
public class Order implements java.io.Serializable {

    private Integer orderid;

    @Column(name = "number")
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    @Column(name = "cost")
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    private User user;
    private Date registertime;
    private String statement;
    private int num;
    private double cost;
    private Set<Product> products = new HashSet<Product>(0);

    public Order() {
    }

    public Order(Integer orderid, User user, Date registertime, String statement, int num, double cost, Set<Product> products) {
        this.orderid = orderid;
        this.user = user;
        this.registertime = registertime;
        this.statement = statement;
        this.num = num;
        this.cost = cost;
        this.products = products;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "registertime", length = 10)
    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }
    @Column(name = "statement", length = 45)
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO,generator="tg2")
    @TableGenerator(name="tg2",initialValue=10000,allocationSize = 1)
    @Column(name = "orderid", unique = true, nullable = false)
    public Integer getOrderid() {
        return this.orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "uid",referencedColumnName = "id")
    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
