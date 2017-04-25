package AirplaneCompany;

import Data.AirplaneDto;
import Data.TestDataSource;
import java.util.ArrayList;

abstract public class Airplane {

    public abstract double GetRange();
    public abstract double GetPayloadCapacity();
    public abstract int GetPassengerCapacity();
    public abstract String GetName();

    public String GetAirplaneDescription(){

        ArrayList<AirplaneDto> airplanes = xmlDataSource.GetAll();

        for (int i = 0; i<airplanes.size();  i++){
            if (airplanes.get(i).ModelName.equals(GetName())) {
                return airplanes.get(i).Description;

            }
        }
        return null;
    }

    protected TestDataSource xmlDataSource = new TestDataSource();

    public enum BoeingModel {
            Boeing747_300,
            Boeing747_400,
            Boeing747_8

        }
    public enum AirbusModel {
        Airbus_A380_800,
        Airbus_A320,
        Airbus_A330_300

    }


}
