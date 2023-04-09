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
import jakarta.persistence.UniqueConstraint;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Rental generated by hbm2java
 */
@Entity
@Table(name="rental"
    ,catalog="sakila"
    , uniqueConstraints = @UniqueConstraint(columnNames={"rental_date", "inventory_id", "customer_id"}) 
)
public class Rental  implements java.io.Serializable {


     private Integer rentalId;
     private Staff staff;
     private Inventory inventory;
     private Customer customer;
     private Timestamp rentalDate;
     private Timestamp returnDate;
     private Timestamp lastUpdate;
     private Set<Payment> payments = new HashSet<Payment>(0);

    public Rental() {
    }

	
    public Rental(Staff staff, Inventory inventory, Customer customer, Timestamp rentalDate, Timestamp lastUpdate) {
        this.staff = staff;
        this.inventory = inventory;
        this.customer = customer;
        this.rentalDate = rentalDate;
        this.lastUpdate = lastUpdate;
    }
    public Rental(Staff staff, Inventory inventory, Customer customer, Timestamp rentalDate, Timestamp returnDate, Timestamp lastUpdate, Set<Payment> payments) {
       this.staff = staff;
       this.inventory = inventory;
       this.customer = customer;
       this.rentalDate = rentalDate;
       this.returnDate = returnDate;
       this.lastUpdate = lastUpdate;
       this.payments = payments;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="rental_id", unique=true, nullable=false)
    public Integer getRentalId() {
        return this.rentalId;
    }
    
    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="staff_id", nullable=false)
    public Staff getStaff() {
        return this.staff;
    }
    
    public void setStaff(Staff staff) {
        this.staff = staff;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="inventory_id", nullable=false)
    public Inventory getInventory() {
        return this.inventory;
    }
    
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customer_id", nullable=false)
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="rental_date", nullable=false, length=19)
    public Timestamp getRentalDate() {
        return this.rentalDate;
    }
    
    public void setRentalDate(Timestamp rentalDate) {
        this.rentalDate = rentalDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="return_date", length=19)
    public Timestamp getReturnDate() {
        return this.returnDate;
    }
    
    public void setReturnDate(Timestamp returnDate) {
        this.returnDate = returnDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="last_update", nullable=false, length=19)
    public Timestamp getLastUpdate() {
        return this.lastUpdate;
    }
    
    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="rental")
    public Set<Payment> getPayments() {
        return this.payments;
    }
    
    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }




}

