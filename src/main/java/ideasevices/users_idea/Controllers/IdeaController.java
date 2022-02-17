package ideasevices.users_idea.Controllers;

import ideasevices.users_idea.models.dtos.IdeaDTO;
import ideasevices.users_idea.services.IdeaService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdeaController {

    private IdeaService ideaService;

    public IdeaController(IdeaService ideaService) {

        this.ideaService = ideaService;
    }


    public IdeaDTO save(@RequestBody IdeaDTO IdeaDTO){
        return ideaService.save(IdeaDTO);
    }

}
