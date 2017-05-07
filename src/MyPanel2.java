import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MyPanel2 extends JPanel {
	public MyPanel2() {
		setBackground(SystemColor.textHighlight);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {1350};
		gridBagLayout.rowHeights = new int[] {700};
		gridBagLayout.columnWeights = new double[]{0.0};
		gridBagLayout.rowWeights = new double[]{0.0};
		setLayout(gridBagLayout);
		
		JButton btnNewButton_1 = new JButton("NORTH_WEST");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 0;
		add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnLabel = new JButton("NORTH");
		btnLabel.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_btnLabel = new GridBagConstraints();
		gbc_btnLabel.anchor = GridBagConstraints.NORTH;
		gbc_btnLabel.gridx = 0;
		gbc_btnLabel.gridy = 0;
		add(btnLabel, gbc_btnLabel);
		
		JButton btnLabel_1 = new JButton("EAST");
		btnLabel_1.setBackground(Color.YELLOW);
		GridBagConstraints gbc_btnLabel_1 = new GridBagConstraints();
		gbc_btnLabel_1.anchor = GridBagConstraints.EAST;
		gbc_btnLabel_1.gridx = 0;
		gbc_btnLabel_1.gridy = 0;
		add(btnLabel_1, gbc_btnLabel_1);
		
		JButton btnLabel_2 = new JButton("WEST");
		btnLabel_2.setBackground(Color.GREEN);
		GridBagConstraints gbc_btnLabel_2 = new GridBagConstraints();
		gbc_btnLabel_2.anchor = GridBagConstraints.WEST;
		gbc_btnLabel_2.gridx = 0;
		gbc_btnLabel_2.gridy = 0;
		add(btnLabel_2, gbc_btnLabel_2);
		
		JButton lblLabel = new JButton("CENTER");
		lblLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblLabel.setForeground(Color.BLACK);
		lblLabel.setBackground(Color.PINK);
		GridBagConstraints gbc_lblLabel = new GridBagConstraints();
		gbc_lblLabel.gridx = 0;
		gbc_lblLabel.gridy = 0;
		add(lblLabel, gbc_lblLabel);
		
		JButton btnNewButton = new JButton("SOUTH");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.SOUTH;
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2 = new JButton("NORTH_EAST");
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnNewButton_2.gridx = 0;
		gbc_btnNewButton_2.gridy = 0;
		add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnLabel_3 = new JButton("SOUTH_EAST");
		GridBagConstraints gbc_btnLabel_3 = new GridBagConstraints();
		gbc_btnLabel_3.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnLabel_3.gridx = 0;
		gbc_btnLabel_3.gridy = 0;
		add(btnLabel_3, gbc_btnLabel_3);
		
		JButton btnLabel_4 = new JButton("SOUTH_WEST");
		GridBagConstraints gbc_btnLabel_4 = new GridBagConstraints();
		gbc_btnLabel_4.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnLabel_4.gridx = 0;
		gbc_btnLabel_4.gridy = 0;
		add(btnLabel_4, gbc_btnLabel_4);
	}

}
