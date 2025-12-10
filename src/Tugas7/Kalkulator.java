package Tugas7;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Kalkulator extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JTextField in = new JTextField();

//        double num1 = 0,num2=0,result=0;
//        char Operator;
//        boolean isOperatorPressed = false; // Status apakah operator baru saja ditekan
    double angka1 = 0, hasil = 0;
    String operator = "";

    JButton a1 = new JButton("1");
    JButton a2 = new JButton("2");
    JButton a3 = new JButton("3");
    JButton a4 = new JButton("4");
    JButton a5 = new JButton("5");
    JButton a6 = new JButton("6");
    JButton a7 = new JButton("7");
    JButton a8 = new JButton("8");
    JButton a9 = new JButton("9");

    JButton at = new JButton("+");
    JButton akr = new JButton("-");
    JButton ab = new JButton("/");
    JButton akl = new JButton("*");

    JButton attk = new JButton(".");
    JButton anol = new JButton("0");
    JButton asd = new JButton("=");

    JButton adel = new JButton("del");
    JButton ac = new JButton("C");

    public Kalkulator() {
        settingFrame();

        in.setBounds(40, 40, 257, 40);
        in.setEditable(false);

        a1.setBounds(40, 100, 50, 50);
        a2.setBounds(110, 100, 50, 50);
        a3.setBounds(177, 100, 50, 50);
        at.setBounds(244, 100, 50, 50);

        a4.setBounds(40, 170, 50, 50);
        a5.setBounds(110, 170, 50, 50);
        a6.setBounds(177, 170, 50, 50);
        akr.setBounds(244, 170, 50, 50);

        a7.setBounds(40, 240, 50, 50);
        a8.setBounds(110, 240, 50, 50);
        a9.setBounds(177, 240, 50, 50);
        akl.setBounds(244, 240, 50, 50);

        attk.setBounds(40, 310, 50, 50);
        anol.setBounds(110, 310, 50, 50);
        asd.setBounds(177, 310, 50, 50);
        ab.setBounds(244, 310, 50, 50);

        adel.setBounds(40, 390, 119, 50);
        ac.setBounds(177, 390, 119, 50);

        // --- Menambah ActionListener ke SEMUA Tombol ---
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        at.addActionListener(this);

        a4.addActionListener(this);
        a5.addActionListener(this);
        a6.addActionListener(this);
        akr.addActionListener(this);

        a7.addActionListener(this);
        a8.addActionListener(this);
        a9.addActionListener(this);
        akl.addActionListener(this);

        anol.addActionListener(this);
        asd.addActionListener(this);
        attk.addActionListener(this);
        ab.addActionListener(this);

        ac.addActionListener(this);
        adel.addActionListener(this);

        frame.add(in);
        frame.add(a1);
        frame.add(a2);
        frame.add(a3);
        frame.add(at);

        frame.add(a4);
        frame.add(a5);
        frame.add(a6);
        frame.add(akr);

        frame.add(a7);
        frame.add(a8);
        frame.add(a9);
        frame.add(akl);

        frame.add(attk);
        frame.add(anol);
        frame.add(asd);
        frame.add(ab);

        frame.add(adel);
        frame.add(ac);

    }

    public void settingFrame() {
        frame.setLayout(null);
        frame.setSize(350, 500);
        frame.setTitle("Kalkulator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Input Angka
        Object source = e.getSource();
        if (source == a1 || source == a2 || source == a3 || source == a4
                || source == a5 || source == a6 || source == a7 || source == a8 
                || source == a9 || source == anol|| source==attk) {

            JButton btn = (JButton) source; // casting ke JButton
            in.setText(in.getText() + btn.getText()); // ambil teks tombol
        }

        // Operator
        if (source == at || source == akr || source == akl || source == ab) {
//            angka1 = Double.parseDouble(in.getText());

            JButton btn = (JButton) source;
            operator = btn.getText();   // otomatis ambil + - * /

            in.setText(in.getText()+operator); // siap input angka kedua
        }

        // Tombol =
        if (e.getSource() == asd) {
            String text = in.getText();
            String[] part = text.split("\\" + operator);

            double angka1 = Double.parseDouble(part[0]);
            double angka2 = Double.parseDouble(part[1]);

            switch (operator) {
                case "+":
                    hasil = angka1 + angka2;
                    break;
                case "-":
                    hasil = angka1 - angka2;
                    break;
                case "*":
                    hasil = angka1 * angka2;
                    break;
                case "/":
                    hasil = angka1 / angka2;
                    break;
            }

            in.setText(String.valueOf(hasil));
        }

        // Tombol C
        if (e.getSource() == ac) {
            in.setText("");
        }

        // Tombol DEL
        if (e.getSource() == adel) {
            String text = in.getText();
            if (!text.isEmpty()) {
                in.setText(text.substring(0, text.length() - 1));
            }
        }
    }

}
