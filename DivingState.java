public class DivingState implements State{
    Hero hero;
    public DivingState(Hero hero){
        this.hero = hero;
    }

    public void upPressedArrow(){
	}
    
    public void upReleasedArrow(){
	}

    public void downPressedArrow(){
    }

    public void downReleasedArrow(){
		System.out.println("You are jumping");
		here.setState(here.getJumpingState());
    }

    public void thrownObject(){
		System.out.println("You dodged a thrown object");
    }

    public void rolledObject(){
		System.out.println("You are dead");
		hero.setState(hero.getDeadState());
    }

    public void fireObject(){
		System.out.println("You dodged a fire object");
    }

    public void esc(){
		System.out.println("You are invisible");
		hero.setState(hero.getInvisibleState());
    }
} 

