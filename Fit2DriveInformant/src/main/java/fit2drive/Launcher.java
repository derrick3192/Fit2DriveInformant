package fit2drive;


import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml.sax.SAXException;

public class Launcher {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {

		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		
		LauncherBean launcherBean = ctx.getBean(LauncherBean.class);
		launcherBean.start();
	}
}
