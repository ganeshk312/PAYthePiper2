package com.example.gk.paythepiper;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

import static com.example.gk.paythepiper.R.id.Bill;

public class MainActivity extends AppCompatActivity {

    int am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand=new Random();
        am=rand.nextInt(200)+1;
        TextView Bill=(TextView) findViewById(R.id.Bill);
        String st= String.valueOf(am);
        Bill.setText(st);

    }
    int[] count=new int[11];

    int amount=0;

    public void CLICK1(View v){
        count[1]++;
        amount=amount+1;
        display(amount);
        display_count();
        check();
    }
    public void CLICK2(View v){
        count[2]+=1;
        amount=amount+2;
        display(amount);
        display_count();
        check();}
    public void CLICK5(View v){
        count[5]+=1;
        amount=amount+5;
        display(amount);
        display_count();
        check();
    }
    public void CLICK10(View v){
        count[10]+=1;
        amount=amount+10;
        display(amount);
        display_count();
        check();}

    public void Reset(View v){
        for(int i=0;i<11;i++){
            count[i]=0;
        }
        display_count();
        amount=0;
        display(amount);
        check();}
    public void display_count(){
        TextView count_msg_1=(TextView) findViewById(R.id.count_msg_1);
        count_msg_1.setText(String.valueOf(count[1]));

        TextView count_msg_2=(TextView) findViewById(R.id.count_msg_2);
        count_msg_2.setText(String.valueOf(count[2]));

        TextView count_msg_5=(TextView) findViewById(R.id.count_msg_5);
        count_msg_5.setText(String.valueOf(count[5]));

        TextView count_msg_10=(TextView) findViewById(R.id.count_msg_10);
        count_msg_10.setText(String.valueOf(count[10]));
    }
    public void display(int amount){
        TextView total=(TextView) findViewById(R.id.total);
        total.setText("Total Paid: " + amount);
    }
    public void check(){
        RelativeLayout Lay=(RelativeLayout)findViewById(R.id.Lay);
        if(am==amount)
        {
            Lay.setBackgroundColor(Color.parseColor("#5550C710"));
            TextView msg=(TextView) findViewById(R.id.msg);
            msg.setVisibility(View.VISIBLE);
        }
        else {
            Lay.setBackgroundColor(Color.parseColor("#FFFFFF"));
            TextView msg=(TextView) findViewById(R.id.msg);
            msg.setVisibility(View.INVISIBLE);
        }
    }

}
