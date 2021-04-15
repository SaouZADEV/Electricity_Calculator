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
		Electric_pr1_formular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Electric_Power1 pr1 = new Electric_Power1();
				pr1.CalculatorFront();
			}
		});
		Electric_pr1_formular.setBounds(60, 210, 90, 30);
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
		lblElectricityFormulas.setBounds(20, 169, 171, 20);
		lblElectricityFormulas.setText("Electricity Power Formula");
		
		Label lblNewLabel_1 = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblNewLabel_1.setBounds(265, 250, 135, 20);
		lblNewLabel_1.setText("P = Power (watts, W)");
		
		Label lblNewLabel_2 = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblNewLabel_2.setBounds(265, 280, 151, 20);
		lblNewLabel_2.setText("V = Voltage (volts, V)");
		
		Label lblNewLabel_3 = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblNewLabel_3.setText("I = Current (ampare, A)");
		lblNewLabel_3.setBounds(265, 310, 151, 20);
		
		Label lblNewLabel_4 = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblNewLabel_4.setBounds(265, 340, 166, 20);
		lblNewLabel_4.setText("R = Resistance (ohm, \u03A9)");
		
		Button Electric_pr2_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_pr2_formular.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				Electric_Power2 pr2 = new Electric_Power2();
				pr2.CalculatorFront();
			}
		});
		Electric_pr2_formular.setBounds(60, 255, 90, 30);
		Electric_pr2_formular.setText("P = V^2 / R");
		
		Button Electric_pr3_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_pr3_formular.setBounds(60, 304, 90, 30);
		Electric_pr3_formular.setText("P = R * I^2");
		
		Label lblElectricityResistanceFormula = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblElectricityResistanceFormula.setBounds(20, 395, 195, 20);
		lblElectricityResistanceFormula.setText("Electricity Resistance Formula");
		
		Button Electric_rs1_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_rs1_formular.setText("R = V / I");
		Electric_rs1_formular.setBounds(60, 430, 90, 30);
		
		Button Electric_rs2_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_rs2_formular.setBounds(60, 476, 90, 30);
		Electric_rs2_formular.setText("R = P / I^2");
		
		Button Electric_rs3_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_rs3_formular.setBounds(60, 522, 90, 30);
		Electric_rs3_formular.setText("R = V^2 / P");
		
		Label lblElectricityVoltageFormula = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblElectricityVoltageFormula.setBounds(529, 169, 184, 20);
		lblElectricityVoltageFormula.setText("Electricity Voltage Formula");
		
		Button Electric_vo1_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_vo1_formular.setBounds(567, 210, 90, 30);
		Electric_vo1_formular.setText("New Button");
		
		Button Electric_vo2_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_vo2_formular.setBounds(567, 255, 90, 30);
		Electric_vo2_formular.setText("New Button");
		
		Button Electric_vo3_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_vo3_formular.setBounds(567, 305, 90, 30);
		Electric_vo3_formular.setText("New Button");
		
		Label lblElectricityCurrentFormula = new Label(shlElectricityEquationsCalculator, SWT.NONE);
		lblElectricityCurrentFormula.setBounds(529, 395, 184, 20);
		lblElectricityCurrentFormula.setText("Electricity Current Formula");
		
		Button Electric_cur1_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_cur1_formular.setBounds(567, 430, 90, 30);
		Electric_cur1_formular.setText("New Button");
		
		Button Electric_cur2_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_cur2_formular.setBounds(567, 476, 90, 30);
		Electric_cur2_formular.setText("New Button");
		
		Button Electric_cur3_formular = new Button(shlElectricityEquationsCalculator, SWT.NONE);
		Electric_cur3_formular.setBounds(567, 522, 90, 30);
		Electric_cur3_formular.setText("New Button");

	}
}
