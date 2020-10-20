/**
 * @author Timothy Tumwikirize
 */
import java.util.ArrayList;

public class ArrayCollection<T> extends ArrayList<T> implements MyArrayInterface<T> {
    
    //eclipse recommended 
    //after "The serializable class ArrayCollection does not declare a static final serialVersionUID field of 
    //type long" 
    private static final long serialVersionUID = 1L;    
    protected int numOfObjects = 0;
    
    @Override
    public String toString() {
        //calls ArrayList method of superclass to
        //represent current collection
        return super.toString();        
        //
    }
    
    public int count(T target) {
        
        for (T element : this) {
            if (element.equals(target)) {
                //updates numOfObjects
                numOfObjects++;
                //after finding similar ones in 
                //current collection
            }            
        }
        return numOfObjects;
        
    }
    public void removeAll(T target) {
        //removes all 'target' objects in collection,
        
        do {
            this.remove(target);
            
        }while (this.contains(target));
    }
    public ArrayCollection<T> combine(ArrayCollection<T> other){
        
        //adds all elements in this collection to new one
        ArrayCollection<T> newCollection = new ArrayCollection<T>();
        for (T element : this) {
            newCollection.add(element);
        }
        //adds all elements in 'other' collection to new one
        for (T element : other) {
            newCollection.add(element);
        }
        return newCollection;
        
    }
}
