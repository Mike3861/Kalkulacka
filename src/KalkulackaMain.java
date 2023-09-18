import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KalkulackaMain extends JFrame {




    double PrveCsilo = 0.0;
    double DruheCsilo = 0.0;
    double vysledok = 0.0;

    int plus = 0;
    int minus = 0;
    int nasobenie = 0;
    int delenie = 0;

    private JButton Plus;
    private JButton plusMinus;
    private JButton a0Button;
    public JPanel MainPanel;
    private JButton Rovna;
    private JButton a2Button;
    private JButton a1Button;
    private JButton Minus;
    private JButton a5Button;
    private JButton a4Button;
    private JButton Krat;
    private JButton a8Button;
    private JButton a7Button;
    private JButton Ciarka;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton Delene;
    private JTextField Displej;
    private JButton Reset;
    private JTextField DisplejOut;

    public void vymaz(){
        Displej.setText("");
        DisplejOut.setText("");
    }

    public KalkulackaMain (){

        setContentPane(MainPanel);
        setSize(340,550);
        setTitle("");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);

        Displej.setHorizontalAlignment(JTextField.RIGHT);
        DisplejOut.setHorizontalAlignment(JTextField.RIGHT);



        Reset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                vymaz();

            }
        });
        a0Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Displej.setText(Displej.getText() + a0Button.getText());
            }
        });
        a1Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Displej.setText(Displej.getText() + a1Button.getText());
            }
        });
        a2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Displej.setText(Displej.getText() + a2Button.getText());
            }
        });
        a3Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Displej.setText(Displej.getText() + a3Button.getText());
            }
        });
        a4Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Displej.setText(Displej.getText() + a4Button.getText());
            }
        });
        a5Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Displej.setText(Displej.getText() + a5Button.getText());
            }
        });
        a6Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Displej.setText(Displej.getText() + a6Button.getText());
            }
        });
        a7Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Displej.setText(Displej.getText() + a7Button.getText());
            }
        });
        a8Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Displej.setText(Displej.getText() + a8Button.getText());
            }
        });
        a9Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Displej.setText(Displej.getText() + a9Button.getText());
            }
        });
        plusMinus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                PrveCsilo= Double.parseDouble(Displej.getText());
                vymaz();
                PrveCsilo *= -1;
                Displej.setText(String.valueOf(PrveCsilo));
                DisplejOut.setText(String.valueOf(PrveCsilo));
            }
        });
        Ciarka.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                Displej.setText(Displej.getText() + Ciarka.getText());


            }
        });


        //-----------------------------vzorce---------------------------------------------
        Plus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                PrveCsilo = Double.parseDouble(Displej.getText());
                plus++;
                vymaz();
                DisplejOut.setText(PrveCsilo + "+");
            }
        });
        Minus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                PrveCsilo = Double.parseDouble(Displej.getText());
                minus++;
                vymaz();
                DisplejOut.setText(PrveCsilo + "-");
            }
        });
        Krat.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                PrveCsilo = Double.parseDouble(Displej.getText());
                nasobenie++;
                vymaz();
                DisplejOut.setText(PrveCsilo + "*");
            }
        });
        Delene.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                PrveCsilo = Double.parseDouble(Displej.getText());
                delenie++;
                vymaz();
                DisplejOut.setText(PrveCsilo + "/");
            }
        });
        Rovna.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                DruheCsilo = Double.parseDouble(Displej.getText());

                if (plus > 0){
                    vysledok = PrveCsilo + DruheCsilo;
                    Displej.setText(String.valueOf(vysledok));
                    plus=0;
                    DisplejOut.setText("");
                }

                if (minus> 0){
                    vysledok = PrveCsilo - DruheCsilo;
                    Displej.setText(String.valueOf(vysledok));
                    minus=0;
                    DisplejOut.setText("");
                }

                if (nasobenie > 0){
                    vysledok = PrveCsilo * DruheCsilo;
                    Displej.setText(String.valueOf(vysledok));
                    nasobenie=0;
                    DisplejOut.setText("");
                }

                if (delenie > 0){
                    vysledok = PrveCsilo / DruheCsilo;
                    Displej.setText(String.valueOf(vysledok));
                    delenie=0;
                    DisplejOut.setText("");
                }




            }
        });


    }


    public static void main(String[] args) {
        new KalkulackaMain();

    }



}

