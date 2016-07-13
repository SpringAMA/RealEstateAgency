package hibernate.mapping;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Maks on 13.07.2016.
 */
@Entity
public class Contact {
    private String id;
    private String userId;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
