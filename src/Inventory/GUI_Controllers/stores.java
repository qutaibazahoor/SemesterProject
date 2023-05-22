package Inventory.GUI_Controllers;

import Inventory.Services.UserService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class stores extends JFrame {
    JLabel reportsLabel =new JLabel("Stores");
    ImageIcon img=new ImageIcon("C:\\Users\\Qutaiba Zahoor\\IdeaProjects\\InventoryManagementSystem\\src\\Inventory\\Resources\\vectorBackground.png");
    JLabel background =new JLabel("",img,JLabel.CENTER);
    JTable itemReport=new JTable();
    JButton delete=new JButton("delete");
    JMenuBar MenuBar=new JMenuBar();
    JMenu menuItem=new JMenu("Options");
    JMenuItem profile=new JMenuItem("Profile");
    JMenuItem items=new JMenuItem("Items");
    JMenuItem stores=new JMenuItem("Stores");
    JMenuItem reports=new JMenuItem("Reports");
    JMenuItem signOut=new JMenuItem("SignOut");
    JMenuItem Menu=new JMenuItem("Menu");
    JMenuItem AdminControls=new JMenuItem("AdminControls");
    JTextField search=new JTextField();
    JButton searchButton=new JButton("Search User");
    JLabel searchLabel=new JLabel("Enter Id to search");
    public stores(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(383,100,600,468);

        reportsLabel.setBounds(375,50,300,50);
        reportsLabel.setFont(new Font(Font.MONOSPACED,Font.BOLD,44));

        background.setBounds(0,0,600,468);
        itemReport.setBounds(20,50,320,300);
        MenuBar.setBounds(0,0,600,20);
        MenuBar.add(menuItem);
        MenuBar.setOpaque(false);
        MenuBar.setBorderPainted(false);

        menuItem.add(profile);
        menuItem.add(reports);
        menuItem.add(items);
        menuItem.add(stores);
        menuItem.add(signOut);
        menuItem.add(Menu);
        if(UserService.user_role.equals("Admin")) {
            menuItem.add(AdminControls);
        }
        search.setSize(200,30);
        search.setLocation(370,239-20);

        searchButton.setSize(100,30);
        searchButton.setLocation(420,339-50);
        searchButton.setFont(new Font(Font.SERIF,Font.ITALIC,11));
        searchButton.setOpaque(false);

        searchLabel.setSize(200,30);
        searchLabel.setLocation(370,195);
        searchLabel.setFont(new Font(Font.MONOSPACED,Font.ITALIC,12));

        delete.setSize(100,30);
        delete.setLocation(130,380);
        delete.setFont(new Font(Font.SERIF,Font.ITALIC,11));
        delete.setOpaque(false);

        Menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Menu();
            }
        });
        profile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new UserProfile();
            }
        });
        signOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Login();
            }
        });
        reports.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new Reports();
            }
        });
        AdminControls.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new AdminControls();
            }
        });
        items.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new items();
            }
        });

        add(search);
        add(delete);
        add(reportsLabel);
        add(searchButton);
        add(searchLabel);
        add(MenuBar);
        add(itemReport);
        add(background);
        setVisible(true);
    }
}
