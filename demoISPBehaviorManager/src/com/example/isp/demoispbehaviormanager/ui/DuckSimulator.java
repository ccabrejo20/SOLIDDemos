package com.example.isp.demoispbehaviormanager.ui;

import com.example.isp.demoispbehaviormanager.client.animals.DecoyDuck;
import com.example.isp.demoispbehaviormanager.client.animals.Duck;
import com.example.isp.demoispbehaviormanager.client.animals.MallardDuck;
import com.example.isp.demoispbehaviormanager.client.animals.ModelDuck;
import com.example.isp.demoispbehaviormanager.client.animals.RedheadDuck;
import com.example.isp.demoispbehaviormanager.client.animals.RubberDuck;
import com.example.isp.demoispbehaviormanager.flycomponents.FlyBehavior;
import com.example.isp.demoispbehaviormanager.flycomponents.FlyNoWay;
import com.example.isp.demoispbehaviormanager.flycomponents.FlyRocketPowered;
import com.example.isp.demoispbehaviormanager.flycomponents.FlyWithWings;
import com.example.isp.demoispbehaviormanager.quackcomponents.MuteQuack;
import com.example.isp.demoispbehaviormanager.quackcomponents.Quack;
import com.example.isp.demoispbehaviormanager.quackcomponents.QuackBehavior;
import com.example.isp.demoispbehaviormanager.quackcomponents.Squeak;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Dimension;
import java.util.Arrays;
import java.util.List;

public class DuckSimulator {

    private JButton simulateButton;
    private JComboBox ducksCombo;
    private JComboBox quackCombo;
    private JComboBox flyCombo;
    private JPanel mainPanel;
    private JLabel duckImage;
    private JTextArea duckResult;
    private Duck duckSelected;

    public DuckSimulator() {
        loadDucks();
        loadFlyBehaviors();
        loadQuackBehaviors();
        loadDuckImage();

        ducksCombo.addItemListener(e -> {
                    loadDuckImage();
                }
        );
        simulateButton.addActionListener(e -> {
                    duckResult.setText("");
                    duckSelected.setFlyBehavior((FlyBehavior) flyCombo.getSelectedItem());
                    duckSelected.setQuackBehavior((QuackBehavior) quackCombo.getSelectedItem());
                    duckResult.setText(duckSelected.display() + "\n" + duckSelected.performQuack() + "\n" + duckSelected.performFly());
                }
        );
    }

    public void loadDucks() {
        List<Duck> duckList = Arrays.asList(new MallardDuck(), new ModelDuck(), new RedheadDuck(), new RubberDuck(), new DecoyDuck());
        DefaultComboBoxModel dml = new DefaultComboBoxModel();
        duckList.forEach(duck -> dml.addElement(duck));
        ducksCombo.setModel(dml);
    }

    public void loadFlyBehaviors() {
        List<FlyBehavior> flyBehaviors = Arrays.asList(new FlyNoWay(), new FlyRocketPowered(), new FlyWithWings());
        DefaultComboBoxModel dml = new DefaultComboBoxModel();
        flyBehaviors.forEach(flyBehavior -> dml.addElement(flyBehavior));
        flyCombo.setModel(dml);
    }

    public void loadQuackBehaviors() {
        List<QuackBehavior> quackBehaviors = Arrays.asList(new MuteQuack(), new Quack(), new Squeak());
        DefaultComboBoxModel dml = new DefaultComboBoxModel();
        quackBehaviors.forEach(quackBehavior -> dml.addElement(quackBehavior));
        quackCombo.setModel(dml);
    }

    private void loadDuckImage() {
        duckSelected = (Duck) ducksCombo.getSelectedItem();
        duckImage.setIcon(new ImageIcon(getClass().getResource(
                "../resources/" + duckSelected.toString() + ".jpg")));
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("DuckSimulator");
        jFrame.setContentPane(new DuckSimulator().mainPanel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setPreferredSize(new Dimension(600, 300));
        jFrame.pack();
        jFrame.setVisible(true);

    }

}
