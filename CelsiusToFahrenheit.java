import java.awt.*;

import java.awt.event.*;
public class CelsiusToFahrenheit extends Frame
    implements WindowListener, ActionListener
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextField Celsius;
    private TextField Fahrenheit;
    private int c;
    private int f;
    private double conF;
    private double conC;
    private double conK;
    private TextField Kelvin;
    private Button btnf;
    private Button btnc;
    private Button btnk;
    public CelsiusToFahrenheit ()
    {
	setLayout (new FlowLayout ());

	this.add (new Label ("Celsius"));

	Celsius = new TextField ("", 10);
	Celsius.setEditable (true);
	this.add (Celsius);

	btnc = new Button ("CONVERT");
	this.add (btnc);

	this.add (new Label ("Fahrenheit"));

	Fahrenheit = new TextField ("", 10);
	this.add (Fahrenheit);

	btnf = new Button ("CONVERT!");
	this.add (btnf);

	this.add (new Label ("Kelvin"));

	Kelvin = new TextField ("", 10);
	this.add (Kelvin);

	btnk = new Button ("CONVERT");
	this.add (btnk);

	btnc.addActionListener (this);
	btnk.addActionListener (this);
	btnf.addActionListener (this);
	addWindowListener (this);
	setSize (120, 300);
	setResizable(true);
	setVisible (true);

    }


    public static void main (String[] args)
    {

	new CelsiusToFahrenheit ();

	// Place your program here.  'c' is the output console
    } // main method


    public void actionPerformed (ActionEvent evt)
    {
	//Executes when Fahrenheit button is pressed
	if (evt.getSource () == btnf)
	{
	    conF = Double.parseDouble (Fahrenheit.getText ());
	    conC = Math.round ((conF - 32) * 5 / 9);
	    conK = Math.round (conC + 273.15);
	    Celsius.setText (String.valueOf (conC));
	    Kelvin.setText (String.valueOf (conK));
	    //System.out.println (conK);
	}
	//Executes when Celsius button is pressed
	if (evt.getSource () == btnc)
	{
	    conC = Double.parseDouble (Celsius.getText ());
	    conF = Math.round (conC * 9 / 5 + 32);
	    conK = Math.round (conC + 273.15);
	    Fahrenheit.setText (String.valueOf (conF));
	    Kelvin.setText (String.valueOf (conK));
	}
	//Executes when Kelvin button is pressed
	if (evt.getSource () == btnk)
	{
	    conK = Double.parseDouble (Kelvin.getText ());
	    conC = Math.round (conK - 273.15);
	    conF = Math.round (conC * 9 / 5 + 32);
	    Celsius.setText (String.valueOf (conC));
	    Fahrenheit.setText (String.valueOf (conF));
	    //System.out.println (conK);
	}

    }


    public void windowClosing (WindowEvent e)
    {
	System.exit(0);
    }


    // Called-back when the user attempts to close the window by clicking the window close button.
    // This is the most-frequently used handler.
    public void windowOpened (WindowEvent e)
    {
    }


    // Called-back the first time a window is made visible.
    public void windowClosed (WindowEvent e)
    {
    }


    // Called-back when a window has been closed as the result of calling dispose on the window.
    public void windowActivated (WindowEvent e)
    {
    }


    // Called-back when the Window is set to be the active Window.
    public void windowDeactivated (WindowEvent e)
    {
    }


    // Called-back when a Window is no longer the active Window.
    public void windowIconified (WindowEvent e)
    {
    }


    // Called-back when a window is changed from a normal to a minimized state.
    public void windowDeiconified (WindowEvent e)
    {
    }


    // Called-back when a window is changed from a minimized to a normal state.


} // CelsiusToFahrenheit class