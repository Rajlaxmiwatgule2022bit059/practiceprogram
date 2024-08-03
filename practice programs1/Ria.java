 import java.awt.*;
import javax.swing.*;

class Riap extends JPanel {
    Riap() {
        this.setBackground(Color.blue);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.black);
        g.setFont(new Font("Helvetica", Font.BOLD, 34));
        g.drawString("Ritu is Muddy", 600, 100);
    }
}

class Ria extends JFrame {
    Ria() {
        super();  
        Container c = this.getContentPane();
        Riap r = new Riap();
        c.add(r);
    }

    public static void main(String[] args) {
        Ria f = new Ria();
        f.setTitle("Ria's frame");
        f.setSize(200, 300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

  
