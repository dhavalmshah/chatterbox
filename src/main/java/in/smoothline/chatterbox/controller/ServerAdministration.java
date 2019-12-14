package in.smoothline.chatterbox.controller;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/server-administration")
public class ServerAdministration {

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
}
