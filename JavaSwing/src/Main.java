
public class Main {

    public static void main(String[] args){

        NewFrame frame = new NewFrame();
        NewLabel label = new NewLabel();
        NewButton button = new NewButton("Push me");


        //NewPanel panel1 = new NewPanel(Color.CYAN,250,250);
        //NewPanel panel2 = new NewPanel(Color.BLACK,250,250);

        label.add(button);
        frame.add(label);

        //frame.add(panel1);
        //frame.add(panel2);

        //frame.pack(); //-> add labels in order to pack

    }
}