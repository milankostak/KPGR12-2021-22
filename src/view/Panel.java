package view;

import rasterize.Raster;
import rasterize.RasterBufferedImage;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    private final RasterBufferedImage imageBuffer;

    private static final int WIDTH = 800, HEIGHT = 600;

    Panel() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        imageBuffer = new RasterBufferedImage(WIDTH, HEIGHT);
        imageBuffer.setClearColor(Color.BLACK.getRGB());
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        imageBuffer.repaint(g);
    }

    public Raster getImageBuffer() {
        return imageBuffer;
    }

}
