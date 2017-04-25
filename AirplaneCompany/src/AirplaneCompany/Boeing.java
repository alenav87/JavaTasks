package AirplaneCompany;

public class Boeing extends Airplane {

    private BoeingModel _model;

   public Boeing (BoeingModel model){
       _model = model;
   }

    @Override
    public double GetRange () {

        switch(_model){
            case Boeing747_300:
                return 6.691;

            case Boeing747_400:
                return 7.232;

            case Boeing747_8:
                return 8.900;

            default:
                return 0;
        }
    }

    @Override
    public double GetPayloadCapacity () {

        switch(_model){
            case Boeing747_300:
                return 146.200;

            case Boeing747_400:
               return 71.395;

            case Boeing747_8:
               return 165.345;

            default:
                return 0;
        }
        //  return 0;
    }

    @Override
    public int GetPassengerCapacity () {

        switch(_model){
            case Boeing747_300:
                return 496;

            case Boeing747_400:
                return 524;

            case Boeing747_8:
                return 605;

            default:
                return 0;
        }
    }

    @Override
    public String GetName () {
        return _model.toString ();
    }
}
