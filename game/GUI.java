package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUI {
    private JFrame frame = new JFrame("Pokemon Program");

    public GUI(){
        frame.setSize(1280, 720);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        initPlayer();
    }

    private void initPlayer(){
        JPanel contentPane = new JPanel();
        JTextField name = new JTextField("Enter your name", 15);
        JLabel label = new JLabel("Select your starter: "), error = new JLabel("Error");
        JCheckBox charm = new JCheckBox("Charmander"), squirt = new JCheckBox("Squirtle"), bulb = new JCheckBox("Bulbasaur");
        JButton submit = new JButton("Begin your adventure!");
        ButtonGroup bg = new ButtonGroup();
        GridBagConstraints c = new GridBagConstraints();

        contentPane.setLayout(new GridBagLayout());
        bg.add(charm);
        bg.add(squirt);
        bg.add(bulb);
        error.setVisible(false);

        submit.addActionListener((ActionEvent arg0) -> {
            int type = -1;
            if(bg.getSelection()==null)
                error.setVisible(true);
            else{
                if(charm.isSelected())
                    type=2;
                 else if(squirt.isSelected())
                    type=3;
                 else if(bulb.isSelected())
                    type = 1;
                 menu(new Player(name.getText(), type, new Pokedex()));
            }

        });


        c.insets=new Insets(10,0,10,0);
        c.gridwidth=3;
        contentPane.add(name,c);
        c.gridy = 1;
        contentPane.add(label,c);
        c.gridwidth=1;
        c.gridy = 2;
        contentPane.add(charm,c);
        c.gridx=1;
        contentPane.add(squirt,c);
        c.gridx=2;
        contentPane.add(bulb,c);
        c.gridwidth=3;
        c.gridx=0;
        c.gridy=3;
        contentPane.add(submit,c);
        c.gridy=4;
        contentPane.add(error,c);
        frame.setContentPane(contentPane);

    }

    private void menu(Player player){

    }

}