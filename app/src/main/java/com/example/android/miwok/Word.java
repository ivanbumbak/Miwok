package com.example.android.miwok;

/**
 * Created by the Bumbs on 22/03/2017.
 * It contains a default translation and a Miwok translation for that word.
 */

public class Word {

    /* Default translation for the word. */
    private String mDefaultTranslation;

    /* Miwok translation for the word. */
    private String mMiwokTranslation;

    /* Image explanation for the word. */
    private int mImageExplanation;

    /* Constructor
    *
    * @param defaultTranslation is the word in a language that user is using (such as English)
    * @param miwokTranslation is the word in the Miwok language
    */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /* Constructor
    *
    * @param defaultTranslation is the word in a language that user is using (such as English)
    * @param miwokTranslation is the word in the Miwok language
    * @param imageExplanation is the drawable resource ID which visually represent the word
    */
    public Word(String defaultTranslation, String miwokTranslation, int imageExplanation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageExplanation = imageExplanation;
    }

    /* Get the Miwok translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /* Get the default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /* Get the picture explanation of the word */
    public int getImageExplanation() { return mImageExplanation; }
}
