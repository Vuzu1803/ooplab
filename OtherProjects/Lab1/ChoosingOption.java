import javax.swing.JOptionPane;

public class ChoosingOption {
    public static void main(String[] args) throws Exception{
        //⦁	How to customize the options to users, e.g. only two options: “Yes” and “No”, OR “I do” and “I don’t”
        String allOptions[] = new String[] {"Yes", "No"};
        int MyOption = JOptionPane.showOptionDialog(null,
        "Do you want to change to the fist class ticket?", "title", 
        JOptionPane.DEFAULT_OPTION, 0, null, allOptions, allOptions[0]);
        JOptionPane.showMessageDialog(null, "You've choosen "+ (MyOption==JOptionPane.YES_OPTION?"Yes.":"No."));
        System.exit(0);
    }
}