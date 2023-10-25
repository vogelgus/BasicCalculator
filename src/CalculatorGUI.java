import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI implements ActionListener {

    private JFrame mainFrame;
    Calculator myCalculator = new Calculator();


    private JPanel panel;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JPanel panel5;
    private JLabel box;
    private JButton exponent;
    private JButton cubed;
    private JButton squared;
    private JButton add;
    private JButton subtract;
    private JButton multiply;
    private JButton divide;
    private JButton equal;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton zero;
    private JButton clear;
    private int num1;
    private int num2;
    public Color perriwinkle = new Color(134, 192, 247);

    public Font BTN_FNT = new Font(Font.MONOSPACED,Font.BOLD,50);
    public Font NMBR_FNT = new Font(Font.MONOSPACED,Font.BOLD,20);
    private String operation;


    public static void main(String[] args) {
        CalculatorGUI myCalculatorGUI = new CalculatorGUI();
    }

    public CalculatorGUI() {


        mainFrame = new JFrame();

        box = new JLabel();
        box.setFont(BTN_FNT);
        box.setPreferredSize(new Dimension(600,100));
        box.setForeground(Color.white);

        exponent = new JButton("x^y");
        exponent.addActionListener(this); //makes button clickable
        exponent.setForeground(perriwinkle);
        exponent.setFont(NMBR_FNT);

        cubed = new JButton("x^3");
        cubed.addActionListener(this); //makes button clickable
        cubed.setForeground(perriwinkle);
        cubed.setFont(NMBR_FNT);

        squared = new JButton("x^2");
        squared.addActionListener(this); //makes button clickable
        squared.setForeground(perriwinkle);
        squared.setFont(NMBR_FNT);

        add = new JButton("+");
        add.addActionListener(this); //makes button clickable
        add.setForeground(perriwinkle);
        add.setFont(NMBR_FNT);

        subtract = new JButton("-");
        subtract.addActionListener(this); //makes button clickable
        subtract.setForeground(perriwinkle);
        subtract.setFont(NMBR_FNT);

        multiply = new JButton("*");
        multiply.addActionListener(this); //makes button clickable
        multiply.setForeground(perriwinkle);
        multiply.setFont(NMBR_FNT);

        divide = new JButton("÷");
        divide.addActionListener(this); //makes button clickable
        divide.setForeground(perriwinkle);
        divide.setFont(NMBR_FNT);

        equal = new JButton("=");
        equal.addActionListener(this); //makes button clickable
        equal.setForeground(perriwinkle);
        equal.setFont(BTN_FNT);

        one = new JButton("1");
        one.addActionListener(this); //makes button clickable
        one.setForeground(perriwinkle);
        one.setFont(BTN_FNT);


        two = new JButton("2");
        two.addActionListener(this); //makes button clickable
        two.setForeground(perriwinkle);
        two.setFont(BTN_FNT);

        three = new JButton("3");
        three.addActionListener(this); //makes button clickable
        three.setForeground(perriwinkle);
        three.setFont(BTN_FNT);

        four = new JButton("4");
        four.addActionListener(this); //makes button clickable
        four.setForeground(perriwinkle);
        four.setFont(BTN_FNT);

        five = new JButton("5");
        five.addActionListener(this); //makes button clickable
        five.setForeground(perriwinkle);
        five.setFont(BTN_FNT);

        six = new JButton("6");
        six.addActionListener(this); //makes button clickable
        six.setForeground(perriwinkle);
        six.setFont(BTN_FNT);

        seven = new JButton("7");
        seven.addActionListener(this); //makes button clickable
        seven.setForeground(perriwinkle);
        seven.setFont(BTN_FNT);

        eight = new JButton("8");
        eight.addActionListener(this); //makes button clickable
        eight.setForeground(perriwinkle);
        eight.setFont(BTN_FNT);

        nine = new JButton("9");
        nine.addActionListener(this); //makes button clickable
        nine.setForeground(perriwinkle);
        nine.setFont(BTN_FNT);

        zero = new JButton("0");
        zero.addActionListener(this); //makes button clickable
        zero.setForeground(perriwinkle);
        zero.setFont(BTN_FNT);

        clear = new JButton("C");
        clear.addActionListener(this); //makes button clickable
        clear.setForeground(perriwinkle);
        clear.setFont(BTN_FNT);


        panel = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        box.setSize(600,100);

        panel2.setLayout(new GridLayout(4, 3));
        panel2.add(one);
        panel2.add(two);
        panel2.add(three);
        panel2.add(four);
        panel2.add(five);
        panel2.add(six);
        panel2.add(seven);
        panel2.add(eight);
        panel2.add(nine);
        panel2.add(clear);
        panel2.add(zero);
        panel2.add(equal);



        panel3.setLayout(new GridLayout(8, 1));
        panel3.add(exponent);
        panel3.add(cubed);
        panel3.add(squared);
        panel3.add(multiply);
        panel3.add(divide);
        panel3.add(add);
        panel3.add(subtract);

        panel.setLayout(new BorderLayout()); // sets up layout for the button and panel
        panel.add(box, BorderLayout.NORTH);
        panel.add(panel2, BorderLayout.CENTER);
        panel.add(panel3, BorderLayout.EAST);


        mainFrame.add(panel);
        mainFrame.setBackground(perriwinkle);
        panel.setBackground(perriwinkle);
        panel2.setBackground(perriwinkle);
        panel3.setBackground(perriwinkle);
        mainFrame.setSize(400, 600);

        mainFrame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object buttonClicked = e.getSource();

        if (buttonClicked == one) {
            box.setText(box.getText() + "1");


        }

        if (buttonClicked == two) {
            box.setText(box.getText() + "2");


        }

        if (buttonClicked == three) {
            box.setText(box.getText() + "3");


        }
        if (buttonClicked == four) {
            box.setText(box.getText() + "4");


        }
        if (buttonClicked == five) {
            box.setText(box.getText() + "5");


        }

        if (buttonClicked == six) {
            box.setText(box.getText() + "6");


        }
        if (buttonClicked == seven) {
            box.setText(box.getText() + "7");

        }
        if (buttonClicked == eight) {
            box.setText(box.getText() + "8");


        }
        if (buttonClicked == nine) {
            box.setText(box.getText() + "9");


        }
        if (buttonClicked == zero) {
            box.setText(box.getText() + "0");


        }

        if (buttonClicked == multiply) {
            num1 = Integer.parseInt(box.getText()); //turns the string in the label box into an int
            System.out.println(num1);
            box.setText(""); //clears the text box to create num2
            operation = "multiply";

        }


        if (buttonClicked == divide) {
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText(""); //clears the text box to create num2
            operation = "divide";


        }

        if (buttonClicked == add) {
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText(""); //clears the text box to create num2
            operation = "add";
        }

        if (buttonClicked == subtract) {
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText(""); //clears the text box to create num2
            operation = "subtract";


        }

        if (buttonClicked == squared) {
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText(""+ (myCalculator.square(num1))); //will immediately print the squared value into the text box


        }

        if (buttonClicked == cubed) {
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText("" + (myCalculator.cubed(num1))); //will immediately print the squared value into the text box


        }

        if (buttonClicked == exponent) {
            num1 = Integer.parseInt(box.getText());
            System.out.println(num1);
            box.setText(""); //clears the text box to create num2
            operation = "exponent";

        }

        if (buttonClicked == clear) {
            box.setText("");

        }

        if (buttonClicked == equal) {
            Integer.parseInt(box.getText()); //converts the number that's in the box after the operation into num2
            num2 = Integer.parseInt(box.getText()); //converts the number that's in the box after the operation into num2
            if (operation == "multiply") {
                System.out.println(num1 * num2);
                box.setText("" + (myCalculator.multiply(num1,num2)));
            }
            if (operation == "divide") {
                System.out.println(num1 / num2);
                box.setText("" + (myCalculator.divide(num1,num2)));
            }
            if (operation == "add") {
                System.out.println(num1 + num2);
                box.setText("" + (myCalculator.add(num1,num2)));
            }
            if (operation == "subtract") {
                System.out.println(num1 - num2);
                box.setText("" + (myCalculator.subtract(num1,num2)));
            }
            if (operation == "exponent"){
                box.setText("" + (myCalculator.exponent(num1, num2)));
                if(num2==0){
                    box.setText("1");
                }
            }

        }


            System.out.println(box.getText());


        }
    }


