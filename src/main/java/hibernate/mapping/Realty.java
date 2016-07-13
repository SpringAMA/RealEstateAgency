package hibernate.mapping;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Maks on 24.06.2016.
 */
@Entity
public class Realty {

    private String id;
    private double price;
    private double area;
    private double utilityPrice;
    private int telephoneNumb;
    private int roomAmount;
    private String description;

    public Realty(double price, double area, double utilityPrice, int telephoneNumb, int roomAmount, String description) {
        this.price = price;
        this.area = area;
        this.utilityPrice = utilityPrice;
        this.telephoneNumb = telephoneNumb;
        this.roomAmount = roomAmount;
        this.description = description;
    }

    public Realty() {
    }

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String getId() {
        return id;
    }

    public void setId(String ID) {
        this.id = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getUtilityPrice() {
        return utilityPrice;
    }

    public void setUtilityPrice(double utilityPrice) {
        this.utilityPrice = utilityPrice;
    }

    public int getTelephoneNumb() {
        return telephoneNumb;
    }

    public void setTelephoneNumb(int telephoneNumb) {
        this.telephoneNumb = telephoneNumb;
    }

    public int getRoomAmount() {
        return roomAmount;
    }

    public void setRoomAmount(int roomAmount) {
        this.roomAmount = roomAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
