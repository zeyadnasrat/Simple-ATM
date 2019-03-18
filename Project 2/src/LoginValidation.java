import java.util.HashMap ;
public class LoginValidation {
	
	HashMap usersDictionary ; 
	public LoginValidation() 
	{
		usersDictionary = new HashMap() ;
		usersDictionary.put("1234","") ;
		usersDictionary.put("0000","") ;
		usersDictionary.put("5555","") ;
	}
	
	
	public boolean validate (String cn)
	{
		boolean valditationResult = false  ;
		
		String fetchedcardnumber= (String) usersDictionary.get(cn) ;
		if(fetchedcardnumber!=null)
		{
			valditationResult = true ;
		}
		
		return valditationResult ;
	}

}
