package claudioshigemi.com.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void displayForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.txt_teamAScore);
        scoreView.setText(String.valueOf(score));
    }
    public  void displayForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.txt_teamBScore);
        scoreView.setText(String.valueOf(score));
    }

    public  void soma3Pontos(View view){
        TextView scoreView = (TextView) findViewById(R.id.txt_teamAScore);
        scoreA += 3;
        displayForTeamA(scoreA);
    }

    public  void  soma2Pontos(View view){
        scoreA += 2;
        displayForTeamA(scoreA);
    }

    public  void freeThrow(View view){
        scoreA += 1;
        displayForTeamA(scoreA);
    }

    public  void  resetPlacar(View view){
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }

    public  void  soma3PontosB(View view){
        scoreB +=3;
        displayForTeamB(scoreB);
    }

    public  void  soma2PontosB(View view){
        scoreB += 2;
        displayForTeamB(scoreB);
    }

    public  void freeThrowB(View view){
        scoreB += 1;
        displayForTeamB(scoreB);
    }

    public  void  resetPlacarB(View view){
        scoreB = 0;
        displayForTeamB(scoreB);
    }





}
