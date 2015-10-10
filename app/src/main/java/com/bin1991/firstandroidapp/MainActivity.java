package com.bin1991.firstandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button okButton;
    private EditText yearInput;
    private ImageView displayImage;
    //生肖逻辑计算数
    private int offset = 4;

    /**
     * 目前存在的问题,暂时没有处理异常if...else语句起不到作用,待研究
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化出生年份输入文本
        yearInput = (EditText) findViewById(R.id.editText);
        //初始化生肖显示图片
        displayImage = (ImageView) findViewById(R.id.imageView);

        //初始化确定按钮
        okButton = (Button) findViewById(R.id.button);
        //为确定按钮设置监听器
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //在当前onClick方法中监听按钮okButton的动作
                System.out.println("输入的出生年份为: " + yearInput.getText());
                if (yearInput.getText() != null) {
                    int year = Integer.parseInt(String.valueOf(yearInput.getText()));
                    int imagenumer = (year - offset) % 12;
                    switch (imagenumer) {
                        case 0:
                            displayImage.setImageResource(R.mipmap.shu);
                            break;
                        case 1:
                            displayImage.setImageResource(R.mipmap.niu);
                            break;
                        case 2:
                            displayImage.setImageResource(R.mipmap.hu);
                            break;
                        case 3:
                            displayImage.setImageResource(R.mipmap.tu);
                            break;
                        case 4:
                            displayImage.setImageResource(R.mipmap.dragon);
                            break;
                        case 5:
                            displayImage.setImageResource(R.mipmap.she);
                            break;
                        case 6:
                            displayImage.setImageResource(R.mipmap.ma);
                            break;
                        case 7:
                            displayImage.setImageResource(R.mipmap.yang);
                            break;
                        case 8:
                            displayImage.setImageResource(R.mipmap.hou);
                            break;
                        case 9:
                            displayImage.setImageResource(R.mipmap.ji);
                            break;
                        case 10:
                            displayImage.setImageResource(R.mipmap.gou);
                            break;
                        case 11:
                            displayImage.setImageResource(R.mipmap.zhu);
                            break;
                        default:
                            System.out.println("请输入正确的年份");
                            break;
                    }
                } else {
                    System.out.println("请输入年份");
                }
            }
        });
    }
}
