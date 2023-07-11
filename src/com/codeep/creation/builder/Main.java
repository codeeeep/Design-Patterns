package com.codeep.creation.builder;

/**
 * @author codeep
 * @date 2023/7/11 20:04
 * @description:
 */
public class Main {

    public static void main(String[] args) {

        if (args.length != 1){
            usage();
            System.exit(0);
        }

        if ("plain".equals(args[0])){
            TextBuilder textBuilder = new TextBuilder();
            Director directorForText = new Director(textBuilder);
            directorForText.construct();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if ("html".equals(args[0])){
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director directorForHTML = new Director(htmlBuilder);
            directorForHTML.construct();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "文件编写完成.");
        } else{
            usage();
            System.exit(0);
        }



    }

    public static void usage(){
        System.out.println("Usage: java Main plain         编写纯文本文档");
        System.out.println("Usage: java Main html         编写HTML文档");
    }

}
