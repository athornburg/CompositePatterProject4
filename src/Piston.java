/**
 * User: alexthornburg
 * Date: 4/1/14
 * Time: 7:17 PM
 */
public class Piston implements Part{

    String name;
    boolean needsMaintenance = false;
    String status;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addName(String name) {
        this.name = name;
    }

    @Override
    public boolean needsMaintenance() {
        return needsMaintenance;
    }

    @Override
    public void breakPart() {
        needsMaintenance = true;
    }

    @Override
    public void fixPart() {
        needsMaintenance = false;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public int performFunction() {
        inductFuel();
        compress();
        exhaust();
        return 1;
    }

    public String inductFuel(){
        status = "fuel in cylinder";
        return status;

    }

    public String compress(){
        status = "compressed";
        return status;
    }

    public String exhaust(){
        status = "exhausted";
        return status;
    }
}
