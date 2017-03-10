package tatjkuz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/geomeetriline_keskmine")
	String gk(String arv1, String arv2, String arv3){
		if(arv1==null){return "andmed puuduvad";}
		int a1=Integer.parseInt(arv1);
		int a2=Integer.parseInt(arv2);
		int a2=Integer.parseInt(arv3);
		return arv1+" ja "+arv2 + " ja "+arv3+" geomeetriline keskmine on "+ Math.sqrt(a1*a2*a3);
		
	}
	
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Ahoi!";
    }
	@RequestMapping("/tervita")
	String tervitusfunktsioon3(String eesnimi){
		return "Tere "+eesnimi+"!";
	}

	@RequestMapping("/algus2")
	String tervitusfunktsioon2(){
		return "Hello World!";
	}
 
    public static void main(String[] args) {
		//System.getProperties().put("server.port", 5555);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash
//mvn package
//java -jar target/boot3-1.0-SNAPSHOT.jar
