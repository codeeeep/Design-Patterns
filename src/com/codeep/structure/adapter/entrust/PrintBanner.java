package com.codeep.structure.adapter.entrust;

/**
 * @author codeep
 * @date 2023/7/4 9:59
 * @description:
 */
public class PrintBanner extends Print{

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak(){
        banner.showWithParen();
    }

    @Override
    public void printStrong(){
        banner.showWithAster();
    }

}
