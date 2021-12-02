

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
public class AlfredQuotes {
     /*
    * Inputs: None
    * Return Type: String
    * Description: Returns a generic greeting that Alfred will say to anyone.
    */
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    /* 
    * Inputs: String name, String dayPeriod 
    *                      Assume "morning", "afternoon" or "evening".
    * Return Type: String
    * Description: Returns a greeting that includes the person's name
    *         as well as the day period. For example:
    *        "Good evening, Beth Kane. Lovely to see you."
    * Tip: Try using the String.format method for string interpolation in Java.
    */
    public String guestGreeting(String name, String dayPeriod) {
        LocalTime localTime = LocalTime.now();
        int time = localTime.getHour();
        
        String timeOfDay = "";
        if(time >= 1 || time <= 12){
            return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
        }
        return "place holder for guest greeting return string";
    }
    /* 
    * Inputs: None
    * Return Type: String
    * Description: Returns a polite announcement of the current date.
    */
    public String dateAnnouncement() {
        
        String dtPattern = "EEEEE MMMM dd yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dtPattern);
        String dt = simpleDateFormat.format(new Date());

        return String.format("Today is %s.", dt);
    }
    
    /*********************************************
    Final Challenge!
    Alfred is listening. Write a method that accepts any string of conversation. 
    If "Alexis" appears in the conversation return a snarky response, such as:
    "Right away, sir. She certainly isn't sophisticated enough for that." 
    
    If "Alfred" is in the conversation return an obliging response, for example: 
    "At your service. As you wish, naturally." 
    
    If neither name is found, return an appropriate response, for instance:
    "Right. And with that I shall retire." 
    **********************************************/
    /*
    * Inputs: String (A conversation)
    * Return Type: String (Something Alfred would say in response)
    * 
    * Tip: Use the indexOf String method
    */
    public String respondBeforeAlexis(String conversation) {
        String response = "";
        if(conversation.contains("Alexis")) {
            response = "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if(conversation.contains("Alfred")) {
            response = "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else {
            response = "Right. And with that I shall retire.";
        }
        return response;
    }
    // NINJA BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

