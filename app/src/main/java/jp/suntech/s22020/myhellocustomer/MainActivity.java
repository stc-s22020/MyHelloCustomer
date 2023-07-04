package jp.suntech.s22020.myhellocustomer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloListener listener = new HelloListener();

        Button btDisplay = findViewById(R.id.btDisplay);
        btDisplay.setOnClickListener(listener);

        Button btPlace = findViewById(R.id.btPlace);
        btPlace.setOnClickListener(listener);

        Button btName = findViewById(R.id.btName);
        btName.setOnClickListener(listener);

    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText input = findViewById(R.id.etName);
            EditText input2 = findViewById(R.id.etPlace);

            int id = v.getId();

            if(id == R.id.btDisplay) {
                String show = input2 + "にお住いの" + input + "さん、こんにちは！";
                Toast.makeText(MainActivity.this, show, Toast.LENGTH_LONG).show();
            } else if (id == R.id.btName) {
                input.setText("");
                String show = input2 + "にお住いの" + input + "さん、こんにちは！";
                Toast.makeText(MainActivity.this, show, Toast.LENGTH_LONG).show();
            } else if (id == R.id.btPlace) {
                input2.setText("");
                String show = input2 + "にお住いの" + input + "さん、こんにちは！";
                Toast.makeText(MainActivity.this, show, Toast.LENGTH_LONG).show();
            }
        }
    }
}