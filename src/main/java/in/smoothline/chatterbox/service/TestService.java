package in.smoothline.chatterbox.service;

import org.springframework.stereotype.Component;

@Component
public class TestService 
{
    public String mockService()
    {
    		System.out.println("ON");
        return "Hello world";
    }
}