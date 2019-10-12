import static org.junit.Assert.assertArrayEquals;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;
import org.junit.Test;

/**
 * @author Marko Bekhta
 */
 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;

public class EnoughIsEnough {

	public static int[] deleteNth(int[] elements, int maxOccurrences) {

    List<Integer> num = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    // 1. Create a Map<Integer, Integer> with elements[i] and # of elements[i]
    // 2. Create a List<Integer> from map entries where the value does not exceed maxOccurrences
    for( int i = 0; i < elements.length; ++i ){
    
      if( map.containsKey(elements[i]) ){  // if the element exists...
      
        map.put( elements[i], (map.get(elements[i])) + 1 );  // key = elements[i], value = (map.get(elements[i])) + 1
        
        if( map.get(elements[i]) <= maxOccurrences ){  // if the value of key is less than or equal to maxOccurrences...
          num.add(elements[i]);                        // append elements[i] into List<Integer> num
        }
        
      }
      else{ // if element does not exist...
      
         map.put(elements[i], 1);  // create a new key with the count of 1
         
         if( map.get(elements[i]) <= maxOccurrences ){ // if the value of key is less than or equal to maxOccurrences...
          num.add(elements[i]);                        // append elements[i] into List<Integer> num
        }
      }
    }
    
    int[] arr = new int[num.size()];
    
    // 3. Create int[] array from ArrayList
    for (int i=0; i < arr.length; i++){
    
        arr[i] = num.get(i).intValue();
    }
    
		return arr;
	}
}

public class EnoughIsEnoughTest {
	@Test
	public void deleteNth() throws Exception {
		assertArrayEquals(
				new int[] { 20, 37, 21 },
				EnoughIsEnough.deleteNth( new int[] { 20, 37, 20, 21 }, 1 )
		);
		assertArrayEquals(
				new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
				EnoughIsEnough.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )
				
		);
		assertArrayEquals(
				new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
				EnoughIsEnough.deleteNth( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
		);
		assertArrayEquals(
				new int[] { 1, 1, 1, 1, 1 },
				EnoughIsEnough.deleteNth( new int[] { 1, 1, 1, 1, 1 }, 5 )
		);
		assertArrayEquals(
				new int[] { },
				EnoughIsEnough.deleteNth( new int[] { }, 5 )
		);

	}

}