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
import android.widget.TextView;

import com.wglxy.demo.pager.R;

/**
 * This activity displays a topic. It shows the title of the topic and a body of text.
 * Since this is a demo, the body is just sample text.
 *
 * The name of the topic comes from the title of a topic in the demo TopicList.
 *
 */

public class TopicActivity extends Activity {

/**
 * Create the activity. Fill in the topic's title from the Database.
 * Use sample_topic_text for the text body.
 * 
 */

@Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.demo_topic);
	 Intent in = getIntent ();
	 int index = in.getIntExtra("index", 0);

    TopicList tlist = TopicList.getInstance ();
    String title = tlist.getTopicTitle (index);
    String body  = tlist.getTopicText (index);
		
    TextView tv = (TextView) findViewById(R.id.title);
    if (tv != null) {
       tv.setText (title);
       tv.setTag (index);
    }
		
    TextView tv2 = (TextView) findViewById(R.id.body);
    if (tv2 != null) {
       tv2.setText (body);
       tv2.setTag (index);
    }
}

} // end class
