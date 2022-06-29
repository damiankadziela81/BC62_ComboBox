import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JComboBox comboBox;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"dog","cat","bird"}; //we need to pass referenced data type, primitives wont work, you need to their wrapper class

        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

        //comboBox.setEditable(true); // - we can type in to search for item
        System.out.println(comboBox.getItemCount());
        comboBox.addItem("mouse");
        System.out.println(comboBox.getItemCount());
        comboBox.insertItemAt("bat", 0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("bird");
        comboBox.removeItemAt(2);
        comboBox.removeAllItems();

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.print(comboBox.getSelectedIndex() + " ");
            System.out.println(comboBox.getSelectedItem());
        }

    }
}
