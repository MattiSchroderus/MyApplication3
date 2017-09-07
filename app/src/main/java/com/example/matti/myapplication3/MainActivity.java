package com.example.matti.myapplication3;


        import android.os.Bundle;
        import android.app.Activity;

        import android.view.View;
        import android.view.View.OnClickListener;

        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

public class MainActivity extends Activity {
    EditText eText;
    EditText eText2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eText = (EditText) findViewById(R.id.edittext);
        eText2 = (EditText) findViewById(R.id.edittext2);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                String str = eText.getText().toString() + eText2.getText().toString();

                Toast msg = Toast.makeText(getBaseContext(),str,Toast.LENGTH_LONG);
                msg.show();
            }
        });
    }
}