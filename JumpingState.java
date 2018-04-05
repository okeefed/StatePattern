public class JumpingState implements State{
    Hero hero;
    public JumpingState(Hero hero){
        this.hero = hero;
    }

    public void upPressedArrow(){
        System.out.println("You are jumping!");
    }
    
    public void upReleasedArrow(){
        System.out.println("You jumped!");
    }

    public void downPressedArrow(){
        System.out.println("You are diving!");

    }

    public void downReleasedArrow(){
        System.out.println("You can't do this at this time!");
    }

    public void thrownObject(){
    }
} 
