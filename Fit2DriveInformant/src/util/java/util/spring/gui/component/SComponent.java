package util.spring.gui.component;

import org.springframework.context.ApplicationEvent;

import fit2drive.data.dao.Dao;
import fit2drive.data.entities.F2DEntity;

public abstract class SComponent<ENTITY extends F2DEntity, DATA> extends SBaseComponent {

	Class<ApplicationEvent> open;
	Class<ApplicationEvent> close;
	Dao<ENTITY, DATA> dao;
	
	public SComponent(
			Class<ApplicationEvent> open, 
			Class<ApplicationEvent> close,
			Dao<ENTITY, DATA> dao) {
		this.open = open;
		this.close = close;
		this.dao = dao;
	}
	
	@Override
	protected SBaseController createController() {
		return new SController<DATA, SIModel<DATA>, SIView<DATA>>(createModel(), createView()) {
		};
	}
	
	protected SModel<ENTITY, DATA> createModel() {
		return new SModel<ENTITY, DATA>(dao);
	}
	
	abstract protected SIView<DATA> createView();

	@Override
	protected Class<?> closeClass() {
		return this.close;
	}

	@Override
	protected Class<?> openClass() {
		return this.open;
	}

}
