package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@RequestMapping("/")
	public String index() {
		return "test/test";
	}
	
	
	@RequestMapping(value = "/ajax" , method = RequestMethod.POST)
	public @ResponseBody int ajaxTest(String inputNum) {
		if (inputNum == null || inputNum.length() == 0) {
			return 0;
		}
		int result = Integer.parseInt(inputNum) * 2;
		return result;
	}
	
//	@RequestMapping(value = "/ajax" , method = RequestMethod.POST)
//	public @ResponseBody boolean ajaxTest(String inputNum) {
//		if (inputNum == null || inputNum.length() == 0) {
//			return false;
//		}
//		
//		return true;
//	}
    
    

}