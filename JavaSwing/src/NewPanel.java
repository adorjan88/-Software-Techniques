import javax.swing.*;
import java.awt.*;

public class NewPanel extends JPanel {

    NewPanel(Color color, int x, int y){ //to set multiple panels with different backgrounds and sizes.

        this.setBackground(color);
        this.setBounds(0,0,x,y);

    }
}
