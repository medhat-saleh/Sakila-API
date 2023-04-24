package gov.iti.jets.Mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.FilmActordto;
import gov.iti.jets.entity.FilmActor;

@Mapper
public interface FilmActorMapper {
    FilmActorMapper INSTANCE = Mappers.getMapper(FilmActorMapper.class);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    public FilmActordto todto(FilmActor object );
    public FilmActor toentity(FilmActordto actordto);
    // @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    // FilmActor partialUpdate(FilmActordto actorDto, @MappingTarget FilmActor actor);

}
