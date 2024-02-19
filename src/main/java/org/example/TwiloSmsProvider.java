package org.example;

public class TwiloSmsProvider extends SmsProvider implements ISmsProvider{
    @Override
    public void sendSms() {
        System.out.println("sms sent with Twilo!!!");
    }
}
