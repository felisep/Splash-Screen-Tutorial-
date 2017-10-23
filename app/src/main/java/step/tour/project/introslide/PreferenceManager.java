package step.tour.project.introslide;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by felipesepulveda on 12/10/2017.
 * Version: 1.0
 */

public class PreferenceManager {
    private Context context;
    private SharedPreferences sharedPreferences;

    /**
     *
     * @param context
     */
    PreferenceManager(Context context){
        this.context = context;
        getSharePreference();
    }

    /**
     *
     */
    private void getSharePreference(){
        sharedPreferences = context.getSharedPreferences(context.getString(R.string.my_preference),Context.MODE_PRIVATE);
    }

    public void writePreference(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(context.getString(R.string.my_preference_key), "INIT_OK");
        editor.apply();
    }

    /**
     *
     * @return status
     */
    public boolean checkPreference(){
        boolean status = false;

        if(sharedPreferences.getString(context.getString(R.string.my_preference_key),"null").equals(null)){
            return status;
        }else{
            status = true;
        }
        return status;
    }

    public void clearPreference(){
        sharedPreferences.edit().clear().apply();
    }

}
