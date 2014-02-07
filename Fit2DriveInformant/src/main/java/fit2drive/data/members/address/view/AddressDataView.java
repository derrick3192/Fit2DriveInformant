/*
 * Created by JFormDesigner on Sun Jan 26 16:10:07 EST 2014
 */

package fit2drive.data.members.address.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

import fit2drive.data.members.address.AddressData;



/**
 * @author derrick futschik
 */
public class AddressDataView extends JPanel {

	private static final long serialVersionUID = 1L;

	public AddressDataView() {
		initComponents();
	}
	
	
	public AddressData getAddressData() {
		return new AddressData(
				getStreetNumber(),
				getUnit(),
				getStreetName(),
				getSuburb(),
				getPostcode(),
				getState(),
				getCountry());
	}
	
	public String getStreetNumber() {
		return txtStreetNumber.getText();
	}
	
	public String getUnit() {
		return txtUnit.getText();
	}
	
	public String getStreetName() {
		return txtStreetName.getText();
	}
	
	public String getSuburb() {
		return txtSuburb.getText();
	}
	
	public String getPostcode() {
		return txtPostcode.getText();
	}
	
	public String getState() {
		return txtState.getText();
	}
	
	public String getCountry() {
		return txtCountry.getText();
	}
	



	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner non-commercial license
		label1 = new JLabel();
		txtStreetNumber = new JTextField();
		label2 = new JLabel();
		txtUnit = new JTextField();
		label3 = new JLabel();
		txtStreetName = new JTextField();
		label4 = new JLabel();
		txtSuburb = new JTextField();
		label5 = new JLabel();
		txtPostcode = new JTextField();
		label6 = new JLabel();
		txtState = new JTextField();
		label7 = new JLabel();
		txtCountry = new JTextField();

		//======== this ========
		setMinimumSize(new Dimension(390, 175));
		setBorder(new CompoundBorder(
				new TitledBorder("Address"),
				new EmptyBorder(5, 5, 5, 5)));
		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {59, 65, 41, 22, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 1.0, 0.0, 1.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

		//---- label1 ----
		label1.setText("Stree No");
		add(label1, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 15), 0, 0));
		add(txtStreetNumber, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 15), 0, 0));

		//---- label2 ----
		label2.setText("Unit");
		add(label2, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 15), 0, 0));
		add(txtUnit, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 0), 0, 0));

		//---- label3 ----
		label3.setText("Street Name");
		add(label3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 15), 0, 0));
		add(txtStreetName, new GridBagConstraints(1, 2, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 0), 0, 0));

		//---- label4 ----
		label4.setText("Suburb");
		add(label4, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 15), 0, 0));
		add(txtSuburb, new GridBagConstraints(1, 3, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 0), 0, 0));

		//---- label5 ----
		label5.setText("Postcode");
		add(label5, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 15), 0, 0));
		add(txtPostcode, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 15), 0, 0));

		//---- label6 ----
		label6.setText("State");
		add(label6, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 15), 0, 0));
		add(txtState, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 0), 0, 0));

		//---- label7 ----
		label7.setText("Country");
		add(label7, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 15), 0, 0));
		add(txtCountry, new GridBagConstraints(1, 5, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 0), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner non-commercial license
	private JLabel label1;
	private JTextField txtStreetNumber;
	private JLabel label2;
	private JTextField txtUnit;
	private JLabel label3;
	private JTextField txtStreetName;
	private JLabel label4;
	private JTextField txtSuburb;
	private JLabel label5;
	private JTextField txtPostcode;
	private JLabel label6;
	private JTextField txtState;
	private JLabel label7;
	private JTextField txtCountry;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
