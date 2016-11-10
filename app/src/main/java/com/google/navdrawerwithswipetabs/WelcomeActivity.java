package com.google.navdrawerwithswipetabs;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button rightBtn = (Button) findViewById(R.id.rightBtn);
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "fonts/AlternateGothicEF_NoTwo.ttf");
        TextView bareng_textview = (TextView) findViewById(R.id.bareng_welcome_text);
        TextView slogan_textview = (TextView) findViewById(R.id.slogan_welcome);
        bareng_textview.setTypeface(myTypeface);
        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
;


