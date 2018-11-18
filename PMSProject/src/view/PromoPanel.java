package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.text.SimpleDateFormat;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import control.BuyerListener;

public class PromoPanel extends JPanel {
	private DefaultListModel<String> model;
	private JList <String> promotions;
	private JButton back;
	
	public PromoPanel(BuyerListener listener) {
		super();
		
		this.setBackground(new Color(176, 196, 222));
		this.setLayout(new BorderLayout(0, 0));
		
		JPanel top =  new JPanel();
		top.setBackground(new Color(176, 196, 222));
		top.setLayout(new BorderLayout(0, 0));		
		java.util.Date theDate = new java.util.Date();
		SimpleDateFormat dFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy");
		JLabel date = new JLabel("" + dFormat.format(theDate));
		date.setFont(new Font("PingFang TC", Font.PLAIN, 14));
		date.setForeground(new Color(25, 25, 112));
		top.add(date, BorderLayout.WEST);
		
		JPanel middle = new JPanel();
		middle.setBackground(new Color(176, 196, 222));
		middle.setLayout(new BorderLayout(0, 0));
		middle.setBorder(new EmptyBorder(25, 25, 25, 25));
		JLabel docLbl = new JLabel("Promotions:");
		docLbl.setFont(new Font("PingFang TC", Font.PLAIN, 15));
		docLbl.setForeground(new Color(25, 25, 112));
		middle.add(docLbl, BorderLayout.NORTH);
		model = new DefaultListModel<>();
		promotions = new JList<>(model);
		promotions.addListSelectionListener(listener);
		JScrollPane scroll = new JScrollPane(promotions, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		middle.add(scroll, BorderLayout.CENTER);

		// need to fill documents jlist with approvalQueue
		//try {
	

		//	prof.setCourses((ArrayList<Course>) objIn.readObject());
		//	for(int i = 0; i < prof.getCourses().size(); i++)
		//	{
		//		model.addElement(prof.getCourses().get(i).toString());
		//	}
		//} catch (IOException e) {
		//	e.printStackTrace();
		//} catch(ClassNotFoundException e)
		//{
		//	System.err.println(e.getMessage());
		//}
		
		JPanel bottom = new JPanel();
		bottom.setBackground(new Color(176, 196, 222));
		bottom.setLayout(new BoxLayout(bottom, BoxLayout.X_AXIS));
		bottom.setBorder(new EmptyBorder(0, 20, 10, 80));
		
		back = new JButton();
		back.setForeground(new Color(25, 25, 112));
		back.setFont(new Font("PingFang TC", Font.PLAIN, 15));
		back.setAlignmentX(Component.CENTER_ALIGNMENT);
		back.setText("Back");
		back.addActionListener(listener);
		
		bottom.add(back);
		
		this.add(top, BorderLayout.NORTH);
		this.add(middle, BorderLayout.CENTER);
		this.add(bottom, BorderLayout.SOUTH);
	}
}