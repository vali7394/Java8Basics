package com.taxSoapWebService.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*@SpringBootApplication
@ImportResource("example.xml")*/
public class DemoApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(DemoApplication.class, args);*/

		Scanner scanIn = new Scanner(System.in);
		String routers  = scanIn.nextLine();
		Map<String,String> routerDetails = new HashMap<>();
		String pathTofind = "";
		while (scanIn.hasNext()){
			String s = scanIn.nextLine();
			if(s.length()==2) {
				pathTofind = s;
				break;
			}
			else
			{
				String[] details = s.split(":");
			routerDetails.put(details[0],details[1]);
			}

		}
		findDistance("ZU",routerDetails);

	}

	private static void findDistance(String path, Map<String,String> routerDetails){

		String firstRoute = path.substring(0,1);
		String secondRoute = path.substring(1,2);

		routerDetails.keySet().forEach(route->{







		});



	}



}
