package Main;

import AirplaneCompany.Airplane;
import AirplaneCompany.Company;
import Exception.DataNotFoundException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        Company company = new Company();
        ArrayList<Airplane> CompanyAirplane = company.GetAirplanes();

        System.out.println("General capacity: " + company.GetGeneralCapacity());
       try {
            for (int i = 0; i < CompanyAirplane.size(); i++) {
                if (CompanyAirplane.get(i).GetAirplaneDescription() == ""){
                    throw new DataNotFoundException("Description is missing");
               }
                System.out.println(CompanyAirplane.get(i).GetName() + "\n" + "Capacity: " + CompanyAirplane.get(i).GetPayloadCapacity() + "lbs \n" + "Range: " + CompanyAirplane.get(i).GetRange() + "nmi \n" + CompanyAirplane.get(i).GetPassengerCapacity() + "(max) passengers \n" + CompanyAirplane.get(i).GetAirplaneDescription());
            }
       } catch (DataNotFoundException ex){
           System.out.println("Description is missing");
       }
    }

}
