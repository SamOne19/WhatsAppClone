package com.samone.whatsappclone.Chat;

import java.util.ArrayList;


public class MessageObject {

    String  messageId,
            senderId,
            message;

    ArrayList<String> mediaUriList;

    public MessageObject(String messageId, String senderId, String message, ArrayList<String> mediaUriList){
        this.messageId = messageId;
        this.senderId = senderId;
        this.message = message;
        this.mediaUriList = mediaUriList;
    }

    public String getMessageId() { return messageId; }
    public String getSenderId() { return senderId; }
    public String getMessage() { return message; }
    public ArrayList<String> getMediaUriList() { return mediaUriList; }

}
