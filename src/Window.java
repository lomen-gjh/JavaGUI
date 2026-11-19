import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {
    //buttons
    JButton hello;
    //Text field
    JTextField entry;
    //Labels
    JLabel label;
    //pannels
    JPanel north, center, south;

    //counter
    int count=0;

    //constructor function - has a same name as class
    public Window(String title, int width, int height){
        //basics - title and dimensions of a new window object
        setSize(width, height);
        setTitle(title);
        //Layout
        setLayout(new BorderLayout());
        //North Panel
        north=new JPanel(); //Define the pannel
        add(north, BorderLayout.NORTH); //Position it at a .NORTH location of the BorderLayout
        hello=new JButton("Hello World!"); //Define the button
        hello.addActionListener(this); //Make hello CLICKABLE in THIS window
        north.add(hello);
        //Label
        label=new JLabel("Enter your name:");
        north.add(label);
        //Text field to write inputs
        entry=new JTextField(15);
        north.add(entry);

        //Center Panel
        center=new JPanel();
        add(center, BorderLayout.CENTER);
        //South Panel
        south=new JPanel();
        add(south, BorderLayout.SOUTH);


        //final touches
        setVisible(true);//if not set, window will not be visible
        setResizable(false);//dont change dimensions of the window
        setDefaultCloseOperation(EXIT_ON_CLOSE);//close the window when clicking the X button
    }

    public static void main(String[] args) {
        Window w=new Window("My first GUI", 800, 600);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==hello){ //check if hello button was clicked
            draw(center.getGraphics());
        }

    }

    public void draw(Graphics g){
       for (int i=0; i<10;i++){
           g.drawRect(i*50,50,50,50);
       }
    }

    public char getFirstLetter(String s){
        return s.charAt(0);
    }

}