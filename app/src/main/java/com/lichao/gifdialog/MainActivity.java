package com.lichao.gifdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lichao.lib.GifDialog;
import com.lichao.lib.GifDialogListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button dialog1,dialog2,dialog3,dialog4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dialog1=findViewById(R.id.dialog1);
        dialog2=findViewById(R.id.dialog2);
        dialog3=findViewById(R.id.dialog3);
        dialog4=findViewById(R.id.dialog4);
        dialog1.setOnClickListener(this);
        dialog2.setOnClickListener(this);
        dialog3.setOnClickListener(this);
        dialog4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.dialog1){
            new GifDialog.Builder(MainActivity.this)
                    .setTitle("Online Shopping")
                    .setMessage("You don't have time for shopping, Visit our website for online shopping with discount price.")
                    .setPositiveBtnText("Ok")
                    .setPositiveBtnBackground("#22b573")
                    .setNegativeBtnText("Cancel")
                    .setNegativeBtnBackground("#c1272d")
                    .setGifResource(R.drawable.gif1)
                    .isCancellable(true)
                    .OnPositiveClicked(new GifDialogListener() {
                        @Override
                        public void OnClick() {
                            Toast.makeText(MainActivity.this,"Ok",Toast.LENGTH_SHORT).show();
                        }
                    })
                    .OnNegativeClicked(new GifDialogListener() {
                        @Override
                        public void OnClick() {
                            Toast.makeText(MainActivity.this,"Cancel",Toast.LENGTH_SHORT).show();
                        }
                    })
                    .build();
        }
    }
}
