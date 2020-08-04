/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bi19110125_payroll;

/**
 *
 * @author RAIZUL RAZALI
 */
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
//import java.awt.Label;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class myABC extend WindowAdapter implements ActionListener
{
    Frame f;
    TextArea textarea;
    Button b[];

    myABC()
    {
        f = new Frame("CALCULATOR");
        f.setSize (300,600);
        f.setVisible (true);
        f.addWindowListener(this);
        f.setLayout (new GridLayout (0,4));
        
        b = new Button[15];
        for (int i = 0; i < b.length; i++)
            {
                b[i] = new Button();
                 f.add(b[i]);
                 b[i].addActionListener (this);
            }

            b[0].setLabel ("0");
            b[1].setLabel ("1");
            b[2].setLabel ("2");
            b[3].setLabel ("3");
            b[4].setLabel ("4");
            b[5].setLabel ("5");
            b[6].setLabel ("6");
            b[7].setLabel ("7");
            b[8].setLabel ("8");
            b[9].setLabel ("9");
            b[10].setLabel ("+");
            b[11].setLabel ("-");
            b[12].setLabel ("*");
            b[13].setLabel ("%");
            b[14].setLabel ("=");
            
        textarea = new TextArea ();
        f.add(textarea);
        f.setBackground(Color.yellow);
    }

    @Override
    public void windowClosing (WindowEvent e){
        System.exit(0); //dispose?
    }
    
    @Override
    public void actionPerformed(ActionEvent e){

            String s = e.getActionCommand();
            textarea.append(s);
            s = textarea.getText();

            if(s.length() == 3) {
                char ch [] = s.toCharArray()
                
                int num1 = Character.getNumericValue(ch[0]);
                int num2 = Character.getNumericValue(ch[2]);
                char op = ch [1];

                double n;
                     if(ch[1] == '+')
                        n = num1+num2;
                     else if (ch[1] == '-')
                        n = num1-num2;
                     else if (ch[1] == '*')
                        n = num1*num2;
                     else
                        n = num1/num2;

                        textarea.setText(Double.toString(n));
            }            
        }
}
public class withAdapter {  
    public static void main (String[] args) {
        myAbc a = new myAbc();
    }
}
        
