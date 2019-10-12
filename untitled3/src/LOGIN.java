import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGIN {
    public LOGIN() {
        JFrame frame = new JFrame("авторизуйтесь");
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel("логин");
        JLabel label2 = new JLabel("пароль");
        JTextField login = new JTextField(10);
        JPasswordField password = new JPasswordField(10);
        JButton button = new JButton("войти");
        panel.add(label1);
        panel.add(login);
        panel.add(label2);
        panel.add(password);
        panel.add(button);
        panel.setBackground(Color.CYAN);
        label1.setForeground(Color.GREEN);
        label2.setForeground(new Color(245));
        button.setBackground(Color.magenta);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setBackground(new Color(
                        panel.getBackground().getRGB() *3));
                if (login.getText().equals("Aleksey") && (password.getText().equals("123"))){
            JOptionPane.showMessageDialog(frame ,"вошол розбийник"); }
            else JOptionPane.showMessageDialog(frame ,"невошол розбийник");
                }


            });
        frame.setContentPane(panel);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
    public static void main(String[] ar) {
        new LOGIN();
    }







}



