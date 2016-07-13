package hibernate.mapping;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Maks on 24.06.2016.
 */

@Entity
public class Photo {
    private String id;
    private int fileID;
    private Realty realty;

    public Photo(int fileID, Realty realty) {
        this.fileID = fileID;
        this.realty = realty;
    }

    public Photo() {
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

    public int getFileID() {
        return fileID;
    }

    public void setFileID(int fileID) {
        this.fileID = fileID;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    public Realty getRealty() {
        return realty;
    }

    public void setRealty(Realty realty) {
        this.realty = realty;
    }
}
