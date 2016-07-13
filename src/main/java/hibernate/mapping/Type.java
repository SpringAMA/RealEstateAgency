package hibernate.mapping;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by Maks on 13.07.2016.
 */
@Entity
public class Type {
    private String id;
    private String name;
    @OneToMany(mappedBy = "realty")
    private Set<Realty> realtySet;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Realty> getRealtySet() {
        return realtySet;
    }

    public void setRealtySet(Set<Realty> realties) {
        this.realtySet = realties;
    }
}
