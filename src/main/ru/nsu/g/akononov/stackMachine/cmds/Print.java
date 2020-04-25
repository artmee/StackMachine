package ru.nsu.g.akononov.stackMachine.cmds;

import ru.nsu.g.akononov.stackMachine.Cmd;

public class Print extends Cmd {

    @Override
    public void execution() {
        if(stack.empty())
        {
            System.out.println("# Stack is empty");
            return;
        }

        System.out.println(stack.peek());
    }
}
