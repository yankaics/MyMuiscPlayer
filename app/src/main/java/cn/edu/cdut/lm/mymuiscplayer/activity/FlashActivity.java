package cn.edu.cdut.lm.mymuiscplayer.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import cn.edu.cdut.lm.mymuiscplayer.R;

/**
 * Created by LimiaoMaster on 2016/9/17 17:28
 */

public class FlashActivity extends AppCompatActivity {
    private static final int DELAY_TIME = 1000;
    private static final String TAG = "FlashActivity";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.e(TAG, "onCreate方法得到执行。");
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(FlashActivity.this, MainActivity.class));
                overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
                finish();
            }
        }, DELAY_TIME);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart方法得到执行。");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume方法得到执行。");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause方法得到执行。");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop方法得到执行。");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart方法得到执行。");
    }

    @Override
    protected void onDestroy() {
        Log.e(TAG,"onDestroy方法得到执行。");
        //关闭notification
        //PlayerService.manager.cancel(NOTIFICATION_ID);
        super.onDestroy();
    }
}
