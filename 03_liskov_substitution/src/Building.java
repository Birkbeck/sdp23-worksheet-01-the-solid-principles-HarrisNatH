/*
 * this class is general for all kinds of buildings
 */

abstract sealed class Building permits Apartment, Studio{
    int squareFootage;
    int numberOfBedrooms;
    
    abstract void setSquareFootage(int sqft);
}
