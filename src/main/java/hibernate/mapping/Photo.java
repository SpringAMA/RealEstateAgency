package hibernate.mapping;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Maks on 13.07.2016.
 */
@Entity
public class Photo {
    private String id;
    private int fileId;
    private Realty realty;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getFileId() {
        return fileId;
    }

    public void setFileId(int fileId) {
        this.fileId = fileId;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "realtyId")
    public Realty getRealty() {
        return realty;
    }

    public void setRealty(Realty realty) {
        this.realty = realty;
    }

}
