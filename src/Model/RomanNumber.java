package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RomanNumber {

	final  Map<Integer, String> lookUp=new HashMap<Integer,String>(){/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{ put(1,"I");put(2,"II");put(3,"III");put(5,"V");put(10,"X");put(50,"L");put(100,"C");put(500,"D");put(1000,"M");}
	
	};
	
	final  Map<Character,Integer> lookUpInt=new HashMap<Character,Integer>(){/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

	{ put('I',1);put('V',5);put('X',10);put('L',50);put('C',100);put('D',500);put('M',1000);}
	
	};
	
	
	public String convert(int i) {
		// TODO Auto-generated method stub
		//let us seek the value in the Lookup if found lets return this
		
		//Now we have no way except to split it and analyize it digit by digit
		//Convert to a char array
		char[] valBuff=Integer.toString(i).toCharArray();
		ArrayList<Character> c=new	ArrayList<Character>();
		for( int ctr=0;ctr < valBuff.length ;ctr++){
			c.add(valBuff[ctr]);
		}		
		return convert(c);
	}
	public int convert(String romanNumber) {
		
		if(romanNumber.isEmpty()){
			return 0; 
		}
		int value=0,prevVal=0,intVal=0;
		char[] valbuff=romanNumber.toCharArray();
		for(int i=0;i<valbuff.length;i++){
			Character c=valbuff[i];
		    if(lookUpInt.containsKey(c)){
		    	
		    	intVal=lookUpInt.get(c);
		    	if( prevVal < intVal && prevVal!=0){
		    		value=(value-prevVal)+(intVal -prevVal);
		    	}else{
		    	value=value+intVal;
		    	}
		    	prevVal=intVal;
		    }
		}
			return value;
	}
	private String convert(ArrayList<Character> valBuff) {
		// TODO Auto-generated method stub
		if(valBuff==null || valBuff.size()==0){
				return "";
		}	
		String convertedRomanNumber="";
		
		Integer powerNotation=0;
		Double	pN=Math.pow(10, (valBuff.size()-1));
		powerNotation=pN.intValue();	
		int value=Character.getNumericValue(valBuff.get(0));
		//Value is zero than don't care.Romans did not have zero 
		   if (value==0){
			   convertedRomanNumber= "";
		   }
		   if(value < 4){ 
			   //Number of times the value would be
			      convertedRomanNumber= repeat( lookUp.get(powerNotation)  ,value);					   
		   }			 
		   if(value==4){
			   //Number of times the value would be
			      convertedRomanNumber= lookUp.get(powerNotation)+lookUp.get(5*(powerNotation));					   
		   }
		   if(value==5){					   
			   convertedRomanNumber= lookUp.get(5 * (powerNotation) );					   
		   }
		   if(value >5 && value<9 )
		   {
			   convertedRomanNumber=  lookUp.get(5 * powerNotation )+ repeat( lookUp.get(powerNotation)  ,(value)-5);					   
		   }
		   if(value==9)
		   {
			   convertedRomanNumber= lookUp.get( powerNotation )+lookUp.get( powerNotation* 10);					   
		   }
		   valBuff.remove(0);
		   return convertedRomanNumber+convert(valBuff);		
		
	}

	private String repeat(String val,int numOfTimes)
	{
		StringBuilder s= new StringBuilder();
		for(int i=0;i < numOfTimes;i++)
		{
			s.append(val);
		}		
		return s.toString();
	}

}
