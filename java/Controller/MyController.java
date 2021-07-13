package Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.telusko.model.User;
import com.telusko.postmapping.UserRequest;

@RestController
@RequestMapping("/users")
public class MyController {
	
	@GetMapping (path="/{userId}" ,
			produces = { MediaType.APPLICATION_JSON_VALUE ,
						MediaType.APPLICATION_XML_VALUE ,
						})
	
	public ResponseEntity<User> getUser(@PathVariable String userId) {
		User user = new User();
		user.setEmail("saifali@gmail.com");
		user.setFirstName("saif");
		user.setLastName("ali");
		
		return new ResponseEntity<User>(user, HttpStatus.OK);   //new ResponseEntity<ModelClass>(model object,status code)
		
	}
	
	@PostMapping(
			
			consumes = { MediaType.APPLICATION_JSON_VALUE ,
					MediaType.APPLICATION_XML_VALUE} ,
					   
			produces = { MediaType.APPLICATION_JSON_VALUE ,
					MediaType.APPLICATION_XML_VALUE}
					
			)
	public  ResponseEntity<User> setUser(@RequestBody UserRequest userrequest) { // json/xml to java object
		User user = new User();
		user.setEmail(userrequest.getEmail());    //userrequest -> user object
		user.setFirstName(userrequest.getFirstName());
		user.setLastName(userrequest.getLastName());
		
		return new ResponseEntity<User>(user, HttpStatus.OK);   //new ResponseEntity<ModelClass>(model object,status code)
		
	}
		
		
	}
	

