package ideasevices.users_idea.services.impl;

import ideasevices.users_idea.dao.IdeaRepo;
import ideasevices.users_idea.mappers.IdeaMapper;
import ideasevices.users_idea.models.dtos.IdeaDTO;
import ideasevices.users_idea.models.enitites.Idea;
import ideasevices.users_idea.services.IdeaService;
import org.springframework.stereotype.Service;

@Service
public class IdeaServiceImpl implements IdeaService {

    private IdeaRepo ideaRepo;

    public IdeaServiceImpl(IdeaRepo ideaRepo) {
        this.ideaRepo = ideaRepo;
    }

    @Override
    public IdeaDTO save(IdeaDTO ideaDTO){
        Idea idea = IdeaMapper.INSTANCE.ideaDtoToIdea(ideaDTO);
        idea =ideaRepo.save(idea);
        return IdeaMapper.INSTANCE.ideaToIdeaDto(idea);
    }

}
