package com.codeep.structure.decorator;

/**
 * @author codeep
 * @date 2023/7/19 21:41
 * @description:
 */
public abstract class Border extends Display{

    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }

}
