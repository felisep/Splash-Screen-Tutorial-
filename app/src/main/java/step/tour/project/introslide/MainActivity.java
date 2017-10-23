package step.tour.project.introslide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{

    /**
     * Starts the Tutorial again if the user wants to se the
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //Starts with this layout?

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
