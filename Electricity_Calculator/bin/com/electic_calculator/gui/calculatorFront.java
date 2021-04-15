package com.electic_calculator.gui.main;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class calculatorFront {

	protected Shell shlElectricityEquationsCalculator;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			calculatorFront window = new calculatorFront();
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
		shlElectricityEquationsCalculator.open();
		shlElectricityEquationsCalculator.layout();
		while (!shlElectricityEquationsCalculator.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlElectricityEquationsCalculator = new Shell();
		shlElectricityEquationsCalculator.setSize(759, 693);
		shlElectricityEquationsCalculator.setText("Electricity Equations Calculator");
		
		Button Electric_pr1_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_pr1_formular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		Electric_pr1_formular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Electric_Power1 pr1 = new Electric_Power1();
				pr1.CalculatorFront();
			}
		});
		Electric_pr1_formular.setBounds(50, 210, 90, 30);
		Electric_pr1_formular.setText("P = V * I");
		
		Label lblNewLabel = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblNewLabel.setAlignment(SWT.CENTER);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 24, SWT.NORMAL));
		lblNewLabel.setBounds(98, 32, 549, 54);
		lblNewLabel.setText("Electricity Equations Calculator");
		
		Label lblClickOnThe = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblClickOnThe.setAlignment(SWT.CENTER);
		lblClickOnThe.setBounds(217, 123, 308, 20);
		lblClickOnThe.setText("Click on the equation you want to calculator");
		
		Label lblElectricityFormulas = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblElectricityFormulas.setBounds(51, 169, 135, 20);
		lblElectricityFormulas.setText("Electricity Formulas");
		
		Label lblNewLabel_1 = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblNewLabel_1.setBounds(265, 190, 135, 20);
		lblNewLabel_1.setText("P = Power (watts, W)");
		
		Label lblNewLabel_2 = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblNewLabel_2.setBounds(265, 220, 151, 20);
		lblNewLabel_2.setText("V = Voltage (volts, V)");
		
		Label lblNewLabel_3 = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblNewLabel_3.setText("I = Current (ampare, A)");
		lblNewLabel_3.setBounds(265, 250, 151, 20);
		
		Label lblNewLabel_4 = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblNewLabel_4.setBounds(265, 280, 166, 20);
		lblNewLabel_4.setText("R = Resistance (ohm, \u03A9)");

	}
}
