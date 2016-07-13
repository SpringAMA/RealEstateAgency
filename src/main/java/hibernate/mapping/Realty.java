package hibernate.mapping;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Maks on 13.07.2016.
 */
@Entity
public class Realty {

    private String id;
    private double price;
    private double area;
    private double utilityPrice;
    private int roomAmount;
    private String description;
    private Address address;
    private Contact contact;
    private Type type;

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

    @OneToOne(mappedBy = "realty", cascade = CascadeType.ALL)
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address addressId) {
        this.address = addressId;
    }


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contactId")
    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contactId) {
        this.contact = contactId;
    }

    @ManyToOne
    @JoinColumn(name = "typeId")
    public Type getType() {
        return type;
    }

    public void setType(Type typeId) {
        this.type = typeId;
    }
}
