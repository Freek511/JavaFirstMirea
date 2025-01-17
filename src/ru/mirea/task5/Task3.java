package ru.mirea.task5;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task3
{
    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MyFrame extends JFrame
{
    public MyFrame()
    {
        setTitle("Main frame");
        setSize(1920, 1080);
        MyPanel panel = new MyPanel();
        Container pane = getContentPane();
        pane.add(panel);
    }
}
class MyPanel extends JPanel
{
    private Image im;
    public MyPanel()
    {
        try
        {
            Scanner in = new Scanner(System.in);
            String s;
            s = in.nextLine();
            im = ImageIO.read(new File(s));
        }
        catch (IOException ex){}
    }
    public void paint(Graphics g)
    {
        super.paintComponent(g);
        g.drawImage(im, 0, 0, null);
    }
}