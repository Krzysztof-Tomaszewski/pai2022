package pl.edu.pbs.carrent.service;

public interface MailService {
    void sendMessage(String from, String name, String subject, String content);
}
