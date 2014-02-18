package util.spring.gui.component;

import util.spring.gui.publisher.SComponentType;
import fit2drive.data.dao.Dao;
import fit2drive.data.entities.F2DEntity;

public abstract class SComponent<ENTITY extends F2DEntity, DATA> extends SBaseComponent {

	Dao<ENTITY, DATA> dao;
	
	public SComponent(
			Dao<ENTITY, DATA> dao,
			SComponentType componentType) {
		super(componentType);
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

}
