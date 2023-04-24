package gov.iti.jets.Mapper;

import gov.iti.jets.DTOS.Categorydto;
import gov.iti.jets.entity.Category;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-24T08:42:50+0200",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Categorydto todto(Category category) {
        if ( category == null ) {
            return null;
        }

        Categorydto categorydto = new Categorydto();

        categorydto.setCategoryId( category.getCategoryId() );
        categorydto.setName( category.getName() );
        categorydto.setLastUpdate( category.getLastUpdate() );

        return categorydto;
    }

    @Override
    public Category toentity(Categorydto categorydto) {
        if ( categorydto == null ) {
            return null;
        }

        Category category = new Category();

        category.setCategoryId( categorydto.getCategoryId() );
        category.setName( categorydto.getName() );
        category.setLastUpdate( categorydto.getLastUpdate() );

        return category;
    }
}
