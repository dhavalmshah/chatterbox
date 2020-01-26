package in.smoothline.chatterbox.controller;

import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.smoothline.chatterbox.service.CircleUserProfileService;
import in.smoothline.chatterbox.vo.CircleUserProfile;
import in.smoothline.chatterbox.vo.UserProfile;



@Controller
@RequestMapping(value = "/user")
class UserProfileController
{
    @Autowired
    CircleUserProfileService circleUserProfileService;

    @PostMapping(value = "/register")
    @ResponseBody
    public String registerUser()
    {
        UserProfile up = new UserProfile();
        return "";
    }

    @PostMapping(value = "/createCircleUserProfile")
    @ResponseBody
    public String createCircleUserProfile()
    {
        return "";
    }

     @GetMapping(value = "/fetchCircleUserProfile")
    @ResponseBody
    public String fetchCircleUserProfile(@RequestParam String userId, @RequestParam String accessToken)
    {
        
        if (!accessToken.equals("qwerty"))
            return "Invalid access token.";
        String circleUserProfile = circleUserProfileService.fetchCircleUserProfileService(userId);
        
        return circleUserProfile;
    }

}