package controllers;

/**
 * Created by Anastasia on 6/23/2017.
 */
import play.mvc.*;
import static play.mvc.Results.ok;

import com.twilio.twiml.Media;
import com.twilio.twiml.Body;
import com.twilio.twiml.Message;
import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.TwiMLException;

public class GreetingController {

    public Result message() throws TwiMLException {
        Media picture = new Media("http://i.imgur.com/i4NxyoZ.jpg");
        Message mms = new Message.Builder()
                .body(new Body("Hello From Fahmida!"))
                .media(picture)
                .build();
                MessagingResponse twiml = new MessagingResponse.Builder().message(mms).build();


        return ok(twiml.toXml()).as("application/xml");

    }






    }


