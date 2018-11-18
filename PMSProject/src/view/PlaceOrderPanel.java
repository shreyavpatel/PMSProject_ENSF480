package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PlaceOrderPanel extends JPanel {
	private JTextField email;
	private JTextField item;
	private JTextField quantity;
	private JTextField card;
	private JTextField cvv;
	private JButton pay;
	private JButton back;
	private JCheckBox visa;
	private JCheckBox mc;
	private JCheckBox am;

	public PlaceOrderPanel() {
		super();
		
		this.setBackground(new Color(176, 196, 222));
		this.setLayout(new BorderLayout(0, 0));
		
		JPanel orderInfo = new JPanel ();
		orderInfo.setBackground(new Color(176, 196, 222));
		orderInfo.setLayout(new BoxLayout(orderInfo, BoxLayout.PAGE_AXIS));
		orderInfo.setBorder(new EmptyBorder(25, 25, 25, 25));
		
		JPanel one = new JPanel ();
		one.setBackground(new Color(176, 196, 222));
		one.setLayout(new FlowLayout());
		one.setBorder(new EmptyBorder(0, 0, 0, 0));
		JLabel eLabel = new JLabel("Email:");
		eLabel.setForeground(new Color(25, 25, 112));
		eLabel.setFont(new Font("PingFang TC", Font.PLAIN, 20));
		one.add(eLabel);
		email = new JTextField(15);
		email.setName("email");
		one.add(email);
		
		JPanel two = new JPanel ();
		two.setBackground(new Color(176, 196, 222));
		two.setLayout(new FlowLayout());
		two.setBorder(new EmptyBorder(0, 0, 0, 0));
		JLabel iLabel = new JLabel("Item ID:");
		iLabel.setForeground(new Color(25, 25, 112));
		iLabel.setFont(new Font("PingFang TC", Font.PLAIN, 20));
		two.add(iLabel);
		item = new JTextField(10);
		item.setName("item");
		two.add(item);
		
		JPanel three = new JPanel ();
		three.setBackground(new Color(176, 196, 222));
		three.setLayout(new FlowLayout());
		three.setBorder(new EmptyBorder(0, 0, 0, 0));
		JLabel qLabel = new JLabel("Quantiy:");
		qLabel.setForeground(new Color(25, 25, 112));
		qLabel.setFont(new Font("PingFang TC", Font.PLAIN, 20));
		three.add(qLabel);
		quantity = new JTextField(3);
		quantity.setSize(2, 15);
		three.add(quantity);
		
		visa = new JCheckBox("Visa");
		visa.setFont(new Font("PingFang TC", Font.PLAIN, 15));
		visa.setForeground(new Color(25, 25, 112));
		visa.setBackground(new Color(176, 196, 222));
		visa.addActionListener(listener);
		mc = new JCheckBox("MasterCard"); 
		mc.setFont(new Font("PingFang TC", Font.PLAIN, 15));
		mc.setForeground(new Color(25, 25, 112));
		mc.setBackground(new Color(176, 196, 222));
		mc.addActionListener(listener);
		am = new JCheckBox("American Express"); 
		am.setFont(new Font("PingFang TC", Font.PLAIN, 15));
		am.setForeground(new Color(25, 25, 112));
		am.setBackground(new Color(176, 196, 222));
		am.addActionListener(listener);
		
		JPanel toPayBy =  new JPanel();
		toPayBy.setLayout(new BoxLayout(toPayBy, BoxLayout.X_AXIS));
		toPayBy.setBackground(new Color(176, 196, 222));
		JLabel payBy = new JLabel("Pay by: ");
		payBy.setFont(new Font("PingFang TC", Font.PLAIN, 15));
		payBy.setForeground(new Color(25, 25, 112));
		toPayBy.add(payBy);
		toPayBy.add(visa);
		toPayBy.add(mc);
		toPayBy.add(am);
		
		JPanel four = new JPanel ();
		four.setBackground(new Color(176, 196, 222));
		four.setLayout(new FlowLayout());
		four.setBorder(new EmptyBorder(0, 0, 0, 0));
		JLabel num = new JLabel("Card Number: ");
		num.setForeground(new Color(25, 25, 112));
		num.setFont(new Font("PingFang TC", Font.PLAIN, 20));
		four.add(num);
		card = new JTextField(16);
		card.setSize(2, 15);
		four.add(four);
		
		JPanel five = new JPanel ();
		five.setBackground(new Color(176, 196, 222));
		five.setLayout(new FlowLayout());
		five.setBorder(new EmptyBorder(0, 0, 0, 0));
		JLabel numcvv = new JLabel("CVV: ");
		numcvv.setForeground(new Color(25, 25, 112));
		numcvv.setFont(new Font("PingFang TC", Font.PLAIN, 20));
		five.add(numcvv);
		cvv = new JTextField(3);
		five.add(four);
		
		JPanel forButton = new JPanel();
		forButton.setBackground(new Color(176, 196, 222));
		forButton.setLayout(new FlowLayout());
		forButton.setBorder(new EmptyBorder(0, 20, 30, 20));
		pay = new JButton();
		pay.setForeground(new Color(25, 25, 112));
		pay.setFont(new Font("PingFang TC", Font.PLAIN, 15));
		pay.setText("Make Payment");
		pay.addActionListener(listener);
		forButton.add(pay);
		back = new JButton();
		back.setForeground(new Color(25, 25, 112));
		back.setFont(new Font("PingFang TC", Font.PLAIN, 15));
		back.setAlignmentX(Component.CENTER_ALIGNMENT);
		back.setText("Back");
		back.addActionListener(listener);
		forButton.add(back);
		
		orderInfo.add(one);
		orderInfo.add(two);
		orderInfo.add(three);
		orderInfo.add(toPayBy);
		orderInfo.add(four);
		orderInfo.add(five);
		this.add(orderInfo, BorderLayout.CENTER);
		//this.add(forButton, BorderLayout.SOUTH);
	}
	
}
