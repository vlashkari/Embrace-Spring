package Embrace.App.Controller;

import Embrace.App.Enums.Topics;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.net.http.HttpResponse;

public class Controller {

    HttpResponse<String> response;

    public Controller() throws UnirestException {
        response = (HttpResponse<String>) Unirest.get("https://healthruwords.p.rapidapi.com/v1/topics/"+Topics.Abundance)
                .header("x-rapidapi-key", "35510044eemshc434d460ed7cab9p1f34efjsnaf98c72fba75")
                .header("x-rapidapi-host", "healthruwords.p.rapidapi.com")
                .asString();


    }

}
