package ketaki.mycompany.calculator;

import androidx.appcompat.app.AppCompatActivity;
import org.mariuszgromada.math.mxparser.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b00,b_dot,b_multiply,b_divide,b_plus,b_minus,b_equal,b_clear,b_bracket;
    ImageButton b_back;
    TextView input_text,output_text;
    String process1;

    char c;
boolean flag = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0 = findViewById(R.id.button0);
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
        b00 = findViewById(R.id.button_double_zero);

        b_plus = findViewById(R.id.button_plus);
        b_minus = findViewById(R.id.button_minus);
        b_multiply = findViewById(R.id.button_multiply);
        b_divide = findViewById(R.id.button_divide);
        b_dot = findViewById(R.id.button_dot);
        b_back = findViewById(R.id.button_back);
        b_equal = findViewById(R.id.button_equal_to);
        b_clear = findViewById(R.id.button_clear);
        b_bracket = findViewById(R.id.button_bracket);

        input_text = findViewById(R.id.inputTextView);
        output_text = findViewById(R.id.outputTextView);

         input_text.setText("");
         output_text.setText("");
        b_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input_text.setText("");
                output_text.setText("");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"0");

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"1");

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"2");

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"3");

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"4");

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"5");

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"6");

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"7");

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"8");

            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"9");

            }
        });

        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"00");

            }
        });
        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"+");

            }
        });
        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1= input_text.getText().toString();
                input_text.setText(process1+"-");
            }
        });

        b_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"×");
            }
        });
        b_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+"÷");
            }
        });
        b_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process1 = input_text.getText().toString();
                input_text.setText(process1+".");
            }
        });
        b_bracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag)
                {
                    process1 = input_text.getText().toString();
                    input_text.setText(process1+"(");
                    flag = false;
                }
                else
                {
                    process1 = input_text.getText().toString();
                    input_text.setText(process1+")");
                    flag = true;
                }
            }
        });

        b_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process1 = input_text.getText().toString();
                if(process1.length()>1) {
                    process1 = process1.substring(0, process1.length() - 1);
                    input_text.setText(process1);
                }
                else if(process1.length()==1)
                {
                    input_text.setText("");
                    output_text.setText("");
                }

            }
        });

    b_equal.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            process1 = input_text.getText().toString();
            process1 = process1.replaceAll("×","*");
            process1=process1.replaceAll("÷","/");

            Expression exp = new Expression(process1);

            String answer = String.valueOf(exp.calculate());
            output_text.setText(answer);

        }
    });







    }
}