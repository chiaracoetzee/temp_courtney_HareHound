import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public enum Directions {
	    EAST  (90),  
	    WEST(270),  
	    SOUTH   (0),
	    NORTH   (180)
	    ; // semicolon needed when fields / methods follow


	    private final int direction;

	    Directions(int direction) {
	        this.direction = direction;
	    }
	    
	    public int getDirection() {
	        return this.direction;
	    }
	    private static final List<Directions> VALUES =
	    	    Collections.unmodifiableList(Arrays.asList(values()));
	    	  private static final int SIZE = VALUES.size();
	    	  private static final Random RANDOM = new Random();

	    	  public static Directions randomDirection()  {
	    	    return VALUES.get(RANDOM.nextInt(SIZE));
	    	  }
	    
	}