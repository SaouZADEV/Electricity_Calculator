package com.electic_calculator.gui.main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

public class Electric_Power1 {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;
	private Text text_3;
	private Text text_4;
	private Text text_5;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void CalculatorFront() {
		try {
			Electric_Power1 window = new Electric_Power1();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("Electricity Equations Calculator");
		
		Label lblP = new Label(shell, SWT.NONE);
		lblP.setBounds(10, 25, 70, 20);
		lblP.setText("P");
		
		Label lblV = new Label(shell, SWT.NONE);
		lblV.setBounds(10, 70, 70, 20);
		lblV.setText("V");
		
		Label lblI = new Label(shell, SWT.NONE);
		lblI.setBounds(10, 116, 70, 20);
		lblI.setText("I");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(33, 19, 78, 26);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(33, 70, 78, 26);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(33, 116, 78, 26);
		
		text_3 = new Text(shell, SWT.BORDER);
		text_3.setBounds(281, 19, 78, 26);
		
		text_4 = new Text(shell, SWT.BORDER);
		text_4.setBounds(281, 70, 78, 26);
		
		text_5 = new Text(shell, SWT.BORDER);
		text_5.setBounds(281, 116, 78, 26);
		
		

	}
}
