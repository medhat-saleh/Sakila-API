package gov.iti.jets.entity;
// Generated Apr 10, 2023, 1:20:38 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * ActorInfo generated by hbm2java
 */
@Entity
@Table(name="actor_info"
    ,catalog="sakila"
)
public class ActorInfo  implements java.io.Serializable {


     private ActorInfoId id;

    public ActorInfo() {
    }

    public ActorInfo(ActorInfoId id) {
       this.id = id;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="actorId", column=@Column(name="actor_id", nullable=false) ), 
        @AttributeOverride(name="filmInfo", column=@Column(name="film_info", length=65535) ), 
        @AttributeOverride(name="firstName", column=@Column(name="first_name", nullable=false, length=45) ), 
        @AttributeOverride(name="lastName", column=@Column(name="last_name", nullable=false, length=45) ) } )
    public ActorInfoId getId() {
        return this.id;
    }
    
    public void setId(ActorInfoId id) {
        this.id = id;
    }




}


