import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleForm extends JFrame implements ActionListener {

    private JLabel nameLabel, emailLabel;
    private JTextField nameTextField, emailTextField;
    private JButton submitButton;

    public SimpleForm() {
        super("Simple Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));

        nameLabel = new JLabel("Name:");
        nameTextField = new JTextField();
        add(nameLabel);
        add(nameTextField);

        emailLabel = new JLabel("Email:");
        emailTextField = new JTextField();
        add(emailLabel);
        add(emailTextField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        add(submitButton);
    }

    public void actionPerformed(ActionEvent e) {
   

        // 处理表单数据
        // ...

        JOptionPane.showMessageDialog(this, "Form submitted successfully!");
    }

    public static void main(String[] args) {
        SimpleForm form = new SimpleForm();
        form.setVisible(true);
    }
}
