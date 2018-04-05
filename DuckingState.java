public class DuckingState implements State{
    Hero hero;
    public DuckingState(Hero hero){
        this.hero = hero;
    }

    public void upPressedArrow(){
    }
    
    public void upReleasedArrow(){
    }

    public void downPressedArrow(){
    }

    public void downReleasedArrow(){
		System.out.println("You are standing");
		hero.setState(hero.getStandingState());
    }

    public void thrownObject(){
		System.out.println("You dodged a fire object");	
    }

    public void rolledObject(){
		System.out.println("You are dead");	
    }

    public void fireObject(){
		System.out.println("You are dead");	
    }

    public void esc(){
		System.out.println("You are invisible");
		hero.setState(hero.getInvisibleState());
    }
} 

