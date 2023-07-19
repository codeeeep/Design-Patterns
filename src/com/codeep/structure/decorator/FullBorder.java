package com.codeep.structure.decorator;

/**
 * @author codeep
 * @date 2023/7/19 21:41
 * @description: 全面包裹的装饰物
 */
public class FullBorder extends Border{

    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns() + 2;
    }

    @Override
    public int getRows() {
        return display.getRows() + 2;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return  "+" + makeLine('-', display.getColumns()) + "+";
        }
        else if (row == display.getRows() + 1) {
            return  "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            stringBuffer.append(ch);
        }
        return stringBuffer.toString();
    }

}
