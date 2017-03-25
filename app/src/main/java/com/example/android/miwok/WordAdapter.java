package com.example.android.miwok;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by the Bumbs on 22/03/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /* Constructor
    * The contex is used to inflate the layout file, and the List is the data we want to
    * to populate inte the lists
    *
    * @param context    The current context. Used to inflate the layout file
    * @param words      A list of Word objects to display in a list
    */
    public WordAdapter(Activity context, ArrayList<Word> words) {
        // Here, it is initialized the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here is used 0.
        super(context, 0, words);
    }

    /*
    * Provieds a view for an AdapterView (ListView, GridView, etc.)
    *
    * @param position       The AdapterView position that is requesting a view
    * @param convertView    The recycled view to populate
    * @param parent         The parent ViewGroup that is used for inflation
    * @param return         The View for the position in the AdapterView
    */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);

        //Find the TextView in the list_item.xml layout with ID miwok_text_view
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        //Get the miwok TextView from the current Word object and set this text on the miwokTextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        //Find the TextView in the list_item.xml layout with ID default_text_view
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        //Get the miwok TextView from the current Word object and set this text on the defaultTextView
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //Find the ImageView in the list_item.xml layout with ID image
        ImageView img = (ImageView) listItemView.findViewById(R.id.image);
        //Get the imageExplanation from the current Word object and set this image on the ImageView
        img.setImageResource(currentWord.getImageExplanation());

        //Return the whole list item layout (containing 2 TextView-s and one ImageView
        return listItemView;
    }
}

