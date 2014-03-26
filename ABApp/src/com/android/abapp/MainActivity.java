package com.android.abapp;

import com.android.abapp.R;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private MediaPlayer mp;
	final static int numberOfButtons = 22;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		for(int i = 1; i<=numberOfButtons; i++){
			String buttonName = "button"+Integer.toString(i);
			int resID = getResources().getIdentifier(buttonName, "id",  getPackageName());
			Button btn = (Button) findViewById(resID);
			btn.setOnClickListener(listenUp);
			btn.setSoundEffectsEnabled(false);
			
		}
		setVolumeControlStream(AudioManager.STREAM_MUSIC);
	}

	final OnClickListener listenUp = new OnClickListener() {
		@Override
		public void onClick(View view){
			int resID;
			switch(view.getId()){
				case R.id.button1:
					resID = R.raw.abap;
				break;
				case R.id.button2:
					resID = R.raw.ballin;
				break;
				case R.id.button3:
					resID = R.raw.three;
				break;
				case R.id.button4:
					resID = R.raw.supbitches;
				break;
				case R.id.button5:
					resID = R.raw.cwizzy;
				break;
				case R.id.button6:
					resID = R.raw.chaddaddy;
				break;
				case R.id.button7:
					resID = R.raw.seven;
				break;
				case R.id.button8:
					resID = R.raw.bigpapi;
				break;
				case R.id.button9:
					resID = R.raw.deehldoe;
				break;
				case R.id.button10:
					resID = R.raw.hahaha;
				break;
				case R.id.button11:
					resID = R.raw.pstripple;
				break;
				case R.id.button12:
					resID = R.raw.slickblack;
				break;
				case R.id.button13:
					resID = R.raw.acetown;
				break;
				case R.id.button14:
					resID = R.raw.shouldcopyhowtogetgoodgames;
				break;
				case R.id.button15:
					resID = R.raw.moreliketearsofwar;
				break;
				case R.id.button16:
					resID = R.raw.weaintdoingeometry;
				break;
				case R.id.button17:
					resID = R.raw.itsallnewandshit;
				break;
				case R.id.button18:
					resID = R.raw.idontknowaboutyoubutthatshitaintballin;
				break;
				case R.id.button19:
					resID = R.raw.lamigra;
				break;
				case R.id.button20:
					resID = R.raw.wariowareshoveitupyourownassgame;
				break;
				case R.id.button21:
					resID = R.raw.fucksmashbros;
				break;
				case R.id.button22:
					resID = R.raw.anyoucanteveneatthatbitch;
				break;
				default:
					resID = R.raw.abap;
				break;
			}
			mp = MediaPlayer.create(getApplicationContext(),resID);
            mp.setOnCompletionListener(new OnCompletionListener() {

                @Override
                public void onCompletion(MediaPlayer mp) {
                    // TODO Auto-generated method stub
                    mp.release();
                    mp = null;
                }

            });   
            mp.start();
		}
	};
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
