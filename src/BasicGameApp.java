import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BasicGameApp implements MouseListener, MouseMotionListener, KeyListener, Runnable {

    final int WIDTH = 1000;
    final int HEIGHT = 700;

    public JFrame frame;
    public Canvas canvas;
    public JPanel panel;
    public BufferStrategy bufferStrategy;

    public int mouseX, mouseY;

    public Button button1;

    public static void main(String[] args) {
        BasicGameApp myApp = new BasicGameApp();   //creates a new instance of the game
        new Thread(myApp).start();               //creates a threads & starts up the code in the run( ) method
    }

    public BasicKeyboardApp() {

        setUpGraphics();
        canvas.addMouseListener(this);
        canvas.addMouseMotionListener(this);
        canvas.addKeyListener(this);


    }

    public BasicGameApp() {

        setUpGraphics();
        canvas.addKeyListener(this);
    }

    public void render() {
        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.clearRect(0, 0, WIDTH, HEIGHT);
        g.dispose();
        bufferStrategy.show();
    }

    public void keyPressed(KeyEvent event) {
        char key = event.getKeyChar();
        int keyCode = event.getKeyCode();
        System.out.println("Key Pressed: " + key + "  Code: " + keyCode);
    }

    public void keyReleased(KeyEvent event) {
        char key = event.getKeyChar();
        int keyCode = event.getKeyCode();
    }

    public void keyTyped(KeyEvent event) {
    }

    public void setUpGraphics() {
        frame = new JFrame("CheeseWorld");

        panel = (JPanel) frame.getContentPane();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setLayout(null);   //set the layout


        canvas = new Canvas();
        canvas.setBounds(0, 0, WIDTH, HEIGHT);
        canvas.setIgnoreRepaint(true);

        panel.add(canvas);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);

        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        canvas.requestFocus();
        System.out.println("DONE graphic setup");

    }

    public void pause(int time) {
        //sleep
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {

        }

        public void mouseClicked{

            int x, y;
            x = e.getX();
            y = e.getY();

            mouseX = x;
            mouseY = y;
            System.out.println();
            System.out.println("Mouse Clicked at " + x + ", " + y);

            if (button1.rec.contains(x, y)) {
                System.out.println("TIMER STARTED");
                startTime = System.currentTimeMillis();
                startTimer = true;
            }

        }

        public void mousePressed (MouseEvent) {
                System.out.println();
        System.out.println("Mouse Button Pressed");
        }

        public void mouseReleased (MouseEvent) {


                System.out.println();
        System.out.println("Mouse Button Released");
        }

        @Override
        public void mouseEntered (MouseEvent e){
            System.out.println();
            System.out.println("Mouse has entered the window");

        }

        @Override
        public void mouseExited (MouseEvent e){
            System.out.println();
            System.out.println("Mouse has left the window");

        }

        public void mouseDragged (MouseEvent e){
            System.out.println("Mouse is being dragged");
        }

        public void mouseMoved(MouseEvent e){

        }


    }