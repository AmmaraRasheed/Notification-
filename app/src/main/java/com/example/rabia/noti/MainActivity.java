package com.example.rabia.noti;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.app.RemoteInput;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String CHANNEL_ID = "id";
    private static final String KEY_TEXT_REPLY = "key_text_reply";
    int SUMMARY_ID = 0;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createNotificationChannel();

//        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
//                .setSmallIcon(R.drawable.nitification)
//                .setContentTitle("Ammara Rasheed")
//                .setContentText("Here is Ammara Rasheed");
//        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);


//        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
//                .setSmallIcon(R.drawable.nitification)
//                .setContentTitle("My notification")
//                .setContentText("Much longer text that cannot fit one line... This is my setStyleFunction")
////                .setStyle(new NotificationCompat.BigTextStyle()
////                        .bigText("Much longer text that cannot fit one line... This is my setStyleFunction"))
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT);



        // Create an explicit intent for an Activity in your app
//        Intent intent = new Intent(this, AlertDetails.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
//
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID)
//                .setSmallIcon(R.drawable.nitification)
//                .setContentTitle("My notification")
//                .setContentText("Hello World!")
//                .setPriority(NotificationCompat.PRIORITY_DEFAULT)
//                // Set the intent that will fire when the user taps the notification
//                .setContentIntent(pendingIntent)
//                .setAutoCancel(true);

// notificationId is a unique int for each notification that you must define

        // Reply Action

        // Key for the string that's delivered in the action's intent.

//
//        String replyLabel = getResources().getString(R.string.reply_label);
//        RemoteInput remoteInput = new RemoteInput.Builder(KEY_TEXT_REPLY)
//                .setLabel(replyLabel)
//                .build();
//
//        int id=(int)System.currentTimeMillis();
//        intent=new Intent("com.app.OPEN");
//        // Build a PendingIntent for the reply action to trigger.
//        PendingIntent replyPendingIntent =
//                PendingIntent.getBroadcast(getApplicationContext(),id,intent,
//                        PendingIntent.FLAG_UPDATE_CURRENT);
//
//
//        // Create the reply action and add the remote input.
//        NotificationCompat.Action action =
//                new NotificationCompat.Action.Builder(R.drawable.nitification,
//                        getString(R.string.label), replyPendingIntent)
//                        .addRemoteInput(remoteInput)
//                        .build();
//
//        // Build the notification and add the action.
//        Notification newMessageNotification = new NotificationCompat.Builder(MainActivity.this)
//                .setSmallIcon(R.drawable.nitification)
//                .setContentTitle(getString(R.string.title))
//                .setContentText(getString(R.string.content))
//                .addAction(action)
//                .build();
//
////
//
//// Issue the notification.
//        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
//        int notificationId=22;
//        notificationManager.notify(notificationId, newMessageNotification);




        //  Add Action Bar


//        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID);
//        builder.setContentTitle("Picture Download")
//                .setContentText("Download in progress")
//                .setSmallIcon(R.drawable.nitification)
//                .setPriority(NotificationCompat.PRIORITY_LOW);
//
//// Issue the initial notification with zero progress
//        int PROGRESS_MAX = 100;
//        int PROGRESS_CURRENT = 0;
//        builder.setProgress(PROGRESS_MAX, PROGRESS_CURRENT, false);
//        int notificationId=43;
//        notificationManager.notify(notificationId, builder.build());
//
//        builder.setContentText("Download complete")
//                .setProgress(0,0,false);
//        notificationManager.notify(notificationId, builder.build());



        String GROUP_KEY_WORK_EMAIL = "com.android.example.WORK_EMAIL";

        Notification newMessageNotification = new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                .setSmallIcon(R.drawable.nitification)
                .setContentTitle("Ammara")
                .setContentText("hi Its ammara")
                .setGroup(GROUP_KEY_WORK_EMAIL)
                .build();



        //use constant ID for notification used as group summary


        Notification newMessageNotification1 =
                new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                        .setSmallIcon(R.drawable.nitification)
                        .setContentTitle("Sara")
                        .setContentText("You will not believe...")
                        .setGroup(GROUP_KEY_WORK_EMAIL)
                        .build();

        Notification newMessageNotification2 =
                new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                        .setSmallIcon(R.drawable.nitification)
                        .setContentTitle("Maham saleem")
                        .setContentText("Please join us to celebrate the...")
                        .setGroup(GROUP_KEY_WORK_EMAIL)
                        .build();

        Notification summaryNotification =
                new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID)
                        .setContentTitle("My Notifications")
                        //set content text to support devices running API level < 24
                        .setContentText("Two new messages")
                        .setSmallIcon(R.drawable.nitification)
                        //build summary info into InboxStyle template
                        .setStyle(new NotificationCompat.InboxStyle()
                                .addLine("Alex Faarborg  Check this out")
                                .addLine("Jeff Chang    Launch Party")
                                .setBigContentTitle("2 new messages")
                                .setSummaryText("janedoe@example.com"))
                        //specify which group this notification belongs to
                        .setGroup(GROUP_KEY_WORK_EMAIL)
                        //set this notification as the summary for the group
                        .setGroupSummary(true)
                        .build();

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
        int emailNotificationId1=1;
        notificationManager.notify(emailNotificationId1, newMessageNotification1);
        int emailNotificationId2=2;
        notificationManager.notify(emailNotificationId2, newMessageNotification);
        int emailNotificationId3=3;
        notificationManager.notify(emailNotificationId3, newMessageNotification2);
        notificationManager.notify(SUMMARY_ID, summaryNotification);

    }


    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

}
