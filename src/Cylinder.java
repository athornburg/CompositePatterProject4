/**
 * User: alexthornburg
 * Date: 4/1/14
 * Time: 7:37 PM
 */
public class Cylinder implements Part {
    private String name;
    boolean needsMaintenance = false;
    private String status;
    public Piston piston;
    public SparkPlug sparkPlug;

    public Piston getPiston() {
        return piston;
    }

    public void setPiston(Piston piston) {
        this.piston = piston;
    }



    public SparkPlug getSparkPlug() {
        return sparkPlug;
    }

    public void setSparkPlug(SparkPlug sparkPlug) {
        this.sparkPlug = sparkPlug;
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
        if(sparkPlug.needsMaintenance){

            return "there is a problem with" + sparkPlug.getName();

        }
        else if(piston.needsMaintenance)  {

            return "there is a problem with " + piston.getName();
        }

        else{
                return sparkPlug.getStatus()+" "+piston.getStatus();
            }
    }

    @Override
    public int performFunction() {
        if(sparkPlug.needsMaintenance){
            needsMaintenance = true;
        }
        else if(piston.needsMaintenance)  {

           needsMaintenance = true;
        }else{
            sparkPlug.performFunction();
            piston.performFunction();
        }
            return 1;

    }

}
