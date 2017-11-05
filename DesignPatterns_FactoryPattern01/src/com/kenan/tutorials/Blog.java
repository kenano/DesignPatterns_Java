package com.kenan.tutorials;

/**
 * Created by kenanozdamar on 4/23/17.
 */
public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CommentPage());
        pages.add(new SearchPage());
        pages.add(new PostPage());
    }
}
