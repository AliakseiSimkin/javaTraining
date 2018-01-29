package dataAccess;

import electricalAppliances.ElectricalAppliances;

public interface DataAccess {
    public String readData ();
    public void writeData (ElectricalAppliances electricalAppliances);
}
