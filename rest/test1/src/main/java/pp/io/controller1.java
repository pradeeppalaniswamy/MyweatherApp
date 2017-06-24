package pp.io;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller1 {
	
	@RequestMapping(method=RequestMethod.GET,value="/getpp",produces=org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String getvalues()
	{
		return "gethu";
		
	}

}
