package ideasevices.users_idea.models.enitites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    Long id;
    String phone;
}
