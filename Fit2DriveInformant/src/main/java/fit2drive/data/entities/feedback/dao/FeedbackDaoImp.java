package fit2drive.data.entities.feedback.dao;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.feedback.Feedback;

public class FeedbackDaoImp extends DaoImp<Feedback> implements FeedbackDao {

	@Override
	public Class<Feedback> getEntityClass() {
		return Feedback.class;
	}
	
}
