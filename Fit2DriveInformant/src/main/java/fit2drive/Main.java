package fit2drive;


import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.reflections.Reflections;
import org.reflections.util.ConfigurationBuilder;
import org.reflections.util.FilterBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml.sax.SAXException;

import fit2drive.data.entities.F2DEntity;
import fit2drive.data.entities.employee.Employee;
import fit2drive.data.entities.employee.component.EmployeeOpenEvent;
import fit2drive.data.entities.employee.dao.EmployeeDaoImp;
import fit2drive.data.entities.employee.table.EmployeeTable;
import fit2drive.data.members.address.Address;

@SuppressWarnings({ "unused", "resource" })
public class Main {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		
		MainBean mainBean = ctx.getBean(MainBean.class);
		
		EmployeeDaoImp dao = ctx.getBean(EmployeeDaoImp.class);
		
		Employee employee = new Employee(
				"sim",
				new Date(),
				new Address(
						"glebe",
						"cheltenham",
						3192));
		
		dao.save(employee);
		
		EmployeeTable table = new EmployeeTable(dao);
		
		mainBean.start();
	}
}
