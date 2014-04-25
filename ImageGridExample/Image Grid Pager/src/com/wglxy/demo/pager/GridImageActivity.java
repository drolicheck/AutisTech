package com.wglxy.demo.pager;

/*
 * Copyright (C) 2012 Wglxy.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.wglxy.demo.pager.R;

public class GridImageActivity extends Activity {

/**
 * An activity that shows a single image and the topic title associated with it.
 * Touching the image or the title takes you to a view of the topic's text.
 * 
 */

@Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.demo_pager_grid_item);
    Intent in = getIntent ();
    int index = in.getIntExtra("index", 0);

    TopicList tlist = TopicList.getInstance ();
    int imageId = tlist.getTopicImage (index);
    String title = tlist.getTopicTitle (index);

    TextView tv = (TextView) findViewById(R.id.title);
    if (tv != null) {
       tv.setText (title);
       tv.setTag (index);
       tv.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                onClickTitle (v);
            }
       });
    }

    ImageView iv = (ImageView) findViewById(R.id.image);
    if (iv != null) {
       iv.setTag (index);
       //iv.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
       iv.setBackgroundResource (R.color.background_grid1_cell);
       //iv.setPadding(8, 8, 8, 8);
       iv.setImageResource (imageId);
       iv.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                onClickImage (v);
            }
       });
    }

}

/**
 * Handle the click of the image being displayed.
 * 
 */

public void onClickImage (View v)
{
   Integer index = (Integer) v.getTag ();
   showTopic (index);
} // end onClickImage

/**
 * Handle the click of the image being displayed.
 * 
 */

public void onClickTitle (View v)
{
   Integer index = (Integer) v.getTag ();
   showTopic (index);
} // end onClickTitle

/**
 * Show the topic indicated by the index number.
 * 
 */

public void showTopic (int index) {

    Intent intent = new Intent(this.getApplicationContext(), TopicActivity.class);
    intent.putExtra ("index", index);
    startActivity (intent);

}

} // end class
