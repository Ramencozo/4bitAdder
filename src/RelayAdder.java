import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SpinnerListModel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JSpinner;
import javax.swing.JTextPane;


public class RelayAdder extends JFrame{
	
	HalfAdder ha01;
	
	FullAdder fa01;
	FullAdder fa02;
	FullAdder fa03;

	private JLabel ha01ArgsALabel;
	private JLabel fa01ArgsALabel;
	private JLabel fa02ArgsALabel;
	private JLabel fa03ArgsALabel;
	
	private JLabel ha01ArgsBLabel;
	private JLabel fa01ArgsBLabel;
	private JLabel fa02ArgsBLabel;
	private JLabel fa03ArgsBLabel;
	
	private JLabel ha01SLabel;
	private JLabel fa01SLabel;
	private JLabel fa02SLabel;
	private JLabel fa03SLabel;

	private JLabel ha01CLabel;
	private JLabel fa01CLabel;
	private JLabel fa02CLabel;
	private JLabel fa03CLabel;

	private JSpinner spinnerArgsA;
	private JSpinner spinnerArgsB;
	private JTextField resultTextField;
	
	public RelayAdder() {
		ha01 = new HalfAdder();
		
		fa01 = new FullAdder();
		fa02 = new FullAdder();
		fa03 = new FullAdder();
				
		setTitle("リレーを用いた4bit加算器");
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel viewPanel = new JPanel();
		getContentPane().add(viewPanel, BorderLayout.CENTER);
		viewPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel fullAdder03Panel = new JPanel();
		viewPanel.add(fullAdder03Panel);
		fullAdder03Panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		fullAdder03Panel.add(panel_4, BorderLayout.NORTH);
		
		JLabel lblC = new JLabel("C[3]:");
		panel_4.add(lblC);
		
		fa03CLabel = new JLabel("0");
		panel_4.add(fa03CLabel);
		
		JLabel lblS = new JLabel("　S[3]:");
		panel_4.add(lblS);
		
		fa03SLabel = new JLabel("0");
		panel_4.add(fa03SLabel);
		
		JTextPane txtpnFa = new JTextPane();
		txtpnFa.setFont(new Font("Arial", Font.PLAIN, 40));
		txtpnFa.setPreferredSize(new Dimension(80, 80));
		txtpnFa.setText("FA3");
		fullAdder03Panel.add(txtpnFa, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		fullAdder03Panel.add(panel_3, BorderLayout.SOUTH);
		
		JLabel lblA = new JLabel("A[3]:");
		panel_3.add(lblA);
		
		fa03ArgsALabel = new JLabel("0");
		panel_3.add(fa03ArgsALabel);
		
		JLabel lblB_3 = new JLabel("　B[3]:");
		panel_3.add(lblB_3);
		
		fa03ArgsBLabel = new JLabel("0");
		panel_3.add(fa03ArgsBLabel);
		
		JPanel fullAdder02Panel = new JPanel();
		viewPanel.add(fullAdder02Panel);
		fullAdder02Panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_5 = new JPanel();
		fullAdder02Panel.add(panel_5, BorderLayout.NORTH);
		
		JLabel lblC_1 = new JLabel("C[2]:");
		panel_5.add(lblC_1);
		
		fa02CLabel = new JLabel("0");
		panel_5.add(fa02CLabel);
		
		JLabel lblS_1 = new JLabel("　S[2]:");
		panel_5.add(lblS_1);
		
		fa02SLabel = new JLabel("0");
		panel_5.add(fa02SLabel);
		
		JTextPane txtpnFa_1 = new JTextPane();
		txtpnFa_1.setText("FA2");
		txtpnFa_1.setFont(new Font("Arial", Font.PLAIN, 40));
		txtpnFa_1.setPreferredSize(new Dimension(80, 80));
		fullAdder02Panel.add(txtpnFa_1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		fullAdder02Panel.add(panel_2, BorderLayout.SOUTH);
		
		JLabel lblA_1 = new JLabel("A[2]:");
		panel_2.add(lblA_1);
		
		fa02ArgsALabel = new JLabel("0");
		panel_2.add(fa02ArgsALabel);
		
		JLabel lblB_2 = new JLabel("　B[2]:");
		panel_2.add(lblB_2);
		
		fa02ArgsBLabel = new JLabel("0");
		panel_2.add(fa02ArgsBLabel);
		
		JPanel fullAdder01Panel = new JPanel();
		viewPanel.add(fullAdder01Panel);
		fullAdder01Panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		fullAdder01Panel.add(panel_6, BorderLayout.NORTH);
		
		JLabel lblC_2 = new JLabel("C[1]:");
		panel_6.add(lblC_2);
		
		fa01CLabel = new JLabel("0");
		panel_6.add(fa01CLabel);
		
		JLabel lblS_2 = new JLabel("　S[1]:");
		panel_6.add(lblS_2);
		
		fa01SLabel = new JLabel("0");
		panel_6.add(fa01SLabel);
		
		JTextPane txtpnFa_2 = new JTextPane();
		txtpnFa_2.setText("FA1");
		txtpnFa_2.setFont(new Font("Arial", Font.PLAIN, 40));
		txtpnFa_2.setPreferredSize(new Dimension(80, 80));
		fullAdder01Panel.add(txtpnFa_2, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		fullAdder01Panel.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblA_2 = new JLabel("A[1]:");
		panel_1.add(lblA_2);
		
		fa01ArgsALabel = new JLabel("0");
		panel_1.add(fa01ArgsALabel);
		
		JLabel lblB_1 = new JLabel("　B[1]:");
		panel_1.add(lblB_1);
		
		fa01ArgsBLabel = new JLabel("0");
		panel_1.add(fa01ArgsBLabel);
		
		JPanel halfAdder01Panel = new JPanel();
		viewPanel.add(halfAdder01Panel);
		halfAdder01Panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		halfAdder01Panel.add(panel_7, BorderLayout.NORTH);
		
		JLabel lblC_3 = new JLabel("C[0]:");
		panel_7.add(lblC_3);
		
		ha01CLabel = new JLabel("0");
		panel_7.add(ha01CLabel);
		
		JLabel lblS_3 = new JLabel("　S[0]:");
		panel_7.add(lblS_3);
		
		ha01SLabel = new JLabel("0");
		panel_7.add(ha01SLabel);
		
		JTextPane txtpnHa = new JTextPane();
		txtpnHa.setText("HA1");
		txtpnHa.setFont(new Font("Arial", Font.PLAIN, 40));
		txtpnHa.setPreferredSize(new Dimension(80, 80));
		halfAdder01Panel.add(txtpnHa, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		halfAdder01Panel.add(panel, BorderLayout.SOUTH);
		
		JLabel lblA_3 = new JLabel("A[0]:");
		panel.add(lblA_3);
		
		ha01ArgsALabel = new JLabel("0");
		panel.add(ha01ArgsALabel);
		
		JLabel lblB = new JLabel("　B[0]:");
		panel.add(lblB);
		
		ha01ArgsBLabel = new JLabel("0");
		panel.add(ha01ArgsBLabel);
		
		JPanel settingPanel = new JPanel();
		getContentPane().add(settingPanel, BorderLayout.SOUTH);
		
		JLabel lbla = new JLabel("引数A");
		settingPanel.add(lbla);
		
		String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"};

		SpinnerListModel modelA = new SpinnerListModel(number);
		spinnerArgsA = new JSpinner(modelA);
		spinnerArgsA.setPreferredSize(new Dimension(50, 30));
		settingPanel.add(spinnerArgsA);
				
		JLabel lblb = new JLabel("引数B");
		settingPanel.add(lblb);

		SpinnerListModel modelB = new SpinnerListModel(number);
		spinnerArgsB = new JSpinner(modelB);
		spinnerArgsB.setPreferredSize(new Dimension(50, 30));
		settingPanel.add(spinnerArgsB);
		
		JButton calcButton = new JButton("計算");
		calcButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int numA = Integer.parseInt((String)spinnerArgsA.getValue());
				int numB = Integer.parseInt((String)spinnerArgsB.getValue());
				
				boolean[] binaryA = getBinaryFromDecimal(numA, 4);
				boolean[] binaryB = getBinaryFromDecimal(numB, 4);
				
				ha01ArgsALabel.setText((binaryA[0] ? "1" : "0"));
				fa01ArgsALabel.setText((binaryA[1] ? "1" : "0"));
				fa02ArgsALabel.setText((binaryA[2] ? "1" : "0"));
				fa03ArgsALabel.setText((binaryA[3] ? "1" : "0"));

				ha01ArgsBLabel.setText((binaryB[0] ? "1" : "0"));
				fa01ArgsBLabel.setText((binaryB[1] ? "1" : "0"));
				fa02ArgsBLabel.setText((binaryB[2] ? "1" : "0"));
				fa03ArgsBLabel.setText((binaryB[3] ? "1" : "0"));

				int sum = addNum(numA, numB);
				
				if(!fa03.getCarryOut()){
					resultTextField.setText("" + sum);
				}else{
					resultTextField.setText("OverFlow");
				}
				
				boolean[] binarySum = getBinaryFromDecimal(sum, 4);
				ha01SLabel.setText((binarySum[0] ? "1" : "0"));
				fa01SLabel.setText((binarySum[1] ? "1" : "0"));
				fa02SLabel.setText((binarySum[2] ? "1" : "0"));
				fa03SLabel.setText((binarySum[3] ? "1" : "0"));

				ha01CLabel.setText((ha01.getCarry() ? "1" : "0"));
				fa01CLabel.setText((fa01.getCarryOut() ? "1" : "0"));
				fa02CLabel.setText((fa02.getCarryOut() ? "1" : "0"));
				fa03CLabel.setText((fa03.getCarryOut() ? "1" : "0"));
			}
		});
		
		JLabel label = new JLabel("　　計算結果");
		settingPanel.add(label);
		
		resultTextField = new JTextField();
		settingPanel.add(resultTextField);
		resultTextField.setColumns(5);
		
		settingPanel.add(calcButton);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RelayAdder();
	}

	public boolean[] getBinaryFromDecimal(int num, int binaryLength){
		int bit = 0x01;
		boolean[] binary = new boolean[binaryLength];

		for(int i=0; i<binary.length; i++){
			binary[i] = (((num & bit) > 0 ) ? true : false);
			bit <<= 0x01;
		}
		
		return binary;
	}
	
	public int addNum(int numA, int numB){
		System.out.println("A: " + numA + ", B: " + numB);		
		if(numA > 15 || numB > 15){
			System.out.println("Sorry, we can't use the numbers length longer than 4bits.");
			return -1;
		}
		
		boolean[] binaryA = getBinaryFromDecimal(numA, 4);
		boolean[] binaryB = getBinaryFromDecimal(numB, 4);
		
		ha01.setInput(binaryA[0], binaryB[0]);
		fa01.setInput(binaryA[1], binaryB[1], ha01.getCarry());
		fa02.setInput(binaryA[2], binaryB[2], fa01.getCarryOut());
		fa03.setInput(binaryA[3], binaryB[3], fa02.getCarryOut());
		
		int sum = 0;
		sum += (ha01.getSum() ? 1 : 0);
		sum += (fa01.getSum() ? 2 : 0);
		sum += (fa02.getSum() ? 4 : 0);
		sum += (fa03.getSum() ? 8 : 0);
		
		return sum;
	}
}
