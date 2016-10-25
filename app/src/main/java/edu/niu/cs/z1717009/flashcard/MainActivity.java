package edu.niu.cs.z1717009.flashcard;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton answerBtn = (ImageButton) findViewById(R.id.answerButton);

        answerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent answerIntent = new Intent(MainActivity.this,AnswerActivity.class);
                startActivity(answerIntent);
                overridePendingTransition(R.anim.answer_on,R.anim.question_off);
            }
        });
    }

}
