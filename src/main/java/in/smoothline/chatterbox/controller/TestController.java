package in.smoothline.chatterbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import in.smoothline.chatterbox.service.TestService;


@Controller
@RequestMapping(value = "/test")
class TestController
{
@Autowired
TestService ts; 

    @RequestMapping(value = "/v1")
    public String callTestService()
    {
        return ts.mockService();
    }
}