package com.codeep.creation.adapter.extension;

/**
 * @author codeep
 * @date 2023/7/4 9:40
 * @description: 这里 print 实例保存在了 Print 类型变量中，并没有选择父类 Banner，原因就是 Banner 是实际情况，需要隐藏其中的实际方法，
 * 只需要把需求暴露给用户即可（接口中的才是需求）,当实际情况改变时 Main 类不需要做出任何改变，他的需求不变，代码就不会变
 */
public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("Hello, World");
        print.printWeak();
        print.printStrong();
    }

}
