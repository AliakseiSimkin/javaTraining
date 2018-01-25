package dataAccess;

public interface DataAccess {
    public void readData (String fileName);
    public void writeData (String fileName, String content);
}
