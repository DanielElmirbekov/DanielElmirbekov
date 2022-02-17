package ideasevices.users_idea.models.dtos;

import lombok.Data;
import org.apache.tomcat.jni.User;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class IdeaDTO {

    Long id;
    String title;
    String text;
    boolean contactWithMe;
    String phone;
}
