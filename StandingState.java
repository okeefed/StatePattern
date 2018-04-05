public class StandingState implements State{
    Hero hero;
    public StandingState(Hero hero){
        this.hero = hero;
    }

    public void upPressedArrow(){
		System.out.println("You are jumping");
		hero.setState(hero.getJumpingState());
    }
    
    public void upReleasedArrow(){
    }

    public void downPressedArrow(){
		System.out.println("You are ducking");
		hero.setState(hero.getDuckingState());
    }

    public void downReleasedArrow(){
    }

    public void thrownObject(){
		System.out.println("You are dead");
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

