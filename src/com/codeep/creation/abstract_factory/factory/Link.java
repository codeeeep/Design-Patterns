package com.codeep.creation.abstract_factory.factory;

/**
 * @author codeep
 * @date 2023/7/13 13:39
 * @description:
 */
public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url){
        super(caption);
        this.url = url;
    }

}
