package lk.swlc.assigment.view.login_ui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LogPanel {
    private JPanel panel;
    private JTextArea logArea;

    public LogPanel() {
        initialize();
    }

    private void initialize() {
        // Main panel with padding and modern border
        panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(new Color(245, 245, 250));

        // Title Label with modern font and alignment
        JLabel logLabel = new JLabel("🔍 Action Log");
        logLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
        logLabel.setForeground(new Color(55, 55, 55));
        logLabel.setHorizontalAlignment(SwingConstants.LEFT);

        // Text area for logs with rounded borders and scroll pane
        logArea = new JTextArea(10, 30);
        logArea.setEditable(false);
        logArea.setFont(new Font("Consolas", Font.PLAIN, 12));
        logArea.setForeground(new Color(33, 37, 41));
        logArea.setBackground(new Color(240, 240, 240));
        logArea.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
                BorderFactory.createEmptyBorder(5, 5, 5, 5)
        ));

        JScrollPane scrollPane = new JScrollPane(logArea);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        scrollPane.getViewport().setBackground(new Color(240, 240, 240));
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        // Adding components to the panel
        panel.add(logLabel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);
    }

    public JPanel getPanel() {
        return panel;
    }

    public JTextArea getLogArea() {
        return logArea;
    }
}
