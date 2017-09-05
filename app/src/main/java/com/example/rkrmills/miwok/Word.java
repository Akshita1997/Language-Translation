package com.example.rkrmills.miwok;

/**
 * Created by RKRMILLS on 11-01-2017.
 * it contains default translation and miwok translation
 */

public class Word {

    /** Default translation for the word */
       private String mDefaultTranslation;

                /** Miwok translation for the word */
                private String mMiwokTranslation;

                private int mImageResourceId=NO_IMAGE_PROVIDED;

                private static final int NO_IMAGE_PROVIDED=-1;
            //audio resource id for word
                private int mAudioResourceId;
    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language

     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResouceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResouceId;
    }

                /**
          * Create a new Word object.
          *
          * @param defaultTranslation is the word in a language that the user is already familiar with
          *                           (such as English)
          * @param miwokTranslation is the word in the Miwok language
                 *     imageResouceId is the drawable resource id for image assosciated with word
         */
                public Word(String defaultTranslation, String miwokTranslation, int ImageResourceId,int audioResouceId) {
             mDefaultTranslation = defaultTranslation;
                mMiwokTranslation = miwokTranslation;
                mImageResourceId=ImageResourceId;
                    mAudioResourceId=audioResouceId;
            }

                /**
          * Get the default translation of the word.
          */
                public String getDefaultTranslation() {

                    return mDefaultTranslation;
            }

                /**
          * Get the Miwok translation of the word.
          */
               public String getMiwokTranslation() {
             return mMiwokTranslation;
            }

                public int getImageResourceId(){
                    return mImageResourceId;
                }

              //returns whether or not there ia an image or not
                public boolean hasImage()
                {
                     return mImageResourceId != NO_IMAGE_PROVIDED;
                }

                public int getmAudioResourceId(){
                    return mAudioResourceId;
                }
}
