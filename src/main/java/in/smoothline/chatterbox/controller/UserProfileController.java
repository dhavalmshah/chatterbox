package in.smoothline.chatterbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
}