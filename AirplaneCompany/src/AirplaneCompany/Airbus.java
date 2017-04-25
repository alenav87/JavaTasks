package AirplaneCompany;

public class Airbus extends Airplane{
    private AirbusModel _model;

    public Airbus (AirbusModel model){
        _model = model;
    }


    @Override
    public double GetRange () {

        switch(_model){
            case Airbus_A380_800:
                return 8.200;

            case Airbus_A320:
                return 3.300;

            case Airbus_A330_300:
                return 6.350;

            default:
                return 0;
        }
    }

    @Override
    public double GetPayloadCapacity () {

        switch(_model){
            case Airbus_A380_800:
            return 196.700;

            case Airbus_A320:
                return 36.000;

            case Airbus_A330_300:
                return 101.200;

            default:
                return 0;
        }
    }

    @Override
    public int GetPassengerCapacity () {

        switch(_model){
            case Airbus_A380_800:
                return 544;

            case Airbus_A320:
                return 150;

            case Airbus_A330_300:
                return 277;

            default:
                return 0;
        }
    }

    @Override
    public String GetName () {
        return _model.toString ();
    }
}
