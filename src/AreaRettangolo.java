import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
public class AreaRettangolo extends JFrame implements ActionListener
{
	JLabel LunghezzaLabel, LarghezzaLabel, AreaLabel;
	JTextField LunghezzaTesto, LarghezzaTesto, AreaTesto;
	JButton calcolaBottone,cancellaBottone;
	
	public AreaRettangolo ()
	{	
		JFrame frame= new JFrame("calcolo area");
		LunghezzaLabel= new JLabel("Lunghezza: ");
		LarghezzaLabel= new JLabel("Larghezza: ");
		AreaLabel=new JLabel("Area: ");

		LunghezzaTesto=new JTextField(10);
		LarghezzaTesto=new JTextField(10);
		AreaTesto=new JTextField(10);
		AreaTesto.setEditable(false);
		
		calcolaBottone = new JButton("Calcola");
		cancellaBottone= new JButton("Cancella");
		
		JPanel panel = new JPanel(new GridLayout(4,2));
		panel.add(LunghezzaLabel);
		panel.add(LunghezzaTesto);
		panel.add(LarghezzaLabel);
		panel.add(LarghezzaTesto);
		panel.add(AreaLabel);
		panel.add(AreaTesto);
		panel.add(calcolaBottone);
		panel.add(cancellaBottone);
	
		frame.add(panel);
		
		calcolaBottone.addActionListener(this);
		cancellaBottone.addActionListener(this);
		
		frame.setSize(400,300);
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==calcolaBottone)
		{
			try 
			{
				double Lunghezza=Double.parseDouble(LunghezzaTesto.getText());
				double Larghezza=Double.parseDouble(LarghezzaTesto.getText());
				double Area=Lunghezza*Larghezza;
				AreaTesto.setText(Double.toString(Area));
			}
			catch(NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(this,"Inserisci un valore numerico valido.");
			}
		}
		else if(e.getSource()==cancellaBottone)
		{
			LunghezzaTesto.setText("");
			LarghezzaTesto.setText("");
			AreaTesto.setText("");
			
		}
	}

	public static void main(String[]args)
	{
		new AreaRettangolo();
	}
	public void insertUpdate(DocumentEvent e)
	{
		
	}
	public void removeUpdate(DocumentEvent e)
	{
		
	}
	public void changedUpdate(DocumentEvent e) 
	{
		
	}
}
