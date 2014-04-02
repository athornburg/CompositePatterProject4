import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * User: alexthornburg
 * Date: 4/1/14
 * Time: 7:10 PM
 */
public class CompositeEngine implements Part {



    public List<Part> components = new ArrayList<Part>();
    String name;
    boolean needsMaintenance = false;


    public List<Part> getComponents() {
        return components;
    }

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
        for(Part part:components){
            //This is where the fun happens
            Random r = new Random();
             double gremlin =  r.nextInt(800);
            if(gremlin > 10 && gremlin < 15){
                part.breakPart();
            }
            //
            if(part.needsMaintenance()){
                needsMaintenance = true;
                return "there is a problem with "+part.getName();

            }else{
                return "vrooooooom";
            }
        }
        return "Engine status checked";
    }

    @Override
    public int performFunction() {
        int power = 0;
        for(Part part:components){
           power+= part.performFunction();
        }
        return power;
    }

    public void addPart(Part part){
        components.add(part);
    }

    public void removePart(Part part){
        components.remove(part);
    }

}
