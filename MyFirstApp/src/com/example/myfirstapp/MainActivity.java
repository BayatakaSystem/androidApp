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
    	//�N��
        super.onCreate(savedInstanceState);
        //���C�A�E�g�ݒ�
        setContentView(R.layout.activity_main);
        
        //��`�����{�^�����̃C���X�^���X���擾
        Button btn1 = (Button)findViewById(R.id.btn1);
        
        //�{�^�����N���b�N���ꂽ���ɌĂяo�����R�[���o�b�N���X�i�[��o�^���܂�
        btn1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

				// �{�^�����N���b�N���ꂽ���ɌĂяo����܂�
				EditText editTxt1 = (EditText)findViewById(R.id.editTxt1);
				// ���͓��e���擾
				String strNum = editTxt1.getText().toString();
				

                Toast.makeText(MainActivity.this, "�N���b�N���Ă���Ă��肪�Ƃ��I",
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
