package step.tour.project.introslide;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;
    ImageView imageView;
    AnimationDrawable animation;
    CheckBox checkBox;

    /**
     * Starts the application with animation and the lesson screen from the activity_home.xml.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //animation section
        imageView = (ImageView) findViewById(R.id.imageView);
        if (imageView == null) throw new AssertionError();
        imageView.setBackgroundResource(R.drawable.animation_loading);

        animation = (AnimationDrawable) imageView.getBackground();
        animation.start();

            //Creates a delay before starting the Game
            new Handler().postDelayed(new Runnable() {

                                          @Override
                                          public void run() {
                                              Intent homeIntent = new Intent(HomeActivity.this, WelcomeActivity.class);
                                              startActivity(homeIntent);
                                          }
                                      }, SPLASH_TIME_OUT);
        }

    /**
     * Loads the WelcomeActivity again.
     * @param view
     */
    public void loadSlides(View view){
        new PreferenceManager(this).clearPreference();
        startActivity(new Intent(this,WelcomeActivity.class));
        finish();
    }
}