package com.darlin.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText num1, num2;
    TextView resul;
    RadioButton suma, resta, multi, div;
    double ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById (R.id.enum1);
        num2 = (EditText) findViewById (R.id.enum2);
        resul = (TextView) findViewById (R.id.eResul);
        suma = (RadioButton) findViewById(R.id.eSuma);
        resta = (RadioButton) findViewById(R.id.eResta);
        multi = (RadioButton) findViewById(R.id.eMulti);
        div = (RadioButton) findViewById(R.id.eDiv);



    }

    public void onRadioButtonClicked(View view){
        boolean checked = ((RadioButton) view).isChecked();
        double n1, n2, resultado;

        n1 = Integer.parseInt(num1.getText().toString());
        n2 = Integer.parseInt(num2.getText().toString());
        //resultado = Integer.parseInt(resul.getText().toString());

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.eSuma:
                if (checked)

                    ope = n1 + n2;
                break;
            case R.id.eResta:
                if (checked)
                    ope = n1 - n2;
                    break;
            case R.id.eMulti:
                if (checked)
                    ope = n1*n2;
                    break;
            case R.id.eDiv:
                if (checked)
                    ope = n1/n2;
                    break;
        }
        resul.setText(String.valueOf(ope));
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
