package electricalAppliances.heatingDevices;


import exceptions.HTNegativeTempException;

public interface ChangeTemperature {

    public void temperatureUp (int currentTemperature) throws HTNegativeTempException;
    public void temperatureDown (int currentTemperature) throws HTNegativeTempException;
}
