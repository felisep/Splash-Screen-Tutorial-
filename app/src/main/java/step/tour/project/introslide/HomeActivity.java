package step.tour.project.introslide;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    /**
     * Starts the applicatoin and the lesson screen from the activity main.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        new Handler().postDelayed(new Runnable(){

            @Override
            public void run(){
                Intent homeIntent = new Intent(HomeActivity.this, WelcomeActivity.class); //
                startActivity(homeIntent);
            }
        }
        ,SPLASH_TIME_OUT);
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