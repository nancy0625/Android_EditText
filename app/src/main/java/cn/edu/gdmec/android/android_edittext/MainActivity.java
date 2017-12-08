package cn.edu.gdmec.android.android_edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        button = (Button)this.findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               String value =  editText.getText().toString().trim();
                if(value == null || value.equals("")){
                    editText.setError("请输入用户名");
                    return;
                }
                // Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
            }
        });
        //键盘事件，监听键盘的按下的变化
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if(keyCode == KeyEvent.KEYCODE_ENTER){
                    Toast.makeText(MainActivity.this,"按下回车键",Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}
