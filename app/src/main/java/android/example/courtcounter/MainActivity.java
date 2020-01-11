package android.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Integer teamAScore = 0;
    Integer teamBScore = 0;
    Integer teamAFouls = 0;
    Integer teamBFouls = 0;
    Integer teamACorners = 0;
    Integer teamBCorners = 0;

    private Button btn1;
    private Button btn2;
    private Button btn3;

    private Button btn4;
    private Button btn5;
    private Button btn6;

    private Button btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incScoreTeamA();
            }
        } );

        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incFoulTeamA();
            }
        } );

        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incCornerTeamA();
            }
        } );

        btn4 = (Button)findViewById(R.id.btn4);
        btn4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incScoreTeamB();
            }
        } );

        btn5 = (Button)findViewById(R.id.btn5);
        btn5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incFoulTeamB();
            }
        } );

        btn6 = (Button)findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                incCornerTeamB();
            }
        });

        btn7 = (Button)findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetAll();
            }
        });
    }

    /**
     * Displays the given score for Team A.
     */
    public void incScoreTeamA() {
        teamAScore++;
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(teamAScore));
    }

    /**
     * Increment Fouls for Team A.
     */
    public void incFoulTeamA() {
        teamAFouls++;
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText("Fouls: " + String.valueOf(teamAFouls));
    }

    /**
     * Displays the given score for Team A.
     */
    public void incCornerTeamA() {
        teamACorners++;
        TextView scoreView = (TextView) findViewById(R.id.team_a_corners);
        scoreView.setText("Corners: " + String.valueOf(teamACorners));
    }

    /**
     * Displays the given score for Team B.
     */
    public void incScoreTeamB() {
        teamBScore++;
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(teamBScore));
    }

    /**
     * Increment Fouls for Team A.
     */
    public void incFoulTeamB() {
        teamBFouls++;
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText("Fouls: " + String.valueOf(teamBFouls));
    }

    /**
     * Displays the given score for Team A.
     */
    public void incCornerTeamB() {
        teamBCorners++;
        TextView scoreView = (TextView) findViewById(R.id.team_b_corners);
        scoreView.setText("Corners: " + String.valueOf(teamBCorners));
    }


    /**
     * RESET ALL THE SCORE FOR BOTH TEAMS
     */
    public void resetAll()
    {
        teamAScore = 0;
        teamAFouls = 0;
        teamACorners = 0;
        teamBScore = 0;
        teamBFouls = 0;
        teamBCorners = 0;

        TextView scoreView1 = (TextView) findViewById(R.id.team_a_score);
        scoreView1.setText(String.valueOf(teamAScore));

        TextView scoreView2 = (TextView) findViewById(R.id.team_b_score);
        scoreView2.setText(String.valueOf(teamBScore));

        TextView scoreView3 = (TextView) findViewById(R.id.team_a_fouls);
        scoreView3.setText("Fouls: " + String.valueOf(teamAFouls));

        TextView scoreView4 = (TextView) findViewById(R.id.team_a_corners);
        scoreView4.setText("Corners: " + String.valueOf(teamACorners));

        TextView scoreView5 = (TextView) findViewById(R.id.team_b_fouls);
        scoreView5.setText("Fouls: " + String.valueOf(teamBFouls));

        TextView scoreView6 = (TextView) findViewById(R.id.team_b_corners);
        scoreView6.setText("Corners: " + String.valueOf(teamBCorners));
    }

}
