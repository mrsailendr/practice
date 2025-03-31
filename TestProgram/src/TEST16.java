

@RestController
public class TEST16 {
	@PostMapping("/getUserDetails")
	public POJO2 getUserDetails(@ResponseBody Pojo p1)
	{
		// Bussiness logic
		POJO2 p=new POJO2();
		return p;
	}
	
	

}
