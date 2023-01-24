// public class WeatherTracker {
//     String currentConditions;
//     Phone phone;
//     Emailer emailer;

//     public WeatherTracker() {
//         phone = new Phone();
//         emailer = new Emailer();
//     }

//     public void setCurrentConditions(String weatherDescription) {
//         this.currentConditions = weatherDescription;
//         if (weatherDescription == "rainy") {
//             String alert = phone.generateWeatherAlert(weatherDescription);
//             System.out.print(alert);
//         }
//         if (weatherDescription == "sunny") {
//             String alert = emailer.generateWeatherAlert(weatherDescription);
//             System.out.print(alert);
//         }
//     }
// }

/*
 * high level module depends Response interface to use its method that also used
 * by other low level module
 */

public class WeatherTracker {
    String currentConditions;

    public void generateWeatherAlert(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
