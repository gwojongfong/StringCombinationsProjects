import java.util.ArrayList;
public class StringCombinations {
//	public static void main(String[] args) {
//		ArrayList<String> strArray = getCombinationOfString("dog");
//		System.out.println(strArray);
//	}

	public static ArrayList<String> getCombinationOfString(String inputString)
	{
		ArrayList<String> strArray = new ArrayList<String>();
		String[] elements = inputString.split("\\|");
		String instr = elements[0];
		String outstr = new String();
		int index = 0;
		StringBuffer outstrBuf = new StringBuffer();
		if (elements.length > 1){			
			outstr = elements[1];
			outstrBuf = new StringBuffer(outstr);
			index = Integer.parseInt(elements[2]);
		}
	    for (int i = index; i < instr.length(); i++)
	    {	    	
	        outstrBuf.append(instr.charAt(i));
	        strArray.add(outstrBuf.toString());
	        //System.out.println(outstrBuf);
	        strArray.addAll(getCombinationOfString(instr+"|"+outstrBuf.toString()+"|"+Integer.toString(i + 1)));
	        outstrBuf.deleteCharAt(outstrBuf.length() - 1);
	    }
	    return strArray;
	} 		
}
