package tatjkuz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/hinnakalkulaator")
	String gk(String hind, String kogus, String kliendikaart){
		if(hind==null){return "andmed puuduvad";}
		int h=Integer.parseInt(hind);
		int k=Integer.parseInt(kogus);
		
		
		return "Toode hind on " +hind+" ja kogus on  "+kogus+". Summa maksiseks on "+ (h*k);
		
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
