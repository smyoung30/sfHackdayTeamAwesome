package com.sf.hackday.goodneighbor.views;

/**
 * Created by svermeyen1 on 6/15/16.
 */
public interface LoginView {
    String getUsername();
    String getPassword();
    void setPrompt(String prompt);
    void transition(boolean isUser);
}
