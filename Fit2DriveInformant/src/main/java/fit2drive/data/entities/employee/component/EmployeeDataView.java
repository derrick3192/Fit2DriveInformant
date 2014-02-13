/*
 * Created by JFormDesigner on Sun Jan 26 15:46:43 EST 2014
 */

package fit2drive.data.entities.employee.component;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.*;

import com.jgoodies.forms.factories.*;

import fit2drive.data.entities.employee.EmployeeData;
import fit2drive.data.members.address.view.*;

import org.jdesktop.beansbinding.*;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

import util.spring.gui.component.SIView;
import util.spring.gui.component.SView;

/**
 * @author derrick futschik
 */
public class EmployeeDataView extends SView<EmployeeData> {

	public EmployeeDataView() {
		initComponents();
	}
	
	public EmployeeData getData() {
		return new EmployeeData(
				getTitle(),
				getName(),
				getLastName(),
				getDob(),
				isMale(),
				getStreetNumber(),
				getUnit(),
				getStreetName(),
				getSuburb(),
				getPostcode(),
				getState(),
				getCountry(),
				getPicture(),
				getHomePhoneNumber(),
				getMobileNumber(),
				getWorkingChildrenNumber(),
				isFacilitator(),
				isLogisticsCoordinator(),
				isAdministrator(),
				isOther(),
				isPrinciple(),
				getEmail());
	}

	
	private boolean isPrinciple() {
		return this.chkPrincipal.isSelected();
	}

	public String getFirstName() {
		return this.txtFirstName.getText();
	}
	
	public String getLastName() {
		return this.txtLastName.getText();
	}
	
	public String getTitle() {
		return this.txtTitle.getText();
	}
	
	public boolean isMale() {
		return this.chkMale.isSelected();
	}
	
	public Date getDob() {
		return (Date) this.spinerDob.getValue();
	}
	
	public String getStreetNumber() {
		return this.addressDataView1.getStreetNumber();
	}
	
	public String getUnit() {
		return this.addressDataView1.getUnit();
	}
	
	public String getStreetName() {
		return this.addressDataView1.getStreetName();
	}
	
	public String getSuburb() {
		return this.addressDataView1.getSuburb();
	}
	
	public String getPostcode() {
		return this.addressDataView1.getPostcode();
	}
	
	public String getState() {
		return this.addressDataView1.getState();
	}
	
	public String getCountry() {
		return this.addressDataView1.getCountry();
	}
	 
	public String getWorkingChildrenNumber() {
		return this.txtWorkingWithChildrenNumber.getText();
	}
	
	public String getPicture() {
		return this.txtPicture.getText();
	}
	
	public String getMobileNumber() {
		return this.txtMobile.getText();
	}
	
	public String getHomePhoneNumber() {
		return this.txtHomePhone.getText();
	}
	
	public String getEmail() {
		return this.txtEmail.getText();
	}
	
	
	public boolean isFacilitator() {
		return this.chkFacilitator.isSelected();
	}
	
	public boolean isLogisticsCoordinator() {
		return this.chkLogisticsCoordinator.isSelected();
	}
	
	public boolean isPresentor() {
		return this.chkPresentor.isSelected();
	}
	
	public boolean isAdministrator() {
		return this.chkAdministrator.isSelected();
	}
	
	public boolean isMfb() {
		return this.chkMfb.isSelected();
	}
	
	public boolean isPolice() {
		return this.chkPolice.isSelected();
	}
	
	public boolean isOther() {
		return this.chkOther.isSelected();
	}
	
	
	public void addBtnReadyActionListener(ActionListener al) {
		this.btnReady.addActionListener(al);
	}

	
	
	


	
	
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner non-commercial license
		panel1 = new JPanel();
		label5 = new JLabel();
		txtFirstName = new JTextField();
		label7 = new JLabel();
		txtLastName = new JTextField();
		label9 = new JLabel();
		txtTitle = new JTextField();
		label1 = new JLabel();
		chkMale = new JCheckBox();
		label6 = new JLabel();
		spinerDob = new JSpinner();
		label2 = new JLabel();
		chkFemale = new JCheckBox();
		addressDataView1 = new AddressDataView();
		panel2 = new JPanel();
		panel4 = new JPanel();
		label13 = new JLabel();
		label12 = new JLabel();
		label11 = new JLabel();
		txtMobile = new JTextField();
		txtHomePhone = new JTextField();
		txtEmail = new JTextField();
		txtPicture = new JTextField();
		label8 = new JLabel();
		label14 = new JLabel();
		txtWorkingWithChildrenNumber = new JTextField();
		panel3 = new JPanel();
		label15 = new JLabel();
		chkFacilitator = new JCheckBox();
		label18 = new JLabel();
		chkAdministrator = new JCheckBox();
		label3 = new JLabel();
		chkPrincipal = new JCheckBox();
		label16 = new JLabel();
		chkLogisticsCoordinator = new JCheckBox();
		label19 = new JLabel();
		chkMfb = new JCheckBox();
		label17 = new JLabel();
		chkPresentor = new JCheckBox();
		label20 = new JLabel();
		chkPolice = new JCheckBox();
		label21 = new JLabel();
		chkOther = new JCheckBox();
		panel5 = new JPanel();
		chkAccept = new JCheckBox();
		btnReady = new JButton();

		//======== this ========
		setLayout(new BorderLayout());

		//======== panel1 ========
		{
			panel1.setBorder(new CompoundBorder(
				new TitledBorder("Details"),
				Borders.DLU2_BORDER));
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 87, 79, 0, 108, 0, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label5 ----
			label5.setText("First Name");
			panel1.add(label5, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));
			panel1.add(txtFirstName, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));

			//---- label7 ----
			label7.setText("Last Name");
			panel1.add(label7, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));
			panel1.add(txtLastName, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));

			//---- label9 ----
			label9.setText("Title");
			panel1.add(label9, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));
			panel1.add(txtTitle, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));

			//---- label1 ----
			label1.setText("Male");
			panel1.add(label1, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));
			panel1.add(chkMale, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));

			//---- label6 ----
			label6.setText("Date of Birth");
			panel1.add(label6, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));

			//---- spinerDob ----
			spinerDob.setModel(new SpinnerDateModel(new java.util.Date(1390721160000L), null, null, java.util.Calendar.DAY_OF_MONTH));
			panel1.add(spinerDob, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));

			//---- label2 ----
			label2.setText("Female");
			panel1.add(label2, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));
			panel1.add(chkFemale, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 10), 0, 0));
		}
		add(panel1, BorderLayout.NORTH);
		add(addressDataView1, BorderLayout.CENTER);

		//======== panel2 ========
		{
			panel2.setBorder(new CompoundBorder(
				new TitledBorder("Contact"),
				Borders.DLU2_BORDER));
			panel2.setLayout(new GridBagLayout());
			((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {0, 0};
			((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
			((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {1.0, 1.0E-4};
			((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

			//======== panel4 ========
			{
				panel4.setLayout(new GridBagLayout());
				((GridBagLayout)panel4.getLayout()).columnWidths = new int[] {0, 294, 0};
				((GridBagLayout)panel4.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0};
				((GridBagLayout)panel4.getLayout()).columnWeights = new double[] {0.0, 1.0, 1.0E-4};
				((GridBagLayout)panel4.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

				//---- label13 ----
				label13.setText("Email");
				panel4.add(label13, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 5), 0, 0));

				//---- label12 ----
				label12.setText("Home Phone");
				panel4.add(label12, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- label11 ----
				label11.setText("Mobile Phone");
				panel4.add(label11, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));
				panel4.add(txtMobile, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 0), 0, 0));
				panel4.add(txtHomePhone, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 0), 0, 0));
				panel4.add(txtEmail, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
				panel4.add(txtPicture, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 0), 0, 0));

				//---- label8 ----
				label8.setText("Picture");
				panel4.add(label8, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- label14 ----
				label14.setText("Working with Children");
				panel4.add(label14, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));
				panel4.add(txtWorkingWithChildrenNumber, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 0), 0, 0));
			}
			panel2.add(panel4, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 0), 0, 0));

			//======== panel3 ========
			{
				panel3.setBorder(new CompoundBorder(
					new TitledBorder("Admin"),
					Borders.DLU2_BORDER));
				panel3.setLayout(new GridBagLayout());
				((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0};
				((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
				((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
				((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

				//---- label15 ----
				label15.setText("Facilitator");
				panel3.add(label15, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));
				panel3.add(chkFacilitator, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- label18 ----
				label18.setText("Administrator");
				panel3.add(label18, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));
				panel3.add(chkAdministrator, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- label3 ----
				label3.setText("Principal");
				panel3.add(label3, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));
				panel3.add(chkPrincipal, new GridBagConstraints(5, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 0), 0, 0));

				//---- label16 ----
				label16.setText("Logistics Coordinator");
				panel3.add(label16, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));
				panel3.add(chkLogisticsCoordinator, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- label19 ----
				label19.setText("MFB");
				panel3.add(label19, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));
				panel3.add(chkMfb, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 5, 5), 0, 0));

				//---- label17 ----
				label17.setText("Presentor");
				panel3.add(label17, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 5), 0, 0));
				panel3.add(chkPresentor, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 5), 0, 0));

				//---- label20 ----
				label20.setText("Police");
				panel3.add(label20, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 5), 0, 0));
				panel3.add(chkPolice, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 5), 0, 0));

				//---- label21 ----
				label21.setText("Other");
				panel3.add(label21, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 5), 0, 0));
				panel3.add(chkOther, new GridBagConstraints(5, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
			}
			panel2.add(panel3, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 15, 0), 0, 0));

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
			panel2.add(panel5, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 0), 0, 0));
		}
		add(panel2, BorderLayout.SOUTH);

		//---- buttonGroup1 ----
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(chkMale);
		buttonGroup1.add(chkFemale);

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
	private JPanel panel1;
	private JLabel label5;
	private JTextField txtFirstName;
	private JLabel label7;
	private JTextField txtLastName;
	private JLabel label9;
	private JTextField txtTitle;
	private JLabel label1;
	private JCheckBox chkMale;
	private JLabel label6;
	private JSpinner spinerDob;
	private JLabel label2;
	private JCheckBox chkFemale;
	private AddressDataView addressDataView1;
	private JPanel panel2;
	private JPanel panel4;
	private JLabel label13;
	private JLabel label12;
	private JLabel label11;
	private JTextField txtMobile;
	private JTextField txtHomePhone;
	private JTextField txtEmail;
	private JTextField txtPicture;
	private JLabel label8;
	private JLabel label14;
	private JTextField txtWorkingWithChildrenNumber;
	private JPanel panel3;
	private JLabel label15;
	private JCheckBox chkFacilitator;
	private JLabel label18;
	private JCheckBox chkAdministrator;
	private JLabel label3;
	private JCheckBox chkPrincipal;
	private JLabel label16;
	private JCheckBox chkLogisticsCoordinator;
	private JLabel label19;
	private JCheckBox chkMfb;
	private JLabel label17;
	private JCheckBox chkPresentor;
	private JLabel label20;
	private JCheckBox chkPolice;
	private JLabel label21;
	private JCheckBox chkOther;
	private JPanel panel5;
	private JCheckBox chkAccept;
	private JButton btnReady;
	private BindingGroup bindingGroup;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
