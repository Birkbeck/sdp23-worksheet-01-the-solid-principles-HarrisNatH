// public class Phone {
//     public String generateWeatherAlert(String weatherConditions) {
//         String alert = "It is " + weatherConditions;
//         return alert;
//     }
// }

/*
 * Emailer depends on Response interface
 */

public class Phone implements Response{
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }

}
