package com.iamhusrev._8_mediator_pattern;


import lombok.Getter;

@Getter
public class ListBox extends UIControl {

    private String selection;


    public ListBox(DialogBox owner) {
        super(owner);
    }

    public void setSelection(String selection) {
        this.selection = selection;
        owner.changed(this);
    }
}
