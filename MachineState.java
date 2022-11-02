public enum MachineState {
    BUSY("This machine is busy."), IDLE("The machine is idle."), BLOCKED("The machine is blocked.");

    private final String stateMachine;
    MachineState(String stateMachine) {
        this.stateMachine = stateMachine;
    }

    public String getStateMachine() {
        return stateMachine;
    }
}
