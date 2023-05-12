import javax.swing.*;
import java.awt.*;
import java.awt.Frame;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("СВЕТОФОР"); // создание окна с заголовком "Мое окно"
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
                g.fillOval(188, 185, 75, 75);
                g2d.setColor(Color.YELLOW);
                g.fillOval(188, 285, 75, 75);
                g2d.setColor(Color.GREEN);
                g.fillOval(188, 385, 75, 75);
                g2d.setColor(Color.BLACK);
                g.fillRoundRect(185, 505, 70, 80, 20, 20);
                g2d.setColor(Color.BLACK);
                g.fillArc(173, 125, 105, 40, -180, -180);




                g2d.setColor(Color.BLACK);
                this.paintThing(145, 180, true, g);
                this.paintThing(145, 280, true, g);
                this.paintThing(145, 380, true, g);
                this.paintThing(305, 180, false, g);
                this.paintThing(305, 280, false, g);
                this.paintThing(305, 380, false, g);

                g2d.setColor(Color.WHITE);
                Area area = new Area(new Ellipse2D.Double(185, 165, 80, 80));
                Area temp = new Area(new Ellipse2D.Double(185, 180, 80, 80));
                area.subtract(temp);
                g2d.fill(area);


                area = new Area(new Ellipse2D.Double(185, 265, 80, 80));
                temp = new Area(new Ellipse2D.Double(185, 280, 80, 80));
                area.subtract(temp);
                g2d.fill(area);


                area = new Area(new Ellipse2D.Double(185, 365, 80, 80));
                temp = new Area(new Ellipse2D.Double(185, 380, 80, 80));
                area.subtract(temp);
                g2d.fill(area);


            }


            public void paintThing(int x, int y, boolean isLeft, Graphics g) {

                Graphics2D g2D = (Graphics2D) g;
                if (isLeft) {
                    g2D.fillOval(x - 20, y, 20, 20);
                    g2D.fillOval(x - 55, y, 20, 20);
                    g2D.fillOval(x - 20, y + 36, 20, 20);
                    Polygon p = new Polygon();
                    p.addPoint(x - 10, y);
                    p.addPoint(x - 45, y);
                    p.addPoint(x - 53, y + 17);
                    p.addPoint(x - 17, y + 53);
                    p.addPoint(x, y + 45);
                    p.addPoint(x, y + 10);
                    g2D.fillPolygon(p);
                } else {
                    g2D.fillOval(x, y, 20, 20);
                    g2D.fillOval(x + 36, y, 20, 20);
                    g2D.fillOval(x, y + 36, 20, 20);
                    Polygon p = new Polygon();
                    p.addPoint(x + 10, y);
                    p.addPoint(x + 45, y);
                    p.addPoint(x + 53, y + 17);
                    p.addPoint(x + 17, y + 53);
                    p.addPoint(x, y + 45);
                    p.addPoint(x, y + 10);
                    g2D.fillPolygon(p);
                }


            }
        };
        frame.setContentPane(panel);



        frame.setVisible(true); // отображение окна
    }


}
