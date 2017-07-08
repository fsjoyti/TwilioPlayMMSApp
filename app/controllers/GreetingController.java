package controllers;

/**
 * Created by Anastasia on 6/23/2017.
 */

import com.twilio.twiml.Media;
import com.twilio.twiml.Body;
import com.twilio.twiml.Message;
import com.twilio.twiml.MessagingResponse;
import com.twilio.twiml.TwiMLException;
import play.Logger;
import play.mvc.*;


import static play.mvc.Results.ok;

public class GreetingController {

    public Result message() throws TwiMLException {

        Message mms = new Message.Builder()
                .body(new Body("Hello From Fahmida!"))
                .media(new Media("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Gal_Gadot_cropped_lighting_corrected_2b.jpg/220px-Gal_Gadot_cropped_lighting_corrected_2b.jpg"))
                .build();
        MessagingResponse twiml = new MessagingResponse.Builder().message(mms).build();




        return ok(twiml.toXml()).as("application/xml");

    }






    }


