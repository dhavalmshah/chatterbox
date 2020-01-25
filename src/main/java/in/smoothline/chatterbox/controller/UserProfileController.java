package in.smoothline.chatterbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/user")
class UserProfileController
{

    @RequestMapping(value = "/register")
    @ResponseBody
    public String registerUser()
    {
        return "";
    }

    @RequestMapping(value = "/createCircleUserProfile")
    @ResponseBody
    public String createCircleUserProfile()
    {
        return "";
    }
}