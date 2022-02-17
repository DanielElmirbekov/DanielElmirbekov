package ideasevices.users_idea.dao;

import ideasevices.users_idea.models.enitites.Idea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaRepo extends JpaRepository<Idea,Long> {
}
