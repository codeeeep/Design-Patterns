package com.codeep.creation.abstract_factory.listfactory;

import com.codeep.creation.abstract_factory.factory.Link;

/**
 * @author codeep
 * @date 2023/7/13 13:43
 * @description:
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
