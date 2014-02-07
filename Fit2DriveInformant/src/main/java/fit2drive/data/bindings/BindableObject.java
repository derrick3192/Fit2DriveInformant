package fit2drive.data.bindings;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * @author Derrick
 *
 * Class which allows property binding.
 */
public abstract class BindableObject {



	public BindableObject(){}

	/** Property Change Support **/
	private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

	/** Add a listener to the be notified whenever the properties of this bean changed .**/
	public void addPropertyChangeListener(
			PropertyChangeListener 
			listener) {
		changeSupport.addPropertyChangeListener(listener);
	}

	/** Remove a property listener. **/
	public void removePropertyChangeListener(
			PropertyChangeListener 
			listener) {
		changeSupport.removePropertyChangeListener(listener);
	}

	/** Add a property change listener to be notified only when a property has changed. **/
	public void addPropertyChangeListener(
			String propertyName,
			PropertyChangeListener listener) {
		changeSupport.addPropertyChangeListener(propertyName, listener);
	}

	/** Remove a property listener from a particular property. **/
	public void removePropertyChangeListener(
			String propertyName,
			PropertyChangeListener listener) {
		changeSupport.removePropertyChangeListener(propertyName, listener);
	}

	/** Fire than a property has changed. **/
	public void firePropertyChange(
			String propertyName, 
			Object oldValue,
			Object newValue) {
		changeSupport.firePropertyChange(propertyName, oldValue, newValue);
	}


}
