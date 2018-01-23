package cs1050;

public class Exercise_1_p3 {

	public static void main(String[] args) {
		boolean[] seed = {true, false, true, true};
		boolean[] co = {false, false, true, true};
		
		System.out.println(FeedbackLFSR(seed, co));
		System.out.println(feedbackUpdateLFSR(seed,co));
		

	}
	static boolean FeedbackLFSR(boolean[] arr, boolean[] coefs){
		int sum=0;
	    for(int i=0; i<arr.length; i++){
	    	if (arr[i]&&coefs[i]){
	    		sum++;
	    	}
	    
	    	}
		if (sum%2==1) {
	    	return true;
	    	}
		else {
			return false;
		}
	}
	static boolean feedbackUpdateLFSR(boolean[] arr, boolean[] coefs){
		boolean next = FeedbackLFSR(arr, coefs);
		boolean ret = arr[arr.length-1];
	   for(int i =arr.length-1; i>1;i--){
	   	arr[i]=arr[i-1];
	   	}
	   	arr[0]=next;
	   	return ret;
	   } 
	}