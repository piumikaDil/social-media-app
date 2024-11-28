package lk.swlc.assigment.view.content_posting_ui;

import javax.swing.*;
import java.awt.*;

public class ContentPanel {
    private JPanel panel;
    private JTextArea contentArea;
    private JButton postButton;

    public ContentPanel() {
        initialize();
    }

    private void initialize() {
        panel = new JPanel(new BorderLayout(5, 5));

        JLabel contentLabel = new JLabel("Post Content:");
        contentArea = new JTextArea(5, 30);
        contentArea.setToolTipText("Enter the content to post");
        postButton = new JButton("Post");
        postButton.setToolTipText("Click to post the content");

        panel.add(contentLabel, BorderLayout.NORTH);
        panel.add(new JScrollPane(contentArea), BorderLayout.CENTER);
        panel.add(postButton, BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextArea getContentArea() {
        return contentArea;
    }

    public JButton getPostButton() {
        return postButton;
    }
}