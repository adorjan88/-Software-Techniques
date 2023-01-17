import javax.swing.*;
import java.awt.*;

public class NewFrame extends JFrame {

    NewFrame(){
        this.setTitle("JFrame window");
        this.setSize(480,480);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

        this.setResizable(false); //-> frame cannot be resized
        ImageIcon imageIcon = new ImageIcon("src/logo.png"); // src/ !
        this.setIconImage(imageIcon.getImage());
        this.getContentPane().setBackground(new Color(3,90,252));

        //this.setLayout(null);

        this.setVisible(true);

    }

}
