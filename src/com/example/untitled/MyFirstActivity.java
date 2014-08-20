package com.example.untitled;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by sundays on 7/13/14.
 */
public class MyFirstActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
       /** TextView textView= new TextView(this);
        setContentView(textView);
        */
        /**
         * это ссылка на Представление, расмещенное внутри разметки*/
    setContentView(R.layout.main);
    }
    public void whatButton(View target){
        switch (target.getId()){
            case R.id.button:
                setContentView(R.layout.where);
        }
    }
    public void whereButtonBack(View target){
        switch (target.getId()){
            case R.id.button1:
                setContentView(R.layout.what);
        }
    }
    public void whereButtonFor(View target){
        switch (target.getId()){
            case R.id.button2:
                setContentView(R.layout.who);
        }
    }
    public void whoButtonBack(View target){
        switch (target.getId()){
            case R.id.button3:
                setContentView(R.layout.where);
        }
    }
    public void mainFind(View target){
        switch (target.getId()){
            case R.id.main_find:
                setContentView(R.layout.what);
        }
    }
    public void mainLost(View target){
        switch (target.getId()){
            case R.id.main_lost:
                setContentView(R.layout.what);
        }
    }
    public void mainOptions(View target){
        switch (target.getId()){
            case R.id.main_options:
                //setContentView(R.layout.bye);
                System.exit(0);
        }
    }
    public void mainExit(View target){
        switch (target.getId()){
            case R.id.main_exit:
                setContentView(R.layout.bye);
                //System.exit(0);
        }
    }
    public void toSummary(View target){
        switch (target.getId()){
            case R.id.summary:
                setContentView(R.layout.summary);
        }
    }
    public void backToMenu(View target){
        switch (target.getId()){
            case R.id.backToMenu:
                setContentView(R.layout.main);
        }
    }


}
