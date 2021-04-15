package com.electic_calculator.gui.main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import com.electic_calculator.methods.Electric_Power1_medthod;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Electric_Power1 {

	protected Shell shell;
	private Text inputP;
	private Text inputV;
	private Text inputI;
	private Text outputP;
	private Text outputV;
	private Text outputI;

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
		shell.setSize(650, 299);
		shell.setText("Electricity Equations Calculator");
		
		Label lblP = new Label(shell, SWT.NONE);
		lblP.setBounds(10, 25, 15, 20);
		lblP.setText("P");
		
		Label lblV = new Label(shell, SWT.NONE);
		lblV.setBounds(10, 70, 15, 20);
		lblV.setText("V");
		
		Label lblI = new Label(shell, SWT.NONE);
		lblI.setBounds(10, 116, 15, 20);
		lblI.setText("I");
		
		inputP = new Text(shell, SWT.BORDER);
		inputP.setBounds(33, 19, 208, 26);
		
		inputV = new Text(shell, SWT.BORDER);
		inputV.setBounds(33, 70, 208, 26);
		
		inputI = new Text(shell, SWT.BORDER);
		inputI.setBounds(33, 116, 208, 26);
		
		outputP = new Text(shell, SWT.BORDER);
		outputP.setBounds(391, 22, 208, 26);
		
		outputV = new Text(shell, SWT.BORDER);
		outputV.setBounds(391, 67, 208, 26);
		
		outputI = new Text(shell, SWT.BORDER);
		outputI.setBounds(391, 113, 208, 26);
		
		Button btnCalculate = new Button(shell, SWT.NONE);
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				double p,v,i;
				if (inputP.getText().equals("")){
						v = Double.parseDouble(inputV.getText());
						i = Double.parseDouble(inputI.getText());
						//Electric_Power1_medthod pr1 = new Electric_Power1_medthod();
						p = v*i;
						outputP.setText(Double.toString(p));
						outputV.setText(Double.toString(v));
						outputI.setText(Double.toString(i));
				}
				else if(inputV.getText().equals("")){
						p = Double.parseDouble(inputP.getText());
						i = Double.parseDouble(inputI.getText());
						//Electric_Power1_medthod pr1 = new Electric_Power1_medthod();
						v= p/i;
						outputP.setText(Double.toString(p));
						outputV.setText(Double.toString(v));
						outputI.setText(Double.toString(i));
				}
				else if(inputI.getText().equals("")) {
						p = Double.parseDouble(inputP.getText());
						v = Double.parseDouble(inputV.getText());
						//Electric_Power1_medthod pr1 = new Electric_Power1_medthod();
						i = p/v;
						outputP.setText(Double.toString(p));
						outputV.setText(Double.toString(v));
						outputI.setText(Double.toString(i));
			}
			}
		});
		btnCalculate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {}
		});
		btnCalculate.setBounds(267, 192, 90, 30);
		btnCalculate.setText("Calculate");
		
		

	}
}
