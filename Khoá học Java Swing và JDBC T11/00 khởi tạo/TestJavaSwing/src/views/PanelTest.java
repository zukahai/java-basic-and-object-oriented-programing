package views;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;

public class PanelTest extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelTest frame = new PanelTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PanelTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 823, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// JSplitPane
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(35, 68, 392, 59);
		splitPane.setDividerLocation(200);
		contentPane.add(splitPane);
		
		// JTabbedPane
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(35, 166, 210, 159);
		contentPane.add(tabbedPane);
		
		JPanel panel1 = new JPanel();
        panel1.add(new JLabel("This is Tab 1"));
        tabbedPane.addTab("Tab 1", null, panel1, "Go to Tab 1");

        JPanel panel2 = new JPanel();
        panel2.add(new JButton("Click Me!"));
        tabbedPane.addTab("Tab 2", null, panel2, "Go to Tab 2");

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.PINK);
        tabbedPane.addTab("Tab 3", null, panel3, "Go to Tab 3");
        
        // JToolBar
        JToolBar toolBar = new JToolBar();
        toolBar.setBounds(485, 71, 194, 43);
        contentPane.add(toolBar);
        
     // Thêm nút vào thanh công cụ
        JButton newButton = new JButton("New");
        newButton.addActionListener(e -> System.out.println("New clicked!"));
        toolBar.add(newButton);

        JButton openButton = new JButton("Open");
        openButton.addActionListener(e -> System.out.println("Open clicked!"));
        toolBar.add(openButton);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(e -> System.out.println("Save clicked!"));
        toolBar.add(saveButton);

        toolBar.addSeparator();

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> System.exit(0));
        toolBar.add(exitButton);
        
        JDesktopPane desktopPane = new JDesktopPane();
        desktopPane.setBounds(334, 166, 433, 296);
        contentPane.add(desktopPane);
        
        JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
        internalFrame.setBounds(32, 25, 227, 165);
        desktopPane.add(internalFrame);
        
        JInternalFrame internalFrame_1 = new JInternalFrame("New JInternalFrame");
        internalFrame_1.setBounds(269, 104, 142, 165);
        desktopPane.add(internalFrame_1);
        internalFrame_1.setVisible(true);
        internalFrame.setVisible(true);

	}
}
