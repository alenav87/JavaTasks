package AirplaneCompany;

import java.util.ArrayList;


public class Company {
    ArrayList<Airplane> airplane = new ArrayList<Airplane>();
    //Airplane.BoeingModel bm;

    public Company() {

        airplane.add(new Airbus(Airplane.AirbusModel.Airbus_A380_800));
        airplane.add(new Airbus(Airplane.AirbusModel.Airbus_A320));
        airplane.add(new Airbus(Airplane.AirbusModel.Airbus_A330_300));
        airplane.add(new Boeing(Airplane.BoeingModel.Boeing747_300));
        airplane.add(new Boeing(Airplane.BoeingModel.Boeing747_400));
        airplane.add(new Boeing(Airplane.BoeingModel.Boeing747_8));

    }

    public int GetGeneralCapacity(){
        int result = 0;
        for (int i = 0; i < airplane.size(); i++) {
            result += airplane.get(i).GetPayloadCapacity();
        }
        return result;
    }

    public ArrayList<Airplane> GetAirplanes(){
        return  airplane;
    }
}

