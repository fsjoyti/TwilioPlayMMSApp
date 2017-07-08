package controllers;

import com.twilio.Twilio;

import com.twilio.twiml.Media;
import com.twilio.twiml.Body;

import com.twilio.type.PhoneNumber;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.TwiMLException;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import play.Logger;
import play.mvc.*;






import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    public static final String ACCOUNT_SID = "Enter your Account SID here";
    public static final String AUTH_TOKEN = "Enter your Twilio Auth token here";
    public static final String  YOUR_PHONE_NUMBER = "Enter the phone number you wanted to send MMS to";
    public static final String  YOUR_TWILIO_NUMBER = "Enter your twilio number here";


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

        Message message =  Message
                .creator(new PhoneNumber(YOUR_PHONE_NUMBER),  // to
                        new PhoneNumber(YOUR_TWILIO_NUMBER),  // from
                        "This is from Fahmida")
                .setMediaUrl(new URI("http://i.imgur.com/8S0MhjB.jpg"))
                .create();
        System.out.println(message.getSid());





        return ok(views.html.index.render());
    }





}
