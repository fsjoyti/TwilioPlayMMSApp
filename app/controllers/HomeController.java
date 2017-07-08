package controllers;

import play.mvc.*;

import com.twilio.Twilio;
import com.twilio.type.PhoneNumber;
import com.twilio.rest.api.v2010.account.Message;
import java.net.URI;
import java.net.URISyntaxException;





/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    public static final String ACCOUNT_SID = "Enter your  twilio account SID here";
    public static final String AUTH_TOKEN = "Enter your twilio auth token here ";
    public static final String  YOUR_TWILIO_NUMBER = "Enter your twilio number here";
    public static final String  YOUR_PHONE_NUMBER = "Enter the phone number you wanted to send MMS to";

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }


    public Result greeting() throws URISyntaxException{

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        try{
        Message message =  Message
                .creator(new PhoneNumber("YOUR_PHONE_NUMBER"),  // The
                        new PhoneNumber(YOUR_TWILIO_NUMBER),  // from
                        "This is from Fahmida")
                .setMediaUrl(new URI("http://i.imgur.com/8S0MhjB.jpg"))
                .create();

        System.out.println(message.getSid());}
        catch(URISyntaxException e){
            e.printStackTrace();
        }
        return ok(views.html.index.render());
    }





}
