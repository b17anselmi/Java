package cs1050;

public class Part2_1 {

	public static void main(String[] args) {
		Part2_1.ch2bitArray('*');

	}
	static boolean[] ch2bitArray(char c){
	    int i=c;//push the char to an int so that the below method can work
	    String str=Integer.toBinaryString(i);//convert it to binary so all we have is 1s and 0s
	    char[] strC = str.toCharArray();//convert it to an array so that we can easily iterate through it 
	  //checking, to be deleted
		System.out.println(i + " = " +str); 
	    boolean[] bin=new boolean[strC.length];
	    int k=0;
	    do{
	    	//more checking, delete later
	    	System.out.println(strC[k]);
	       bin[k]=(strC[k]=='1');
	       k++;
	    }while(k<strC.length);
	   
	   // Exercise1.printBitArray(bin);
	    for(int l=0; l<bin.length;l++) {
	    	//final check, delete later
	    	System.out.println(bin[l]);
	    }
	    return bin;
	}
}
