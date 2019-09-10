package com.example.student.kiemtra;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button dangnhap;
    private AlertDialog.Builder alert;
    private CheckBox luu;
    private Button thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dangnhap = (Button) findViewById(R.id.dangnhap);
        luu = findViewById(R.id.luu);
        alert = new AlertDialog.Builder(this);
        alert.setTitle("Thông Báo!");

        dangnhap.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(luu.isChecked())
                {
                    alert.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                }
                else
                {
                    alert.setMessage("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
                }
                alert.show();


            }
        });

        //xulinutthoat
        thoat.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                alert.setTitle("Thông Báo");
                alert.setMessage("Bạn có muốn thoát không?");
                alert.setPositiveButton("CÓ", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which)
                    {
                        finish();
                    }
                });
                alert.setNegativeButton("NO", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which)
                    {
                        dialogInterface.cancel();
                    }
                });
            }
        });
    }


}
