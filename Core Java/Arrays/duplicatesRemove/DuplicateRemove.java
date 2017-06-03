package duplicatesRemove;

public class DuplicateRemove {
	
	public static  void removeFromArray(
		    String[] array, int removeIndex){

		    for(int i = removeIndex; i < array.length -1; i++){
		        array[i] = array[i + 1];
		    }
		    for(String s:array)
		    System.out.println(s);
		}
	
	public static void main(String[] args) {
		
		String[] names={"ram","raja","roja","ram","murali"};
		for(int i=0;i<names.length;i++)
		{
		      for(int j=0;j<=i-1;j++)
		      {
		    	  if(names[i].equals(names[j]))
				      DuplicateRemove.removeFromArray(names, i);
		      }
		}  
	}

}
