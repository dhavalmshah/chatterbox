package in.smoothline.chatterbox.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class UserProfile
{
    
    private String user_id;
    private String password;
    private String creation_ts;
    private String last_modified_ts;
    private String is_admin;
    private String deactivated;
    private String email;
    private String mobile;
}