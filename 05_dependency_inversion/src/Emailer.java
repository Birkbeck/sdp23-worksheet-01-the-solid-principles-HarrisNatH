// public class Emailer {
//     public String generateWeatherAlert(String weatherConditions) {
//         String alert = "It is " + weatherConditions;
//         return alert;
//     }
// }

/*
 * Emailer depends on REsponse interface
 */

 public class Emailer implements Response {
    @Override
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
