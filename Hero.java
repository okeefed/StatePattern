public class Hero{
    State jumpingState;
    State duckingState;
    State invisibleState;
    State standingState;
    State deadState;
    State divingState; 
    State state = standingState;

    public Hero(){
        jumpingState = new JumpingState(this);
        duckingState = new DuckingState(this);
        invisibleState = new InvisibleState(this);
        standingState = new StandingState(this);
        deadState = new DeadState(this);
        divingState = new DivingState(this);

    }
    
    public void upPressedArrow(){
        state.upPressedArrow();
    }

    public void upReleasedArrow(){
        state.upReleasedArrow();
    }

    public void downPressedArrow(){
        state.downPressedArrow();
    }

    public void downReleasedArrow(){
        state.downPressedArrow();
    }

    public void thrownObject(){
        state.thrownObject();
    }

    public void rolledObject(){
        state.rolledObject();
    }

    public void firedObject(){
        state.firedObject();
    }

    public void esc(){
        state.esc();
    }

    public void setState(State state){
        this.state = state;
    }

    public State getJumpingState(){
        return jumpingState;
    }

    public State getDuckingState(){
        return duckingState;
    }

    public State getStandingState(){
        return standingState();
    }

    public State getDeadState(){
        return deadState();
    }

    public State getDivingState(){
        return divingState();
    }

    public State getInvisibleState(){
        return invisibleState();
    }


       

    
}
