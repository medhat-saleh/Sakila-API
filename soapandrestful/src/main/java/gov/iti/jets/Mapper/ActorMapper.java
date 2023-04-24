package gov.iti.jets.Mapper;

import java.util.Collection;

import org.hibernate.mapping.List;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import gov.iti.jets.DTOS.ActorDTO.ActorFilmdto;
import gov.iti.jets.DTOS.ActorDTO.Actordto;
import gov.iti.jets.entity.Actor;
import gov.iti.jets.entity.Film;


@Mapper
public interface ActorMapper {
    ActorMapper INSTANCE = Mappers.getMapper(ActorMapper.class);
    public Actordto todto(Actor actor );
    public Actor toentity(Actordto actordto);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    java.util.List<ActorFilmdto> collectionToDto(Collection<Film> filmActor);
    
}
