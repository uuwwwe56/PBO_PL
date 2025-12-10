package Game;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class KeyEvent extends JFrame implements KeyListener, ActionListener {
    
    JFrame frame = new JFrame();
    JLabel kotak = new JLabel();
    JLabel[] peluru = new JLabel[10];
    JLabel[] musuh = new JLabel[5];
    JLabel labelScore = new JLabel("Score : 0");

    ImageIcon pesawat;
    Timer timerTembak;

    int wf, hf;
    int x, y;
    int i = 0;
    int score = 0;
    
    public KeyEvent() {

        wf = 400;
        hf = 500;

        frame.setTitle("Aplikasi Keyboard");
        frame.setSize(wf, hf);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.addKeyListener(this);

        // Buat semua komponen dulu sebelum timer dijalankan
        buatPesawat();
        buatPeluru();
        buatMusuhBanyak();

        labelScore.setBounds(10, 10, 200, 20);
        frame.add(labelScore);

        frame.setVisible(true);

        // Timer mulai terakhir setelah semua siap
        timerTembak = new Timer(10, this);
        timerTembak.start();
    }
    
    // ============================================================
    // PESAWAT
    // ============================================================
    public void buatPesawat() {
        x = (400/2) - 50/2;
        y = 400;

//        pesawat = new ImageIcon(this.getClass().getResource("pesawat.gif"));
//        kotak.setIcon(pesawat);
        kotak.setBackground(Color.red);
        kotak.setOpaque(true);
        kotak.setBounds(x, y, 50, 50);
        frame.add(kotak);
    }

    // ============================================================
    // PELURU
    // ============================================================
    public void buatPeluru() {
        for (int a = 0; a < peluru.length; a++) {
            peluru[a] = new JLabel();
            peluru[a].setBackground(Color.red);
            peluru[a].setOpaque(true);
            peluru[a].setBounds(0, 0, 5, 15);
            peluru[a].setVisible(false);
            frame.add(peluru[a]);
        }
    }

    // ============================================================
    // MUSUH (20x20)
    // ============================================================
    public void buatMusuhBanyak() {
        for (int m = 0; m < musuh.length; m++) {
            musuh[m] = new JLabel();
            musuh[m].setOpaque(true);
            musuh[m].setBackground(Color.blue);

            int randomX = (int)(Math.random() * (wf - 20));
            int randomY = (int)(Math.random() * 200);

            musuh[m].setBounds(randomX, randomY, 20, 20);
            frame.add(musuh[m]);
        }
    }

    // ============================================================
    // RESPWAN MUSUH
    // ============================================================
    public void respawnMusuh(int index) {
        int randomX = (int)(Math.random() * (wf - 20));
        musuh[index].setLocation(randomX, 0);
    }

    // ============================================================
    // GERAK PELURU
    // ============================================================
    public void tembak() {
        for (int p = 0; p < peluru.length; p++) {

            if (peluru[p] == null) continue; // aman dari error

            if (peluru[p].isVisible()) {
                peluru[p].setLocation(peluru[p].getX(), peluru[p].getY() - 4);

                if (peluru[p].getY() < 0)
                    peluru[p].setVisible(false);
            }
        }
    }

    // ============================================================
    // GERAK MUSUH
    // ============================================================
    public void gerakMusuh() {
        for (int m = 0; m < musuh.length; m++) {

            if (musuh[m] == null) continue;

            musuh[m].setLocation(musuh[m].getX(), musuh[m].getY() + 1);

            if (musuh[m].getY() > hf)
                respawnMusuh(m);

            if (cekTabrakan(kotak, musuh[m])) {
                gameOver();
                return;
            }
        }
    }

    // ============================================================
    // CEK TABRAKAN LABEL A & B
    // ============================================================
    public boolean cekTabrakan(JLabel a, JLabel b) {
        return a.getBounds().intersects(b.getBounds());
    }

    // ============================================================
    // CEK TEMBAKAN
    // ============================================================
    public void cekTembakan() {
        for (int p = 0; p < peluru.length; p++) {

            if (peluru[p] == null) continue;
            if (!peluru[p].isVisible()) continue;

            for (int m = 0; m < musuh.length; m++) {

                if (cekTabrakan(peluru[p], musuh[m])) {

                    peluru[p].setVisible(false);

                    respawnMusuh(m);

                    score += 10;
                    labelScore.setText("Score : " + score);
                }
            }
        }
    }

    // ============================================================
    // GAME OVER
    // ============================================================
    public void gameOver() {
        timerTembak.stop();

        JLabel over = new JLabel("GAME OVER");
        over.setBounds(130, 200, 200, 40);
        over.setForeground(Color.red);
        over.setFont(over.getFont().deriveFont(24f));

        frame.add(over);
        frame.repaint();
    }

    // ============================================================
    // KEY EVENT
    // ============================================================
    @Override
    public void keyPressed(java.awt.event.KeyEvent e) {
        switch (e.getKeyCode()) {
            case 37:
                if (kotak.getX() > 0)
                    kotak.setLocation(kotak.getX() - 10, kotak.getY());
                break;

            case 39:
                if (kotak.getX() < 350)
                    kotak.setLocation(kotak.getX() + 10, kotak.getY());
                break;

            case 32: // SPACE
                peluru[i].setLocation(kotak.getX() + 25, kotak.getY() - 10);
                peluru[i].setVisible(true);

                i++;
                if (i >= peluru.length) i = 0;
                break;
        }
    }

    @Override public void keyTyped(java.awt.event.KeyEvent e) {}
    @Override public void keyReleased(java.awt.event.KeyEvent e) {}

    // ============================================================
    // TIMER
    // ============================================================
    @Override
    public void actionPerformed(ActionEvent e) {
        tembak();
        gerakMusuh();
        cekTembakan();
    }
}
