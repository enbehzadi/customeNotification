package com.example.mbehzadi.customenotification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RemoteViews;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap icon1 = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher_round);

        Notification.Builder mBuilder = new Notification.Builder(
                this).setAutoCancel(true)
                .setContentTitle("DJ-Android notification")
                .setSmallIcon(R.mipmap.ic_launcher).setLargeIcon(icon1)
                .setContentText("Hello World!");

        Notification.BigPictureStyle bigPicStyle = new Notification.BigPictureStyle();
        bigPicStyle.bigPicture(icon1);
        bigPicStyle.setBigContentTitle("Android is a Linux-based operating system designed primarily for touchscreen mobile devices such as smartphones and tablet computers. Initially developed by Android, Inc., which Google backed financially and later bought in 2005,[12] Android was unveiled in 2007 along with the founding of the Open Handset Alliance: a consortium of hardware, software, and telecommunication companies devoted to advancing open standards for mobile devices.[13] The first Android-powered phone was sold in October 2008");


        bigPicStyle.setBigContentTitle("Dhaval Sodha Parmar");
        mBuilder.setStyle(bigPicStyle);

        // Creates an explicit intent for an Activity in your app
        Intent resultIntent = new Intent(this, MainActivity.class);

        // The stack builder object will contain an artificial back stack for
        // the
        // started Activity.
        // This ensures that navigating backward from the Activity leads out of
        // your application to the Home screen.
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);

        // Adds the back stack for the Intent (but not the Intent itself)
        stackBuilder.addParentStack(MainActivity.class);

        // Adds the Intent that starts the Activity to the top of the stack
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,
                PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);

        NotificationManager mNotificationManager = (NotificationManager) getSystemService(this.NOTIFICATION_SERVICE);

        // mId allows you to update the notification later on.
        mNotificationManager.notify(100, mBuilder.build());

       /* String[] events = new String[19];

        events[0] = "Helloo..!";
        events[1] = "How are you?";
        events[2] = "HIII !!";
        events[3] = "i am fine...";
        events[4] = "what about you? all is well?";
        events[5] = "Yes, every thing is all right..";
        events[6] = "Yes, every thing is all right..";
        events[7] = "Yes, every thing is all right..";
        events[8] = "Yes, every thing is all right..";
        events[9] = "Yes, every thing is all right..";
        events[10] = "Yes, every thing is all right..";
        events[11] = "Yes, every thing is all right..";
        events[12] = "Yes, every thing is all right..";
        events[13] = "Yes, every thing is all right..";
        events[14] = "Yes, every thing is all right..";
        events[15] = "Yes, every thing is all right..";
        events[16] = "Yes, every thing is all right..";
        events[17] = "Yes, every thing is all right..";
        events[18] = "Yes, every thing is all right..";

        Bitmap icon1 = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher_round);

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(
                this).setAutoCancel(true)
                .setContentTitle("DJ-Android notification")
                .setSmallIcon(R.mipmap.ic_launcher_round).setLargeIcon(icon1)
                .setContentText("Hello World!");

        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();

        // Sets a title for the Inbox style big view
        inboxStyle.setBigContentTitle("Event Details");

        // Moves events into the big view
        for (int i = 0; i < events.length; i++) {

            inboxStyle.addLine(events[i]);
        }
        // Moves the big view style object into the notification object.
        mBuilder.setStyle(inboxStyle);

        // Creates an explicit intent for an Activity in your app
        Intent resultIntent = new Intent(this, MainActivity.class);

        // The stack builder object will contain an artificial back stack for
        // the
        // started Activity.
        // This ensures that navigating backward from the Activity leads out of
        // your application to the Home screen.
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);

        // Adds the back stack for the Intent (but not the Intent itself)
        stackBuilder.addParentStack(MainActivity.class);

        // Adds the Intent that starts the Activity to the top of the stack
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,
                PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);

        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // mId allows you to update the notification later on.
        mNotificationManager.notify(100, mBuilder.build());*/



      /*  Bitmap icon1 = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher_round);

        Notification.Builder mBuilder = new Notification.Builder(
                this).setAutoCancel(true)
                .setContentTitle("DJ-Android notification")
                .setSmallIcon(R.mipmap.ic_launcher).setLargeIcon(icon1)
                .setContentText("Hello World!");

        Notification.BigTextStyle bigText = new Notification.BigTextStyle();
        bigText.bigText("Android is a Linux-based operating system designed primarily for touchscreen mobile devices such as smartphones and tablet computers. Initially developed by Android, Inc., which Google backed financially and later bought in 2005,[12] Android was unveiled in 2007 along with the founding of the Open Handset Alliance: a consortium of hardware, software, and telecommunication companies devoted to advancing open standards for mobile devices.[13] The first Android-powered phone was sold in October 2008");
        bigText.setBigContentTitle("Android");
        bigText.setSummaryText("By: Dhaval Sodha Parmar");
        mBuilder.setStyle(bigText);

        // Creates an explicit intent for an Activity in your app
        Intent resultIntent = new Intent(this, MainActivity.class);

        // The stack builder object will contain an artificial back stack for
        // the
        // started Activity.
        // This ensures that navigating backward from the Activity leads out of
        // your application to the Home screen.
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);

        // Adds the back stack for the Intent (but not the Intent itself)
        stackBuilder.addParentStack(MainActivity.class);

        // Adds the Intent that starts the Activity to the top of the stack
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,
                PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);

        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        // mId allows you to update the notification later on.
        mNotificationManager.notify(100, mBuilder.build());*/


       /* NotificationManager notificationManager = (NotificationManager)
                this.getSystemService(Context.NOTIFICATION_SERVICE);

        Intent notificationIntent = new Intent(this, MainActivity.class);

        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        PendingIntent intent =
                PendingIntent.getActivity(this, 0,
                        notificationIntent,PendingIntent.FLAG_UPDATE_CURRENT);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher_round);
        String message="Hello Notification with image";
        String title="Notification !!!";
        int icon = R.mipmap.ic_launcher_round;
        long when = System.currentTimeMillis();

        Notification  notification = new NotificationCompat.Builder(this)
                .setContentTitle(title)
                .setContentText(message)
                .setContentIntent(intent)
                .setSmallIcon(icon)
                .setWhen(when)
                .setStyle(new NotificationCompat.BigPictureStyle()
                        .bigPicture(bitmap).setSummaryText(message))
                .build();

        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        // Play default notification sound
        notification.defaults |= Notification.DEFAULT_SOUND;
        notification.defaults |= Notification.DEFAULT_VIBRATE;
        notificationManager.notify(0, notification);*/


      /*  Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher_round);

        Intent notificationIntent = new Intent(this, MainActivity.class);

        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        PendingIntent intent =
                PendingIntent.getActivity(this, 0,
                        notificationIntent,PendingIntent.FLAG_UPDATE_CURRENT);

        RemoteViews contentView = new RemoteViews(getPackageName(), R.layout.titelnotify);
        contentView.setImageViewResource(R.id.image, R.mipmap.ic_launcher);
        contentView.setTextViewText(R.id.title, "Custom notification");
        contentView.setTextViewText(R.id.text, "This is a custom layout");


        RemoteViews mexpandedView = new RemoteViews(getPackageName(), R.layout.expandednotify);
        mexpandedView.setImageViewResource(R.id.ivexpanded, R.mipmap.asd);
        mexpandedView.setTextViewText(R.id.tvexpanded, "fsdfsdfdsfdshfgsdhf\n" +
                "fkjdsjkfdjsf.ds\n" +
                "fjkdsfldsjkflds\n" +
                "jfkdljflksdjfl;kd\n" +
                "fjkdsfldsjflkds");

        Notification.Builder mBuilder = new Notification.Builder(this)
                .setContentIntent(intent)
                .setSmallIcon(R.mipmap.ic_launcher).setCustomBigContentView(mexpandedView)

                //.setStyle(new Notification.BigPictureStyle().bigPicture(bitmap).setSummaryText("fweeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee"))
                .setCustomContentView(contentView);

        Notification notification = mBuilder.build();

        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        notification.defaults |= Notification.DEFAULT_SOUND;
        notification.defaults |= Notification.DEFAULT_VIBRATE;

        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, notification);*/




    }

    public void makeNotifyCustomeLayout(int IvTitle,String Title,String Title2,int imageDescription,String txtdescription)
    {

        //when clicked on notification go to mainActivity
        long when = System.currentTimeMillis();
        Intent notificationIntent = new Intent(this, MainActivity.class);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent intent = PendingIntent.getActivity(this, 0,notificationIntent,PendingIntent.FLAG_UPDATE_CURRENT);
        //----------------------------------------------------

        //main notify
        RemoteViews mainNotifyView = new RemoteViews(getPackageName(), R.layout.titelnotify);
        mainNotifyView.setTextViewText(R.id.title, Title);
        mainNotifyView.setTextViewText(R.id.text, Title2);
        mainNotifyView.setImageViewResource(R.id.image, IvTitle);

        //-------------------------------------------

        //expanded view notify
        RemoteViews expandedNotifyView = new RemoteViews(getPackageName(), R.layout.expandednotify);
        expandedNotifyView.setImageViewResource(R.id.ivexpanded, imageDescription);
        expandedNotifyView.setTextViewText(R.id.tvexpanded, txtdescription);
        //--------------------------------------------------------------------
        //make notify and set mainview and expandview
        Notification.Builder mBuilder = new Notification.Builder(this)
                .setContentIntent(intent)
                .setSmallIcon(IvTitle).setCustomBigContentView(expandedNotifyView)
                .setCustomContentView(mainNotifyView)
                .setWhen(when);
        //-------------------------------
        //set flags notify
        Notification notification = mBuilder.build();
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        notification.defaults |= Notification.DEFAULT_SOUND;
        notification.defaults |= Notification.DEFAULT_VIBRATE;
        //---------------------------------------

        //call notify
        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(1, notification);
        //-------------------------------------------------
    }
    public void notifyDefultLayout()
    {
          NotificationManager notificationManager = (NotificationManager)
                this.getSystemService(Context.NOTIFICATION_SERVICE);

        Intent notificationIntent = new Intent(this, MainActivity.class);

        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        PendingIntent intent =
                PendingIntent.getActivity(this, 0,
                        notificationIntent,PendingIntent.FLAG_UPDATE_CURRENT);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),
                R.mipmap.ic_launcher_round);
        String message="Hello Notification with image";
        String title="Notification !!!";
        int icon = R.mipmap.ic_launcher_round;
        long when = System.currentTimeMillis();

        Notification  notification = new Notification.Builder(this)
                .setContentTitle(title)
                .setContentText(message)
                .setContentIntent(intent)
                .setSmallIcon(icon)
                .setWhen(when)
                .setStyle(new Notification.BigPictureStyle()
                        .bigPicture(bitmap).setSummaryText(message))
                .build();

        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        // Play default notification sound
        notification.defaults |= Notification.DEFAULT_SOUND;
        notification.defaults |= Notification.DEFAULT_VIBRATE;
        notificationManager.notify(0, notification);
    }
    }


