import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class QuestionTwo_01200644d {
    private JPanel framePanel;
    private JLabel mainLabel;
    private JTextField SalestextField;
    private JLabel salesLabel;
    private JTextField PercentageTextField;
    private JLabel percentageLabel;
    private JButton calculateButton;
    private JLabel commissionLabel;
    private JTextField CommissionTextField;
    private JButton resetButton;


    public QuestionTwo_01200644d(){
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Double totalSales = Double.parseDouble(SalestextField.getText());
                Double percentage = Double.parseDouble(PercentageTextField.getText())/100;
                Double commission = totalSales*percentage;

                CommissionTextField.setText(String.valueOf(commission));



            }
        });
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SalestextField.setText("");
                PercentageTextField.setText("");
                CommissionTextField.setText("0");
            }
        });

    }

    public static void main(String[] args) {
        JFrame frame= new JFrame("Commission Calculator");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(455,224);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setContentPane(new QuestionTwo_01200644d().framePanel);
        frame.pack();

    }














}

