import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class NewLabel extends JLabel {

    NewLabel(){

        this.setText("Welcome!");

        ImageIcon imageIcon = new ImageIcon("src/logo.png");
        this.setIcon(imageIcon);
        Border border = BorderFactory.createLineBorder(Color.ORANGE,5);

        this.setHorizontalTextPosition(JLabel.CENTER);
        this.setVerticalTextPosition(JLabel.TOP);

        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);

        this.setForeground(Color.BLACK);
        this.setFont(new Font("Times New Roman",Font.ITALIC,24));
        this.setIconTextGap(5);

        this.setBorder(border);


        //this.setBounds();
    }

}
