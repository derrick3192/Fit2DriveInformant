package util.spring.gui.component;

import org.springframework.context.ApplicationEvent;

public class SComponentEvent extends ApplicationEvent{
	
	final SComponentType componentType;
	final SEventType type;

	public SComponentEvent(Object source, SComponentType componentType, SEventType type) {
		super(source);
		
		this.componentType = componentType;
		this.type = type;
	}
	
	public SComponentType getComponentType() {
		return componentType;
	}
	
	public SEventType getSEventType() {
		return type;
	}

}
