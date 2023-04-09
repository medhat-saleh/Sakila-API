package gov.iti.jets.entity;
// Generated Apr 10, 2023, 1:20:38 AM by Hibernate Tools 6.1.7.Final


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.math.BigDecimal;

/**
 * SalesByStoreId generated by hbm2java
 */
@Embeddable
public class SalesByStoreId  implements java.io.Serializable {


     private String manager;
     private String store;
     private BigDecimal totalSales;

    public SalesByStoreId() {
    }

    public SalesByStoreId(String manager, String store, BigDecimal totalSales) {
       this.manager = manager;
       this.store = store;
       this.totalSales = totalSales;
    }
   


    @Column(name="manager", length=91)
    public String getManager() {
        return this.manager;
    }
    
    public void setManager(String manager) {
        this.manager = manager;
    }


    @Column(name="store", length=101)
    public String getStore() {
        return this.store;
    }
    
    public void setStore(String store) {
        this.store = store;
    }


    @Column(name="total_sales", precision=27, scale=2)
    public BigDecimal getTotalSales() {
        return this.totalSales;
    }
    
    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SalesByStoreId) ) return false;
		 SalesByStoreId castOther = ( SalesByStoreId ) other; 
         
		 return ( (this.getManager()==castOther.getManager()) || ( this.getManager()!=null && castOther.getManager()!=null && this.getManager().equals(castOther.getManager()) ) )
 && ( (this.getStore()==castOther.getStore()) || ( this.getStore()!=null && castOther.getStore()!=null && this.getStore().equals(castOther.getStore()) ) )
 && ( (this.getTotalSales()==castOther.getTotalSales()) || ( this.getTotalSales()!=null && castOther.getTotalSales()!=null && this.getTotalSales().equals(castOther.getTotalSales()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getManager() == null ? 0 : this.getManager().hashCode() );
         result = 37 * result + ( getStore() == null ? 0 : this.getStore().hashCode() );
         result = 37 * result + ( getTotalSales() == null ? 0 : this.getTotalSales().hashCode() );
         return result;
   }   


}


