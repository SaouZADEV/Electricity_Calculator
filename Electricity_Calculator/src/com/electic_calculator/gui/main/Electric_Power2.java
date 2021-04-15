package com.electic_calculator.gui.main;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class Electric_Power2 {

	protected Shell shell;
	private Text inputP;
	private Text inputV;
	private Text inputR;
	private Text outputP;
	private Text outputV;
	private Text outputR;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public static void CalculatorFront() {
		try {
			Electric_Power2 window = new Electric_Power2();
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
		
		Label lblR = new Label(shell, SWT.NONE);
		lblR.setBounds(10, 283, 15, 20);
		lblR.setText("I");
		
		inputP = new Text(shell, SWT.BORDER);
		inputP.setBounds(33, 173, 208, 26);
		
		inputV = new Text(shell, SWT.BORDER);
		inputV.setBounds(33, 228, 208, 26);
		
		inputR = new Text(shell, SWT.BORDER);
		inputR.setBounds(33, 280, 208, 26);
		
		outputP = new Text(shell, SWT.BORDER);
		outputP.setBounds(391, 173, 208, 26);
		
		outputV = new Text(shell, SWT.BORDER);
		outputV.setBounds(391, 228, 208, 26);
		
		outputR = new Text(shell, SWT.BORDER);
		outputR.setBounds(391, 280, 208, 26);
		
		Button btnCalculate = new Button(shell, SWT.NONE);
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				double p,v,r;
				if (inputP.getText().equals("")){
						v = Double.parseDouble(inputV.getText());
						r = Double.parseDouble(inputR.getText());
						p = (v*v)/r;
						outputP.setText(Double.toString(p));
						outputV.setText(Double.toString(v));
						outputR.setText(Double.toString(r));
				}
				else if(inputV.getText().equals("")){
						p = Double.parseDouble(inputP.getText());
						r = Double.parseDouble(inputR.getText());
						v= Math.sqrt(p*r);
						outputP.setText(Double.toString(p));
						outputV.setText(Double.toString(v));
						outputR.setText(Double.toString(r));
				}
				else if(inputR.getText().equals("")) {
						p = Double.parseDouble(inputP.getText());
						v = Double.parseDouble(inputV.getText());
						r = (v*v)/v;
						outputP.setText(Double.toString(p));
						outputV.setText(Double.toString(v));
						outputR.setText(Double.toString(r));
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
		lblNewLabel_1.setBounds(261, 61, 115, 26);
		lblNewLabel_1.setText("P = V^2 / R");
		
		Label lblNewLabel_2 = new Label(shell, SWT.NONE);
		lblNewLabel_2.setBounds(132, 98, 370, 56);
		lblNewLabel_2.setText("Input the two variables that you know and leave the one \r\n\t          you are looking for empty");
		

}}
