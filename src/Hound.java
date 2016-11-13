


public class Hound {
	private int x_location;
	private int y_location;
	private Directions direction;
	
	
	public Hound()
	{
		this.x_location =  0;
		this.y_location = 0;
		
	}
	
	public Hound(int x, int y)
	{
		this.x_location =  x;
		this.y_location = y;
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
		if(this.direction != null)
		{
			if(Math.abs(direction.getDirection() - this.direction.getDirection()) <= 90)
				 this.direction = direction;
				else if(direction.getDirection() == 270 || direction.getDirection() == 90   )
					 this.direction = Directions.WEST;
				else if(direction.getDirection() == 0   || direction.getDirection() == 180 )
					 this.direction = Directions.EAST;
		}
		else
			 this.direction = direction;
		
			
	}
	public Directions getDirection()
	{
		return this.direction; 
	}
	

}
