
package com.mycompany.airportsimulator;

/**
 *
 * @author lsant
 */
public class AirPlane {
    
    private String flightNumber;
    private String cityTravellingFrom;
    private String cityTravellingTo;
    private int runWay;
    
    public void parked(){
        
        System.out.println("*---------WELCOME TO VALHALLA AIRPORT----------*");
        System.out.println("*-Below you will find the Airplane's information-*");
        System.out.println("Flight number: " + this.getFlightNumber() + "."+ "\n" 
        + "Departure: " + this.cityTravellingFrom + "." + "\n" 
        + "Destination: " + this.getCityTravellingTo() + "." + "\n"
        + "Runway: " + this.getRunWay() + "." + "\n"
        + "Status: Parked." );
        

    }
    
    public void taxiing(){
        
        System.out.println("*---------WELCOME TO VALHALLA AIRPORT----------*");
        System.out.println("*-Below you will find the Airplane's information-*");
        System.out.println("Flight number: " + this.getFlightNumber() + "."+ "\n" 
        + "Departure: " + this.cityTravellingFrom + "." + "\n" 
        + "Destination: " + this.getCityTravellingTo() + "." + "\n"
        + "Runway: " + this.getRunWay() + "." + "\n"
        + "Status: Taxiing." );
        
    }
    
    public void takingOff(){
        
        System.out.println("*---------WELCOME TO VALHALLA AIRPORT----------*");
        System.out.println("*-Below you will find the Airplane's information-*");
        System.out.println("Flight number: " + this.getFlightNumber() + "."+ "\n" 
        + "Departure: " + this.cityTravellingFrom + "." + "\n" 
        + "Destination: " + this.getCityTravellingTo() + "." + "\n"
        + "Runway: " + this.getRunWay() + "." + "\n"
        + "Status: Taking Off." );
    }
    
    public void waiting(){
        
        System.out.println("*---------WELCOME TO VALHALLA AIRPORT----------*");
        System.out.println("*-Below you will find the Airplane's information-*");
        System.out.println("Flight number: " + this.getFlightNumber() + "."+ "\n" 
        + "Departure: " + this.cityTravellingFrom + "." + "\n" 
        + "Destination: " + this.getCityTravellingTo() + "." + "\n"
        + "Runway: " + this.getRunWay() + "." + "\n"
        + "Status: Waiting." );
    }
    
    public void landed(){
        
        System.out.println("*---------WELCOME TO VALHALLA AIRPORT----------*");
        System.out.println("*-Below you will find the Airplane's information-*");
        System.out.println("Flight number: " + this.getFlightNumber() + "."+ "\n" 
        + "Departure: " + this.cityTravellingFrom + "." + "\n" 
        + "Destination: " + this.getCityTravellingTo() + "." + "\n"
        + "Runway: " + this.getRunWay() + "." + "\n"
        + "Status: Landed." );
    }
    
    //Complete Constructor Method
    public AirPlane(String flightNumber, String cityTravellingFrom, String cityTravellingTo, int runWay) {
        super();
        this.flightNumber = flightNumber;
        this.cityTravellingFrom = cityTravellingFrom;
        this.cityTravellingTo = cityTravellingTo;
        this.runWay = runWay;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getCityTravellingFrom() {
        return cityTravellingFrom;
    }

    public void setCityTravellingFrom(String cityTravellingFrom) {
        this.cityTravellingFrom = cityTravellingFrom;
    }
    
     public String getCityTravellingTo() {
        return cityTravellingTo;
    }
   
    public void setCityTravellingTo(String cityTravellingTo) {
        this.cityTravellingTo = cityTravellingTo;
    }
    
    public int getRunWay(){
        return runWay;
    }
    
    public void setRunWay(){
        this.runWay = runWay;
             
    }  
}
