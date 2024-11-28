package lk.swlc.assigment.view.user_managment_ui;

import javax.swing.*;
import java.awt.*;

public class UserManagementPanel {
    private JPanel panel;
    private JTextField userField;
    private JButton subscribeButton;
    private JButton unsubscribeButton;

    public UserManagementPanel() {
        initialize();
    }

    private void initialize() {
        panel = new JPanel(new GridLayout(4, 1, 5, 5));

        JLabel userLabel = new JLabel("User Management:");
        userField = new JTextField();
        userField.setToolTipText("Enter user name");
        subscribeButton = new JButton("Subscribe");
        subscribeButton.setToolTipText("Click to subscribe the user");
        unsubscribeButton = new JButton("Unsubscribe");
        unsubscribeButton.setToolTipText("Click to unsubscribe the user");

        panel.add(userLabel);
        panel.add(userField);
        panel.add(subscribeButton);
        panel.add(unsubscribeButton);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextField getUserField() {
        return userField;
    }

    public JButton getSubscribeButton() {
        return subscribeButton;
    }

    public JButton getUnsubscribeButton() {
        return unsubscribeButton;
    }
}
