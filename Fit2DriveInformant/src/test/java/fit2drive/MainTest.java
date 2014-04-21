package fit2drive;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	/**
	 * Test to see if the spring application is indeed starting.
	 */
	@Test
	public void testApplication() {

		try {

			ApplicationContext ctx = new ClassPathXmlApplicationContext(
					"Spring.xml");

			@SuppressWarnings("unused")
			LauncherBean launcherBean = ctx.getBean(LauncherBean.class);

			((ConfigurableApplicationContext) ctx).close();
		} catch (Exception e) {
			fail("The application failed");
		}
	}

}
