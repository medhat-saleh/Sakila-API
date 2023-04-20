package gov.iti.jets.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.FilmActorIddto;
import gov.iti.jets.entity.FilmActorId;

@Mapper
public interface FilmActorIdMapper {
    FilmActorIdMapper INSTANCE = Mappers.getMapper(FilmActorIdMapper.class);
    public FilmActorIddto todto(FilmActorId object );
    public FilmActorId toentity(FilmActorIddto actordto);
}
