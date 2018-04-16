package com.droidrank.tictactoe;

import android.content.DialogInterface;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{


    private int count=0;

    Button block1, block2, block3, block4, block5, block6, block7, block8, block9, restart;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        block1 = (Button) findViewById(R.id.bt_block1);
        block2 = (Button) findViewById(R.id.bt_block2);
        block3 = (Button) findViewById(R.id.bt_block3);
        block4 = (Button) findViewById(R.id.bt_block4);
        block5 = (Button) findViewById(R.id.bt_block5);
        block6 = (Button) findViewById(R.id.bt_block6);
        block7 = (Button) findViewById(R.id.bt_block7);
        block8 = (Button) findViewById(R.id.bt_block8);
        block9 = (Button) findViewById(R.id.bt_block9);
        result = (TextView) findViewById(R.id.tv_show_result);
        restart = (Button) findViewById(R.id.bt_restart_game);

        block1.setText("");
        block2.setText("");
        block3.setText("");
        block4.setText("");
        block5.setText("");
        block6.setText("");
        block7.setText("");
        block8.setText("");
        block9.setText("");

        block1.setEnabled(false);
        block2.setEnabled(false);
        block3.setEnabled(false);
        block4.setEnabled(false);
        block5.setEnabled(false);
        block6.setEnabled(false);
        block7.setEnabled(false);
        block8.setEnabled(false);
        block9.setEnabled(false);

        



        /**
         * Restarts the game
         */
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = restart.getText().toString();
                if(text.equals("Start New Game"))
                {
                    restart.setText("Restart Game");
                    block1.setEnabled(true);
                    block2.setEnabled(true);
                    block3.setEnabled(true);
                    block4.setEnabled(true);
                    block5.setEnabled(true);
                    block6.setEnabled(true);
                    block7.setEnabled(true);
                    block8.setEnabled(true);
                    block9.setEnabled(true);

                }
                else if(text.equals("Restart Game"))
                {
                    AlertDialog.Builder builder;
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        builder = new AlertDialog.Builder(MainActivity.this, android.R.style.Theme_Material_Dialog_Alert);
                    } else {
                        builder = new AlertDialog.Builder(MainActivity.this);
                    }
                    builder.setTitle("Tic-Tac-Toe")
                            .setMessage("Do you want to restart the game?")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // continue with delete
                                    restart.setText("Start New Game");
                                    block1.setText("");
                                    block2.setText("");
                                    block3.setText("");
                                    block4.setText("");
                                    block5.setText("");
                                    block6.setText("");
                                    block7.setText("");
                                    block8.setText("");
                                    block9.setText("");
                                    result.setText("");

                                    count=0;

                                    block1.setEnabled(false);
                                    block2.setEnabled(false);
                                    block3.setEnabled(false);
                                    block4.setEnabled(false);
                                    block5.setEnabled(false);
                                    block6.setEnabled(false);
                                    block7.setEnabled(false);
                                    block8.setEnabled(false);
                                    block9.setEnabled(false);

                                }
                            })
                            .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    // do nothing
                                    dialog.dismiss();
                                }
                            })
                            .setIcon(android.R.drawable.ic_dialog_alert)
                            .show();
                }

            }
        });


        // BLOCK 1
        block1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CHECK AGAR ALREADY KUCH STRING EXIST KAR RAHA HAI..
                String text = block1.getText().toString();
                if(text.equals("X") || text.equals("O"))
                {

                }
                else
                {
                    if(count%2==0)
                    {
                        block1.setText("O");
                        count++;
                        check();
                    }
                    else
                    {
                        block1.setText("X");
                        count++;
                        check();
                    }
                }

            }
        });


        // BLOCK 2
        block2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CHECK AGAR ALREADY KUCH STRING EXIST KAR RAHA HAI..
                String text = block2.getText().toString();
                if(text.equals("X") || text.equals("O"))
                {

                }
                else
                {
                    if(count%2==0)
                    {
                        block2.setText("O");
                        count++;
                        check();
                    }
                    else
                    {
                        block2.setText("X");
                        count++;
                        check();
                    }
                }

            }
        });


        // BLOCK 3
        block3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CHECK AGAR ALREADY KUCH STRING EXIST KAR RAHA HAI..
                String text = block3.getText().toString();
                if(text.equals("X") || text.equals("O"))
                {

                }
                else
                {
                    if(count%2==0)
                    {
                        block3.setText("O");
                        count++;
                        check();
                    }
                    else
                    {
                        block3.setText("X");
                        count++;
                        check();
                    }
                }

            }
        });

        // BLOCK 4
        block4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CHECK AGAR ALREADY KUCH STRING EXIST KAR RAHA HAI..
                String text = block4.getText().toString();
                if(text.equals("X") || text.equals("O"))
                {

                }
                else
                {
                    if(count%2==0)
                    {
                        block4.setText("O");
                        count++;
                        check();
                    }
                    else
                    {
                        block4.setText("X");
                        count++;
                        check();
                    }
                }

            }
        });

        //BLOCK 5
        block5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CHECK AGAR ALREADY KUCH STRING EXIST KAR RAHA HAI..
                String text = block5.getText().toString();
                if(text.equals("X") || text.equals("O"))
                {

                }
                else
                {
                    if(count%2==0)
                    {
                        block5.setText("O");
                        count++;
                        check();
                    }
                    else
                    {
                        block5.setText("X");
                        count++;
                        check();
                    }
                }

            }
        });

        //BLOCK 6
        block6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CHECK AGAR ALREADY KUCH STRING EXIST KAR RAHA HAI..
                String text = block6.getText().toString();
                if(text.equals("X") || text.equals("O"))
                {

                }
                else
                {
                    if(count%2==0)
                    {
                        block6.setText("O");
                        count++;
                        check();
                    }
                    else
                    {
                        block6.setText("X");
                        count++;
                        check();
                    }
                }

            }
        });

        //BLOCK 7
        block7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CHECK AGAR ALREADY KUCH STRING EXIST KAR RAHA HAI..
                String text = block7.getText().toString();
                if(text.equals("X") || text.equals("O"))
                {

                }
                else
                {
                    if(count%2==0)
                    {
                        block7.setText("O");
                        count++;
                        check();
                    }
                    else
                    {
                        block7.setText("X");
                        count++;
                        check();
                    }
                }

            }
        });

        // BLOCK 8
        block8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CHECK AGAR ALREADY KUCH STRING EXIST KAR RAHA HAI..
                String text = block8.getText().toString();
                if(text.equals("X") || text.equals("O"))
                {

                }
                else
                {
                    if(count%2==0)
                    {
                        block8.setText("O");
                        count++;
                        check();
                    }
                    else
                    {
                        block8.setText("X");
                        count++;
                        check();
                    }
                }

            }
        });

        // BLOCK 9
        block9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // CHECK AGAR ALREADY KUCH STRING EXIST KAR RAHA HAI..
                String text = block9.getText().toString();
                if(text.equals("X") || text.equals("O"))
                {

                }
                else
                {
                    if(count%2==0)
                    {
                        block9.setText("O");
                        count++;
                        check();
                    }
                    else
                    {
                        block9.setText("X");
                        count++;
                        check();
                    }
                }

            }
        });



         // ONCREATE ENDS HERE
    }

    public void check()
    {
        String t1 = block1.getText().toString();
        String t2 = block2.getText().toString();
        String t3 = block3.getText().toString();
        String t4 = block4.getText().toString();
        String t5 = block5.getText().toString();
        String t6 = block6.getText().toString();
        String t7 = block7.getText().toString();
        String t8 = block8.getText().toString();
        String t9 = block9.getText().toString();

        if ((t1 == t2 && t1 == t3 && t3 == t2)) {
            if (t1 == "O") {
                result.setText("Player 1 Wins");
                condition();
                return;
            } else if (t1 == "X") {
                result.setText("Player 2 Wins");
                condition();
                return;
            }
        } else if ((t4 == t5 && t5 == t6 && t4 == t6)) {
            if (t4 == "O") {
                result.setText("Player 1 Wins");
                condition();
                return;
            } else if (t4 == "X") {
                result.setText("Player 2 Wins");
                condition();
                return;
            }
        } else if ((t7 == t8 && t8 == t9 && t7 == t9)) {
            if (t7 == "O") {
                result.setText("Player 1 Wins");
                condition();
                return;
            } else if (t7 == "X") {
                result.setText("Player 2 Wins");
                condition();
                return;
            }
        } else if ((t1 == t4 && t4 == t7 && t7 == t1)) {
            if (t7 == "O") {
                result.setText("Player 1 Wins");
                condition();
                return;
            } else if (t7 == "X") {
                result.setText("Player 2 Wins");
                condition();
                return;
            }
        } else if ((t2 == t5 && t2 == t8 && t5 == t8)) {
            if (t2 == "O") {
                result.setText("Player 1 Wins");
                condition();
                return;
            } else if (t2 == "X") {
                result.setText("Player 2 Wins");
                condition();
                return;
            }
        } else if ((t3 == t6 && t6 == t9 && t3 == t9)) {
            if (t3 == "O") {
                result.setText("Player 1 Wins");
                condition();
                return;
            } else if (t3 == "X") {
                result.setText("Player 2 Wins");
                condition();
                return;
            }
        } else if ((t1 == t5 && t1 == t9 && t5 == t9)) {
            if (t5 == "O") {
                result.setText("Player 1 Wins");
                condition();
                return;
            } else if (t5 == "X") {
                result.setText("Player 2 Wins");
                condition();
                return;
            }
        } else if ((t7 == t3 && t7 == t5 && t3 == t5)) {
            if (t7 == "O") {
                result.setText("Player 1 Wins");
                condition();
                return;
            } else if (t7 == "X") {
                result.setText("Player 2 Wins");
                condition();
                return;
            }
        } else if (count == 9) {
            result.setText("It's a Tie");
            return;
        } else {

        }
    }

    public void condition()
    {
        block1.setEnabled(false);
        block2.setEnabled(false);
        block3.setEnabled(false);
        block4.setEnabled(false);
        block5.setEnabled(false);
        block6.setEnabled(false);
        block7.setEnabled(false);
        block8.setEnabled(false);
        block9.setEnabled(false);
    }

}
