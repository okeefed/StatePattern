public class Hero{
    State jumpingState;
    State duckingState;
    State invisibleState;
    State standingState;
    State deadState;
    
    State state = standingState;

    public Hero(){
        jumpingState = new JumpingState(this);
        duckingState = new DuckingState(this);
        invisibleState = new InvisisbleState(this);
        standingState = new StandingState(this);
        deadState = new DeadState(this);

    }
    
    public void upArrow(){
        state.upArrow();
    }

    public void downArrow(){
        state.downArrow();
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

    public void setState(State state){
        this.state = state;
    }

    
    

    
}
