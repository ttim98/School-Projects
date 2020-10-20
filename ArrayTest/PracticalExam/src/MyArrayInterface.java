/**
 * 
 * @author Timothy Tumwikirize
 *
 */
public interface MyArrayInterface<T> {
    
    /**
     * creates and 
     * @return string that correctly represents the current collection
     */
    public String toString();
    //implemented in ArrayCollection class
    
    
    /**
     * return count of number of elements e in collection
     * so that e.equals(target) is true
     * @param target is the object being compared with
     * @return number of elements in collection^
     */    
    public int count(T target);
    // implemented in ArrayCollection class
    
    
    /**
     * removes all elements e from collection such that e.equals
     * (target) is true
     * @param target is the object being compared with
     */    
    public void removeAll(T target);
    //implemented in ArrayCollection class
    
    /**
     * creates and returns a new ArrayCollection<T> object that is a
     * concatenated combination of this object and the argument object
     * @param other- will be used to concatenate with 'this' object
     * @return new resulting combined object
     */
    public ArrayCollection<T> combine(ArrayCollection<T> other);
    

}
