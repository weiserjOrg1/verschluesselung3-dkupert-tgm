package dkupert.cipher;

import javax.swing.*;

import dkupert.cipher.Exceptions.CipherException;

import java.awt.*;
import java.awt.ActiveEvent.*;
import java.awt.event.*;

/**
 * This class listens to ActionEvents and decides what to do with them
 * 
 * @author dkupert
 * @version 2018-10-18
 */
public class GUICipherController implements ActionListener{
	private GUICipherModel m1;
	private GUICipherView v1;
	
	
	
	@Override
	/**
	 * Is called whenever a ActionEvent is created
	 * The method decides which Action to perform based on the ActionEvent
	 * @param e : the ActionEvent in question
	*/
	public void actionPerformed(ActionEvent e) {
		if(this.v1.isB1(e)) {
			try {
				v1.changeMod();
			} catch (NumberFormatException | CipherException e1) {
				v1.exceptionMessage(e1.toString());
				v1.blockText();
			}
			v1.refresh();
		}
		if(this.v1.isB2(e)) {
			v1.b2Reset();
			v1.refresh();
		}
		if(this.v1.isB3(e)) {
			v1.Encrypt();
			v1.refresh();
		}
		if(this.v1.isB4(e)) {
			v1.b4Reset();
			v1.refresh();
		}
		if(this.v1.isB5(e)) {
			v1.Decrypt();
			v1.refresh();
		}
		if(this.v1.isB6(e)) {
			v1.b6Reset();
			v1.refresh();
		}
		
	}
	//Constructor
	/**
	 * This is the default constructor for this class. It initializes the Model and View Object
	 */
	public GUICipherController() {
		this.m1 = new GUICipherModel();
		this.v1 = new GUICipherView(this.m1, this);
		
		
	}


}
