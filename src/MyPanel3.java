import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MyPanel3 extends JPanel {
	public MyPanel3() {
		setBackground(SystemColor.textHighlight);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {100, 100, 100};
		gridBagLayout.rowHeights = new int[] {100, 100, 100};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0};
		setLayout(gridBagLayout);
		
		JButton btnNewButton_1 = new JButton("NORTH_WEST");
		btnNewButton_1.setBackground(Color.PINK);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 0;
		add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnLabel = new JButton("NORTH");
		btnLabel.setBackground(Color.YELLOW);
		GridBagConstraints gbc_btnLabel = new GridBagConstraints();
		gbc_btnLabel.fill = GridBagConstraints.BOTH;
		gbc_btnLabel.anchor = GridBagConstraints.NORTH;
		gbc_btnLabel.gridx = 1;
		gbc_btnLabel.gridy = 0;
		add(btnLabel, gbc_btnLabel);
		
		JButton btnLabel_1 = new JButton("EAST");
		btnLabel_1.setBackground(Color.MAGENTA);
		GridBagConstraints gbc_btnLabel_1 = new GridBagConstraints();
		gbc_btnLabel_1.fill = GridBagConstraints.BOTH;
		gbc_btnLabel_1.anchor = GridBagConstraints.EAST;
		gbc_btnLabel_1.gridx = 2;
		gbc_btnLabel_1.gridy = 1;
		add(btnLabel_1, gbc_btnLabel_1);
		
		JButton btnLabel_2 = new JButton("WEST");
		btnLabel_2.setBackground(Color.GREEN);
		GridBagConstraints gbc_btnLabel_2 = new GridBagConstraints();
		gbc_btnLabel_2.fill = GridBagConstraints.BOTH;
		gbc_btnLabel_2.anchor = GridBagConstraints.WEST;
		gbc_btnLabel_2.gridx = 0;
		gbc_btnLabel_2.gridy = 1;
		add(btnLabel_2, gbc_btnLabel_2);
		
		JButton lblLabel = new JButton("CENTER");
		lblLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblLabel.setForeground(Color.BLACK);
		lblLabel.setBackground(Color.ORANGE);
		GridBagConstraints gbc_lblLabel = new GridBagConstraints();
		gbc_lblLabel.fill = GridBagConstraints.BOTH;
		gbc_lblLabel.gridx = 1;
		gbc_lblLabel.gridy = 1;
		add(lblLabel, gbc_lblLabel);
		
		JButton btnNewButton = new JButton("SOUTH");
		btnNewButton.setBackground(Color.CYAN);
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.anchor = GridBagConstraints.SOUTH;
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 2;
		add(btnNewButton, gbc_btnNewButton);
		
		JButton btnNewButton_2 = new JButton("NORTH_EAST");
		btnNewButton_2.setBackground(Color.RED);
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton_2.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnNewButton_2.gridx = 2;
		gbc_btnNewButton_2.gridy = 0;
		add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnLabel_3 = new JButton("SOUTH_EAST");
		btnLabel_3.setBackground(Color.BLUE);
		GridBagConstraints gbc_btnLabel_3 = new GridBagConstraints();
		gbc_btnLabel_3.fill = GridBagConstraints.BOTH;
		gbc_btnLabel_3.anchor = GridBagConstraints.SOUTHEAST;
		gbc_btnLabel_3.gridx = 2;
		gbc_btnLabel_3.gridy = 2;
		add(btnLabel_3, gbc_btnLabel_3);
		
		JButton btnLabel_4 = new JButton("SOUTH_WEST");
		btnLabel_4.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_btnLabel_4 = new GridBagConstraints();
		gbc_btnLabel_4.fill = GridBagConstraints.BOTH;
		gbc_btnLabel_4.anchor = GridBagConstraints.SOUTHWEST;
		gbc_btnLabel_4.gridx = 0;
		gbc_btnLabel_4.gridy = 2;
		add(btnLabel_4, gbc_btnLabel_4);
	}

}
