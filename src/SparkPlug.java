/**
 * User: alexthornburg
 * Date: 4/1/14
 * Time: 7:23 PM
 */
public class SparkPlug implements Part {

    String name;
    boolean needsMaintenance = false;
    boolean isCompressed = false;

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
        if(getCompressionStatus()){
            return "creating power!";
        }else{
            return "recovering";
        }
    }

    @Override
    public int performFunction() {
        if(!getCompressionStatus()){
            compress();
        }else{
            exhaust();
        }
        if(isCompressed&&!needsMaintenance){
            return 1;
        }else{
            return 0;
        }

    }

    public boolean getCompressionStatus(){
        return isCompressed;
    }

    public void compress(){
        isCompressed = true;
    }

    public void exhaust(){
        isCompressed = false;
    }


}
