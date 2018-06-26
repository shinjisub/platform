package com.plat.platform;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	
	@Resource(name = "testDao")
	private TestDAO testDao;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		
		/*������ �׽�Ʈ�� ��������*/
		int  m = testDao.TestDAO();
		System.out.println("������ ������ : "+m);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}
