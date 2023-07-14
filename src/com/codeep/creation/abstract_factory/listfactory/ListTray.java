package com.codeep.creation.abstract_factory.listfactory;

import com.codeep.creation.abstract_factory.factory.Item;
import com.codeep.creation.abstract_factory.factory.Tray;

import java.util.Iterator;

/**
 * @author codeep
 * @date 2023/7/13 13:43
 * @description:
 */
public class ListTray extends Tray {

    public ListTray(String caption){
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it = tray.iterator();
        while(it.hasNext()){
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
