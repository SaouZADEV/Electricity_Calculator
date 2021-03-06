package com.electic_calculator.gui.main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;


import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.wb.swt.SWTResourceManager;

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
		shell.setSize(650, 450);
		shell.setText("Electricity Equations Calculator");
		
		Label lblP = new Label(shell, SWT.NONE);
		lblP.setBounds(10, 176, 15, 20);
		lblP.setText("P");
		
		Label lblV = new Label(shell, SWT.NONE);
		lblV.setBounds(10, 231, 15, 20);
		lblV.setText("V");
		
		Label lblI = new Label(shell, SWT.NONE);
		lblI.setBounds(10, 283, 15, 20);
		lblI.setText("I");
		
		inputP = new Text(shell, SWT.BORDER);
		inputP.setBounds(33, 173, 208, 26);
		
		inputV = new Text(shell, SWT.BORDER);
		inputV.setBounds(33, 228, 208, 26);
		
		inputI = new Text(shell, SWT.BORDER);
		inputI.setBounds(33, 280, 208, 26);
		
		outputP = new Text(shell, SWT.BORDER);
		outputP.setBounds(391, 173, 208, 26);
		
		outputV = new Text(shell, SWT.BORDER);
		outputV.setBounds(391, 228, 208, 26);
		
		outputI = new Text(shell, SWT.BORDER);
		outputI.setBounds(391, 280, 208, 26);
		
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
		btnCalculate.setBounds(273, 327, 90, 30);
		btnCalculate.setText("Calculate");
		
		Label lblNewLabel = new Label(shell, SWT.NONE);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 20, SWT.NORMAL));
		lblNewLabel.setBounds(163, 10, 315, 45);
		lblNewLabel.setText("Electic Power Formula");
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblNewLabel_1.setBounds(284, 61, 69, 26);
		lblNewLabel_1.setText("P = V*I");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(132, 98, 370, 56);
		lblNewLabel_2.setText("Input the two variables that you know and leave the one \r\n\t          you are looking for empty");
		
		

	}
}
