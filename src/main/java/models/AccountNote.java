package models;
import java.time.LocalDate;
import java.util.*;
public class AccountNote {
    private static final Set <String> availableTags = new HashSet<>(List.of(
        "general", "suspicious-activity", "customer-request", "wire-transfer", "identity-verified",
        "fraud-review", "account-frozen", "account-unfrozen", "large-deposit", "large-withdrawal", 
        "customer-contact", "address-change", "complaint", "follow-up-required", "resolved"
    ));

    private int noteId;
    private int accNum;
    private String note;
    private String [] tags; //create index for tags field in account notes collection so it become multikey index
    private int transId;
    private LocalDate date;
    private int author;

    public AccountNote(int noteId, int accNum, String note, String [] tags, LocalDate date, int author, int transId){
        this.noteId = noteId;
        this.accNum = accNum;
        this.note = note;
        this.tags = tags;
        this.transId = transId;
        this.date = date;
        this.author = author;
    }

    //transaction id is optional, so we can have a constructor without it
    public AccountNote(int noteId, int accNum, String note, String [] tags, LocalDate date, int author){
        this(noteId, accNum, note, tags, date, author, -1);
    }

    //Getters and Setters
    public int getNoteId(){return noteId;}
    public int getAccNum(){return accNum;}
    public String getNote(){return note;}
    public String [] getTags(){return tags;}
    public int getTransId(){return transId;}
    public LocalDate getDate(){return date;}
    public int getAuthor(){return author;}
    public static Set<String> getAvailableTags(){return Collections.unmodifiableSet(availableTags);} // return unmodifiable set
    public void setNote(String note){this.note = note;}

    public boolean addTag(String tag){
        tag = tag.toLowerCase().trim().replace(' ', '-');
        return availableTags.add(tag);
    }
    public boolean deleteTag(String tag){return availableTags.remove(tag);}
    public String toString(){return note;}
}
