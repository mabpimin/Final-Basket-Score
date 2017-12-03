package com.bagus.mabpimin.appbascetscore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreTimA;
    TextView scoreTimB;

    int timA = 0;
    int timB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreTimA = findViewById(R.id.score1);
        scoreTimB = findViewById(R.id.score2);
    }



    public int addThreePoints(int score){
        return score+3;
    }
    public int addTwoPoints(int score){ return score+2; }
    public int addOnePoints(int score){
        return score+1;
    }




    public void displayScoreA(String scoreA){
        scoreTimA.setText(scoreA);
    }
    public void displayScoreB(String scoreB){
        scoreTimB.setText(scoreB);
    }



    public void tigaPoinA(View view) {
        timA = addThreePoints(timA);
        String angka = String.valueOf(timA);
        displayScoreA(angka);
    }
    public void duaPoinA(View view) {
        timA = addTwoPoints(timA);
        String angka = String.valueOf(timA);
        displayScoreA(angka);
    }
    public void satuPoinA(View view) {
        timA = addOnePoints(timA);
        String angka = String.valueOf(timA);
        displayScoreA(angka);
    }

    public void tigaPoinB(View view) {
        timB = addThreePoints(timB);
        String angka = String.valueOf(timB);
        displayScoreB(angka);
    }
    public void duaPoinB(View view) {
        timB = addTwoPoints(timB);
        String angka = String.valueOf(timB);
        displayScoreB(angka);
    }
    public void satuPoinB(View view) {
        timB = addOnePoints(timB);
        String angka = String.valueOf(timB);
        displayScoreB(angka);
    }





    public void resetAllScore(){
        timA = 0;
        timB = 0;
        scoreTimA.setText(String.valueOf(timA));
        scoreTimB.setText(String.valueOf(timB));
    }



    public void hapus(View view) {
        resetAllScore();
    }

    public void kirimBang(View view) {
        Intent intentKirim = new Intent( this, Main2Activity.class);
        intentKirim.putExtra("SCOREA", timA);
        intentKirim.putExtra("SCOREB", timB);
        startActivity(intentKirim);
    }

    public void telp(View view) {
        Intent intentKirim = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:085242232540"));
        startActivity(intentKirim);
    }
}

