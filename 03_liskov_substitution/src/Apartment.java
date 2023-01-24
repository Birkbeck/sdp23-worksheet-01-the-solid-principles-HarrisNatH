// abstract sealed class Apartment permits PenthouseSuite, Studio {
//     int squareFootage;
//     int numberOfBedrooms;

//     abstract void setSquareFootage(int sqft);
// }


/*
 * fix
 * studio is erased, both Apartment PenthouseSuite permitted from Building class
 */

public sealed class Apartment extends Building permits PenthouseSuite{

    
}

