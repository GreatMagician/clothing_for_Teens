package shop.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by Alexander on 08.07.2017.
 * Заказ
 */
@Entity
@Table(name = "orders")
public class Order extends BaseEntity{

    @Column(name = "registered", columnDefinition = "timestamp default now()")
    private Date registered = new Date();

    @Column(name="status")
    private String status;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "orders_clothinglist", joinColumns = @JoinColumn(name = "orders_id"))
    @JoinColumn(name="clothing_id")
    private List<Clothing> clothingList;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_id", nullable = false)
    private User user;

    public Order() {
    }

    public Order(long id, Date registered, String status, List<Clothing> clothingList, User user) {
        this.id = id;
        this.registered = registered;
        this.status = status;
        this.clothingList = clothingList;
        this.user = user;
    }


    public Date getRegistered() {
        return registered;
    }

    public void setRegistered(Date registered) {
        this.registered = registered;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Clothing> getClothingList() {
        return clothingList;
    }

    public void setClothingList(List<Clothing> clothingList) {
        this.clothingList = clothingList;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
