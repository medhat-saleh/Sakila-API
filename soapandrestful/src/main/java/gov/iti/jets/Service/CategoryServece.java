package gov.iti.jets.Service;

import java.util.List;
import java.util.Set;

import gov.iti.jets.DAOS.GenericDao;
import gov.iti.jets.DTOS.Categorydto;
import gov.iti.jets.Mapper.CategoryMapper;
import gov.iti.jets.Mapper.FilmCategoryMapper;
import gov.iti.jets.entity.Category;


public class CategoryServece {
    GenericDao dao = new GenericDao<Category>(Category.class);

    public Categorydto getCategoryById(int id) {
        Category category=(Category) dao.findById(id);
        System.out.println(category);
        Categorydto categorydto  = CategoryMapper.INSTANCE.todto(category);

        categorydto.setFilmCategoriesdto(category.getFilmCategories().stream().map(film->FilmCategoryMapper.INSTANCE.todto(film)).toList());

        return categorydto;
    }

    public List<Categorydto> getAllCategories() {

        return dao.getAll(Category.class).stream().map(category -> CategoryMapper.INSTANCE.todto((Category) category)).toList();

    }

    public boolean updateCategory(Categorydto categorydto) {

        Category category=(Category) (CategoryMapper.INSTANCE.toentity(categorydto));
         category.setFilmCategories((Set)categorydto.getFilmCategoriesdto().stream().map(film-> FilmCategoryMapper.INSTANCE.toentity(film)).toList());
        return dao.update(category);
    }

    public boolean DeleteCategoryById(int inventoryid) {
        return dao.delete(inventoryid);
    }

    public Categorydto AddCategory(Categorydto categorydto) {

        Category category=(Category) (CategoryMapper.INSTANCE.toentity(categorydto));
        category.setFilmCategories((Set)categorydto.getFilmCategoriesdto().stream().map(film-> FilmCategoryMapper.INSTANCE.toentity(film)).toList());
        return CategoryMapper.INSTANCE.todto((Category)dao.insert(category));
    }

    
}
