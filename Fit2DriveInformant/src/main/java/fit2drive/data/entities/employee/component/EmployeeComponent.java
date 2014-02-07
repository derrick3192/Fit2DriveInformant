package fit2drive.data.entities.employee.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;

import fit2drive.data.entities.employee.dao.EmployeeDao;



public class EmployeeComponent implements ApplicationListener<EmployeeOpenEvent> {
	
	@Autowired
	EmployeeDao dao;

	@Override
	public void onApplicationEvent(EmployeeOpenEvent arg0) {
		EmployeeDataView view = new EmployeeDataView();
		EmployeeModel model = new EmployeeModel(dao);
		EmployeeController controller = new EmployeeController(model, view);
		controller.run();
	}
	
	

}
