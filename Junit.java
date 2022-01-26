package Pooja.junitclass;


import org.junit.Test;

import Pooja.businesslogic.Service;

 

public class Junit {

	@Test
	public void testwriteToFileAndDisplayToConsoleTest()
	{
		Service service = new Service();
		String webSiteName = "https://www.facebook.com/";
		service.readingWebsitePage(webSiteName);
	}
}
