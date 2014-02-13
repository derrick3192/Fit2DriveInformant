/*
 * Created by JFormDesigner on Mon Jan 27 10:38:49 EST 2014
 */

package fit2drive.data.entities.school.component;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.*;

import util.spring.gui.component.SIView;

import com.jgoodies.forms.factories.*;

import fit2drive.data.entities.school.SchoolData;
import fit2drive.data.entities.view.*;
import fit2drive.data.members.address.view.*;

/**
 * @author derrick futschik
 */
public class SchoolDataView extends JPanel implements SIView<SchoolData> {

	
	public SchoolDataView() {
		initComponents();
	}
	
	public void addBtnReadyActionListener(ActionListener createBtnAction) {
		
	}
	
	
	public SchoolData getData() {
		return new SchoolData(
				txtName.getText(),
				txtEmail.getText(),
				txtPhone.getText(),
				chkPublic.isSelected(),
				chkPrivate.isSelected(),
				txtReligion.getText(),
				this.addressDataView1.getAddressData());
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner non-commercial license
		addressDataView1 = new AddressDataView();
		panel1 = new JPanel();
		label1 = new JLabel();
		txtName = new JTextField();
		label2 = new JLabel();
		txtEmail = new JTextField();
		label3 = new JLabel();
		txtPhone = new JTextField();
		label4 = new JLabel();
		chkPublic = new JCheckBox();
		label5 = new JLabel();
		chkPrivate = new JCheckBox();
		label6 = new JLabel();
		txtReligion = new JTextField();
		agreePanel1 = new AgreePanel();

		//======== this ========
		setLayout(new BorderLayout());
		add(addressDataView1, BorderLayout.CENTER);

		//======== panel1 ========
		{
			panel1.setBorder(new CompoundBorder(
				new TitledBorder("Details"),
				Borders.DLU2_BORDER));
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {112, 0, 77, 91, 0, 0, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label1 ----
			label1.setText("Name");
			panel1.add(label1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(txtName, new GridBagConstraints(1, 0, 5, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label2 ----
			label2.setText("Email");
			panel1.add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(txtEmail, new GridBagConstraints(1, 1, 5, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label3 ----
			label3.setText("Phone");
			panel1.add(label3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(txtPhone, new GridBagConstraints(1, 2, 5, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label4 ----
			label4.setText("Public");
			panel1.add(label4, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(chkPublic, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label5 ----
			label5.setText("Private");
			panel1.add(label5, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(chkPrivate, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label6 ----
			label6.setText("Religion");
			panel1.add(label6, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));
			panel1.add(txtReligion, new GridBagConstraints(1, 4, 5, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		add(panel1, BorderLayout.NORTH);
		add(agreePanel1, BorderLayout.SOUTH);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner non-commercial license
	private AddressDataView addressDataView1;
	private JPanel panel1;
	private JLabel label1;
	private JTextField txtName;
	private JLabel label2;
	private JTextField txtEmail;
	private JLabel label3;
	private JTextField txtPhone;
	private JLabel label4;
	private JCheckBox chkPublic;
	private JLabel label5;
	private JCheckBox chkPrivate;
	private JLabel label6;
	private JTextField txtReligion;
	private AgreePanel agreePanel1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
