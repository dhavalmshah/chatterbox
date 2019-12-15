package in.smoothline.chatterbox.controller;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import in.smoothline.chatterbox.repository.ServerAdministrationRepository;



@Controller
@RequestMapping(value = "/server-administration")
public class ServerAdministrationController {

//	@Autowired
//	ServerAdministrationDAO serverAdministrationDao;
//	
	
	@Autowired
	ServerAdministrationRepository serverAdministrationRepository;
	
	@RequestMapping(value = "/.well-known", method = { RequestMethod.GET })
	@ResponseBody
	public String wellKnownJson() {
		Reader reader = null;
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = null;
		try {
			reader = new FileReader("well-known.json");
			jsonObject = (JSONObject) parser.parse(reader);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return (jsonObject.toString());
	}
	
	@RequestMapping(value = "/whois", method = {RequestMethod.GET})
	@ResponseBody
	public String whoIs(@RequestHeader("access_token") String access_token, @RequestParam("userId") String userId) {
	
		
		String isAdmin = serverAdministrationRepository.isAdmin(access_token);
		
		if (isAdmin.equals("false"))
			return ("Unauthorized access. Please ensure that you are the admin!");
		
		
		
		//System.out.println("Result is" + isAdmin);
		return ("Result is" + isAdmin);
	}
}
