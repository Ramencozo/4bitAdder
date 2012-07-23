// 半加算器クラス
// EXOR回路一個、AND回路一個
// 1bit + 1bit の演算。EXORが加算結果、ANDが桁上げ。
// 0 + 0 = 0, 桁上げ 0 
// 0 + 1 = 1, 桁上げ 0 　 真理値表的に見ると、
// 1 + 0 = 1, 桁上げ 0  　加算結果SはEXOR、桁上げCはAND
// 1 + 1 = 0, 桁上げ 1 
public class HalfAdder{
		
	EXOR exOrGate;
	AND andGate;
	
	boolean sum;
	boolean carry;
	
	public HalfAdder() {
		exOrGate = new EXOR();
		andGate = new AND();
		
		sum = false;
		carry = false;
	}
	
	public void setInput(boolean inputA, boolean inputB){
		exOrGate.setInput(inputA, inputB);
		andGate.setInput(inputA, inputB);
		
		sum = exOrGate.getOutput();
		carry = andGate.getOutput();
	}
	
	public boolean getSum(){
		return sum;
	}
	
	public boolean getCarry(){
		return carry;
	}
}
