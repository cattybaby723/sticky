package com.example.anrou_hu.sticky.model.data;


import com.example.anrou_hu.sticky.model.data_type.StickyStatus;
import com.example.anrou_hu.sticky.model.data_type.StickyType;

/**
 * @author anrou_hu
 */

public class Note extends Sticky {

    private String mDescription;

    public Note() {
        this.setType(StickyType.NOTE);
        this.setStatus(StickyStatus.ACTIVATE);
    }


    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String content) {
        mDescription = content;
    }
}
