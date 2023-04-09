package gov.iti.jets.entity;
// Generated Apr 10, 2023, 1:20:38 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Inventory generated by hbm2java
 */
@Entity
@Table(name="inventory"
    ,catalog="sakila"
)
public class Inventory  implements java.io.Serializable {


     private Integer inventoryId;
     private Store store;
     private Film film;
     private Timestamp lastUpdate;
     private Set<Rental> rentals = new HashSet<Rental>(0);

    public Inventory() {
    }

	
    public Inventory(Store store, Film film, Timestamp lastUpdate) {
        this.store = store;
        this.film = film;
        this.lastUpdate = lastUpdate;
    }
    public Inventory(Store store, Film film, Timestamp lastUpdate, Set<Rental> rentals) {
       this.store = store;
       this.film = film;
       this.lastUpdate = lastUpdate;
       this.rentals = rentals;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="inventory_id", unique=true, nullable=false)
    public Integer getInventoryId() {
        return this.inventoryId;
    }
    
    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="store_id", nullable=false)
    public Store getStore() {
        return this.store;
    }
    
    public void setStore(Store store) {
        this.store = store;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="film_id", nullable=false)
    public Film getFilm() {
        return this.film;
    }
    
    public void setFilm(Film film) {
        this.film = film;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false, length=19)
    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="inventory")
    public Set<Rental> getRentals() {
        return this.rentals;
    }
    
    public void setRentals(Set<Rental> rentals) {
        this.rentals = rentals;
    }




}


