package org.example;

public class NextmoSmsProvider extends SmsProvider implements ISmsProvider{
    @Override
    public void sendSms() {
        System.out.println("sms sent with NextMo!!");
    }
}
