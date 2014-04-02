/**
 * User: alexthornburg
 * Date: 4/1/14
 * Time: 7:07 PM
 */
public interface Part {

    public String getName();

    public void addName(String name);

    public boolean needsMaintenance();

    public void breakPart();

    public void fixPart();

    public String getStatus();

    public int performFunction();



}
