/**
 * User: alexthornburg
 * Date: 4/1/14
 * Time: 7:46 PM
 */
public class Car {
    CompositeEngine engine;

    public Car(CompositeEngine engine){
        this.engine = engine;
    }


    public void installNewEngine(CompositeEngine engine){
        this.engine = engine;
    }

    public CompositeEngine getEngine(){
        return engine;
    }

    public void breakEngine(){
        engine.breakPart();
    }

    public void cycleEngine(){
        engine.performFunction();
    }
}
