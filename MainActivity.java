
package com.moryomai;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.ScrollView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText input = findViewById(R.id.chat_input);
        Button sendBtn = findViewById(R.id.send_button);
        TextView chatLog = findViewById(R.id.chat_log);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = input.getText().toString();
                if (!message.isEmpty()) {
                    chatLog.append("\nYou: " + message);
                    input.setText("");
                }
            }
        });
    }
}
