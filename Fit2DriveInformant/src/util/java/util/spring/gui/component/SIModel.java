package util.spring.gui.component;




/**
 * @author Derrick
 *
 * Model to be used with the SComponent Configuration.
 */
public interface SIModel<Data> {
	
	/** Method to save the entity **/
	public boolean saveEntity(Data data);

}
