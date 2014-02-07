package fit2drive.data.entities.school.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationListener;

import fit2drive.data.entities.school.dao.SchoolDao;

public class SchoolComponent implements ApplicationListener<ApplicationEvent> {
	
	@Autowired
	SchoolDao dao;
	
	@Autowired
	ApplicationEventPublisher publisher;
	
	SchoolController controller = null;

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// TODO Auto-generated method stub
		
	}
	

}
