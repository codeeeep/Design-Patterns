package com.codeep.creation.abstract_factory.listfactory;

import com.codeep.creation.abstract_factory.factory.Factory;
import com.codeep.creation.abstract_factory.factory.Link;
import com.codeep.creation.abstract_factory.factory.Page;
import com.codeep.creation.abstract_factory.factory.Tray;

/**
 * @author codeep
 * @date 2023/7/13 13:40
 * @description:
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return null;
    }

    @Override
    public Page createPage(String title, String author) {
        return null;
    }
}
