/*
 * Created by JFormDesigner on Tue Jan 28 00:41:18 EST 2014
 */

package fit2drive.data.entities.view;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

import com.jgoodies.forms.factories.*;

import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

/**
 * @author derrick futschik
 */
public class AgreePanel extends JPanel {
	
	public AgreePanel() {
		initComponents();
	}
	
	public void addBtnReadyActionListener(ActionListener al) {
		this.btnReady.addActionListener(al);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner non-commercial license
		panel5 = new JPanel();
		chkAccept = new JCheckBox();
		btnReady = new JButton();

		//======== this ========
		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {0, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

		//======== panel5 ========
		{
			panel5.setBorder(new CompoundBorder(
				new TitledBorder("Statement of agreement"),
				Borders.DLU2_BORDER));
			panel5.setLayout(new GridBagLayout());
			((GridBagLayout)panel5.getLayout()).columnWidths = new int[] {0, 0};
			((GridBagLayout)panel5.getLayout()).rowHeights = new int[] {0, 0, 0};
			((GridBagLayout)panel5.getLayout()).columnWeights = new double[] {0.0, 1.0E-4};
			((GridBagLayout)panel5.getLayout()).rowWeights = new double[] {0.0, 0.0, 1.0E-4};

			//---- chkAccept ----
			chkAccept.setText("I have supplied the correct information.");
			panel5.add(chkAccept, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- btnReady ----
			btnReady.setText("Ready");
			panel5.add(btnReady, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		add(panel5, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 0, 0), 0, 0));

		//---- bindings ----
		bindingGroup = new BindingGroup();
		bindingGroup.addBinding(Bindings.createAutoBinding(UpdateStrategy.READ_WRITE,
			chkAccept, BeanProperty.create("selected"),
			btnReady, BeanProperty.create("enabled")));
		bindingGroup.bind();
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner non-commercial license
	private JPanel panel5;
	private JCheckBox chkAccept;
	private JButton btnReady;
	private BindingGroup bindingGroup;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
