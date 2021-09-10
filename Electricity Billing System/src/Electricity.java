import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Electricity {
    private JTextField txtcid;
    private JTextField txtname;
    private JButton button1;
    private JTextArea txtprint;
    private JTextField txtunit;
    private JPanel Main;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Electricity");
        frame.setContentPane(new Electricity().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Electricity() {
        button1.addActionListener(new ActionListener() {
            String cid;
            double charge, gramount;
            int count;

            public void print() {
                cid = txtcid.getText();
                String cname = txtname.getText();
                String unit = txtunit.getText();
                txtprint.setText(txtprint.getText() + "\n");
                txtprint.setText(txtprint.getText() + "Electricity Billing system" + "\n");
                txtprint.setText(txtprint.getText() + "\n");
                txtprint.setText(txtprint.getText() + "Customer ID= " + cid + "\n");
                txtprint.setText(txtprint.getText() + "Customer Name= " + cname + "\n");
                txtprint.setText(txtprint.getText() + "Unit= " + unit + "\n");
                txtprint.setText(txtprint.getText() + "Amount= " + gramount + "\n");
                txtprint.setText(txtprint.getText() + "Thank you come again");

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                cid = txtcid.getText();
                count = Integer.parseInt(txtunit.getText());
                if (count < 500) {
                    charge = 1.00;
                } else if (count < 500 && count < 600) {
                    charge = 1.80;
                } else if (count < 600 && count < 800) {
                    charge = 2.80;
                } else {
                    charge = 3.00;
                }
                gramount = charge * count;
                print();
            }

        });
        }
    }
