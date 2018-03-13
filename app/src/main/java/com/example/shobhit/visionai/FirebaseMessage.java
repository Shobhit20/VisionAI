package com.example.shobhit.visionai;

import android.content.Intent;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by shobhit on 10/3/18.
 */
public class FirebaseMessage extends FirebaseMessagingService {

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // ...
        ;
        // TODO(developer): Handle FCM messages here.
        // Not getting messages here? See why this may be: https://goo.gl/39bRNJ
        if(remoteMessage.getNotification()!= null){
            if(remoteMessage.getNotification().getBody() != null){
                Intent intents=new Intent();
                intents.setAction("MyReceiver");
                intents.putExtra("Detected", remoteMessage.getNotification().getBody());
                getBaseContext().sendBroadcast(intents);
            }
        }


        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
    }


}
