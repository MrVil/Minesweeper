package com.polytech.minesweeper.view.windows;

import com.polytech.minesweeper.controleur.actionListeners.OnCancelClicked;
import com.polytech.minesweeper.controleur.actionListeners.OnQuitClicked;
import com.polytech.minesweeper.controleur.actions.Quit;

import javax.swing.*;

/**
 * Created by Guyl.B on 09/06/15.
 */
public class NewGame extends JFrame{

    private JPanel main_panel;;
    private JTextField width_field;
    private JTextField height_field;
    private JTextField bomb_field;
    private JButton ok_button;
    private JButton cancel_button;

    public NewGame(){
        super();

        main_panel = new JPanel();

        this.setContentPane(main_panel);

        JLabel label = new JLabel("Configuration :");
        height_field = new JTextField();
        width_field = new JTextField();
        bomb_field = new JTextField();
        JLabel height_label = new JLabel("Hauteur");
        JLabel bomb_label = new JLabel("Nombre de bombes");
        JLabel width_label = new JLabel("Largeur");
        JButton okButton = new JButton("Ok");
        JButton cancelButton = new JButton("Annuler");


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                        .addComponent(label)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(height_label)
                                                        .addComponent(width_label)
                                                        .addComponent(bomb_label)
                                                        .addComponent(okButton)
                                        )
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(height_field)
                                                        .addComponent(width_field)
                                                        .addComponent(bomb_field)
                                                        .addComponent(cancelButton)
                                        )
                                )
                        )
        );
        layout.linkSize(SwingConstants.HORIZONTAL, okButton, cancelButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label)
                        )
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                               .addComponent(height_label)
                                               .addComponent(height_field)
                                       )
                                       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                               .addComponent(width_label)
                                               .addComponent(width_field)
                                       )
                                       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                               .addComponent(bomb_label)
                                               .addComponent(bomb_field)
                                       )
                                       .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                               .addComponent(okButton)
                                               .addComponent(cancelButton)
                                       )
                                )
                        )
        );

        cancelButton.addActionListener(new OnCancelClicked(this));
        this.setTitle("Nouvelle partie");
        this.setSize(400, 170);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

    }

    private void createLabeledField (String label, JTextField field){
        JPanel result = new JPanel();
        result.add(new JLabel(label));
        result.add(field);
    }

    private JButton createActionedButton (Action action, String label ){
        JButton result = new JButton();
        result.setAction(action);
        result.setText(label);
        return result;
    }

}
