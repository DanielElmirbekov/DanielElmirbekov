package ideasevices.users_idea.mappers;

import ideasevices.users_idea.models.dtos.IdeaDTO;
import ideasevices.users_idea.models.enitites.Idea;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface IdeaMapper {
    IdeaMapper INSTANCE = Mappers.getMapper(IdeaMapper.class);

    @Mapping(source = "ideaDto.phone",target = "phone_user")

    Idea ideaDtoToIdea (IdeaDTO ideaDTO);
    IdeaDTO ideaToIdeaDto(Idea idea);
}
