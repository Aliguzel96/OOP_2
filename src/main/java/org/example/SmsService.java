package org.example;

public class SmsService{

    private SmsProvider smsProvider;

    public void sendSms() {
        smsProvider.sendSms();
    }

}
