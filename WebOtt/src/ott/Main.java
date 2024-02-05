package ott;
//import java.sql.*;
//import java.io.*;
//
//public class Main {
//	public static void main(String args[]) {
//		System.out.println("hey there ");
//		Connection conn=null;
//		Statement stmt=null;
//		ResultSet rs=null;
//		try {
//			Class.forName("org.postgresql.Driver");
//			conn=DriverManager.getConnection("jdbc:postgresql://localhost/sarthak","postgres","root");
//			if(conn==null) {
//				System.out.println("COnnection failed");
//			}else {
//				System.out.println("connection successful");
//				stmt=conn.createStatement();
//				rs=stmt.executeQuery("SELECT * FROM shubh");
//				while(rs.next()) {
//					System.out.println("Roll No = "+rs.getInt(1));
//					System.out.println("Name = "+rs.getString(2));
//					
//			}
//				conn.close();
//			}
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//}


//package Navigation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    public Main() {
        setTitle("Navigation Bar Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton homeButton = new JButton("Delete");
        JButton aboutButton = new JButton("About");
        JButton contactButton = new JButton("Contact");

        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked Home button");
            }
        });

        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked About button");
            }
        });

        contactButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked Contact button");
            }
        });

        panel.add(homeButton);
        panel.add(aboutButton);
        panel.add(contactButton);

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });
    }
}
