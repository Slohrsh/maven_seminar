package XMLUtil;


import org.json.JSONObject;
import org.json.XML;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class Application {

   
    @RequestMapping(value="/json_to_xml", method = RequestMethod.POST)
    @ResponseBody
    String xmlToJson(@RequestParam(value="json") String json)
    {
    	JSONObject jsonObject = new JSONObject(json);
    	String xml = XML.toString(jsonObject); 
    	return xml;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}