import static org.junit.Assert.*;

import org.junit.*;

public class MyArrayListHiddenTester {
    // Do not change the method signatures!
    /**
     * This sets up the test fixture. JUnit invokes this method before
     * every testXXX method. The @Before tag tells JUnit to run this method
     * before each test 
     */
    @Before
    public void setUp() throws Exception {
        
    }

    /**
     * Aims to test the constructor when the input argument
     * is not valid
     */
    @Test
    public void testConstructorInvalidArg(){
        
    }

    /**
     * Aims to test the constructor when the input argument is null
     */
    @Test
    public void testConstructorNullArg(){

    }

    /**
     * Aims to test the constructor when the input array has null elements
     */
    @Test
    public void testConstructorArrayWithNull(){

    }

    /**
     * Aims to test the append method when an element is added to a full list
     * Check reflection on size and capacity
     */
    @Test
    public void testAppendAtCapacity(){
        
    }

    /**
     * Aims to test the append method when null is added to a full list
     * Check reflection on size and capacity
     */
    @Test
    public void testAppendNull(){
        
    }

    /**
     * Aims to test the prepend method when an element is added to a full list
     * Check reflection on size and capacity
     */
    @Test
    public void testPrependAtCapacity(){
        
    }
    
    /**
     * Aims to test the prepend method when a null element is added
     * Checks reflection on size and capacity
     * Checks whether null was added successfully
     */
    @Test
    public void testPrependNull(){
        
    }
    
    /**
     * Aims to test the insert method when input index is out of bounds
     */
    @Test
    public void testInsertOutOfBounds(){
       
    }

    /**
     * Insert multiple (eg. 1000) elements sequentially beyond capacity -
     * Check reflection on size and capacity
     * Hint: for loop could come in handy
     */
    @Test
    public void testInsertMultiple(){
        
    }

    /**
     * Aims to test the get method when input index is out of bound
     */
    @Test
    public void testGetOutOfBound(){
        
    }

    /**
     * Aims to test the set method when input index is out of bound
     */
    @Test
    public void testSetOutOfBound(){
        
    }

    /**
     * Aims to test the remove method when removing multiple items from a list
     */
    @Test
    public void testRemoveMultiple(){
        
    }

    /**
     * Aims to test the remove method when input index is out of bound
     */
    @Test
    public void testRemoveOutOfBound(){
        
    }

    /**
     * Aims to test the expandCapacity method when 
     * requiredCapacity is strictly less than the current capacity
     */
    @Test
    public void testExpandCapacitySmaller(){
       
    }

    /**
     * Aims to test the expandCapacity method when 
     * requiredCapacity is greater than current capacity * 2 and default capacity
     */
    @Test
    public void testExpandCapacityLarge(){
        
    }

    /**
     * Aims to test the rotate method when 
     * input index is out of bounds
     */
    @Test
    public void testRotateOutOfBound() {
        
    }

    /**
     * Aims to test the find method when 
     * there are multiple of the input element
     */
    @Test
    public void testFindMultiple(){
	    
    }
	
    /**
     * Aims to test the find method when 
     * input element does not exist in the list
     */
    @Test
    public void testFindDoesNotExist(){
        
    }

}
