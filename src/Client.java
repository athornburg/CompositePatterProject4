/**
 * User: alexthornburg
 * Date: 4/1/14
 * Time: 7:49 PM
 */
public class Client {
    public static void main(String[] args){
        SparkPlug sparkPlug = new SparkPlug();
        sparkPlug.addName("spark plug 0");
        Piston piston = new Piston();
        piston.addName("piston 0");
        Cylinder cylinder = new Cylinder();
        cylinder.addName("cylinder 0");
        cylinder.setSparkPlug(sparkPlug);
        cylinder.setPiston(piston);

        SparkPlug sparkPlug1 = new SparkPlug();
        sparkPlug1.addName("spark plug 1");
        Piston piston1 = new Piston();
        piston1.addName("piston 1");
        Cylinder cylinder1 = new Cylinder();
        cylinder1.addName("cylinder 1");
        cylinder1.setSparkPlug(sparkPlug1);
        cylinder1.setPiston(piston1);

        SparkPlug sparkPlug2 = new SparkPlug();
        sparkPlug2.addName("spark plug 2");
        Piston piston2 = new Piston();
        piston2.addName("piston 2");
        Cylinder cylinder2 = new Cylinder();
        cylinder2.addName("cylinder 2");
        cylinder2.setSparkPlug(sparkPlug2);
        cylinder2.setPiston(piston2);

        CompositeEngine engine = new CompositeEngine();
        engine.addPart(cylinder);
        engine.addPart(cylinder1);
        engine.addPart(cylinder2);

        Car car = new Car(engine);

        for(int i = 0; i < 500; i++){
            car.cycleEngine();
            System.out.println(car.getEngine().getStatus());
            for(Part p:car.getEngine().getComponents()){
                System.out.println(p.getStatus());
            }
            if(car.getEngine().needsMaintenance()){
                for(Part p:car.getEngine().getComponents())
                {
                    System.out.println(p.getStatus());
                    if(p.needsMaintenance()){

                        break;
                    }

                }
                    break;

            }
        }
    }
}
