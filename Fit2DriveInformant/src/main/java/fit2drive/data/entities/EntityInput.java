package fit2drive.data.entities;

import java.util.ArrayList;
import java.util.List;

import org.jdesktop.beansbinding.Binding;

import fit2drive.data.bindings.BindableObject;

/**
 * @author Derrick
 * 
 * Class which can be used as input to a bean to create a new instance
 *
 * @param <E>
 */
public abstract class EntityInput<E extends F2DEntity> extends BindableObject {
	
	
	@SuppressWarnings("rawtypes")
	protected List<Binding> bindings = new ArrayList<>();
	
	
	/** Method to return whether or not the input for the entity is infact valid. **/
	public boolean isValid() {
		return false;
	}
	
	/** Method to create a new instance internally. **/
	protected abstract E createNewInstancePrivate();
	
	/** Method get a new Instance from the <code>EntityInput</code> **/
	public E getNewInstance() {
		if (isValid()) {
			try {
			return createNewInstancePrivate();
			} catch (Exception e) {
				assert(false);
				return null;
			}
		} else {
			throw new IllegalStateException("Bean is in an invalid state");
		}
	}
	
	
}
