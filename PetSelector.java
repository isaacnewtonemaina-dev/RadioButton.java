import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PetSelector extends JFrame {
    private JRadioButton bird, cat, dog, rabbit, pig;
    private ButtonGroup group;
    private JLabel label;

    public PetSelector() {
        setTitle("Selector");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        group = new ButtonGroup();

        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        // Set Pig as default selection to match your layout
        pig.setSelected(true);

        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 1, 5, 5));
        
        panel.add(bird);
        panel.add(cat);
        panel.add(dog);
        panel.add(rabbit);
        panel.add(pig);

        label = new JLabel("Select a pet");
        label.setFont(new Font("Times New Roman", Font.BOLD, 14));
        panel.add(label);

        JButton button = new JButton("Show Selection");
        button.addActionListener(e -> showSelection());
        panel.add(button);

        add(panel);
        setVisible(true);
    }

    private void showSelection() {
        String selectedPet = "";

        if (bird.isSelected()) {
            selectedPet = "Bird";
        } else if (cat.isSelected()) {
            selectedPet = "Cat";
        } else if (dog.isSelected()) {
            selectedPet = "Dog";
        } else if (rabbit.isSelected()) {
            selectedPet = "Rabbit";
        } else if (pig.isSelected()) {
            selectedPet = "Pig";
        }

        JOptionPane.showMessageDialog(this, "You selected: " + selectedPet, "Selection", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PetSelector());
    }
}