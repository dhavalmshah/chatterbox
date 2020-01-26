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

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreation_ts() {
        return creation_ts;
    }

    public void setCreation_ts(String creation_ts) {
        this.creation_ts = creation_ts;
    }

    public String getLast_modified_ts() {
        return last_modified_ts;
    }

    public void setLast_modified_ts(String last_modified_ts) {
        this.last_modified_ts = last_modified_ts;
    }

    public String getIs_admin() {
        return is_admin;
    }

    public void setIs_admin(String is_admin) {
        this.is_admin = is_admin;
    }

    public String getDeactivated() {
        return deactivated;
    }

    public void setDeactivated(String deactivated) {
        this.deactivated = deactivated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    
}