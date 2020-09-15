
package javaframes;

public class MessagingThread {
    private String[] messages;
    private boolean status;

    public MessagingThread(String[] messages, boolean status) {
        this.messages = messages;
        this.status = status;
    }

    public String[] getMessages() {
        return messages;
    }

    public void setMessages(String[] messages) {
        this.messages = messages;
    }

    public boolean getSatus() {
        return status;
    }

    public void setSatus(boolean satus) {
        this.status = status;
    }
}
