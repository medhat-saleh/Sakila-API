package gov.iti.jets.Controller.SoapControllers;

import java.util.List;
import gov.iti.jets.DTOS.Categorydto;
import gov.iti.jets.Service.CategoryServece;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;


@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class CategoryController {
    CategoryServece categoryServece = new CategoryServece();

   
    public Categorydto getCategoryById( Short id) {
        
            Categorydto categorydto = categoryServece.getCategoryById(id);
            return categorydto;
       
    }

    public List<Categorydto> getAllCategories() {
        
            List<Categorydto> categorydtos = categoryServece.getAllCategories();
        return categorydtos;  
    }

    public Categorydto addCategory(Categorydto categorydto) {
       
            return categoryServece.AddCategory(categorydto);
      

    }

    public boolean UpdateInventory(Categorydto categorydto) {
        
        return categoryServece.updateCategory(categorydto);
        
    }

    public boolean DeleteInventoryById( Short id) {
        
            return categoryServece.DeleteCategoryById(id);
        
    } 
}
