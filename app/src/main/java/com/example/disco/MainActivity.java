package com.example.disco;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.support.constraint.ConstraintLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import static java.lang.Thread.sleep;

public class MainActivity extends Activity{
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button b1=(Button)findViewById(R.id.button);
       Button b2=(Button)findViewById(R.id.button3);
       final LinearLayout l1 = (LinearLayout) findViewById(R.id.linear);
       b1.setOnClickListener(new View.OnClickListener()
       {
            @Override
            public void onClick(View view)
            {
                Settings.System.putInt(getApplicationContext().getContentResolver(), Settings.System.SCREEN_BRIGHTNESS, 255);
                new Handler().postDelayed(new Runnable()
                    {@Override
                        public void run() {
                            l1.setBackgroundColor(Color.rgb(128,0,128)); }
                    }, 100);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.BLUE);}
                }, 200);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.GREEN);}
                }, 300);new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.YELLOW);}
            }, 400);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 500);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 600);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 700);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 800);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 900);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(128,0,128)); }
                }, 1000);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.BLUE);}
                }, 1100);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.GREEN);}
                }, 1200);new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.YELLOW);}
            }, 1300);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 1400);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 1500);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 1600);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 1700);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 1800);new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.rgb(128,0,128)); }
            }, 1900);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.BLUE);}
                }, 2000);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.GREEN);}
                }, 2100);new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.YELLOW);}
            }, 2200);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 2300);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 2400);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 2500);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 2600);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 2700);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(128,0,128)); }
                }, 2800);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.BLUE);}
                }, 2900);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.GREEN);}
                }, 3000);new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.YELLOW);}
            }, 3100);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 3200);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 3300);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 3400);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 3500);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 3600);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(128,0,128)); }
                }, 3700);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.BLUE);}
                }, 3800);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.GREEN);}
                }, 3900);new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.YELLOW);}
            }, 4000);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 4100);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 4200);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 4300);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 4400);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 4500);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(128,0,128)); }
                }, 4600);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.BLUE);}
                }, 4700);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.GREEN);}
                }, 4800);new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.YELLOW);}
            }, 4900);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 5000);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 5100);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 5200);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 5300);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 5400);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(128,0,128)); }
                }, 5500);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.BLUE);}
                }, 5600);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.GREEN);}
                }, 5700);new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.YELLOW);}
            }, 4900);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 5800);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 5900);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 6000);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 6100);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 6200); new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.rgb(128,0,128)); }
            }, 6300);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.BLUE);}
                }, 6400);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.GREEN);}
                }, 6500);new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.YELLOW);}
            }, 6600);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 6700);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 6800);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 6900);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 7000);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 7100);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 7200);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 7300);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 7400);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 7500);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 7600);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 7700);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 7800);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 7900);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 8000);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 8100);new Handler().postDelayed(new Runnable()
            {@Override
            public void run() {
                l1.setBackgroundColor(Color.rgb(255,165,0));}
            }, 8200);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 8300);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 8400);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 8500);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 8600);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 8700);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 8800);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 8900);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 9000);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 9100);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 9200);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 9300);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 9400);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 9500);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.WHITE);}
                }, 9600);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.rgb(255,165,0));}
                }, 9700);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.RED);}
                }, 9800);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.LTGRAY);}
                }, 9900);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.MAGENTA);}
                }, 10000);
                new Handler().postDelayed(new Runnable()
                {@Override
                public void run() {
                    l1.setBackgroundColor(Color.BLACK);}
                }, 10100);
                }
        });
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Settings.System.putInt(getApplicationContext().getContentResolver(), Settings.System.SCREEN_BRIGHTNESS, 255);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },100);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },200);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },300);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },400);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },500);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },600);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },700);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },800);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },900);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },1000);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },1100);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },1200);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },1300);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },1400);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },1500);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },1600);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },1700);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },1800);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },1900);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },2000);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },2100);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },2200);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },2300);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },2400);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },2500);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },2600);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },2700);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },2800);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },2900);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },3000);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },3100);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },3200);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },   3300);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },3400);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },3500);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },3600);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },3700);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },3800);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },3900);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },4000);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },4100);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },4200);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },4300);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },4400);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },4500);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },4600);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },4700);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },4800);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },4900);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },5000);        new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },5100);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },5200);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },5300);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },5400);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },5500);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },5600);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },5700);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },5800);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },5900);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },6000);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },6100);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },6200);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },6300);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },6400);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },6500);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },6600);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },6700);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },6800);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },6900);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },7000);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },7100);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },7200);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },7300);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },7400);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },7500);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },7600);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },7700);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },7800);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },7900);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },8000);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },8100);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },8200);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },8300);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },8400);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },8500);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },8600);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },8700);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },8800);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },8900);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },9000);
               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },9100);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },9200);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },9300);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },9400);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },9500);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },9600);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },9700);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },9800);new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.WHITE); }
               },9900);

               new Handler().postDelayed(new Runnable() {
                   @Override
                   public void run() {l1.setBackgroundColor(Color.BLACK); }
               },10000);
           }
       });

        }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Settings.System.putInt(getApplicationContext().getContentResolver(), Settings.System.SCREEN_BRIGHTNESS, 20);
    }
}

