public class InvisibleState implements State{
    Hero hero;
    public InvisibleState(Hero hero){
        this.hero = hero;
		try
		{
			Thread.sleep(5000);
			hero.setState(hero.getStandingState());
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
    }

    public void upPressedArrow(){
    }
    
    public void upReleasedArrow(){
    }

    public void downPressedArrow(){
    }

    public void downReleasedArrow(){
    }

    public void thrownObject(){
    }

    public void rolledObject(){
    }

    public void fireObject(){
    }

    public void esc(){
    }
} 

