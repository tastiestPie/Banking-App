package models;
import java.time.LocalDate;

public class AccountNote {
    public static enum NoteType {GENERAL, WIRE_TRANSFER, SUSPICIOUS_ACTIVITY, CUSTOMER_CONTACT};
    private int noteId;
    private int accNum;
    private String note;
    private NoteType type;
    private int transId;
    private LocalDate date;
    private int author;

    public AccountNote(int noteId, int accNum, String note, NoteType type, LocalDate date, int author, int transId){
        this.noteId = noteId;
        this.accNum = accNum;
        this.note = note;
        this.type = type;
        this.transId = transId;
        this.date = date;
        this.author = author;
    }

    //transaction id is optional, so we can have a constructor without it
    public AccountNote(int accNum, String note, LocalDate date, NoteType type, int author){
        this(-1, accNum, note, type, date, author, -1);
    }

    //Getters and Setters
    public int getNoteId(){return noteId;}
    public int getAccNum(){return accNum;}
    public String getNote(){return note;}
    public NoteType getType(){return type;}
    public int getTransId(){return transId;}
    public LocalDate getDate(){return date;}
    public int getAuthor(){return author;}
    public void setNote(String note){this.note = note;}
}
