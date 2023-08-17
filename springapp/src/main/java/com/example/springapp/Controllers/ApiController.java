package com.example.springapp.Controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    public String yourFavColor="Blue";
    @GetMapping("/student")
	public String getMyFav()
	{
		return "My favorite color  "+yourFavColor;
	}

}
