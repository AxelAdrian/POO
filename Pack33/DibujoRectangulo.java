package Pack33;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class DibujoRectangulo extends JPanel {

    public DibujoRectangulo() {
        setBackground(Color.WHITE);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int anchoRect = 200;
        int altoRect = 280;
        g.drawRect(150, 150, anchoRect, altoRect);
        g.setColor(Color.RED);
    }

}
