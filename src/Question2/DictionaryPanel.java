package Question2;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;

/**
 * Created by aviad on 09/01/2016.
 */
public class DictionaryPanel extends JPanel
{


private JFrame frame;
private Dictionary dictionary;
private JList itemList;
private JButton cmdAddVal, cmdDeleteVal, cmdUpdateVal, cmdFindVal;
private JLabel lblTerm, lblTranslation;
private JTextField txtTranslation, txtTerm;
private JTextArea txtData;

public DictionaryPanel()
	{
		makeFrame();
		frame.setVisible(true);

	}

public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

	}

private void makeFrame()
	{
		ControlsListener controlsListener = new ControlsListener();
		frame = new JFrame("House Automation System");
		txtData = new JTextArea(5, 20);
		txtData.setFont(new java.awt.Font("Courier New", 0, 24));
		JPanel contentPane = (JPanel) frame.getContentPane();
		contentPane.setLayout(new BorderLayout(8, 8));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));

		JPanel buttonPanel = new JPanel(new GridLayout(2, 4, 10, 10));

		lblTerm = new JLabel("Term: ");
		buttonPanel.add(lblTerm);

		txtTerm = new JTextField(10);
		buttonPanel.add(txtTerm);

		lblTranslation = new JLabel("Translation: ");
		buttonPanel.add(lblTranslation);

		txtTranslation = new JTextField(10);
		buttonPanel.add(txtTranslation);

		cmdAddVal = new JButton("Add Value");
		cmdDeleteVal = new JButton("Delete Value");
		cmdUpdateVal = new JButton("Update Value");
		cmdFindVal = new JButton("Find Value");
		cmdAddVal.addActionListener(controlsListener);
		cmdUpdateVal.addActionListener(controlsListener);
		cmdDeleteVal.addActionListener(controlsListener);
		cmdFindVal.addActionListener(controlsListener);
		buttonPanel.add(cmdAddVal);
		buttonPanel.add(cmdDeleteVal);
		buttonPanel.add(cmdUpdateVal);
		buttonPanel.add(cmdFindVal);

		contentPane.add(buttonPanel, BorderLayout.NORTH);
		dictionary = new Dictionary();
		itemList = new JList(dictionary.getDictionaryValues());

		contentPane.add(txtData, BorderLayout.CENTER);

		frame.pack();
	}

private class ControlsListener implements ActionListener
{

	public void actionPerformed(ActionEvent e)
		{
			if (e.getSource() == cmdAddVal)
				{
				if (!String.valueOf(txtTerm.getText()).isEmpty() && !String.valueOf(txtTranslation.getText()).isEmpty())
					{
					DictionaryValue dv = new DictionaryValue(txtTerm.getText(), txtTranslation.getText());
					try
						{
						dictionary.addTerm(dv);
						txtData.setText(dictionary.toString());
						} catch (DictionaryExceptions ex)
						{
						JOptionPane.showMessageDialog(null, ex.getMessage());
						}
					repaint();
					}
				}
			else if (e.getSource() == cmdFindVal)
				{
				if (!String.valueOf(txtTerm.getText()).isEmpty())
					{
					try
						{

						DictionaryValue dv = new DictionaryValue(txtTerm.getText(), txtTranslation.getText());
						DictionaryValue found = dictionary.findTerm(dv);
						JOptionPane.showMessageDialog(null,
								MessageFormat.format("Term was Found!\nTerm: {0}\nTranslation: {1}\n", found.term,
										found.translation));
						} catch (DictionaryExceptions ex)
						{
						JOptionPane.showMessageDialog(null, ex.getMessage());
						}
					repaint();
					}
				}
			else if (e.getSource() == cmdDeleteVal)
				{
				String term = txtTerm.getText().toLowerCase();
				try
					{
					dictionary.deleteTerm(term);
					txtData.setText(dictionary.toString());

					} catch (DictionaryExceptions ex)
					{
					JOptionPane.showMessageDialog(null, ex.getMessage());
					}
				repaint();
				}
			else if (e.getSource() == cmdUpdateVal)
				{
				DictionaryValue dv = new DictionaryValue(txtTerm.getText(), txtTranslation.getText());
				try
					{
					dictionary.updateTerm(dv.term, dv.translation);
						txtData.setText(dictionary.toString());
					} catch (DictionaryExceptions ex)
					{
					JOptionPane.showMessageDialog(null, ex.getMessage());
					}
				repaint();
				}
		}
}

}
