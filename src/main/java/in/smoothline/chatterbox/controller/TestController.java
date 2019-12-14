package in.smoothline.chatterbox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import in.smoothline.chatterbox.service.TestService;


@Controller
@RequestMapping(value = "/test")
class TestController
{
@Autowired
TestService ts; 

    @RequestMapping(value = "/v1")
    @ResponseBody

    public String callTestService()
    {
        return ts.mockService();
    }
}