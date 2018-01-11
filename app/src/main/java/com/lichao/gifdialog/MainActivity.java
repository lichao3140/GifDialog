package com.lichao.gifdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.lichao.mylibrary.GifDialog;
import com.lichao.mylibrary.GifDialogListener;

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
        } else if(view.getId() == R.id.dialog2){
            new GifDialog.Builder(MainActivity.this)
                    .setTitle("Getting Late")
                    .setMessage("Are you having problem with time.Don't know estimated time to reach.Visit our application,It will help you to get estimate time with distance.")
                    .setNegativeBtnText("Cancel")
                    .setPositiveBtnBackground("#22b573")
                    .setPositiveBtnText("Ok")
                    .setNegativeBtnBackground("#c1272d")
                    .setGifResource(R.drawable.gif2)
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
        } else if(view.getId() == R.id.dialog3){
            new GifDialog.Builder(MainActivity.this)
                    .setTitle("Tour Planning")
                    .setMessage("Are you planning to go for tour.No need to waste time,Visit our online tour booking website.")
                    .setNegativeBtnText("Cancel")
                    .setPositiveBtnBackground("#22b573")
                    .setPositiveBtnText("Ok")
                    .setNegativeBtnBackground("#c1272d")
                    .setGifResource(R.drawable.gif3)
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
        } else if(view.getId() == R.id.dialog4){
            new GifDialog.Builder(MainActivity.this)
                    .setTitle("Dialog without Gif Supports")
                    .setMessage("You can use TT Fancy Dialog without gif also.")
                    .setPositiveBtnBackground("#22b573")
                    .setPositiveBtnText("Ok")
                    .setGifResource(R.drawable.png1)
                    .isCancellable(true)
                    .OnPositiveClicked(new GifDialogListener() {
                        @Override
                        public void OnClick() {
                            Toast.makeText(MainActivity.this,"Ok",Toast.LENGTH_SHORT).show();
                        }
                    })
                    .build();
        }
    }
}
