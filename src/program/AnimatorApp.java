package program;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnimatorApp extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    final AnimatorApp frame = new AnimatorApp();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     * @param //delay
     */
    public AnimatorApp() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        int ww = 1200, wh = 800;
        setBounds((screen.width-ww)/2, (screen.height-wh)/2, ww, wh);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        AnimPanel kanwa = new AnimPanel();
        kanwa.setBounds(10, 10, 600, 400);
        contentPane.add(kanwa);
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                kanwa.initialize();
            }
        });

        JButton btnAdd = new JButton("Add");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kanwa.addFig();
            }
        });
        btnAdd.setBounds(10, 420, 120, 30);
        contentPane.add(btnAdd);

        JButton btnAnimate = new JButton("Animate");
        btnAnimate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                kanwa.animate();
            }
        });
        btnAnimate.setBounds(150, 420, 120, 30);
        contentPane.add(btnAnimate);

        JButton btnAddOval = new JButton("Add Oval");
        btnAddOval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kanwa.addOval();
            }
        });
        btnAddOval.setBounds(10, 460, 120, 30);
        contentPane.add(btnAddOval);

        JButton btnAddRectangle = new JButton("Add Rectangle");
        btnAddRectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kanwa.addRectangle();
            }
        });
        btnAddRectangle.setBounds(150, 460, 120, 30);
        contentPane.add(btnAddRectangle);

        JButton btnAddTriangle = new JButton("Add Triangle");
        btnAddTriangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kanwa.addTriangle();
            }
        });
        btnAddTriangle.setBounds(10, 500, 120, 30);
        contentPane.add(btnAddTriangle);

        JButton btnAddSquare = new JButton("Add Square");
        btnAddSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kanwa.addSquare();
            }
        });
        btnAddSquare.setBounds(150, 500, 120, 30);
        contentPane.add(btnAddSquare);

        JButton btnAddCircle = new JButton("Add Circle");
        btnAddCircle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kanwa.addCircle();
            }
        });
        btnAddCircle.setBounds(10, 540, 120, 30);
        contentPane.add(btnAddCircle);

    }

}