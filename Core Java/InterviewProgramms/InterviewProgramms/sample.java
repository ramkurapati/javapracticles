package InterviewProgramms;

public class sample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = 1;
		if(++test<5){
			test=test%3;
		}
		switch(test){
		case 1: System.out.println("Sri");
		break;
		case 2: System.out.println("kanth");
		default: System.out.println("@");
		}
		
	}

}
