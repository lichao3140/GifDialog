package com.lichao.lib;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import pl.droidsonroids.gif.GifImageView;

/**
 * Created by Administrator on 2018-01-10.
 */

public class GifDialog {
    private String title,message,positiveBtnText,negativeBtnText,positiveBtnColor,negativeBtnColor;
    private Activity activity;
    private GifDialogListener positiveListener,negativeListener;
    private boolean cancel;
    int gifImageResource;

    private GifDialog(Builder builder){
        this.title=builder.title;
        this.message=builder.message;
        this.activity=builder.activity;
        this.positiveListener=builder.positiveListener;
        this.negativeListener=builder.negativeListener;
        this.positiveBtnColor=builder.positiveBtnColor;
        this.negativeBtnColor=builder.negativeBtnColor;
        this.positiveBtnText=builder.positiveBtnText;
        this.negativeBtnText=builder.negativeBtnText;
        this.gifImageResource=builder.gifImageResource;
        this.cancel=builder.cancel;
    }

    public static class Builder{
        private String title,message,positiveBtnText,negativeBtnText,positiveBtnColor,negativeBtnColor;
        private Activity activity;
        private GifDialogListener positiveListener,negativeListener;
        private boolean cancel;
        int gifImageResource;

        public Builder(Activity activity){
            this.activity=activity;
        }

        public Builder setTitle(String title){
            this.title=title;
            return this;
        }

        public Builder setMessage(String message){
            this.message=message;
            return this;
        }

        public Builder setPositiveBtnText(String positiveBtnText){
            this.positiveBtnText=positiveBtnText;
            return this;
        }

        public Builder setNegativeBtnText(String negativeBtnText){
            this.negativeBtnText=negativeBtnText;
            return this;
        }

        public Builder setPositiveBtnBackground(String positiveBtnColor){
            this.positiveBtnColor=positiveBtnColor;
            return this;
        }

        public Builder setNegativeBtnBackground(String negativeBtnColor){
            this.negativeBtnColor=negativeBtnColor;
            return this;
        }

        //set Positive Listener
        public Builder OnPositiveClicked(GifDialogListener positiveListener){
            this.positiveListener=positiveListener;
            return this;
        }

        //set Negative Listener
        public Builder OnNegativeClicked(GifDialogListener negativeListener){
            this.negativeListener=negativeListener;
            return this;
        }

        public Builder isCancellable(boolean cancel){
            this.cancel=cancel;
            return this;
        }

        //set GIF Resource
        public Builder setGifResource(int gifImageResource){
            this.gifImageResource=gifImageResource;
            return this;
        }

        public GifDialog build(){
            TextView message1,title1;
            ImageView iconImg;
            final Button pBtn,nBtn;
            GifImageView gifImageView;
            final Dialog dialog;
            dialog=new Dialog(activity);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            dialog.setCancelable(cancel);
            dialog.setContentView(R.layout.gif_dialog_layout);

            //init
            title1= (TextView) dialog.findViewById(R.id.title);
            message1=(TextView)dialog.findViewById(R.id.message);
            pBtn=(Button)dialog.findViewById(R.id.positiveBtn);
            nBtn=(Button)dialog.findViewById(R.id.negativeBtn);
            gifImageView=dialog.findViewById(R.id.gifImageView);
            gifImageView.setImageResource(gifImageResource);

            //values
            title1.setText(title);
            message1.setText(message);
            if(positiveBtnText!=null){
                pBtn.setText(positiveBtnText);
            }
            if(negativeBtnText!=null){
                nBtn.setText(negativeBtnText);
            }
            if(positiveBtnColor!=null){
                GradientDrawable bgShape= (GradientDrawable) pBtn.getBackground();
                bgShape.setColor(Color.parseColor(positiveBtnColor));
            }
            if(negativeBtnColor!=null){
                GradientDrawable bgShape= (GradientDrawable) nBtn.getBackground();
                bgShape.setColor(Color.parseColor(negativeBtnColor));
            }
            if(positiveListener!=null){
                pBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        positiveListener.OnClick();
                        dialog.dismiss();
                    }
                });
            }else{
                pBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
            }

            if(negativeListener!=null){
                nBtn.setVisibility(View.VISIBLE);
                nBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        negativeListener.OnClick();
                        dialog.dismiss();
                    }
                });
            }

            dialog.show();

            return new GifDialog(this);
        }

    }
}
