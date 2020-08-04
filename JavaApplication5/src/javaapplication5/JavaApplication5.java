/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

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
    }
}
        
