package com.example.android.miwok;

/**
 * Created by NITISH KUMAR on 12-04-2018.
 */

public class word {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mDefautTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;

    public word(String defautTranslation, String miwokTranslation, int audioResourceId) {
        mDefautTranslation = defautTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    public word(String defautTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefautTranslation = defautTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getmDefautTranslation() {
        return mDefautTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}