package electricalAppliances.heatingDevices;


import Exceptions.HTNegativeTempException;

public interface ChangeTemperature {

    public void temperatureUp (int currentTemperature) throws HTNegativeTempException;
    public void temperatureDown (int currentTemperature) throws HTNegativeTempException;
}
