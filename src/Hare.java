
public class Hare {
	private int x_location;
	private int y_location;
	private Directions direction;
	
	
	
	public Hare()
	{
		this.x_location =  0;
		this.y_location = 0;
		direction = Directions.randomDirection();
	}
	
	public Hare(int x, int y)
	{
		this.x_location =  x;
		this.y_location = y;
		direction = Directions.randomDirection();
	}
	public void setLocation(int x,int y)
	{
		this.x_location =  x;
		this.y_location = y;
	}
	public int getXLocation()
	{
		return this.x_location;
	
	}
	public int getYLocation()
	{
		return this.y_location;
	}
	public void move(int units, Directions direction)
	{
		if(direction.getDirection() == 270)
		{
			this.y_location += units;
		}
		else if(direction.getDirection() == 180)
		{
			this.x_location -= units;
		}
		else if(direction.getDirection() == 90)
		{
			this.y_location -= units;
		}
		else if(direction.getDirection() == 0)
		{
			this.x_location += units;
		}
		
		else
		{
			
		}
	}
	public void setDirection(Directions direction)
	{
		this.direction = direction;
	}
	public Directions getDirection()
	{
		return this.direction; 
	}
	
	

}
