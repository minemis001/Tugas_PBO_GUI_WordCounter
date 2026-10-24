import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AplikasiPenghitungKata extends JFrame implements ActionListener {

    private JTextArea textArea;
    private JLabel labelStatus;
    private JButton btnHitung, btnRiset;

    public AplikasiPenghitungKata() {

        setTitle("Aplikasi Penghitung Kata & Karakter");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        setLayout(new BorderLayout(10, 10));

        textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(textArea); 

        JPanel panelBawah = new JPanel(); 
        panelBawah.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); 

        btnHitung = new JButton("Hitung");
        btnRiset = new JButton("Reset");
        labelStatus = new JLabel("Jumlah Kata: 0 | Jumlah Karakter: 0");

        panelBawah.add(btnHitung);
        panelBawah.add(btnRiset);
        panelBawah.add(labelStatus);

        add(scrollPane, BorderLayout.CENTER);
        add(panelBawah, BorderLayout.SOUTH);

        btnHitung.addActionListener(this);
        btnRiset.addActionListener(this);

        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                hitungKataDanKarakter();
            }
        });
    }

    private void hitungKataDanKarakter() {
        String teks = textArea.getText().trim();
        int jumlahKarakter = teks.length();
        int jumlahKata = teks.isEmpty() ? 0 : teks.split("\\s+").length;

        labelStatus.setText("Jumlah Kata: " + jumlahKata + " | Jumlah Karakter: " + jumlahKarakter);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnHitung) {
            hitungKataDanKarakter();
            JOptionPane.showMessageDialog(this, "Perhitungan selesai!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnRiset) {
            textArea.setText("");
            labelStatus.setText("Jumlah Kata: 0 | Jumlah Karakter: 0");
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new AplikasiPenghitungKata().setVisible(true);
        });
    }
}