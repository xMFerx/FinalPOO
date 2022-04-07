package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class CataloguePanel extends JPanel {
	private JButton btnLogIn;
	private JButton btnMyProfile;
	private JButton btnBanner;
	private JTextPane txtBannerName;
	private JTextField txtPrice;
	private JButton btnBannerOp1;
	private JButton btnBannerOp2;
	private JButton btnBannerOp3;
	private JLabel BGPanel;
	private JTextField txtDiscount;
	private JLabel lblBanner;
	
	private JTextField txtCategory1;
	private JScrollPane scrollCategory1;
	private JPanel panelC1;
	private JButton btnC1B1;
	private JButton btnC1B2;
	private JButton btnC1B3;
	private JButton btnC1B4;
	private JButton btnC1B5;
	private JButton btnC1B6;
	private JButton btnC1B7;
	
	private JTextField txtCategory2;
	private JScrollPane scrollCategory2;
	private JPanel panelC2;
	private JButton btnC2B1;
	private JButton btnC2B2;
	private JButton btnC2B3;
	private JButton btnC2B4;
	private JButton btnC2B5;
	private JButton btnC2B6;
	
	private JTextField txtCategory3;
	private JScrollPane scrollCategory3;
	private JPanel panelC3;
	private JButton btnC3B1;
	private JButton btnC3B2;
	private JButton btnC3B3;
	private JButton btnC3B4;

	private JTextField txtCategory4;
	private JScrollPane scrollCategory4;
	private JPanel panelC4;
	private JButton btnC4B1;
	private JButton btnC4B2;
	private JButton btnC4B3;
	private JButton btnC4B4;
	private JButton btnC4B5;
	private JButton btnC4B6;
	private JButton btnCart;
	
	/**
	 * Create the panel.
	 */
	public CataloguePanel() {
		setBackground(new Color(242, 233, 228));
		setPreferredSize(new Dimension(1020, 1380));
		setLayout(null);
		
		/*
		 * Header
		 */
		
		btnBanner = new JButton("");
		btnBanner.setContentAreaFilled(false);
		btnBanner.setBounds(145, 178, 540, 300);
		add(btnBanner);
		btnLogIn = new JButton("Inicia Sesion");
		btnLogIn.setForeground(new Color(255, 255, 255));
		btnLogIn.setLocation(722, -1);
		btnLogIn.setSize(300, 102);
		btnLogIn.setFont(new Font("Saudagar", Font.BOLD, 18));
		btnLogIn.setBackground(new Color(34, 34, 59));
		btnLogIn.setBorder(null);
		add(btnLogIn);
		
		btnMyProfile = new JButton("My Cuenta");
		btnMyProfile.setForeground(new Color(255, 255, 255));
		btnMyProfile.setLocation(722, -1);
		btnMyProfile.setSize(300, 102);
		btnMyProfile.setFont(new Font("Saudagar", Font.BOLD, 18));
		btnMyProfile.setBackground(new Color(34, 34, 59));
		btnMyProfile.setBorder(null);
		add(btnMyProfile);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/MainLogo.png")));
		lblLogo.setFont(new Font("morgenlicht", Font.PLAIN, 26));
		lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogo.setBounds(0, 0, 500, 100);
		add(lblLogo);
		
		/*
		 * Banners
		 */
		txtBannerName = new JTextPane();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		txtBannerName.setParagraphAttributes(center, false);			
		txtBannerName.setFont(new Font("Saudagar", Font.PLAIN, 32));
		txtBannerName.setDisabledTextColor(new Color(0, 0, 0));		
		txtBannerName.setOpaque(false);
		txtBannerName.setEditable(false);
		txtBannerName.setEnabled(false);
		txtBannerName.setBounds(440, 194, 230, 125);
		add(txtBannerName);
		
		txtPrice = new JTextField();
		txtPrice.setBorder(null);
		txtPrice.setEnabled(false);
		txtPrice.setDisabledTextColor(new Color(0, 0, 0));
		txtPrice.setFont(new Font("Saudagar", Font.BOLD, 22));
		txtPrice.setOpaque(false);
		txtPrice.setEditable(false);
		txtPrice.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPrice.setBounds(472, 428, 181, 29);
		add(txtPrice);
		txtPrice.setColumns(10);
		
		btnBannerOp1 = new JButton("");
		btnBannerOp1.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnBanner1.png")));
		btnBannerOp1.setContentAreaFilled(false);		
		btnBannerOp1.setBounds(722, 188, 160, 80);
		add(btnBannerOp1);
		
		btnBannerOp2 = new JButton("");
		btnBannerOp2.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnBanner2.png")));
		btnBannerOp2.setContentAreaFilled(false);
		btnBannerOp2.setBounds(722, 288, 160, 80);
		add(btnBannerOp2);
		
		btnBannerOp3 = new JButton("");
		btnBannerOp3.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnBanner3.png")));
		btnBannerOp3.setContentAreaFilled(false);
		btnBannerOp3.setBounds(722, 388, 160, 80);
		add(btnBannerOp3);
		
		txtDiscount = new JTextField();
		txtDiscount.setBorder(null);
		txtDiscount.setEnabled(false);
		txtDiscount.setDisabledTextColor(new Color(0, 0, 0));
		txtDiscount.setFont(new Font("Saudagar", Font.BOLD, 15));
		txtDiscount.setOpaque(false);
		txtDiscount.setEditable(false);
		txtDiscount.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDiscount.setBounds(527, 388, 126, 29);
		add(txtDiscount);
		txtDiscount.setColumns(10);
		
		lblBanner = new JLabel("");		
		lblBanner.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/BannerOpt1.png")));		
		lblBanner.setBounds(145, 178, 540, 300);
		add(lblBanner);
		
		/*
		 * Category 1
		 */
		txtCategory1 = new JTextField();
		txtCategory1.setBorder(null);
		txtCategory1.setText("Lanzables y Power Ups!");
		txtCategory1.setOpaque(false);
		txtCategory1.setEditable(false);
		txtCategory1.setFont(new Font("Saudagar", Font.PLAIN, 22));
		txtCategory1.setBounds(75, 540, 820, 50);
		add(txtCategory1);
		txtCategory1.setColumns(10);
		
		scrollCategory1 = new JScrollPane();
		scrollCategory1.getHorizontalScrollBar().setPreferredSize(new Dimension(0,0));
		scrollCategory1.getHorizontalScrollBar().setUnitIncrement(16);
		scrollCategory1.setBorder(null);
		scrollCategory1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollCategory1.setBounds(50, 600, 920, 100);
		scrollCategory1.setBackground(new Color(242, 233, 228));
		add(scrollCategory1);
		
		panelC1 = new JPanel();
		panelC1.setPreferredSize(new Dimension(1750, 100));
		panelC1.setBorder(null);		
		panelC1.setBackground(new Color(242, 233, 228));
		scrollCategory1.setViewportView(panelC1);
		panelC1.setLayout(null);
		
		btnC1B1 = new JButton("");
		btnC1B1.setBounds(0, 0, 200, 100);
		btnC1B1.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC1B1.png")));
		panelC1.add(btnC1B1);
		btnC1B1.setContentAreaFilled(false);
		
		btnC1B2 = new JButton("");		
		btnC1B2.setBounds(250, 0, 200, 100);
		btnC1B2.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC1B2.png")));
		panelC1.add(btnC1B2);
		btnC1B2.setContentAreaFilled(false);
		
		btnC1B3 = new JButton("");
		btnC1B3.setBounds(500, 0, 200, 100);
		btnC1B3.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC1B3.png")));
		panelC1.add(btnC1B3);
		btnC1B3.setContentAreaFilled(false);
		
		btnC1B4 = new JButton("");
		btnC1B4.setBounds(750, 0, 200, 100);
		btnC1B4.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC1B4.png")));
		panelC1.add(btnC1B4);
		btnC1B4.setContentAreaFilled(false);
		
		btnC1B5 = new JButton("");
		btnC1B5.setContentAreaFilled(false);
		btnC1B5.setBounds(1000, 0, 200, 100);
		btnC1B5.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC1B5.png")));
		panelC1.add(btnC1B5);
		
		btnC1B6 = new JButton("");
		btnC1B6.setContentAreaFilled(false);
		btnC1B6.setBounds(1250, 0, 200, 100);
		btnC1B6.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC1B6.png")));
		panelC1.add(btnC1B6);
		
		btnC1B7 = new JButton("");
		btnC1B7.setContentAreaFilled(false);
		btnC1B7.setBounds(1500, 0, 200, 100);
		btnC1B7.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC1B7.png")));
		panelC1.add(btnC1B7);
		
		/*
		 * Category 2
		 */
		txtCategory2 = new JTextField();
		txtCategory2.setText("Duelo a muerte con...");
		txtCategory2.setOpaque(false);
		txtCategory2.setFont(new Font("Saudagar", Font.PLAIN, 22));
		txtCategory2.setEditable(false);
		txtCategory2.setColumns(10);
		txtCategory2.setBorder(null);
		txtCategory2.setBounds(75, 750, 820, 50);
		add(txtCategory2);
		
		scrollCategory2 = new JScrollPane();
		scrollCategory2.getHorizontalScrollBar().setPreferredSize(new Dimension(0,0));
		scrollCategory2.getHorizontalScrollBar().setUnitIncrement(16);
		scrollCategory2.setBorder(null);
		scrollCategory2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollCategory2.setBounds(50, 810, 920, 100);
		scrollCategory2.setBackground(new Color(242, 233, 228));
		add(scrollCategory2);
		
		panelC2 = new JPanel();
		panelC2.setPreferredSize(new Dimension(1500, 100));
		panelC2.setBorder(null);		
		panelC2.setBackground(new Color(242, 233, 228));
		scrollCategory2.setViewportView(panelC2);
		panelC2.setLayout(null);
		
		btnC2B1 = new JButton("");
		btnC2B1.setBounds(0, 0, 200, 100);
		btnC2B1.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC2B1.png")));
		panelC2.add(btnC2B1);
		btnC2B1.setContentAreaFilled(false);
		
		btnC2B2 = new JButton("");		
		btnC2B2.setBounds(250, 0, 200, 100);
		btnC2B2.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC2B2.png")));
		panelC2.add(btnC2B2);
		btnC2B2.setContentAreaFilled(false);
		
		btnC2B3 = new JButton("");
		btnC2B3.setBounds(500, 0, 200, 100);
		btnC2B3.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC2B3.png")));
		panelC2.add(btnC2B3);
		btnC2B3.setContentAreaFilled(false);
		
		btnC2B4 = new JButton("");
		btnC2B4.setBounds(750, 0, 200, 100);
		btnC2B4.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC2B4.png")));
		panelC2.add(btnC2B4);
		btnC2B4.setContentAreaFilled(false);
		
		btnC2B5 = new JButton("");
		btnC2B5.setContentAreaFilled(false);
		btnC2B5.setBounds(1000, 0, 200, 100);
		btnC2B5.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC2B5.png")));
		panelC2.add(btnC2B5);
		
		btnC2B6 = new JButton("");
		btnC2B6.setContentAreaFilled(false);
		btnC2B6.setBounds(1250, 0, 200, 100);
		btnC2B6.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC2B6.png")));
		panelC2.add(btnC2B6);
		
		/*
		 * Category 3
		 */
		txtCategory3 = new JTextField();
		txtCategory3.setText("Superheroe o villano?");
		txtCategory3.setOpaque(false);
		txtCategory3.setFont(new Font("Saudagar", Font.PLAIN, 22));
		txtCategory3.setEditable(false);
		txtCategory3.setColumns(10);
		txtCategory3.setBorder(null);
		txtCategory3.setBounds(75, 960, 820, 50);
		add(txtCategory3);
		
		scrollCategory3 = new JScrollPane();
		scrollCategory3.getHorizontalScrollBar().setPreferredSize(new Dimension(0,0));
		scrollCategory3.getHorizontalScrollBar().setUnitIncrement(16);
		scrollCategory3.setBorder(null);
		scrollCategory3.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollCategory3.setBounds(50, 1020, 920, 100);
		scrollCategory3.setBackground(new Color(242, 233, 228));
		add(scrollCategory3);
		
		panelC3 = new JPanel();
		panelC3.setPreferredSize(new Dimension(1000, 100));
		panelC3.setBorder(null);		
		panelC3.setBackground(new Color(242, 233, 228));
		scrollCategory3.setViewportView(panelC3);
		panelC3.setLayout(null);
		
		btnC3B1 = new JButton("");
		btnC3B1.setBounds(0, 0, 200, 100);
		btnC3B1.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC3B1.png")));
		panelC3.add(btnC3B1);
		btnC3B1.setContentAreaFilled(false);
		
		btnC3B2 = new JButton("");		
		btnC3B2.setBounds(250, 0, 200, 100);
		btnC3B2.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC3B2.png")));
		panelC3.add(btnC3B2);
		btnC3B2.setContentAreaFilled(false);
		
		btnC3B3 = new JButton("");
		btnC3B3.setBounds(500, 0, 200, 100);
		btnC3B3.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC3B3.png")));
		panelC3.add(btnC3B3);
		btnC3B3.setContentAreaFilled(false);
		
		btnC3B4 = new JButton("");
		btnC3B4.setBounds(750, 0, 200, 100);
		btnC3B4.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC3B4.png")));
		panelC3.add(btnC3B4);
		btnC3B4.setContentAreaFilled(false);
		
		/*
		 * Category 4
		 */
		txtCategory4 = new JTextField();
		txtCategory4.setText("La guerra nunca cambia");
		txtCategory4.setOpaque(false);
		txtCategory4.setFont(new Font("Saudagar", Font.PLAIN, 22));
		txtCategory4.setEditable(false);
		txtCategory4.setColumns(10);
		txtCategory4.setBorder(null);
		txtCategory4.setBounds(75, 1170, 820, 50);
		add(txtCategory4);
		
		scrollCategory4 = new JScrollPane();
		scrollCategory4.getHorizontalScrollBar().setPreferredSize(new Dimension(0,0));
		scrollCategory4.getHorizontalScrollBar().setUnitIncrement(16);
		scrollCategory4.setBorder(null);
		scrollCategory4.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
		scrollCategory4.setBounds(50, 1230, 920, 100);
		scrollCategory4.setBackground(new Color(242, 233, 228));
		add(scrollCategory4);
		
		panelC4 = new JPanel();
		panelC4.setPreferredSize(new Dimension(1500, 100));
		panelC4.setBorder(null);		
		panelC4.setBackground(new Color(242, 233, 228));
		scrollCategory4.setViewportView(panelC4);
		panelC4.setLayout(null);
		
		btnC4B1 = new JButton("");
		btnC4B1.setBounds(0, 0, 200, 100);
		btnC4B1.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC4B1.png")));
		panelC4.add(btnC4B1);
		btnC4B1.setContentAreaFilled(false);
		
		btnC4B2 = new JButton("");		
		btnC4B2.setBounds(250, 0, 200, 100);
		btnC4B2.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC4B2.png")));
		panelC4.add(btnC4B2);
		btnC4B2.setContentAreaFilled(false);
		
		btnC4B3 = new JButton("");
		btnC4B3.setBounds(500, 0, 200, 100);
		btnC4B3.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC4B3.png")));
		panelC4.add(btnC4B3);
		btnC4B3.setContentAreaFilled(false);
		
		btnC4B4 = new JButton("");
		btnC4B4.setBounds(750, 0, 200, 100);
		btnC4B4.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC4B4.png")));
		panelC4.add(btnC4B4);
		btnC4B4.setContentAreaFilled(false);
		
		btnC4B5 = new JButton("");
		btnC4B5.setContentAreaFilled(false);
		btnC4B5.setBounds(1000, 0, 200, 100);
		btnC4B5.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC4B5.png")));
		panelC4.add(btnC4B5);
		
		btnC4B6 = new JButton("");
		btnC4B6.setContentAreaFilled(false);
		btnC4B6.setBounds(1250, 0, 200, 100);
		btnC4B6.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/btnC4B6.png")));
		panelC4.add(btnC4B6);
		
		btnCart = new JButton("");
		btnCart.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/CartIcon.png")));
		btnCart.setContentAreaFilled(false);
		btnCart.setBounds(910, 112, 80, 80);
		add(btnCart);
		
		BGPanel = new JLabel("");
		BGPanel.setIcon(new ImageIcon(CataloguePanel.class.getResource("/view/icons/Catalogue/BGCatalogue.png")));
		BGPanel.setBackground(new Color(255, 255, 153));
		BGPanel.setBounds(0, 0, 1020, 720);
		add(BGPanel);
	
	}
	
	
	
	public JLabel getLblBanner() {
		return lblBanner;
	}



	public void setLblBanner(JLabel lblBanner) {
		this.lblBanner = lblBanner;
	}



	public JButton getBtnCart() {
		return btnCart;
	}


	public JTextField getTxtCategory1() {
		return txtCategory1;
	}



	public void setTxtCategory1(JTextField txtCategory1) {
		this.txtCategory1 = txtCategory1;
	}



	public JButton getBtnC1B1() {
		return btnC1B1;
	}



	public void setBtnC1B1(JButton btnC1B1) {
		this.btnC1B1 = btnC1B1;
	}



	public JButton getBtnC1B2() {
		return btnC1B2;
	}



	public void setBtnC1B2(JButton btnC1B2) {
		this.btnC1B2 = btnC1B2;
	}



	public JButton getBtnC1B3() {
		return btnC1B3;
	}



	public void setBtnC1B3(JButton btnC1B3) {
		this.btnC1B3 = btnC1B3;
	}



	public JButton getBtnC1B4() {
		return btnC1B4;
	}



	public void setBtnC1B4(JButton btnC1B4) {
		this.btnC1B4 = btnC1B4;
	}



	public JButton getBtnC1B5() {
		return btnC1B5;
	}



	public void setBtnC1B5(JButton btnC1B5) {
		this.btnC1B5 = btnC1B5;
	}



	public JButton getBtnC1B6() {
		return btnC1B6;
	}



	public void setBtnC1B6(JButton btnC1B6) {
		this.btnC1B6 = btnC1B6;
	}



	public JButton getBtnC1B7() {
		return btnC1B7;
	}



	public void setBtnC1B7(JButton btnC1B7) {
		this.btnC1B7 = btnC1B7;
	}



	public JTextField getTxtCategory2() {
		return txtCategory2;
	}



	public void setTxtCategory2(JTextField txtCategory2) {
		this.txtCategory2 = txtCategory2;
	}



	public JButton getBtnC2B1() {
		return btnC2B1;
	}



	public void setBtnC2B1(JButton btnC2B1) {
		this.btnC2B1 = btnC2B1;
	}



	public JButton getBtnC2B2() {
		return btnC2B2;
	}



	public void setBtnC2B2(JButton btnC2B2) {
		this.btnC2B2 = btnC2B2;
	}



	public JButton getBtnC2B3() {
		return btnC2B3;
	}



	public void setBtnC2B3(JButton btnC2B3) {
		this.btnC2B3 = btnC2B3;
	}



	public JButton getBtnC2B4() {
		return btnC2B4;
	}



	public void setBtnC2B4(JButton btnC2B4) {
		this.btnC2B4 = btnC2B4;
	}



	public JButton getBtnC2B5() {
		return btnC2B5;
	}



	public void setBtnC2B5(JButton btnC2B5) {
		this.btnC2B5 = btnC2B5;
	}



	public JButton getBtnC2B6() {
		return btnC2B6;
	}



	public void setBtnC2B6(JButton btnC2B6) {
		this.btnC2B6 = btnC2B6;
	}



	public JTextField getTxtCategory3() {
		return txtCategory3;
	}



	public void setTxtCategory3(JTextField txtCategory3) {
		this.txtCategory3 = txtCategory3;
	}



	public JButton getBtnC3B1() {
		return btnC3B1;
	}



	public void setBtnC3B1(JButton btnC3B1) {
		this.btnC3B1 = btnC3B1;
	}



	public JButton getBtnC3B2() {
		return btnC3B2;
	}



	public void setBtnC3B2(JButton btnC3B2) {
		this.btnC3B2 = btnC3B2;
	}



	public JButton getBtnC3B3() {
		return btnC3B3;
	}



	public void setBtnC3B3(JButton btnC3B3) {
		this.btnC3B3 = btnC3B3;
	}



	public JButton getBtnC3B4() {
		return btnC3B4;
	}



	public void setBtnC3B4(JButton btnC3B4) {
		this.btnC3B4 = btnC3B4;
	}



	public JTextField getTxtCategory4() {
		return txtCategory4;
	}



	public void setTxtCategory4(JTextField txtCategory4) {
		this.txtCategory4 = txtCategory4;
	}



	public JButton getBtnC4B1() {
		return btnC4B1;
	}



	public void setBtnC4B1(JButton btnC4B1) {
		this.btnC4B1 = btnC4B1;
	}



	public JButton getBtnC4B2() {
		return btnC4B2;
	}



	public void setBtnC4B2(JButton btnC4B2) {
		this.btnC4B2 = btnC4B2;
	}



	public JButton getBtnC4B3() {
		return btnC4B3;
	}



	public void setBtnC4B3(JButton btnC4B3) {
		this.btnC4B3 = btnC4B3;
	}



	public JButton getBtnC4B4() {
		return btnC4B4;
	}



	public void setBtnC4B4(JButton btnC4B4) {
		this.btnC4B4 = btnC4B4;
	}



	public JButton getBtnC4B5() {
		return btnC4B5;
	}



	public void setBtnC4B5(JButton btnC4B5) {
		this.btnC4B5 = btnC4B5;
	}



	public JButton getBtnC4B6() {
		return btnC4B6;
	}



	public void setBtnC4B6(JButton btnC4B6) {
		this.btnC4B6 = btnC4B6;
	}



	public JButton getBtnMyProfile() {
		return btnMyProfile;
	}

	public void setBtnMyProfile(JButton btnMyProfile) {
		this.btnMyProfile = btnMyProfile;
	}

	public JButton getBtnLogIn() {
		return btnLogIn;
	}

	public void setBtnLogIn(JButton btnLogIn) {
		this.btnLogIn = btnLogIn;
	}

	public JButton getBtnBanner() {
		return btnBanner;
	}

	public void setBtnBanner(JButton btnBanner) {
		this.btnBanner = btnBanner;
	}

	public JTextPane getTxtBannerName() {
		return txtBannerName;
	}

	public void setTxtBannerName(JTextPane txtBannerName) {
		this.txtBannerName = txtBannerName;
	}

	public JTextField getTxtPrice() {
		return txtPrice;
	}

	public void setTxtPrice(JTextField txtPrice) {
		this.txtPrice = txtPrice;
	}

	public JButton getBtnBannerOp1() {
		return btnBannerOp1;
	}

	public void setBtnBannerOp1(JButton btnBannerOp1) {
		this.btnBannerOp1 = btnBannerOp1;
	}

	public JButton getBtnBannerOp2() {
		return btnBannerOp2;
	}

	public void setBtnBannerOp2(JButton btnBannerOp2) {
		this.btnBannerOp2 = btnBannerOp2;
	}

	public JButton getBtnBannerOp3() {
		return btnBannerOp3;
	}

	public void setBtnBannerOp3(JButton btnBannerOp3) {
		this.btnBannerOp3 = btnBannerOp3;
	}

	public JTextField getTxtDiscount() {
		return txtDiscount;
	}

	public void setTxtDiscount(JTextField txtDiscount) {
		this.txtDiscount = txtDiscount;
	}
}
