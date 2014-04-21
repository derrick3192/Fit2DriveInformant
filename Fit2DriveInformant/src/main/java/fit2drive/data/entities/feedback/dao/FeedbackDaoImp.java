package fit2drive.data.entities.feedback.dao;

import fit2drive.data.dao.DaoImp;
import fit2drive.data.entities.feedback.Feedback;
import fit2drive.data.entities.feedback.FeedbackData;

public class FeedbackDaoImp extends DaoImp<Feedback, FeedbackData> implements FeedbackDao {

	@Override
	public Class<Feedback> getEntityClass() {
		return Feedback.class;
	}

	@Override
	public Feedback createEntity(FeedbackData data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feedback createValidEntity() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
