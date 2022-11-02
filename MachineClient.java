public class MachineClient {
    public static void main(String[] args) {
        Machine machine = new Machine();
        //machine.setState("State one");
        machine.setState(MachineState.IDLE);

        MachineState state = machine.getState();
        System.out.println("The machine state is: " + state);
        machine.setState(MachineState.BUSY);
        MachineState state2 = machine.getState();
        System.out.println("The machine state is: " + state2);
        //new MachineState();
        MachineState machineState = MachineState.BUSY;
        System.out.println(machineState.getStateMachine());
    }
}
