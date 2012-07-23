public class NOT{
	
	Relay reley01;
	
	boolean outputF;
	
	public NOT() {
		reley01 = new Relay();
		
		outputF = false;
	}
	
	public void setInput(boolean inputA){
		reley01.electorifyToCoil(inputA);
		
		if(!reley01.getSwitchState()){
			outputF = true;
		}else {
			outputF = false;
		}
	}
	
	public boolean getOutput(){
		return outputF;
	}
}
