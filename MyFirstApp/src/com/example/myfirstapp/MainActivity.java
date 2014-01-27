package com.example.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	//起動
        super.onCreate(savedInstanceState);
        //レイアウト設定
        setContentView(R.layout.activity_main);
        
        //定義したボタン等のインスタンスを取得
        Button btn1 = (Button)findViewById(R.id.btn1);
        
        //ボタンがクリックされた時に呼び出されるコールバックリスナーを登録します
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				// ボタンがクリックされた時に呼び出されます
				EditText editTxt1 = (EditText)findViewById(R.id.editTxt1);
				// 入力内容を取得
				String strNum = editTxt1.getText().toString();
				

                Toast.makeText(MainActivity.this, "クリックしてくれてありがとう！",
                        Toast.LENGTH_SHORT).show();
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
