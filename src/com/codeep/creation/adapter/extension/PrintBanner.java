package com.codeep.creation.adapter.extension;

/**
 * @author codeep
 * @date 2023/7/4 9:40
 * @description:
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
