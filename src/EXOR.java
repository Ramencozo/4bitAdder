public class EXOR{
	
	Relay reley01;
	Relay reley02;
	
	boolean outputF;
	
	public EXOR() {
		reley01 = new Relay();
		reley02 = new Relay();
		
		outputF = false;
	}
	
	public void setInput(boolean inputA, boolean inputB){
		reley01.electorifyToCoil(inputA);
		reley02.electorifyToCoil(inputB);
				
		if(	(reley01.getSwitchState() && !reley02.getSwitchState())	||
			(!reley01.getSwitchState() && reley02.getSwitchState())	){
			outputF = true;
		}else {
			outputF = false;
		}
	}
	
	public boolean getOutput(){
		return outputF;
	}
}
