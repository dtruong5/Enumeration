public class Machine {
    private MachineState state;
    public void setState(MachineState state){
        this.state = state;
    }
    public MachineState getState(){
        return state;
    }
}
