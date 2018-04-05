public class JumpingState implements State{
    Hero hero;
    public JumpingState(Hero hero){
        this.hero = hero;
    }

    public void upPressedArrow(){
    }
    
    public void upReleasedArrow(){
        System.out.println("You are standing");
        hero.setState(hero.getStandingState());
    }

    public void downPressedArrow(){
        System.out.println("You are diving!");
        hero.setState(hero.getDivingState());
    }

    public void downReleasedArrow(){
    }

    public void thrownObject(){
        System.out.println("You have been hit");
        hero.setState(hero.getDeadState());
    }

    public void rolledObject(){
        System.out.println("You have jumped over a rolling object!");
    }

    public void fireObject(){
        System.out.println("You have jumped over a fire object!");
    }

    public void esc(){
        System.out.println("You are invisble and are unable to do anything to I say");
        hero.setState(hero.getInvisibleState());
    }
} 
