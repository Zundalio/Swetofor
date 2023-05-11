import javax.swing.*;
import java.awt.*;
import java.awt.Frame;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Мое окно"); // создание окна с заголовком "Мое окно"
        frame.setSize(500, 700); // установка размеров окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна при нажатии на крестик

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(150, 150, 150, 350, 20, 20);
                g2d.setColor(Color.RED);
                g.fillOval(188,185,75,75);
                g2d.setColor(Color.YELLOW);
                g.fillOval(188,285,75,75);
                g2d.setColor(Color.GREEN);
                g.fillOval(188, 385,75,75);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(185, 505, 70, 80, 20, 20);
                g2d.setColor(Color.BLACK);
                g.fillArc(173, 125,105,40,-180,-180);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(90,300, 55, 10, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(135,300, 10, 55, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(90,200, 55, 10, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(135,200, 10, 55, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(90,400, 55, 10, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(135,400, 10, 55, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(303,400, 55, 10, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(303,400, 10, 55, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(303,300, 55, 10, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(303,300, 10, 55, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(303,200, 55, 10, 10, 10);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(303,200, 10, 55, 10, 10);
                int xp[]= {395,440,438};
                int yp[]= {377,375,420};
                g.fillPolygon(xp,yp,3);







            }
        };
        frame.setContentPane(panel);



        frame.setVisible(true); // отображение окна
    }


}
