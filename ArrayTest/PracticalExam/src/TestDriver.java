/**
 * 
 * @author Timothy Tumwikirize
 *
 */
public class TestDriver {
    
    public static void main(String[] args) {
        
        ArrayCollection<Double> testCollection = new ArrayCollection<Double>();
        //populates collection 
        for (int looper = 1; looper <= 20; looper++) {
            testCollection.add(10.2);
        }
            System.out.println("Original Collection: " + testCollection.toString());
            //testing collection count
            System.out.println("Original Collection count: " + testCollection.count(10.2));
            //testing collection removeAll
            testCollection.removeAll(10.2);
            System.out.println("Original Collection after removeAll() call: " + testCollection.toString());
            //testing combine method with two new collections populated randomly
            System.out.println("Now to test combine: ");
            ArrayCollection<Integer> tCollection2 = new ArrayCollection<Integer>();
            ArrayCollection<Integer> tCollection3 = new ArrayCollection<Integer>();
            for (int loop = 1; loop <= 5; loop++) {
                tCollection3.add((int)(Math.random() * 5));
                tCollection2.add((int)(Math.random() * 5));
            }
            System.out.println("Collection 2: " + tCollection2.toString());
            System.out.println("Collection 3: " + tCollection3.toString());
            System.out.println("Collection 2 and 3 combined: " + tCollection2.combine(tCollection3).toString());
            
            
        }
    }


