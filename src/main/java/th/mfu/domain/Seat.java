package th.mfu.domain;

import javax.annotation.Generated;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class Seat {

    //TODO: add attributes and annotation for Id, GeneratedValue
    // - id (Long)
    // - number (String)
    // - zone (String)
    // - booked (boolean)

    //TODO: add many-to-one relationship to concert with cascade type CascadeType.MERGE
    
    //TODO: add getters and setters


}
