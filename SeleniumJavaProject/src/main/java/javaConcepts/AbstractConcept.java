package javaConcepts;


abstract class Phone{
	
	public abstract void voiceMessage();
		
	
	
	public void sendMessages() {
		System.out.println("Text Message");
	}
}

class SmartPhone extends Phone {
	
	public void videoCall() {
		System.out.println("VideoCall");
	}
	
	public void voiceMessage() {
		System.out.println("VoiceMessage");
	}
	
}

public class AbstractConcept {

	public static void main(String[] args) {
	
       Phone obj = new SmartPhone();
       obj.sendMessages();
       obj.voiceMessage();
	}

}
