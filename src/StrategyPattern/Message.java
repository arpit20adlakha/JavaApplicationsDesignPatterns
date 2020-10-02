package StrategyPattern;

import java.security.MessageDigest;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Message implements Comparable<Message> {
    private String from;
    private String to;
    private String title;
    private String text;
    private byte[] attachment;

    public Message(String from, String to, String title, String text) {
        this.from = from;
        this.to = to;
        this.title = title;
        this.text = text;
    }

    @Override
    public int compareTo(Message message) {
       return  this.title.compareTo(message.title);
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", attachment=" + Arrays.toString(attachment) +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public byte[] getAttachment() {
        return attachment;
    }

    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return from.equals(message.from) &&
                to.equals(message.to) &&
                title.equals(message.title) &&
                text.equals(message.text) &&
                Arrays.equals(attachment, message.attachment);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(from, to, title, text);
        result = 31 * result + Arrays.hashCode(attachment);
        return result;
    }
}
