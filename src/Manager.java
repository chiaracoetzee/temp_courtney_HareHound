
public class Manager {
	
	public static void main(String args[])
	{
		int turns = 1;
		
		boolean isCaught = false;
		Hare hare = new Hare(0,0);
		Hound hound = new Hound(0,0);
		hound.setDirection(hare.getDirection());
		while(!isCaught && turns <= 100)
		{
			System.out.println("Turn:" +turns);
			if(turns <=3)
			{
				hare.move(3, hare.getDirection());
			}
			else 
			{
				if(Math.sqrt(Math.pow(getXDisplacement(hare,hound), 2) + Math.pow(getYDisplacement(hare,hound), 2)) <=2)
				{
					isCaught = true;
					break;
				}
					
				if(turns % 3 == 0)
				{
					hare.setDirection(Directions.randomDirection());
				}
				if(turns % 5 == 0)
				{
					if(getXDisplacement(hare,hound) > 0 && getYDisplacement(hare,hound) > 0 && getXDisplacement(hare,hound) > getYDisplacement(hare,hound) )
					   hound.setDirection(Directions.SOUTH);
					else if(getXDisplacement(hare,hound) > 0 && getYDisplacement(hare,hound) > 0 && getXDisplacement(hare,hound) < getYDisplacement(hare,hound) )
					   hound.setDirection(Directions.WEST);
					else if(getXDisplacement(hare,hound) < 0 && getYDisplacement(hare,hound) < 0 && getXDisplacement(hare,hound) < getYDisplacement(hare,hound) )
					   hound.setDirection(Directions.NORTH);
					else if(getXDisplacement(hare,hound) < 0 && getYDisplacement(hare,hound) < 0 && getXDisplacement(hare,hound) > getYDisplacement(hare,hound) )
					   hound.setDirection(Directions.EAST);
					else if(getXDisplacement(hare,hound) < 0 && getYDisplacement(hare,hound) > 0 && Math.abs(getXDisplacement(hare,hound)) < getYDisplacement(hare,hound) )
						   hound.setDirection(Directions.WEST);
					else if(getXDisplacement(hare,hound) < 0 && getYDisplacement(hare,hound) > 0 && Math.abs(getXDisplacement(hare,hound)) > getYDisplacement(hare,hound) )
						   hound.setDirection(Directions.NORTH);
					else if(getXDisplacement(hare,hound) > 0 && getYDisplacement(hare,hound) < 0 && getXDisplacement(hare,hound) > Math.abs(getYDisplacement(hare,hound)) )
						   hound.setDirection(Directions.SOUTH);
					else 
						hound.setDirection(Directions.EAST);
					
					
				}
				
				hare.move(3, hare.getDirection());
				if(Math.abs(getXDisplacement(hare,hound)) > Math.abs(getYDisplacement(hare,hound)) )
				  hound.move(Math.abs(getYDisplacement(hare,hound)) - Math.abs(Math.abs(getYDisplacement(hare,hound)) - 8) , hound.getDirection());
				else
				  hound.move(Math.abs(getYDisplacement(hare,hound)) - Math.abs(Math.abs(getYDisplacement(hare,hound)) - 8) , hound.getDirection());
				
				System.out.println("HARE ("+hare.getXLocation()+","+hare.getYLocation()+") Direction: "+ hare.getDirection());
				System.out.println("HOUND ("+hound.getXLocation()+","+hound.getYLocation()+") Direction: "+ hound.getDirection());
				System.out.println("---------------");	
			}
			turns++;
			
		}
		if(isCaught)
			System.out.println("Hound wins");
		else
			System.out.println("Hare wins");
		
	}
	public static int getXDisplacement(Hare hare, Hound hound)
	{
		return hare.getXLocation() - hound.getXLocation();
	}
	public static int getYDisplacement(Hare hare, Hound hound)
	{
		return hare.getYLocation() - hound.getYLocation();
	}

}
