package restaurant_S;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Restaurants {

	private JFrame frame;
	private JTextField textField_ChickenBurger;
	private JTextField textField_FishBurgerMeal;
	private JTextField textField_CheeseBurger;
	private JTextField textField_Qty;
	private JTextField textField_Converter;
	
	
	double US_dollar = 1.24;
	double euros = 1.14;
	double yen = 8.78;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurants window = new Restaurants();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0,0, 1368, 689);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel.setBounds(10, 104, 590, 266);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl_ChickenBurger = new JLabel("Chicken Burger Meal");
		lbl_ChickenBurger.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_ChickenBurger.setBounds(25, 11, 212, 36);
		panel.add(lbl_ChickenBurger);
		
		JLabel lblChickenBurgerMeal = new JLabel("Fish Burger Meal");
		lblChickenBurgerMeal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblChickenBurgerMeal.setBounds(25, 55, 227, 36);
		panel.add(lblChickenBurgerMeal);
		
		JLabel lblCheeseBurger = new JLabel("Cheese Burger Meal");
		lblCheeseBurger.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCheeseBurger.setBounds(25, 102, 212, 36);
		panel.add(lblCheeseBurger);
		
		textField_ChickenBurger = new JTextField();
		textField_ChickenBurger.setText("0");
		textField_ChickenBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_ChickenBurger.setBounds(288, 21, 262, 28);
		panel.add(textField_ChickenBurger);
		textField_ChickenBurger.setColumns(10);
		
		textField_FishBurgerMeal = new JTextField();
		textField_FishBurgerMeal.setText("0");
		textField_FishBurgerMeal.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_FishBurgerMeal.setColumns(10);
		textField_FishBurgerMeal.setBounds(288, 65, 262, 28);
		panel.add(textField_FishBurgerMeal);
		
		textField_CheeseBurger = new JTextField();
		textField_CheeseBurger.setText("0");
		textField_CheeseBurger.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_CheeseBurger.setColumns(10);
		textField_CheeseBurger.setBounds(288, 110, 262, 28);
		panel.add(textField_CheeseBurger);
		
		JLabel lblDrink = new JLabel("Drink");
		lblDrink.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDrink.setBounds(25, 159, 79, 28);
		panel.add(lblDrink);
		
		JLabel lblQty = new JLabel("Qty");
		lblQty.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblQty.setBounds(288, 159, 79, 28);
		panel.add(lblQty);
		
		textField_Qty = new JTextField();
		textField_Qty.setText("0");
		textField_Qty.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_Qty.setColumns(10);
		textField_Qty.setBounds(288, 191, 262, 28);
		panel.add(textField_Qty);
		
		JComboBox comboBox_Drinks = new JComboBox();
		comboBox_Drinks.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_Drinks.setModel(new DefaultComboBoxModel(new String[] {"Select a drink", "Coke", "Pepsi", "7Up", "Sprite", "Fanta Orange", "Mirinda Strawberry", "Apple Juice"}));
		comboBox_Drinks.setBounds(23, 191, 214, 28);
		panel.add(comboBox_Drinks);
		
		JCheckBox chckbx_Delivery = new JCheckBox("Home Delivery");
		chckbx_Delivery.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbx_Delivery.setBounds(19, 226, 158, 23);
		panel.add(chckbx_Delivery);
		
		JCheckBox chckbx_Tax = new JCheckBox("Tax");
		chckbx_Tax.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbx_Tax.setBounds(288, 226, 97, 23);
		panel.add(chckbx_Tax);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 157, 525, -9);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(35, 149, 500, 6);
		panel.add(separator_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_1.setBounds(610, 104, 389, 266);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox_Converter = new JComboBox();
		comboBox_Converter.setModel(new DefaultComboBoxModel(new String[] {"Select Currency", "USA Dollars", "Euros", "Chinese Yen"}));
		comboBox_Converter.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_Converter.setBounds(100, 60, 214, 41);
		panel_1.add(comboBox_Converter);
		
		textField_Converter = new JTextField();
		textField_Converter.setHorizontalAlignment(SwingConstants.CENTER);
		textField_Converter.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_Converter.setColumns(10);
		textField_Converter.setBounds(70, 112, 262, 41);
		panel_1.add(textField_Converter);
		
		JLabel lbl_Converter = new JLabel("");
		lbl_Converter.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Converter.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_Converter.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbl_Converter.setBounds(70, 164, 262, 41);
		panel_1.add(lbl_Converter);
		
		JButton btn_Convert = new JButton("Convert");
		btn_Convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double UK_pound = Double.parseDouble(textField_Converter.getText());
				if (comboBox_Converter.getSelectedItem().equals("USA Dollars")) {
					String cConvert1 = String.format("$%.2f", UK_pound*US_dollar);
					lbl_Converter.setText(cConvert1);
				}
				else if(comboBox_Converter.getSelectedItem().equals("Euros")) {
					String cConvert2 = String.format("€%.2f", UK_pound*euros);
					lbl_Converter.setText(cConvert2);
				}
				else if(comboBox_Converter.getSelectedItem().equals("Chinese Yen")) {
					String cConvert3 = String.format("¥%.2f", UK_pound*yen);
					lbl_Converter.setText(cConvert3);
				}
			}
		});
		btn_Convert.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Convert.setBounds(27, 216, 106, 23);
		panel_1.add(btn_Convert);
		
		JButton btn_Close = new JButton("Reset");
		btn_Close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Converter.setText(null);
				lbl_Converter.setText(null);
				comboBox_Converter.setSelectedItem("Select Currency");
			}
		});
		btn_Close.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_Close.setBounds(271, 216, 89, 23);
		panel_1.add(btn_Close);
		
		JLabel lblNewLabel_4 = new JLabel("Currency Converter");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_4.setBounds(111, 11, 190, 38);
		panel_1.add(lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_2.setBounds(10, 375, 590, 167);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lbl2 = new JLabel("Cost of Meal");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl2.setBounds(21, 55, 227, 36);
		panel_2.add(lbl2);
		
		JLabel lbl3 = new JLabel("Cost of Delivery");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl3.setBounds(21, 102, 176, 36);
		panel_2.add(lbl3);
		
		JLabel lbl1 = new JLabel("Cost of Drinks");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl1.setBounds(21, 11, 176, 36);
		panel_2.add(lbl1);
		
		JLabel lbl_DrinkCost = new JLabel("\u00A30.00");
		lbl_DrinkCost.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbl_DrinkCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_DrinkCost.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_DrinkCost.setBounds(368, 19, 165, 26);
		panel_2.add(lbl_DrinkCost);
		
		JLabel lbl_MealCost = new JLabel("\u00A30.00");
		lbl_MealCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_MealCost.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_MealCost.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbl_MealCost.setBounds(368, 65, 165, 26);
		panel_2.add(lbl_MealCost);
		
		JLabel lbl_DeliveryCost = new JLabel("\u00A30.00");
		lbl_DeliveryCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_DeliveryCost.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_DeliveryCost.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbl_DeliveryCost.setBounds(368, 112, 165, 26);
		panel_2.add(lbl_DeliveryCost);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_3.setBounds(1009, 104, 333, 438);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 313, 416);
		panel_3.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea txtrrestaurantManagementSystems = new JTextArea();
		txtrrestaurantManagementSystems.setBounds(10, 11, 288, 366);
		panel_6.add(txtrrestaurantManagementSystems);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("Calculator", null, panel_7, null);
		panel_7.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(37, 11, 237, 44);
		panel_7.add(textField);
		textField.setColumns(10);
		
		JButton btnUsvg = new JButton("^");
		btnUsvg.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnUsvg.setBounds(37, 66, 56, 52);
		panel_7.add(btnUsvg);
		
		JButton btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnC.setBounds(97, 66, 56, 52);
		panel_7.add(btnC);
		
		JButton button_2 = new JButton("%");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2.setBounds(158, 66, 56, 52);
		panel_7.add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3.setBounds(216, 66, 56, 52);
		panel_7.add(button_3);
		
		JButton button_3_1 = new JButton("-");
		button_3_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3_1.setBounds(216, 120, 56, 52);
		panel_7.add(button_3_1);
		
		JButton button_2_1 = new JButton("9");
		button_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2_1.setBounds(158, 120, 56, 52);
		panel_7.add(button_2_1);
		
		JButton button_1_1 = new JButton("8");
		button_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1_1.setBounds(97, 120, 56, 52);
		panel_7.add(button_1_1);
		
		JButton button_4 = new JButton("7");
		button_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_4.setBounds(37, 120, 56, 52);
		panel_7.add(button_4);
		
		JButton btnX = new JButton("X");
		btnX.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnX.setBounds(216, 174, 56, 52);
		panel_7.add(btnX);
		
		JButton button_2_2 = new JButton("6");
		button_2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2_2.setBounds(158, 174, 56, 52);
		panel_7.add(button_2_2);
		
		JButton button_1_2 = new JButton("5");
		button_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1_2.setBounds(97, 174, 56, 52);
		panel_7.add(button_1_2);
		
		JButton button_5 = new JButton("4");
		button_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_5.setBounds(37, 174, 56, 52);
		panel_7.add(button_5);
		
		JButton button_3_3 = new JButton("/");
		button_3_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3_3.setBounds(216, 230, 56, 52);
		panel_7.add(button_3_3);
		
		JButton button_2_3 = new JButton("3");
		button_2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2_3.setBounds(158, 230, 56, 52);
		panel_7.add(button_2_3);
		
		JButton button_1_3 = new JButton("2");
		button_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1_3.setBounds(97, 230, 56, 52);
		panel_7.add(button_1_3);
		
		JButton button_6 = new JButton("1");
		button_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_6.setBounds(37, 230, 56, 52);
		panel_7.add(button_6);
		
		JButton button_3_4 = new JButton("=");
		button_3_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_3_4.setBounds(216, 285, 56, 52);
		panel_7.add(button_3_4);
		
		JButton button_2_4 = new JButton("!");
		button_2_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_2_4.setBounds(158, 285, 56, 52);
		panel_7.add(button_2_4);
		
		JButton button_1_4 = new JButton(".");
		button_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_1_4.setBounds(97, 285, 56, 52);
		panel_7.add(button_1_4);
		
		JButton button_7 = new JButton("0");
		button_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		button_7.setBounds(37, 285, 56, 52);
		panel_7.add(button_7);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_4.setBounds(610, 375, 389, 167);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Total");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_2_1_1.setBounds(10, 113, 176, 36);
		panel_4.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Sub total");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_1_1_1.setBounds(10, 66, 149, 36);
		panel_4.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Tax");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1_3_1.setBounds(10, 19, 176, 36);
		panel_4.add(lblNewLabel_1_3_1);
		
		JLabel lbl_Tax = new JLabel("\u00A30.00");
		lbl_Tax.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Tax.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_Tax.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbl_Tax.setBounds(200, 19, 165, 36);
		panel_4.add(lbl_Tax);
		
		JLabel lbl_SubTotal = new JLabel("\u00A30.00");
		lbl_SubTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_SubTotal.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_SubTotal.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbl_SubTotal.setBounds(200, 66, 165, 36);
		panel_4.add(lbl_SubTotal);
		
		JLabel lbl_Total = new JLabel("\u00A30.00");
		lbl_Total.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_Total.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl_Total.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lbl_Total.setBounds(200, 113, 165, 36);
		panel_4.add(lbl_Total);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		panel_5.setBounds(10, 553, 1332, 90);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		JButton btn_Exit = new JButton("Exit");
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btn_Exit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Exit.setBounds(968, 23, 114, 40);
		panel_5.add(btn_Exit);
		
		JButton btn_Reset = new JButton("Reset");
		btn_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				lbl_DrinkCost.setText("£0.00");
				lbl_DeliveryCost.setText("£0.00");
				lbl_MealCost.setText("£0.00");
				lbl_Total.setText("£0.00");
				lbl_SubTotal.setText("£0.00");
				lbl_Tax.setText("£0.00");
				textField_Converter.setText(null);
				lbl_Converter.setText(null);
				comboBox_Converter.setSelectedItem("Currency");
				comboBox_Drinks.setSelectedItem("Select a drink");
				textField_ChickenBurger.setText("0");
				textField_FishBurgerMeal.setText("0");
				textField_CheeseBurger.setText("0");
				textField_Qty.setText("0");
				txtrrestaurantManagementSystems.setText(null);
				chckbx_Delivery.setSelected(false);
				chckbx_Tax.setSelected(false);
				
			}
		});
		btn_Reset.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Reset.setBounds(754, 23, 114, 40);
		panel_5.add(btn_Reset);
		
		JButton btn_Receipt = new JButton("Receipt");
		btn_Receipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtrrestaurantManagementSystems.setText(null);
				
				double rItem1 = Double.parseDouble(textField_ChickenBurger.getText());
				double rItem2 = Double.parseDouble(textField_FishBurgerMeal.getText());
				double rItem3 = Double.parseDouble(textField_CheeseBurger.getText());
				double rItem4 = Double.parseDouble(textField_Qty.getText());
				
				txtrrestaurantManagementSystems.append("\t\n------------Restaurant Management System------------" + "\n\n\t Your Bill:"
						+ "\n\nChicken Burger Meal:" + "\t\t" + rItem1 + "\nFish Burger Meal:"
						+ "\t\t" + rItem2 + "\nCheese Burger Meal:" + "\t\t" + rItem3 + "\n" + comboBox_Drinks.getSelectedItem() 
						+ "\t\t\t" + rItem4 + "\n\nTax:" + "\t\t\t" + lbl_Tax.getText() + "\n\nTotal:" + "\t\t\t" + lbl_Total.getText());
			}
		});
		btn_Receipt.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Receipt.setBounds(548, 23, 114, 40);
		panel_5.add(btn_Receipt);
		
		JButton btn_Total = new JButton("Total");
		btn_Total.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double chickBurger = Double.parseDouble(textField_ChickenBurger.getText());
				double chickBurgerPrice = 2.39;
				double chickenBurger;
				chickenBurger = (chickBurger * chickBurgerPrice);
				
				double fishBurger = Double.parseDouble(textField_FishBurgerMeal.getText());
				double fishBurgerPrice = 4.39;
				double fishBurgerMeal;
				fishBurgerMeal = (fishBurger * fishBurgerPrice);
				
				double chBurger = Double.parseDouble(textField_CheeseBurger.getText());
				double cheeseBurgerPrice = 3.39;
				double cheeseBurger;
				cheeseBurger = (chBurger * cheeseBurgerPrice);
				
				double mealPrice = (chickenBurger + fishBurgerMeal + cheeseBurger);
				
				String total = String.format("%.2f", mealPrice);
				lbl_MealCost.setText(total);
				
				
				double homeDelivery = 3.39;
				if (chckbx_Delivery.isSelected())
				{
					String deliveryPrice = String.format("%.2f", homeDelivery);
					lbl_DeliveryCost.setText(deliveryPrice);
				}
				else
				{
					lbl_DeliveryCost.setText("0");
				}
				
				double numberOfDrinks = Double.parseDouble(textField_Qty.getText());
				double coke = 1.5*numberOfDrinks;
				double Pepsi = 1*numberOfDrinks;
				double sevenUp = 1*numberOfDrinks;
				double sprite = 1*numberOfDrinks;
				double fanta_Orange = 1*numberOfDrinks;
				double mirinda_Strawberry = 1*numberOfDrinks;
				double apple_Juice = 0.5*numberOfDrinks;
				
				if (comboBox_Drinks.getSelectedItem().equals("Coke")){
					String cCoke = String.format("%.2f", coke);
					lbl_DrinkCost.setText(cCoke);
				}
				else if (comboBox_Drinks.getSelectedItem().equals("Pepsi")){
					String cPepsi = String.format("%.2f", Pepsi);
					lbl_DrinkCost.setText(cPepsi);
					
				}
				else if (comboBox_Drinks.getSelectedItem().equals("7Up")){
					String cSevenUp = String.format("%.2f", sevenUp);
					lbl_DrinkCost.setText(cSevenUp);
				}
				else if (comboBox_Drinks.getSelectedItem().equals("Sprite")){
					String cSprite = String.format("%.2f", sprite);
					lbl_DrinkCost.setText(cSprite);
				}
				else if (comboBox_Drinks.getSelectedItem().equals("Fanta Orange")){
					String cFanta = String.format("%.2f", fanta_Orange);
					lbl_DrinkCost.setText(cFanta);
				}
				else if (comboBox_Drinks.getSelectedItem().equals("Mirinda Strawberry")){
					String cMirinda = String.format("%.2f", mirinda_Strawberry);
					lbl_DrinkCost.setText(cMirinda);
				}
				else if (comboBox_Drinks.getSelectedItem().equals("Apple Juice")){
					String cApple = String.format("%.2f", apple_Juice);
					lbl_DrinkCost.setText(cApple);
				}
				else if (comboBox_Drinks.getSelectedItem().equals("Select a drink")) {
					textField_Qty.setText("0");
					lbl_DrinkCost.setText("£0.00");
				}
				else if (textField_Qty.getText().equals("0")) {
					textField_Qty.setText("0");
					lbl_DrinkCost.setText("£0.00");
				}
				
				double cTotal1 = Double.parseDouble(lbl_DrinkCost.getText());
				double cTotal2 = Double.parseDouble(lbl_MealCost.getText());
				double cTotal3 = Double.parseDouble(lbl_DeliveryCost.getText());
				double AllTotal = (cTotal1 + cTotal2 + cTotal3) /100;
				if (chckbx_Tax.isSelected()) {
					String tax = String.format("%.2f", AllTotal);
					lbl_Tax.setText(tax);
				}
				
				
				double cTotal4 = Double.parseDouble(lbl_Tax.getText());
				double subTotal = (cTotal1 + cTotal2 + cTotal3);
				String csubTotal = String.format("£%.2f", subTotal);
				lbl_SubTotal.setText(csubTotal);
				
				double Totals = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
				String cTotals = String.format("£%.2f", Totals);
				lbl_Total.setText(cTotals);
				
			}
		});
		btn_Total.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_Total.setBounds(342, 23, 114, 40);
		panel_5.add(btn_Total);
		
		JLabel lblNewLabel = new JLabel("Bill Management Systems");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel.setBounds(149, 0, 1193, 96);
		frame.getContentPane().add(lblNewLabel);
	}
}
