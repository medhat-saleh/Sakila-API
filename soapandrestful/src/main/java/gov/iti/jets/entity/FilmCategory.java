package gov.iti.jets.entity;
// Generated Apr 10, 2023, 1:20:38 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.sql.Timestamp;

/**
 * FilmCategory generated by hbm2java
 */
@Entity
@Table(name="film_category"
    ,catalog="sakila"
)
public class FilmCategory  implements java.io.Serializable {


     private FilmCategoryId id;
     private Category category;
     private Film film;
     private Timestamp lastUpdate;

    public FilmCategory() {
    }

    public FilmCategory(FilmCategoryId id, Category category, Film film, Timestamp lastUpdate) {
       this.id = id;
       this.category = category;
       this.film = film;
       this.lastUpdate = lastUpdate;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="categoryId", column=@Column(name="category_id", nullable=false) ), 
        @AttributeOverride(name="filmId", column=@Column(name="film_id", nullable=false) ) } )
    public FilmCategoryId getId() {
        return this.id;
    }
    
    public void setId(FilmCategoryId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_id", nullable=false, insertable=false, updatable=false)
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="film_id", nullable=false, insertable=false, updatable=false)
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




}


