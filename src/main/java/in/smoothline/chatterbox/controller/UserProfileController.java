package in.smoothline.chatterbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.smoothline.chatterbox.service.CircleUserProfileService;
import in.smoothline.chatterbox.vo.CircleUserProfile;



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
       // UserProfile up = new UserProfile();
        return "";
    }

    @PostMapping(value = "/createCircleUserProfile", consumes = "application/json", produces = 
    "application/json")
    @ResponseBody
    public String createCircleUserProfile(@RequestParam CircleUserProfile circleUserProfile)
    {
        String message = null;

        int circleuserprofilecreated = circleUserProfileService.createCircleUserProfileService(circleUserProfile);
        
        System.out.println(" circle userprofile created " + circleuserprofilecreated);

        if(circleuserprofilecreated == 1)
        {
            message = "success";
        }else
        {
            message = "failure";
        }

        return message;
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