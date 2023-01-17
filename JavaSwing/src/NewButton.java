import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewButton extends JButton implements ActionListener {

    NewButton(String string){
        this.setBounds(185,350,100,50);
        this.addActionListener(this);
        this.setText(string);
        this.setBackground(Color.ORANGE);
        this.setBorder(BorderFactory.createEtchedBorder());

    }


     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this){
            System.out.println("Pushed Button");
        }

    }


}
