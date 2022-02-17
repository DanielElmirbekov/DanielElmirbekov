package ideasevices.users_idea.models.enitites;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Idea {
    @Id
    Long id;

    String title;
    String text;
    boolean contactWithMe;
    String phone_user;
    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;

}
