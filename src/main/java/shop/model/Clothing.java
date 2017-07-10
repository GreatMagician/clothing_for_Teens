package shop.model;

import javax.persistence.*;

/**
 * Created by Alexander on 08.07.2017.
 * Одежда
 */
@Entity
@Table(name = "clothing")
public class Clothing extends BaseEntity{

    @Column(name="name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="imagePath")
    private String imagePath;

    @Column(name="price")
    private int price;

    public Clothing() {
    }

    public Clothing(long id, String name, String description, String imagePath, int price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imagePath = imagePath;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
