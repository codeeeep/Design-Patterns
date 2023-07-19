package com.codeep.structure.decorator;

/**
 * @author codeep
 * @date 2023/7/19 21:41
 * @description: 两侧包裹的装饰物
 */
public class SideBored extends Border{

    private char borderChar;

    public SideBored(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
