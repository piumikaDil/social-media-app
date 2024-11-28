package lk.swlc.assigment.view.social_media_app;

//import ui.ContentPanel;
//import ui.LogPanel;
//import ui.UserManagementPanel;

import lk.swlc.assigment.view.content_posting_ui.ContentPanel;
import lk.swlc.assigment.view.login_ui.LogPanel;
import lk.swlc.assigment.view.user_managment_ui.UserManagementPanel;

import javax.swing.*;
import java.awt.*;

public class SocialMediaApp {
    private JFrame frame;

    public SocialMediaApp() {
        initializeUI();
    }

    private void initializeUI() {
        // Main application frame
        frame = new JFrame("Social Media App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 500);
        frame.setLayout(new BorderLayout(10, 10));

        // Adding panels
        ContentPanel contentPanel = new ContentPanel();
        UserManagementPanel userPanel = new UserManagementPanel();
        LogPanel logPanel = new LogPanel();

        frame.add(contentPanel.getPanel(), BorderLayout.CENTER);
        frame.add(userPanel.getPanel(), BorderLayout.EAST);
        frame.add(logPanel.getPanel(), BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SocialMediaApp();
    }
}
